---
title: SvgOptions.MinimumAbsoluteNonscaledLinewidth
second_title: Aspose.CAD for .NET API Reference
description: SvgOptions property. Lines with width in pixels less than this will be rescaled if absolute rescaling treshold
type: docs
weight: 30
url: /net/aspose.cad.imageoptions/svgoptions/minimumabsolutenonscaledlinewidth/
---
## SvgOptions.MinimumAbsoluteNonscaledLinewidth property

Lines with width in pixels less than this will be rescaled if absolute rescaling treshold

```csharp
public float MinimumAbsoluteNonscaledLinewidth { get; set; }
```

## Examples

using (var img = Image.Load(file)) { CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions(); cadRasterizationOptions.PageWidth = 1000; cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels SvgOptions opt = new SvgOptions(); opt.UseAbsoluteRescaling = true; //using absolute rescaling limit opt.MinimumAbsoluteNonscaledLinewidth = 5; //As result, lines thinner than 5 pixels wide would be made thicker, approaching the thickness of 5 pixels opt.VectorRasterizationOptions = cadRasterizationOptions; img.Save(outFile, opt); }

### See Also

* class [SvgOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../../)


