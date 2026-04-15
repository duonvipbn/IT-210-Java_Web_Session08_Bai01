package com.it210java_web_session08_bai01.controller;


import com.it210java_web_session08_bai01.dto.AddressDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/address")
public class UserController {

    // Hiển thị form
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("addressDto", new AddressDto());
        return "address-form";
    }

    // Submit form
    @PostMapping("/save")
    public String saveAddress(@Valid @ModelAttribute("addressDto") AddressDto addressDto,
                              BindingResult result) {

        if (result.hasErrors()) {
            return "address-form"; // quay lại form nếu lỗi
        }

        // giả lập lưu DB
        return "success";
    }
}