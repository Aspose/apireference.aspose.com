---
title: minimum_relative_linewidth_ratio property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.cad.imageoptions/svgoptions/minimum_relative_linewidth_ratio/
is_root: false
---

## minimum_relative_linewidth_ratio property


Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling treshold is used. A smaller dimension is picked as image size.

### Example 


using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();

cadRasterizationOptions.PageWidth = 1000;
cadRasterizationOptions.PageHeight = 1000; // as units are not set, the size is in pixels

SvgOptions opt = new SvgOptions();
opt.UseAbsoluteRescaling = false; //using relative rescaling limit
opt.MinimumRelativeLinewidthRatio = 5000; //As result, lines thinner than 1/5th of a pixel would be made thicker, approaching the thickness of 1/5th of a pixel
opt.VectorRasterizationOptions = cadRasterizationOptions;
img.Save(outFile, opt);
}
### Definition:
```python
@property
def minimum_relative_linewidth_ratio(self):
    ...
@minimum_relative_linewidth_ratio.setter
def minimum_relative_linewidth_ratio(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions)
