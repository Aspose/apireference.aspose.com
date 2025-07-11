---
title: HtmlFixedSaveOptions.ExportEmbeddedFonts
linktitle: ExportEmbeddedFonts
articleTitle: ExportEmbeddedFonts
second_title: Aspose.Words for .NET
description: Control font embedding in your HTML with the ExportEmbeddedFonts property. Enhance document quality while managing file size effectively.
type: docs
weight: 50
url: /net/aspose.words.saving/htmlfixedsaveoptions/exportembeddedfonts/
---
## HtmlFixedSaveOptions.ExportEmbeddedFonts property

Specifies whether fonts should be embedded into Html document in Base64 format. Note setting this flag can significantly increase size of output Html file.

```csharp
public bool ExportEmbeddedFonts { get; set; }
```

## Examples

Shows how to determine where to store embedded fonts when exporting a document to Html.

```csharp
Document doc = new Document(MyDir + "Embedded font.docx");

// When we export a document with embedded fonts to .html,
// Aspose.Words can place the fonts in two possible locations.
// Setting the "ExportEmbeddedFonts" flag to "true" will store the raw data for embedded fonts within the CSS stylesheet,
// in the "url" property of the "@font-face" rule. This may create a huge CSS stylesheet file
// and reduce the number of external files that this HTML conversion will create.
// Setting this flag to "false" will create a file for each font.
// The CSS stylesheet will link to each font file using the "url" property of the "@font-face" rule.
HtmlFixedSaveOptions htmlFixedSaveOptions = new HtmlFixedSaveOptions
{
    ExportEmbeddedFonts = exportEmbeddedFonts
};

doc.Save(ArtifactsDir + "HtmlFixedSaveOptions.ExportEmbeddedFonts.html", htmlFixedSaveOptions);

string outDocContents = File.ReadAllText(ArtifactsDir + "HtmlFixedSaveOptions.ExportEmbeddedFonts/styles.css");

if (exportEmbeddedFonts)
{
    Assert.That(Regex.Match(outDocContents,
        "@font-face { font-family:'Arial'; font-style:normal; font-weight:normal; src:local[(]'☺'[)], url[(].+[)] format[(]'woff'[)]; }").Success, Is.True);
    Assert.That(Directory.GetFiles(ArtifactsDir + "HtmlFixedSaveOptions.ExportEmbeddedFonts").Count(f => f.EndsWith(".woff")), Is.EqualTo(0));
}
else
{
    Assert.That(Regex.Match(outDocContents,
        "@font-face { font-family:'Arial'; font-style:normal; font-weight:normal; src:local[(]'☺'[)], url[(]'font001[.]woff'[)] format[(]'woff'[)]; }").Success, Is.True);
    Assert.That(Directory.GetFiles(ArtifactsDir + "HtmlFixedSaveOptions.ExportEmbeddedFonts").Count(f => f.EndsWith(".woff")), Is.EqualTo(2));
}
```

### See Also

* class [HtmlFixedSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
