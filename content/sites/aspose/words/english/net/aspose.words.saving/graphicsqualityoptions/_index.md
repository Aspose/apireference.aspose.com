---
title: GraphicsQualityOptions Class
linktitle: GraphicsQualityOptions
articleTitle: GraphicsQualityOptions
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Saving.GraphicsQualityOptions class to enhance document graphics quality with customizable options for superior output.
type: docs
weight: 5790
url: /net/aspose.words.saving/graphicsqualityoptions/
---
## GraphicsQualityOptions class

Allows to specify additional Graphics quality options.

To learn more, visit the [Save a Document](https://docs.aspose.com/words/net/save-a-document/) documentation article.

```csharp
public class GraphicsQualityOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [GraphicsQualityOptions](graphicsqualityoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [CompositingMode](../../aspose.words.saving/graphicsqualityoptions/compositingmode/) { get; set; } | Gets or sets a value that specifies how composited images are drawn to this Graphics. |
| [CompositingQuality](../../aspose.words.saving/graphicsqualityoptions/compositingquality/) { get; set; } | Gets or sets the rendering quality of composited images drawn to this Graphics. |
| [InterpolationMode](../../aspose.words.saving/graphicsqualityoptions/interpolationmode/) { get; set; } | Gets or sets the interpolation mode associated with this Graphics. |
| [SmoothingMode](../../aspose.words.saving/graphicsqualityoptions/smoothingmode/) { get; set; } | Gets or sets the rendering quality for this Graphics. |
| [StringFormat](../../aspose.words.saving/graphicsqualityoptions/stringformat/) { get; set; } | Gets or sets text layout information (such as alignment, orientation and tab stops) display manipulations (such as ellipsis insertion and national digit substitution) and OpenType features. |
| [TextRenderingHint](../../aspose.words.saving/graphicsqualityoptions/textrenderinghint/) { get; set; } | Gets or sets the rendering mode for text associated with this Graphics. |
| [UseTileFlipMode](../../aspose.words.saving/graphicsqualityoptions/usetileflipmode/) { get; set; } | Gets or sets a flag indicating whether WrapMode is TileFlipXY. |

## Examples

Shows how to set render quality options while converting documents to image formats.

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

GraphicsQualityOptions qualityOptions = new GraphicsQualityOptions
{
    SmoothingMode = SmoothingMode.AntiAlias,
    TextRenderingHint = TextRenderingHint.ClearTypeGridFit,
    CompositingMode = CompositingMode.SourceOver,
    CompositingQuality = CompositingQuality.HighQuality,
    InterpolationMode = InterpolationMode.High,
    StringFormat = StringFormat.GenericTypographic
};

ImageSaveOptions saveOptions = new ImageSaveOptions(SaveFormat.Jpeg);
saveOptions.GraphicsQualityOptions = qualityOptions;

doc.Save(ArtifactsDir + "ImageSaveOptions.GraphicsQuality.jpg", saveOptions);
```

### See Also

* namespace [Aspose.Words.Saving](../../aspose.words.saving/)
* assembly [Aspose.Words](../../)
