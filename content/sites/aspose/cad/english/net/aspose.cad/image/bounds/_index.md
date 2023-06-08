---
title: Image.Bounds
second_title: Aspose.CAD for .NET API Reference
description: Image property. Gets the image bounds
type: docs
weight: 30
url: /net/aspose.cad/image/bounds/
---
## Image.Bounds property

Gets the image bounds.

```csharp
public Rectangle Bounds { get; }
```

### Property Value

The image bounds.

## Examples

Custom processing of a drawing depending on its bounds

```csharp
var fileName = @"C:\path\drawing.dwg";
using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName))
{
    if (drawing.Bounds.Width > 500)
    {
        // ...
    }
}
```

### See Also

* struct [Rectangle](../../rectangle/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


