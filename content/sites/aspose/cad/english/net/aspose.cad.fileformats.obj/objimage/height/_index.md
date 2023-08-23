---
title: ObjImage.Height
second_title: Aspose.CAD for .NET API Reference
description: ObjImage property. Gets the height of the image. Calculated as the difference between maximum and minimum values of the Y coordinate amongst all vertices. Minimal allowed height is 1
type: docs
weight: 30
url: /net/aspose.cad.fileformats.obj/objimage/height/
---
## ObjImage.Height property

Gets the height of the image. Calculated as the difference between maximum and minimum values of the Y coordinate amongst all vertices. Minimal allowed height is 1.

```csharp
public override int Height { get; }
```

### Property Value

The height of the image.

## Examples

Prints the height of the OBJ drawing.

```csharp
using (ObjImage objImage = (ObjImage)Image.Load(fileName))
{
    System.Console.WriteLine("The height of the image is {0}", objImage.Height);
}
```

### See Also

* class [ObjImage](../)
* namespace [Aspose.CAD.FileFormats.Obj](../../../aspose.cad.fileformats.obj/)
* assembly [Aspose.CAD](../../../)


