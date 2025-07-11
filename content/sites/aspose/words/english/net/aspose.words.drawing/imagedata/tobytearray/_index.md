---
title: ImageData.ToByteArray
linktitle: ToByteArray
articleTitle: ToByteArray
second_title: Aspose.Words for .NET
description: Convert any image to byte array effortlessly with the ImageData ToByteArray method. Access image bytes from stored or linked sources easily!
type: docs
weight: 220
url: /net/aspose.words.drawing/imagedata/tobytearray/
---
## ImageData.ToByteArray method

Returns image bytes for any image regardless whether the image is stored or linked.

```csharp
public byte[] ToByteArray()
```

## Remarks

If the image is linked, downloads the image every time it is called.

## Examples

Shows how to create an image file from a shape's raw image data.

```csharp
Document imgSourceDoc = new Document(MyDir + "Images.docx");
Shape imgShape = (Shape) imgSourceDoc.GetChild(NodeType.Shape, 0, true);

Assert.That(imgShape.HasImage, Is.True);

// ToByteArray() returns the array stored in the ImageBytes property.
Assert.That(imgShape.ImageData.ToByteArray(), Is.EqualTo(imgShape.ImageData.ImageBytes));

// Save the shape's image data to an image file in the local file system.
using (Stream imgStream = imgShape.ImageData.ToStream())
{
    using (FileStream outStream = new FileStream(ArtifactsDir + "Drawing.GetDataFromImage.png",
        FileMode.Create, FileAccess.ReadWrite))
    {
        imgStream.CopyTo(outStream);
    }
}
```

### See Also

* class [ImageData](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
