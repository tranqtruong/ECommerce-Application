--insert role
insert into role(name, description) values('ADMIN', 'Manage everything');
insert into role(name, description) values('SALESPERSON', 'Manage product price, customers, shipping, orders and sales report');
insert into role(name, description) values('CUSTOMER', 'Manage shopping cart, checkout and order history');
insert into role(name, description) values('EDITOR', 'Manage categories, brands, products, blog, ...');
insert into role(name, description) values('SHIPPER', 'view product, view orders and update order status');
insert into role(name, description) values('ASSISTANT', 'Manage questions and reviews');

--insert employee
insert into employee(id, first_name, last_name, email, password, enabled, photo)
values(1, 'tran', 'truong', 'admin@example.com', '$2a$10$OToK8iIi6y6wDTQiSEEFUOJtpB0ZAmQlTyUkHfc8EPRb6h13J85J.', true, 'admin.jpg');

--insert employee role
insert into employee_role(employee_id, role_id) values(1, 1);

--insert customer
insert into customer(id, first_name, last_name, email, password, phone_number, enabled, role_id)
values(2, 'nguyen van', 'a', 'nva@example.com', '$2a$10$MU7V5wBSmXAfrA20ILQ0.ONFjUeFt1HbJsSRYF79tv0UG4hvl53ue', '012345678',true, 3);


--update hibernate_sequences table
update hibernate_sequences set next_val = 3 where sequence_name = 'default';