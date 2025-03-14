---
title: GraphicsQualityOptions.CompositingQuality
linktitle: CompositingQuality
articleTitle: CompositingQuality
second_title: Aspose.Words for .NET
description: Discover the GraphicsQualityOptions CompositingQuality property to enhance your image rendering. Optimize composited images for stunning visual quality!
type: docs
weight: 30
url: /net/aspose.words.saving/graphicsqualityoptions/compositingquality/
---
## GraphicsQualityOptions.CompositingQuality property

Gets or sets the rendering quality of composited images drawn to this Graphics.

```csharp
public CompositingQuality? CompositingQuality { get; set; }
```

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

* class [GraphicsQualityOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
