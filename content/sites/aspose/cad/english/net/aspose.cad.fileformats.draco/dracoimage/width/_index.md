---
title: DracoImage.Width
second_title: Aspose.CAD for .NET API Reference
description: DracoImage property. Gets the width of the image. Calculated as the difference between maximum and minimum values of the X coordinate amongst all vertices. Minimal allowed width is 1
type: docs
weight: 80
url: /net/aspose.cad.fileformats.draco/dracoimage/width/
---
## DracoImage.Width property

Gets the width of the image. Calculated as the difference between maximum and minimum values of the X coordinate amongst all vertices. Minimal allowed width is 1.

```csharp
public override int Width { get; }
```

### Property Value

The width of the image.

## Examples

Prints the width of the DRACO drawing.

```csharp
using (DracoImage drcImage = (DracoImage)Image.Load(fileName))
{
    System.Console.WriteLine("The width of the image is {0}", drcImage.Width);
}
```

### See Also

* class [DracoImage](../)
* namespace [Aspose.CAD.FileFormats.Draco](../../../aspose.cad.fileformats.draco/)
* assembly [Aspose.CAD](../../../)


