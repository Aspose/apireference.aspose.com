---
title: ImageSaveOptions.ImageContrast
linktitle: ImageContrast
articleTitle: ImageContrast
second_title: Aspose.Words for .NET
description: Adjust the ImageContrast property in ImageSaveOptions to enhance your images' clarity and depth. Optimize your visuals effortlessly!
type: docs
weight: 60
url: /net/aspose.words.saving/imagesaveoptions/imagecontrast/
---
## ImageSaveOptions.ImageContrast property

Gets or sets the contrast for the generated images.

```csharp
public float ImageContrast { get; set; }
```

## Remarks

This property has effect only when saving to raster image formats.

The default value is 0.5. The value must be in the range between 0 and 1.

## Examples

Shows how to edit the image while Aspose.Words converts a document to one.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.ParagraphFormat.Style = doc.Styles["Heading 1"];
builder.Writeln("Hello world!");
builder.InsertImage(ImageDir + "Logo.jpg");

// When we save the document as an image, we can pass a SaveOptions object to
// edit the image while the saving operation renders it.
ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Png)
{
    // We can adjust these properties to change the image's brightness and contrast.
    // Both are on a 0-1 scale and are at 0.5 by default.
    ImageBrightness = 0.3f,
    ImageContrast = 0.7f,

    // We can adjust horizontal and vertical resolution with these properties.
    // This will affect the dimensions of the image.
    // The default value for these properties is 96.0, for a resolution of 96dpi.
    HorizontalResolution = 72f,
    VerticalResolution = 72f,

    // We can scale the image using this property. The default value is 1.0, for scaling of 100%.
    // We can use this property to negate any changes in image dimensions that changing the resolution would cause.
    Scale = 96f / 72f
};

doc.Save(ArtifactsDir + "ImageSaveOptions.EditImage.png", options);
```

### See Also

* class [ImageSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
