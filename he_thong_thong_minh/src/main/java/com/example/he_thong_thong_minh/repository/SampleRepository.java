package com.example.he_thong_thong_minh.repository;


import com.example.he_thong_thong_minh.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
}
