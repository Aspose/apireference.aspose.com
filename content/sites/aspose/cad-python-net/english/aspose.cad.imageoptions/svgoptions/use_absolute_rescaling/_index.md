---
title: use_absolute_rescaling property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 180
url: /python-net/aspose.cad.imageoptions/svgoptions/use_absolute_rescaling/
is_root: false
---

## use_absolute_rescaling property


Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true).
If false, use [`SvgOptions.minimum_relative_linewidth_ratio`](/cad/python-net/aspose.cad.imageoptions/svgoptions#minimum_relative_linewidth_ratio) to specify maximum rate of image size to line width when line won't be rescaled up yet.
If true, use [`SvgOptions.minimum_absolute_nonscaled_linewidth`](/cad/python-net/aspose.cad.imageoptions/svgoptions#minimum_absolute_nonscaled_linewidth) to specify minimum unscaled width in pixels

### Example 


using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();

cadRasterizationOptions.PageWidth = 1000;
cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels

SvgOptions opt = new SvgOptions();
opt.UseAbsoluteRescaling = false; //using relative rescaling treshold
opt.MinimumRelativeLinewidthRatio = 5000; //As result, lines thinner than 1/5th of a pixel would be made thicker, approaching the thickness of 1/5th of a pixel
opt.VectorRasterizationOptions = cadRasterizationOptions;
img.Save(outFile, opt);
} 


using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();

cadRasterizationOptions.PageWidth = 1000;
cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels

SvgOptions opt = new SvgOptions();
opt.UseAbsoluteRescaling = true; //using absolute rescaling treshold
opt.MinimumAbsoluteNonscaledLinewidth = 5; //As result, lines thinner than 5 pixels wide would be made thicker, approaching the thickness of 5 pixels
opt.VectorRasterizationOptions = cadRasterizationOptions;
img.Save(outFile, opt);
}
### Definition:
```python
@property
def use_absolute_rescaling(self):
    ...
@use_absolute_rescaling.setter
def use_absolute_rescaling(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions)
