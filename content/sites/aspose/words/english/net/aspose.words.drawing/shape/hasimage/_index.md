---
title: Shape.HasImage
linktitle: HasImage
articleTitle: HasImage
second_title: Aspose.Words for .NET
description: Discover if a shape contains image data or links to an image with the HasImage property. Enhance your designs effortlessly!
type: docs
weight: 90
url: /net/aspose.words.drawing/shape/hasimage/
---
## Shape.HasImage property

Returns `true` if the shape has image bytes or links an image.

```csharp
public bool HasImage { get; }
```

## Examples

Shows how to delete all shapes with images from a document.

```csharp
Document doc = new Document(MyDir + "Images.docx");
NodeCollection shapes = doc.GetChildNodes(NodeType.Shape, true);

Assert.That(shapes.OfType<Shape>().Count(s => s.HasImage), Is.EqualTo(9));

foreach (Shape shape in shapes.OfType<Shape>())
    if (shape.HasImage) 
        shape.Remove();

Assert.That(shapes.OfType<Shape>().Count(s => s.HasImage), Is.EqualTo(0));
```

Shows how to extract images from a document, and save them to the local file system as individual files.

```csharp
Document doc = new Document(MyDir + "Images.docx");

// Get the collection of shapes from the document,
// and save the image data of every shape with an image as a file to the local file system.
NodeCollection shapes = doc.GetChildNodes(NodeType.Shape, true);

Assert.That(shapes.Count(s => ((Shape)s).HasImage), Is.EqualTo(9));

int imageIndex = 0;
foreach (Shape shape in shapes.OfType<Shape>())
{
    if (shape.HasImage)
    {
        // The image data of shapes may contain images of many possible image formats. 
        // We can determine a file extension for each image automatically, based on its format.
        string imageFileName =
            $"File.ExtractImages.{imageIndex}{FileFormatUtil.ImageTypeToExtension(shape.ImageData.ImageType)}";
        shape.ImageData.Save(ArtifactsDir + imageFileName);
        imageIndex++;
    }
}
```

### See Also

* class [Shape](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
