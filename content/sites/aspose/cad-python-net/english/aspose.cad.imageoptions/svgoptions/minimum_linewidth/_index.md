---
title: minimum_linewidth property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.cad.imageoptions/svgoptions/minimum_linewidth/
is_root: false
---

## minimum_linewidth property


Minumum width of the line relative to minimum non-rescaled linewidth.
A line with width of 0 would be drawn with this width if rescaling is used ( as it is by default), lines thicker than that will be drawn thicker until they reach rescaling treshold, lines thicker than that won't be rescaled.

### Example 


using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();

cadRasterizationOptions.PageWidth = 1000;
cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels

SvgOptions opt = new SvgOptions();
opt.UseAbsoluteRescaling = true; //using absolute rescaling limit
opt.MinimumAbsoluteNonscaledLinewidth = 5; //As result, lines thinner than 5 pixels wide would be made thicker, approaching the thickness of 5 pixels
opt.MinimumLinewidth = 0.2f; // As result, lines with width of 0 will be drawn with width of 1 pixel. A line with source width of 1 pixel would be rescaled to be 1.8 pixels wide
opt.VectorRasterizationOptions = cadRasterizationOptions;
img.Save(outFile, opt);
}
### Definition:
```python
@property
def minimum_linewidth(self):
    ...
@minimum_linewidth.setter
def minimum_linewidth(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions)
