---
title: CadRasterizationOptions.ObserverPoint
second_title: Aspose.CAD for .NET API Reference
description: CadRasterizationOptions property. Gets or sets the observer point
type: docs
weight: 90
url: /net/aspose.cad.imageoptions/cadrasterizationoptions/observerpoint/
---
## CadRasterizationOptions.ObserverPoint property

Gets or sets the observer point.

```csharp
public ObserverPoint ObserverPoint { get; set; }
```

### Property Value

The observer point.

## Examples

Sets up observation point to perform export of custom view of a drawing

```csharp
using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName)))
{
    JpegOptions options = new JpegOptions();
    var rasterizationOptions = new CadRasterizationOptions();
    rasterizationOptions.PageWidth = 1500;
    rasterizationOptions.PageHeight = 1500;
    float xAngle = 10; //Angle of rotation along the X axis
    float yAngle = 20; //Angle of rotation along the Y axis
    float zAngle = 30; //Angle of rotation along the Z axis
    rasterizationOptions.ObserverPoint = new ObserverPoint(xAngle, yAngle, zAngle);
    options.VectorRasterizationOptions = rasterizationOptions;
    cadImage.Save(outFile, options);
}
```

### See Also

* class [ObserverPoint](../../../aspose.cad.fileformats/observerpoint/)
* class [CadRasterizationOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../cadrasterizationoptions/)
* assembly [Aspose.CAD](../../../)


