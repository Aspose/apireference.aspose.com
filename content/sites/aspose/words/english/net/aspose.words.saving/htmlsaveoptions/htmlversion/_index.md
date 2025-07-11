---
title: HtmlSaveOptions.HtmlVersion
linktitle: HtmlVersion
articleTitle: HtmlVersion
second_title: Aspose.Words for .NET
description: Discover the HtmlSaveOptions HtmlVersion property to easily choose your HTML standard when saving documents to HTML or MHTML. Optimize your output effortlessly!
type: docs
weight: 330
url: /net/aspose.words.saving/htmlsaveoptions/htmlversion/
---
## HtmlSaveOptions.HtmlVersion property

Specifies version of HTML standard that should be used when saving the document to HTML or MHTML. Default value is Xhtml.

```csharp
public HtmlVersion HtmlVersion { get; set; }
```

## Examples

Shows how to display a DOCTYPE heading when converting documents to the Xhtml 1.0 transitional standard.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Hello world!");

HtmlSaveOptions options = new HtmlSaveOptions(SaveFormat.Html)
{
    HtmlVersion = HtmlVersion.Xhtml,
    ExportXhtmlTransitional = showDoctypeDeclaration,
    PrettyFormat = true
};

doc.Save(ArtifactsDir + "HtmlSaveOptions.ExportXhtmlTransitional.html", options);

// Our document will only contain a DOCTYPE declaration heading if we have set the "ExportXhtmlTransitional" flag to "true".
string outDocContents = File.ReadAllText(ArtifactsDir + "HtmlSaveOptions.ExportXhtmlTransitional.html");
string newLine = Environment.NewLine;

if (showDoctypeDeclaration)
    Assert.That(outDocContents.Contains(
        $"<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"no\"?>{newLine}" +
        $"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">{newLine}" +
        "<html xmlns=\"http://www.w3.org/1999/xhtml\">"), Is.True);
else
    Assert.That(outDocContents.Contains("<html>"), Is.True);
```

Shows how to save a document to a specific version of HTML.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

HtmlSaveOptions options = new HtmlSaveOptions(SaveFormat.Html)
{
    HtmlVersion = htmlVersion,
    PrettyFormat = true
};

doc.Save(ArtifactsDir + "HtmlSaveOptions.HtmlVersions.html", options);

// Our HTML documents will have minor differences to be compatible with different HTML versions.
string outDocContents = File.ReadAllText(ArtifactsDir + "HtmlSaveOptions.HtmlVersions.html");

switch (htmlVersion)
{
    case HtmlVersion.Html5:
        Assert.That(outDocContents.Contains("<a id=\"_Toc76372689\"></a>"), Is.True);
        Assert.That(outDocContents.Contains("<a id=\"_Toc76372689\"></a>"), Is.True);
        Assert.That(outDocContents.Contains("<table style=\"padding:0pt; -aw-border-insideh:0.5pt single #000000; -aw-border-insidev:0.5pt single #000000; border-collapse:collapse\">"), Is.True);
        break;
    case HtmlVersion.Xhtml:
        Assert.That(outDocContents.Contains("<a name=\"_Toc76372689\"></a>"), Is.True);
        Assert.That(outDocContents.Contains("<ul type=\"disc\" style=\"margin:0pt; padding-left:0pt\">"), Is.True);
        Assert.That(outDocContents.Contains("<table cellspacing=\"0\" cellpadding=\"0\" style=\"-aw-border-insideh:0.5pt single #000000; -aw-border-insidev:0.5pt single #000000; border-collapse:collapse\""), Is.True);
        break;
}
```

### See Also

* enum [HtmlVersion](../../htmlversion/)
* class [HtmlSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
