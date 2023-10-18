package com.example.he_thong_thong_minh.service;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;


import com.example.he_thong_thong_minh.entity.Sample;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface sampleService {
    List<Sample> getAllSample();

    Sample saveSample(Sample sample);

    Sample updateSample(Sample sample);

    void deleteSample(Long id);

    void init();

    void save(MultipartFile file);

    Resource load(String filename);

    boolean delete(String filename);

    Stream<Path> loadAll();
}
