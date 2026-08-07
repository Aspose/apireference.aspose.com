package com.aspose.doclet;
import com.aspose.doclet.utils.OptionsFileUtil;

import javax.tools.ToolProvider;

public class DocletRunner {

    public static void main(final String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java DocletRunner <doclet-params-filename>");
            return;
        }
        if (!(new java.io.File(args[0])).isFile()) {
            System.err.println(String.format("File '%s' does not exist", args[0]));
            return;
        }

        ToolProvider.getSystemDocumentationTool().run(null, null, null, OptionsFileUtil.processOptionsFile(args[0]));
    }
}
