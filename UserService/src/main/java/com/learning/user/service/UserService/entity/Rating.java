package com.learning.user.service.UserService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Rating {
    private String ratingId;
    private String userId;
    private String holtelId;
    private int rating;
    private String feedback;
    
}
