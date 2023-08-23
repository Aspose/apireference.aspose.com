---
title: SvgOptions.UseAbsoluteRescaling
second_title: Aspose.CAD for .NET API Reference
description: SvgOptions property. Wether minimum nonrescaled line widh should be defined relative to whole image size if false or in pixels if true. If false use  to specify maximum rate of image size to line width when line wont be rescaled up yet. If true use  to specify minimum unscaled width in pixels
type: docs
weight: 90
url: /net/aspose.cad.imageoptions/svgoptions/useabsoluterescaling/
---
## SvgOptions.UseAbsoluteRescaling property

Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true). If false, use  to specify maximum rate of image size to line width when line won't be rescaled up yet. If true, use  to specify minimum unscaled width in pixels

```csharp
public bool UseAbsoluteRescaling { get; set; }
```

## Examples

using (var img = Image.Load(file)) { CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions(); cadRasterizationOptions.PageWidth = 1000; cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels SvgOptions opt = new SvgOptions(); opt.UseAbsoluteRescaling = false; //using relative rescaling treshold opt.MinimumRelativeLinewidthRatio = 5000; //As result, lines thinner than 1/5th of a pixel would be made thicker, approaching the thickness of 1/5th of a pixel opt.VectorRasterizationOptions = cadRasterizationOptions; img.Save(outFile, opt); } using (var img = Image.Load(file)) { CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions(); cadRasterizationOptions.PageWidth = 1000; cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels SvgOptions opt = new SvgOptions(); opt.UseAbsoluteRescaling = true; //using absolute rescaling treshold opt.MinimumAbsoluteNonscaledLinewidth = 5; //As result, lines thinner than 5 pixels wide would be made thicker, approaching the thickness of 5 pixels opt.VectorRasterizationOptions = cadRasterizationOptions; img.Save(outFile, opt); }

### See Also

* class [SvgOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../../)


