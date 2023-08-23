---
title: SvgOptions.TextAsShapes
second_title: Aspose.CAD for .NET API Reference
description: SvgOptions property. Gets or sets a value indicating whether text must be converted as shapes. By default text will be converted to shapes so it wont be selectable
type: docs
weight: 80
url: /net/aspose.cad.imageoptions/svgoptions/textasshapes/
---
## SvgOptions.TextAsShapes property

Gets or sets a value indicating whether text must be converted as shapes. By default text will be converted to shapes, so it won't be selectable.

```csharp
public bool TextAsShapes { get; set; }
```

### Property Value

`true` if all text should be turned into SVG shapes in the convertion; otherwise, `false`.

## Examples

using (var img = Image.Load(file)) { CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions(); SvgOptions opt = new SvgOptions(); opt.TextAsShapes = true; opt.VectorRasterizationOptions = cadRasterizationOptions; img.Save(outFile, opt); }

### See Also

* class [SvgOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../../)


