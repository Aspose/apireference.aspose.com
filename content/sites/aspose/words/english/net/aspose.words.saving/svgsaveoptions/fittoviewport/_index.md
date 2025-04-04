---
title: SvgSaveOptions.FitToViewPort
linktitle: FitToViewPort
articleTitle: FitToViewPort
second_title: Aspose.Words for .NET
description: Discover how the SvgSaveOptions FitToViewPort property optimizes your SVG output to perfectly fill any browser window or container for stunning visuals.
type: docs
weight: 30
url: /net/aspose.words.saving/svgsaveoptions/fittoviewport/
---
## SvgSaveOptions.FitToViewPort property

Specifies if the output SVG should fill the available viewport area (browser window or container). When set to `true` width and height of output SVG are set to 100%.

The default value is `false`.

```csharp
public bool FitToViewPort { get; set; }
```

## Examples

Shows how to mimic the properties of images when converting a .docx document to .svg.

```csharp
Document doc = new Document(MyDir + "Document.docx");

// Configure the SvgSaveOptions object to save with no page borders or selectable text.
SvgSaveOptions options = new SvgSaveOptions
{
    FitToViewPort = true,
    ShowPageBorder = false,
    TextOutputMode = SvgTextOutputMode.UsePlacedGlyphs
};

doc.Save(ArtifactsDir + "SvgSaveOptions.SaveLikeImage.svg", options);
```

### See Also

* class [SvgSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
