package com.mars.kiwifruit.controller;

import com.mars.kiwifruit.dto.R;
import com.mars.kiwifruit.exception.ExceptionCode;
import com.mars.kiwifruit.exception.MyException;
import com.mars.kiwifruit.service.BillService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Log4j2
@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/ping")
    public R ping() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return R.ok("pong", now.format(formatter));
    }

    @GetMapping("/transformBillData")
    public R transformBillData(@RequestParam String filename) {
        try {
            billService.transformBillData(filename);
        } catch (IOException e) {
            e.printStackTrace();
            throw new MyException(ExceptionCode.READ_OR_WRITE_FILE_ERROR);
        }
        return R.ok();
    }

}
