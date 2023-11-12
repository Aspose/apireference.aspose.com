---
title: ObjImage.Depth
second_title: Aspose.CAD for .NET API Reference
description: ObjImage property. Gets the depth of the image. Calculated as the difference between maximum and minimum values of the Z coordinate amongst all vertices. Minimal allowed depth is 0
type: docs
weight: 20
url: /net/aspose.cad.fileformats.obj/objimage/depth/
---
## ObjImage.Depth property

Gets the depth of the image. Calculated as the difference between maximum and minimum values of the Z coordinate amongst all vertices. Minimal allowed depth is 0.

```csharp
public override int Depth { get; }
```

### Property Value

The depth of the image.

## Examples

Prints the depth of the OBJ drawing.

```csharp
using (ObjImage objImage = (ObjImage)Image.Load(fileName))
{
    System.Console.WriteLine("The depth of the image is {0}", objImage.Depth);
}
```

### See Also

* class [ObjImage](../)
* namespace [Aspose.CAD.FileFormats.Obj](../../../aspose.cad.fileformats.obj/)
* assembly [Aspose.CAD](../../../)


