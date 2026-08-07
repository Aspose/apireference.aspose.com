package com.aspose.doclet;
import com.aspose.doclet.build.MarkDownFilesBuilder;
import jdk.javadoc.doclet.Doclet;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;
import org.apache.commons.lang3.StringUtils;


import javax.lang.model.SourceVersion;
import javax.tools.Diagnostic;
import java.util.*;
import javax.tools.Diagnostic.Kind;

public class HugoDoclet implements Doclet {
    private Reporter reporter;

    @Override
    public void init(Locale locale, Reporter reporter) {
        reporter.print(Kind.NOTE, "Hugo Doclet using locale: " + locale);
        this.reporter = reporter;
    }

    @Override
    public String getName() {
        return "HugoDoclet";
    }

    @Override
    public Set<? extends Option> getSupportedOptions() {
        Option[] options = {
                new CustomOption("TOC front matter path", Arrays.asList("-tocfrontmatter", "--toc-front-matter", "-tfm"), "path") {
                    @Override
                    public boolean process(String option, List<String> arguments) {
                        tocFrontMatter = arguments.get(0);
                        return true;
                    }
                },
                new CustomOption("Front matter path", Arrays.asList("-frontmatter", "--front-matter", "-fm"), "path") {
                    @Override
                    public boolean process(String option, List<String> arguments) {
                        frontMatter = arguments.get(0);
                        return true;
                    }
                },
                new CustomOption("Output path", Arrays.asList("-outputpath", "--output-path", "-d"), "path") {
                    @Override
                    public boolean process(String option, List<String> arguments) {
                        outputPath = arguments.get(0);
                        return true;
                    }
                },
                new CustomOption("Exclude packages", Arrays.asList("-excludepackages", "--exclude-packages", "-ep"),
                        "packages") {
                    @Override
                    public boolean process(String option, List<String> arguments) {
                        excludePackages = StringUtils.split(arguments.get(0), ":");
                        return true;
                    }
                },
                new CustomOption("Exclude classes", Arrays.asList("-excludeclasses", "--exclude-classes", "-ec"),
                        "classes") {
                    @Override
                    public boolean process(String option, List<String> arguments) {
                        excludeClasses = StringUtils.split(arguments.get(0), ":");
                        return true;
                    }
                },
                new CustomOption("Exclude Deprecated", Arrays.asList("-nodeprecated", "--no-deprecated", "-nd"),
                        "classes") {
                    @Override
                    public boolean process(String option, List<String> arguments) {
                        noDeprecated = Boolean.valueOf(arguments.get(0));
                        return true;
                    }
                },
                // Support next properties for compatibility with Gradle javadoc task.
                // According to javadoc spec - these properties used by StandardDoclet and used only when
                // 'doclet' parameter not populated. But Gradle javadoc not align with this rule and
                // passes them in spite of 'doclet' parameter existence
                new FakeOptionForCompatibilityWithStandardDoclet("Fake support of doctitle property", "-doctitle"),
                new FakeOptionForCompatibilityWithStandardDoclet("Fake support of windowtitle property", "-windowtitle")
        };
        return new HashSet<>(Arrays.asList(options));
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
    private String outputPath;
    private String[] excludePackages = {};
    private String[] excludeClasses = {};
    private boolean noDeprecated = false;
    private String tocFrontMatter;
    private String frontMatter;
    @Override
    public boolean run(DocletEnvironment environment) {
        reporter.print(Kind.NOTE, "Output path: " + outputPath);
        reporter.print(Kind.NOTE, "TOC front matter path: " + tocFrontMatter);
        reporter.print(Kind.NOTE, "front matter path: " + frontMatter);
        reporter.print(Kind.NOTE, "Excluded packages: " + Arrays.toString(excludePackages));
        reporter.print(Kind.NOTE, "Excluded classes: " + Arrays.toString(excludeClasses));
        return (new MarkDownFilesBuilder(environment, outputPath, tocFrontMatter, frontMatter, excludePackages, excludeClasses, noDeprecated)).build();

    }
    public abstract static class CustomOption implements Option {

        private final String description;
        private final List<String> names;
        private final String parameters;

        public CustomOption(String description, List<String> names, String parameters) {
            this.description = description;
            this.names = names;
            this.parameters = parameters;
        }

        @Override
        public int getArgumentCount() {
            return 1;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public Kind getKind() {
            return Kind.STANDARD;
        }

        @Override
        public List<String> getNames() {
            return names;
        }

        @Override
        public String getParameters() {
            return parameters;
        }
    }

    public static class FakeOptionForCompatibilityWithStandardDoclet extends CustomOption {

        public FakeOptionForCompatibilityWithStandardDoclet(String description, String name) {
            super(description, Collections.singletonList(name), "none");
        }

        @Override
        public boolean process(String option, List<String> arguments) {
            return true;
        }
    }
}
