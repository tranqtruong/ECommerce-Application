package com.trg.ecommerce.payload.error;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class ApiError {
    private String message;
    private Date timestamp;
    private String details;
}
