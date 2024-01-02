---
title: DwfImage.Width
second_title: Aspose.CAD for .NET API Reference
description: DwfImage property. Gets the image width. Defines the Xaxis distance between the leftmost point of all graphic objects in the image and their rightmost point. The distance is measured in units corresponding to the value of the property UnitType
type: docs
weight: 70
url: /net/aspose.cad.fileformats.dwf/dwfimage/width/
---
## DwfImage.Width property

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
string file = string.Format("{0}.dwf", fileName);
string outPath = string.Format("{0}.pdf", fileName);
using (FileStream inStream = new FileStream(file, FileMode.Open))
using (DwfImage image = (DwfImage) Image.Load(inStream))
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

* class [DwfImage](../)
* namespace [Aspose.CAD.FileFormats.Dwf](../../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../../)


