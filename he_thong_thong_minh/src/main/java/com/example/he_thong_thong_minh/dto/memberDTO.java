package com.example.he_thong_thong_minh.dto;

import lombok.Data;

@Data
public class memberDTO {
    private Long id;
    private String name;
    private String username;
    private String password;
    public memberDTO(Long id, String name, String username, String password){
        this.id= id;
        this.name = name;
        this.username= username;
        this.password= password;
    }
}
