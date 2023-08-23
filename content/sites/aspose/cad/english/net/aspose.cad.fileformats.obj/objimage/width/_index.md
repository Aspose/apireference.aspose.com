---
title: ObjImage.Width
second_title: Aspose.CAD for .NET API Reference
description: ObjImage property. Gets the width of the image. Calculated as the difference between maximum and minimum values of the X coordinate amongst all vertices. Minimal allowed width is 1
type: docs
weight: 60
url: /net/aspose.cad.fileformats.obj/objimage/width/
---
## ObjImage.Width property

Gets the width of the image. Calculated as the difference between maximum and minimum values of the X coordinate amongst all vertices. Minimal allowed width is 1.

```csharp
public override int Width { get; }
```

### Property Value

The width of the image.

## Examples

Prints the width of the OBJ drawing.

```csharp
using (ObjImage objImage = (ObjImage)Image.Load(fileName))
{
    System.Console.WriteLine("The width of the image is {0}", objImage.Width);
}
```

### See Also

* class [ObjImage](../)
* namespace [Aspose.CAD.FileFormats.Obj](../../../aspose.cad.fileformats.obj/)
* assembly [Aspose.CAD](../../../)


