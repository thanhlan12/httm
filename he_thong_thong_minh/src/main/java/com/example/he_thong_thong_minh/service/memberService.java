package com.example.he_thong_thong_minh.service;



import com.example.he_thong_thong_minh.entity.member;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface memberService {
    void save(member mem);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    boolean checkPassword(String rawPassword, String encodedPassword);
}

