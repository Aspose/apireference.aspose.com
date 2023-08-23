---
title: SvgOptions.RescaleSubpixelLinewidths
second_title: Aspose.CAD for .NET API Reference
description: SvgOptions property. Whether subpixel linewidths should be rescaled. If set to true lines thinner than a width specified by other options will be drawn thicker asymptotically approaching the minimum width
type: docs
weight: 60
url: /net/aspose.cad.imageoptions/svgoptions/rescalesubpixellinewidths/
---
## SvgOptions.RescaleSubpixelLinewidths property

Whether sub-pixel linewidths should be rescaled. If set to true, lines thinner than a width specified by other options will be drawn thicker, asymptotically approaching the minimum width

```csharp
public bool RescaleSubpixelLinewidths { get; set; }
```

## Examples

using (var img = Image.Load(file)) { CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions(); SvgOptions opt = new SvgOptions(); opt.RescaleSubpixelLinewidths = false; //now lines with width in source file == 0 will not be visible opt.VectorRasterizationOptions = cadRasterizationOptions; img.Save(outFile, opt); }

### See Also

* class [SvgOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../../)


