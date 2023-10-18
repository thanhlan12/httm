package com.example.he_thong_thong_minh.repository;

import com.example.he_thong_thong_minh.entity.member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<member, Integer> {
    member findByUsername(String username);
}
