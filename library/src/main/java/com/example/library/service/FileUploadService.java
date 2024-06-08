package com.example.library.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

    String saveFile(MultipartFile file);
}
