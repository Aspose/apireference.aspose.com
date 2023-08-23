---
title: SvgOptions.MinimumRelativeLinewidthRatio
second_title: Aspose.CAD for .NET API Reference
description: SvgOptions property. Lines with width less than images sizeminimumRelativeLinewidthRatio will be rescaled if relative rescaling treshold is used. A smaller dimension is picked as image size
type: docs
weight: 50
url: /net/aspose.cad.imageoptions/svgoptions/minimumrelativelinewidthratio/
---
## SvgOptions.MinimumRelativeLinewidthRatio property

Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling treshold is used. A smaller dimension is picked as image size.

```csharp
public float MinimumRelativeLinewidthRatio { get; set; }
```

## Examples

using (var img = Image.Load(file)) { CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions(); cadRasterizationOptions.PageWidth = 1000; cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels SvgOptions opt = new SvgOptions(); opt.UseAbsoluteRescaling = false; //using relative rescaling limit opt.MinimumRelativeLinewidthRatio = 5000; //As result, lines thinner than 1/5th of a pixel would be made thicker, approaching the thickness of 1/5th of a pixel opt.VectorRasterizationOptions = cadRasterizationOptions; img.Save(outFile, opt); }

### See Also

* class [SvgOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../../)


