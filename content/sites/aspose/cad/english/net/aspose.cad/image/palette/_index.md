---
title: Image.Palette
second_title: Aspose.CAD for .NET API Reference
description: Image property. Gets or sets the color palette
type: docs
weight: 70
url: /net/aspose.cad/image/palette/
---
## Image.Palette property

Gets or sets the color palette.

```csharp
public IColorPalette Palette { get; set; }
```

### Property Value

The color palette.

## Examples

Asserts DGN drawing contains palette

```csharp
var fileName = @"C:\path\drawing.dgn";
using (DgnImage drawing = (DgnImage)Image.Load(fileName))
{
    Assert.IsNotNull(drawing.Palette);
}
```

### See Also

* interface [IColorPalette](../../icolorpalette/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


