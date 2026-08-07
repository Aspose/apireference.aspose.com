package com.aspose.doclet.utils;

import com.aspose.doclet.model.MarkDownFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

    /**
     * Dump string to file. Create required folders when needed
     */
    public static void dumpToFile(String content, String fileName) {

        try {
            Path path = Paths.get(fileName, "_index.md");
            if (!Files.exists(path.getParent())) {
                Files.createDirectories(path.getParent());
            }
            Files.write(path, content.getBytes());
        } catch (IOException ioe) {
            throw new RuntimeException("Error during dump to file", ioe);
        }
    }

    public static void dumpToFile(MarkDownFile markDownFile) {
        dumpToFile(markDownFile.getFileContent(), markDownFile.getFileNameWithPath());
    }
}
