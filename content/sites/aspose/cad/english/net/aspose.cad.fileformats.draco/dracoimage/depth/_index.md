---
title: DracoImage.Depth
second_title: Aspose.CAD for .NET API Reference
description: DracoImage property. Gets the depth of the image. Calculated as the difference between maximum and minimum values of the Z coordinate amongst all vertices. Minimal allowed depth is 0
type: docs
weight: 30
url: /net/aspose.cad.fileformats.draco/dracoimage/depth/
---
## DracoImage.Depth property

Gets the depth of the image. Calculated as the difference between maximum and minimum values of the Z coordinate amongst all vertices. Minimal allowed depth is 0.

```csharp
public override int Depth { get; }
```

### Property Value

The depth of the image.

## Examples

Prints the depth of the DRACO drawing.

```csharp
using (DracoImage drcImage = (DracoImage)Image.Load(fileName))
{
    System.Console.WriteLine("The depth of the image is {0}", drcImage.Depth);
}
```

### See Also

* class [DracoImage](../)
* namespace [Aspose.CAD.FileFormats.Draco](../../../aspose.cad.fileformats.draco/)
* assembly [Aspose.CAD](../../../)


