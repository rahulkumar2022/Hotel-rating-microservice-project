package com.learning.user.service.UserService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;

}
