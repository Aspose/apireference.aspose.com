---
title: ImageSize Class
linktitle: ImageSize
articleTitle: ImageSize
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Drawing.ImageSize class, your go-to resource for detailed image size and resolution insights for enhanced document quality.
type: docs
weight: 1400
url: /net/aspose.words.drawing/imagesize/
---
## ImageSize class

Contains information about image size and resolution.

To learn more, visit the [Working with Images](https://docs.aspose.com/words/net/working-with-images/) documentation article.

```csharp
public class ImageSize
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageSize](imagesize/#constructor)(*int, int*) | Initializes width and height to the given values in pixels. Initializes resolution to 96 dpi. |
| [ImageSize](imagesize/#constructor_1)(*int, int, double, double*) | Initializes width, height and resolution to the given values. |

## Properties

| Name | Description |
| --- | --- |
| [HeightPixels](../../aspose.words.drawing/imagesize/heightpixels/) { get; } | Gets the height of the image in pixels. |
| [HeightPoints](../../aspose.words.drawing/imagesize/heightpoints/) { get; } | Gets the height of the image in points. 1 point is 1/72 inch. |
| [HorizontalResolution](../../aspose.words.drawing/imagesize/horizontalresolution/) { get; } | Gets the horizontal resolution in DPI. |
| [VerticalResolution](../../aspose.words.drawing/imagesize/verticalresolution/) { get; } | Gets the vertical resolution in DPI. |
| [WidthPixels](../../aspose.words.drawing/imagesize/widthpixels/) { get; } | Gets the width of the image in pixels. |
| [WidthPoints](../../aspose.words.drawing/imagesize/widthpoints/) { get; } | Gets the width of the image in points. 1 point is 1/72 inch. |

## Examples

Shows how to resize a shape with an image.

```csharp
// When we insert an image using the "InsertImage" method, the builder scales the shape that displays the image so that,
// when we view the document using 100% zoom in Microsoft Word, the shape displays the image in its actual size.
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
Shape shape = builder.InsertImage(ImageDir + "Logo.jpg");

// A 400x400 image will create an ImageData object with an image size of 300x300pt.
ImageSize imageSize = shape.ImageData.ImageSize;

Assert.AreEqual(300.0d, imageSize.WidthPoints);
Assert.AreEqual(300.0d, imageSize.HeightPoints);

// If a shape's dimensions match the image data's dimensions,
// then the shape is displaying the image in its original size.
Assert.AreEqual(300.0d, shape.Width);
Assert.AreEqual(300.0d, shape.Height);

// Reduce the overall size of the shape by 50%. 
shape.Width *= 0.5;

// Scaling factors apply to both the width and the height at the same time to preserve the shape's proportions. 
Assert.AreEqual(150.0d, shape.Width);
Assert.AreEqual(150.0d, shape.Height);

// When we resize the shape, the size of the image data remains the same.
Assert.AreEqual(300.0d, imageSize.WidthPoints);
Assert.AreEqual(300.0d, imageSize.HeightPoints);

// We can reference the image data dimensions to apply a scaling based on the size of the image.
shape.Width = imageSize.WidthPoints * 1.1;

Assert.AreEqual(330.0d, shape.Width);
Assert.AreEqual(330.0d, shape.Height);

doc.Save(ArtifactsDir + "Image.ScaleImage.docx");
```

### See Also

* property [ImageSize](../imagedata/imagesize/)
* namespace [Aspose.Words.Drawing](../../aspose.words.drawing/)
* assembly [Aspose.Words](../../)
