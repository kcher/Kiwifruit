package com.mars.kiwifruit.controller;

import com.mars.kiwifruit.dto.R;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Log4j2
@RestController
@RequestMapping("/bill")
public class BillController {

    @GetMapping("/ping")
    public R ping() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return R.ok("pong", now.format(formatter));
    }

}
