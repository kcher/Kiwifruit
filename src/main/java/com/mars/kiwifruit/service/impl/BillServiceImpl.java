package com.mars.kiwifruit.service.impl;

import com.mars.kiwifruit.service.BillService;
import com.mars.kiwifruit.util.FileUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.List;

@Log4j2
@Service
public class BillServiceImpl implements BillService {

    @Value("${bill.path}")
    private String billFolderPath;

    @Autowired
    private FileSystem fileSystem;

    @Override
    public void transformBillData(String filename) throws IOException {
        log.info("bill folder path -> {}", billFolderPath);
        String filePath = billFolderPath + filename;
        Path path = fileSystem.getPath(filePath);

        List<String> billDataList = FileUtils.readDataFromFile(path);
        if (!CollectionUtils.isEmpty(billDataList)) {
            for (String record : billDataList) {
                log.info(record);
            }
        }
    }
}
