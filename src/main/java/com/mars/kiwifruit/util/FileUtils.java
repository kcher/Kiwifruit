package com.mars.kiwifruit.util;

import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class FileUtils {

    public static String writeDataToFile(String filename, List<String> data) throws IOException {

        File file = new File(filename);
        file.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(file));

        try {
            for (int i = 0;i < data.size(); i++) {
                out.write(data.get(i));
                if (i != data.size() - 1) {
                    out.newLine();
                }
            }
        } finally {
            out.flush();
            out.close();
        }

        return filename;
    }


    public static List<String> readDataFromFile(Path path) throws IOException {
        List<String> result = new ArrayList<>();
        BufferedReader br = null;

        try {
            br = Files.newBufferedReader(path, Charset.forName("GBK"));
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                log.info("line number -> {}, data -> {}", lineNum ++, line);
                result.add(line);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }

        return result;
    }

}
