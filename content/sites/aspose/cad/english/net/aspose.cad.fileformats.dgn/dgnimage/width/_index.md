---
title: DgnImage.Width
second_title: Aspose.CAD for .NET API Reference
description: DgnImage property. Gets the image width. Defines the Xaxis distance between the leftmost point of all graphic objects in the image and their rightmost point. The distance is measured in units corresponding to the value of the property UnitType
type: docs
weight: 130
url: /net/aspose.cad.fileformats.dgn/dgnimage/width/
---
## DgnImage.Width property

Gets the image width. Defines the X-axis distance between the leftmost point of all graphic objects in the image and their rightmost point. The distance is measured in units corresponding to the value of the property [`UnitType`](../../../aspose.cad/image/unittype/)

```csharp
public override int Width { get; }
```

### Property Value

The image width.

## Examples

Uses image width value to set rasterization options.

```csharp
string fileName = "ExampleFile; 
string file = string.Format("{0}.dgn", fileName);
string outPath = string.Format("{0}.pdf", fileName);
using (FileStream inStream = new FileStream(file, FileMode.Open))
using (DgnImage image = (DgnImage) Image.Load(inStream))
{
    CadRasterizationOptions rasterizationOptions = new CadRasterizationOptions();
    rasterizationOptions.PageSize = new SizeF(image.Width, image.Height);
    rasterizationOptions.PageHeight = image.Height;
    rasterizationOptions.PageWidth = image.Width;
    rasterizationOptions.UnitType = image.UnitType;
    PdfOptions pdfOptions = new PdfOptions { VectorRasterizationOptions = rasterizationOptions };
    image.Save(outPath, pdfOptions);
}
```

### See Also

* class [DgnImage](../)
* namespace [Aspose.CAD.FileFormats.Dgn](../../../aspose.cad.fileformats.dgn/)
* assembly [Aspose.CAD](../../../)


