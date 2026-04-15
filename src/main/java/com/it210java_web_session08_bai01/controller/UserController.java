package com.it210java_web_session08_bai01.controller;

import com.it210java_web_session08_bai01.dto.AddressDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class UserController {

    @PostMapping("/update")
    public ResponseEntity<?> updateAddress(@Valid @RequestBody AddressDto addressDto) {
        // giả lập lưu database
        return ResponseEntity.ok("Cập nhật địa chỉ thành công!");
    }
}