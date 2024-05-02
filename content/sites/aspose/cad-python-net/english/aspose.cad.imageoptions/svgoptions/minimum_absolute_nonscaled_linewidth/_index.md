---
title: minimum_absolute_nonscaled_linewidth property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.cad.imageoptions/svgoptions/minimum_absolute_nonscaled_linewidth/
is_root: false
---

## minimum_absolute_nonscaled_linewidth property


Lines with width in pixels less than this will be rescaled if absolute rescaling treshold

### Example 


using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();

cadRasterizationOptions.PageWidth = 1000;
cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels

SvgOptions opt = new SvgOptions();
opt.UseAbsoluteRescaling = true; //using absolute rescaling limit
opt.MinimumAbsoluteNonscaledLinewidth = 5; //As result, lines thinner than 5 pixels wide would be made thicker, approaching the thickness of 5 pixels
opt.VectorRasterizationOptions = cadRasterizationOptions;
img.Save(outFile, opt);
}
### Definition:
```python
@property
def minimum_absolute_nonscaled_linewidth(self):
    ...
@minimum_absolute_nonscaled_linewidth.setter
def minimum_absolute_nonscaled_linewidth(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions)
