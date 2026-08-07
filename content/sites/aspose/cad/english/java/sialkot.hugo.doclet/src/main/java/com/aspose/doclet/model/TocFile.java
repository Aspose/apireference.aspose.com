package com.aspose.doclet.model;

import com.aspose.doclet.utils.MarkDownUtil;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;

public class TocFile extends ArrayList<TocItem> implements MarkDownFile {

    private static String TOC_FILE_HEADER = "";
    private final static String TOC_FILE_NAME = "";
    private final String outputPath;
    private final String frontMatter;
    public TocFile(String outputPath, String frontMatter) {
        this.outputPath = outputPath;
        this.frontMatter = frontMatter;
        TOC_FILE_HEADER = getFrontMatter();
    }
    private String getFrontMatter()
    {
        String frontMatterContent = "";
        try {
            frontMatterContent= new String (Files.readAllBytes(Paths.get(frontMatter)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return frontMatterContent;
    }

    public void addTocItem(TocItem packageTocItem) {
        add(packageTocItem);
    }

    @Override
    public String getFileContent() {
        return TOC_FILE_HEADER + MarkDownUtil.tocToMarkdown(this);
    }

    @Override
    public String getFileNameWithPath() {
        return outputPath + File.separator + TOC_FILE_NAME;
    }
}
