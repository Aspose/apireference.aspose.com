---
title: HtmlFixedSaveOptions.PageMargins
linktitle: PageMargins
articleTitle: PageMargins
second_title: Aspose.Words for .NET
description: Discover the HtmlFixedSaveOptions PageMargins property to customize your HTML document's margins. Set values in points for precise layout control.
type: docs
weight: 130
url: /net/aspose.words.saving/htmlfixedsaveoptions/pagemargins/
---
## HtmlFixedSaveOptions.PageMargins property

Specifies the margins around pages in an HTML document. The margins value is measured in points and should be equal to or greater than 0. Default value is 10 points.

```csharp
public double PageMargins { get; set; }
```

## Remarks

Depends on the value of [`PageHorizontalAlignment`](../pagehorizontalalignment/) property:

* Defines top, bottom and left page margins if the value is Left.
* Defines top, bottom and right page margins if the value is Right.
* Defines top and bottom page margins if the value is Center.

## Examples

Shows how to adjust page margins when saving a document to HTML.

```csharp
Document doc = new Document(MyDir + "Document.docx");

HtmlFixedSaveOptions saveOptions = new HtmlFixedSaveOptions
{
    PageMargins = 15
};

doc.Save(ArtifactsDir + "HtmlFixedSaveOptions.PageMargins.html", saveOptions);

string outDocContents = File.ReadAllText(ArtifactsDir + "HtmlFixedSaveOptions.PageMargins/styles.css");

Assert.That(Regex.Match(outDocContents,
    "[.]awpage { position:relative; border:solid 1pt black; margin:15pt auto 15pt auto; overflow:hidden; }").Success, Is.True);
```

### See Also

* class [HtmlFixedSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
