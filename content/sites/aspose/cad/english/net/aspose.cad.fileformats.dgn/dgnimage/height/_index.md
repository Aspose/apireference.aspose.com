---
title: DgnImage.Height
second_title: Aspose.CAD for .NET API Reference
description: DgnImage property. Gets the image height. Defines the Yaxis distance between the bottommost point of all graphical objects in the image and their topmost point. The distance is measured in units corresponding to the value of the property UnitType
type: docs
weight: 30
url: /net/aspose.cad.fileformats.dgn/dgnimage/height/
---
## DgnImage.Height property

Gets the image height. Defines the Y-axis distance between the bottommost point of all graphical objects in the image and their topmost point. The distance is measured in units corresponding to the value of the property [`UnitType`](../../../aspose.cad/image/unittype/)

```csharp
public override int Height { get; }
```

### Property Value

The image height.

## Examples

Uses image height value to set rasterization options.

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


