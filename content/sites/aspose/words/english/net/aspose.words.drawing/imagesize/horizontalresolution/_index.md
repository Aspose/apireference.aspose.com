---
title: ImageSize.HorizontalResolution
linktitle: HorizontalResolution
articleTitle: HorizontalResolution
second_title: Aspose.Words for .NET
description: Discover the ImageSize HorizontalResolution property to easily obtain the DPI for your images, enhancing quality and precision in your projects.
type: docs
weight: 40
url: /net/aspose.words.drawing/imagesize/horizontalresolution/
---
## ImageSize.HorizontalResolution property

Gets the horizontal resolution in DPI.

```csharp
public double HorizontalResolution { get; }
```

## Examples

Shows how to read the properties of an image in a shape.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a shape into the document which contains an image taken from our local file system.
Shape shape = builder.InsertImage(ImageDir + "Logo.jpg");

// If the shape contains an image, its ImageData property will be valid,
// and it will contain an ImageSize object.
ImageSize imageSize = shape.ImageData.ImageSize;

// The ImageSize object contains read-only information about the image within the shape.
Assert.AreEqual(400, imageSize.HeightPixels);
Assert.AreEqual(400, imageSize.WidthPixels);

const double delta = 0.05;
Assert.AreEqual(95.98d, imageSize.HorizontalResolution, delta);
Assert.AreEqual(95.98d, imageSize.VerticalResolution, delta);

// We can base the size of the shape on the size of its image to avoid stretching the image.
shape.Width = imageSize.WidthPoints * 2;
shape.Height = imageSize.HeightPoints * 2;

doc.Save(ArtifactsDir + "Drawing.ImageSize.docx");
```

### See Also

* class [ImageSize](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
