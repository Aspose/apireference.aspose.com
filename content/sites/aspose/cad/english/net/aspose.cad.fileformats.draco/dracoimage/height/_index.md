---
title: DracoImage.Height
second_title: Aspose.CAD for .NET API Reference
description: DracoImage property. Gets the height of the image. Calculated as the difference between maximum and minimum values of the Y coordinate amongst all vertices. Minimal allowed height is 1
type: docs
weight: 40
url: /net/aspose.cad.fileformats.draco/dracoimage/height/
---
## DracoImage.Height property

Gets the height of the image. Calculated as the difference between maximum and minimum values of the Y coordinate amongst all vertices. Minimal allowed height is 1.

```csharp
public override int Height { get; }
```

### Property Value

The height of the image.

## Examples

Prints the height of the DRACO drawing.

```csharp
using (DracoImage drcImage = (DracoImage)Image.Load(fileName))
{
    System.Console.WriteLine("The height of the image is {0}", drcImage.Height);
}
```

### See Also

* class [DracoImage](../)
* namespace [Aspose.CAD.FileFormats.Draco](../../../aspose.cad.fileformats.draco/)
* assembly [Aspose.CAD](../../../)


