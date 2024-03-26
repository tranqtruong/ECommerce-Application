package com.trg.ecommerce.security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.trg.ecommerce.entity.Customer;
import com.trg.ecommerce.entity.Employee;
import com.trg.ecommerce.entity.User;
import com.trg.ecommerce.exception.ResourceNotFoundException;
import com.trg.ecommerce.repository.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService{
    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if(user == null) {
            throw new ResourceNotFoundException("User", "email", email);
        }

        List<GrantedAuthority> authorities = null;
        if(user instanceof Employee){
            authorities = ((Employee)user).getRoles().stream().map(
                role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
        }else if(user instanceof Customer){
            authorities = List.of(new SimpleGrantedAuthority(
                ((Customer)user).getRole().getName()
            ));
        }else{
            System.err.println("Invalid user type");
        }

        return new org.springframework.security.core.userdetails.User(
            user.getEmail(), user.getPassword(), authorities
        );
    }
    
}
