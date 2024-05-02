---
title: rescale_subpixel_linewidths property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.cad.imageoptions/svgoptions/rescale_subpixel_linewidths/
is_root: false
---

## rescale_subpixel_linewidths property


Whether sub-pixel linewidths should be rescaled. 
If set to true, lines thinner than a width specified by other options will be drawn thicker, asymptotically approaching the minimum width

### Example 


using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
SvgOptions opt = new SvgOptions();
opt.RescaleSubpixelLinewidths = false; //now lines with width in source file == 0 will not be visible
opt.VectorRasterizationOptions = cadRasterizationOptions;
img.Save(outFile, opt);
}
### Definition:
```python
@property
def rescale_subpixel_linewidths(self):
    ...
@rescale_subpixel_linewidths.setter
def rescale_subpixel_linewidths(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions)
