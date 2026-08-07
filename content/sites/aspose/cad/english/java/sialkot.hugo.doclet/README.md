## JavaDoc Doclet for Hugo
### Standalone

One can execute the `javadoc` command with the command line parameters:

```bash
javadoc \
-docletpath ./target/hugo-doclet-1.0-SNAPSHOT-jar-with-dependencies.jar \
-doclet com.aspose.doclet.HugoDoclet
-sourcepath ./src/test/java
-outputpath ./target/test-out
-encoding UTF-8
-excludepackages com\.microsoft\.samples\.someexcludedpack.*:com\.microsoft\.samples\.someunexistingpackage
-excludeclasses com\.microsoft\.samples\.subpackage\.SomeExcluded.*:com\.microsoft\.samples\.subpackage\.SomeUnexistingClass
-subpackages com.microsoft.samples
-nodeprecated false
-tocfrontmatter ./src/test/resources/tocfrontmatters.md
-frontmatter ./src/test/resources/frontmatters.md
```

| Parameter | Description                                                         |
|-----------|---------------------------------------------------------------------|
| `encoding` | Encoding for source files (_optional_).                             |
| `docletpath` | Path to the doclet JAR file.                                        |
| `doclet` | Doclet class name.                                                  |
| `classpath` | List of dependencies to be included in the classpath (_optional_).  |
| `sourcepath` | Location of the source code that needs to be documented.            |
| `outputpath` | The location for the generated YAML files.                          |
| `excludepackages` | List of excluded packages, separated by a colon (`:`) (_optional_). |
| `excludeclasses` | List of excluded classes, separated by a colon (`:`) (_optional_).  |
| `subpackages` | Subpackages to recursively load, separated by a colon (`:`).        |
| `tocfrontmatter` | Frontmatter path for root page.                                     |
| `frontmatter` | Frontmatter path for API page.                                      |
| `nodeprecated` | Boolean value to exclude deprecated. By default false               |

### With `maven-javadoc-plugin`
Run "mvn clean install" in sialkot.hugo.doclet folder to install doclet artifact locally. Java 11+ are required.
When there is an existing java project where Maven is used as a build tool, one could add `maven-javadoc-plugin` to the root `pom.xml`.
Working example from Aspose.Page for Java:

```java
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-javadoc-plugin</artifactId>
  <version>3.0.1</version>
  <!-- If 3.0.1 can not be found use following -->
  <!--version>3.4.1</version-->
  <configuration>
    <doclet>com.aspose.doclet.HugoDoclet</doclet>
    <show>public</show>
    <nohelp>true</nohelp>
    <sourcepath>${basedir}/build/src</sourcepath>
    <docletArtifact>
      <groupId>com.aspose</groupId>
    	<artifactId>hugo-doclet</artifactId>
    	<version>1.0-SNAPSHOT</version>
    </docletArtifact>
    <useStandardDocletOptions>false</useStandardDocletOptions>
    <additionalOptions>
    	<additionalOption>-outputpath</additionalOption>
    	<additionalOption>../../../../../../Aspose.Page-API-References/english/java</additionalOption>
    	<additionalOption>-tocfrontmatter</additionalOption>
    	<additionalOption>${basedir}/frontmatters/java/tocfrontmatters.md</additionalOption>
    	<additionalOption>-frontmatter</additionalOption>
    	<additionalOption>${basedir}/frontmatters/java/frontmatters.md</additionalOption>
    	<additionalOption>-excludepackages</additionalOption>
    	<additionalOption>com.aspose.font.*:com.aspose.eps.graphics2d.*:com.aspose.eps.graphicsio.*:com.aspose.eps.postscript.*:com.aspose.eps.resources.*:com.aspose.eps.util.*:com.aspose.eps.xmp.*:com.aspose.page.licensemanagement.*:com.aspose.eps.xmp.*:com.aspose.page.metered.*:com.aspose.eps.xmp.*:com.aspose.page.resources.*:com.aspose.eps.xmp.*:com.aspose.page.util.*:com.aspose.ms.*:com.aspose.foundation.*</additionalOption>
    	<additionalOption>-excludeclasses</additionalOption>
    	<additionalOption>com.aspose.page.InternalHelper:com.aspose.page.GlyphsIndices:com.aspose.eps.InternalHelper:com.aspose.eps.device.InternalHelper:com.aspose.eps.xmp.InternalHelper:com.aspose.font.FontInternalHelper:com.aspose.xps.InternalHelper:com.aspose.xps.metadata.InternalHelper:com.aspose.xps.rendering.InternalHelper:com.aspose.xps.XpsDocumentVisitor:com.aspose.xps.XpsBasePresenter:com.aspose.xps.XpsPresenter:com.aspose.xps.rendering.ApsSaveOptions:com.aspose.xps.rendering.ApsDevice:com.aspose.xps.rendering.XpsConversionMode:</additionalOption>
    	<additionalOption>-subpackages</additionalOption>
    	<additionalOption>com.aspose.page:com.aspose.eps:com.aspose.xps</additionalOption>
    	<!-- Add additional options here when needed -->
    </additionalOptions>    
  </configuration>
</plugin>
```

The doclet can then be ran with the following command: 

```bash
mvn javadoc:javadoc
```
