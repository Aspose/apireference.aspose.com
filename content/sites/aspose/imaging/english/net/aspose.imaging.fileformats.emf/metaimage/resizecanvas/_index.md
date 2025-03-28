---
title: MetaImage.ResizeCanvas
second_title: Aspose.Imaging for .NET API Reference
description: MetaImage method. Resizes the canvas
type: docs
weight: 50
url: /net/aspose.imaging.fileformats.emf/metaimage/resizecanvas/
---
## MetaImage.ResizeCanvas method

Resizes the canvas.

```csharp
public abstract void ResizeCanvas(Rectangle newRectangle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| newRectangle | Rectangle | The new rectangle. |

## Examples

The following example shows how to add a border with the specified margins around a metafile (WMF and EMF).

```csharp
[C#]

int borderLeft = 50;
int borderTop = 50;
int borderRight = 50;
int borderBottom = 50;

string dir = "c:\\aspose.imaging\\issues\\net\\3280\\";
string[] fileNames = new[] { "image1.emf", "image2.wmf" };
foreach (string fileName in fileNames)
{
    string inputFilePath = dir + fileName;
    string outputFilePath = dir + "AddBorder_" + fileName;
    using (Aspose.Imaging.FileFormats.Emf.MetaImage image = (Aspose.Imaging.FileFormats.Emf.MetaImage)Aspose.Imaging.Image.Load(inputFilePath))
    {
        image.ResizeCanvas(new Aspose.Imaging.Rectangle(-borderLeft, -borderTop, image.Width + borderLeft + borderRight, image.Height + borderTop + borderBottom));
        image.Save(outputFilePath);
    }
}
```

### See Also

* struct [Rectangle](../../../aspose.imaging/rectangle/)
* class [MetaImage](../)
* namespace [Aspose.Imaging.FileFormats.Emf](../../metaimage/)
* assembly [Aspose.Imaging](../../../)


