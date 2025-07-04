---
title: HtmlSaveOptions.ExportRelativeFontSize
linktitle: ExportRelativeFontSize
articleTitle: ExportRelativeFontSize
second_title: Aspose.Words for .NET
description: Discover the HtmlSaveOptions ExportRelativeFontSize property to customize font sizes in HTML, MHTML, or EPUB formats. Enhance readability with ease!
type: docs
weight: 230
url: /net/aspose.words.saving/htmlsaveoptions/exportrelativefontsize/
---
## HtmlSaveOptions.ExportRelativeFontSize property

Specifies whether font sizes should be output in relative units when saving to HTML, MHTML or EPUB. Default is `false`.

```csharp
public bool ExportRelativeFontSize { get; set; }
```

## Remarks

In many existing documents (HTML, IDPF EPUB) font sizes are specified in relative units. This allows applications to adjust text size when viewing/processing documents. For instance, Microsoft Internet Explorer has "View-&gt;Text Size" submenu, Adobe Digital Editions has two buttons: Increase/Decrease Text Size. If you expect this functionality to work then set `ExportRelativeFontSize` property to `true`.

Aspose Words document model contains and operates only with absolute font size units. Relative units need additional logic to be recalculated from some initial (standard) size. Font size of **Normal** document style is taken as standard. For instance, if **Normal** has 12pt font and some text is 18pt then it will be output as **1.5em.** to the HTML.

When this option is enabled, document elements other than text will still have absolute sizes. Also some text-related attributes might be expressed absolutely. In particular, line spacing specified with "exactly" rule might produce unwanted results when scaling text. So the source documents should be properly designed and tested when exporting with `ExportRelativeFontSize` set to `true`.

## Examples

Shows how to use relative font sizes when saving to .html.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Default font size, ");
builder.Font.Size = 24;
builder.Writeln("2x default font size,");
builder.Font.Size = 96;
builder.Write("8x default font size");

// When we save the document to HTML, we can pass a SaveOptions object
// to determine whether to use relative or absolute font sizes.
// Set the "ExportRelativeFontSize" flag to "true" to declare font sizes
// using the "em" measurement unit, which is a factor that multiplies the current font size. 
// Set the "ExportRelativeFontSize" flag to "false" to declare font sizes
// using the "pt" measurement unit, which is the font's absolute size in points.
HtmlSaveOptions options = new HtmlSaveOptions { ExportRelativeFontSize = exportRelativeFontSize };

doc.Save(ArtifactsDir + "HtmlSaveOptions.RelativeFontSize.html", options);

string outDocContents = File.ReadAllText(ArtifactsDir + "HtmlSaveOptions.RelativeFontSize.html");

if (exportRelativeFontSize)
{
    Assert.That(outDocContents.Contains(
        "<body style=\"font-family:'Times New Roman'\">" +
            "<div>" +
                "<p style=\"margin-top:0pt; margin-bottom:0pt\">" +
                    "<span>Default font size, </span>" +
                "</p>" +
                "<p style=\"margin-top:0pt; margin-bottom:0pt; font-size:2em\">" +
                    "<span>2x default font size,</span>" +
                "</p>" +
                "<p style=\"margin-top:0pt; margin-bottom:0pt; font-size:8em\">" +
                    "<span>8x default font size</span>" +
                "</p>" +
            "</div>" +
        "</body>"), Is.True);
}
else
{
    Assert.That(outDocContents.Contains(
        "<body style=\"font-family:'Times New Roman'; font-size:12pt\">" +
            "<div>" +
                "<p style=\"margin-top:0pt; margin-bottom:0pt\">" +
                    "<span>Default font size, </span>" +
                "</p>" +
                "<p style=\"margin-top:0pt; margin-bottom:0pt; font-size:24pt\">" +
                    "<span>2x default font size,</span>" +
                "</p>" +
                "<p style=\"margin-top:0pt; margin-bottom:0pt; font-size:96pt\">" +
                    "<span>8x default font size</span>" +
                "</p>" +
            "</div>" +
        "</body>"), Is.True);
}
```

### See Also

* class [HtmlSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
