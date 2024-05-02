---
title: text_as_shapes property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 160
url: /python-net/aspose.cad.imageoptions/svgoptions/text_as_shapes/
is_root: false
---

## text_as_shapes property


Gets or sets a value indicating whether text must be converted as shapes.
By default text will be converted to shapes, so it won't be selectable.

### Example 


using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
SvgOptions opt = new SvgOptions();
opt.TextAsShapes = true;
opt.VectorRasterizationOptions = cadRasterizationOptions;
img.Save(outFile, opt);
}
### Definition:
```python
@property
def text_as_shapes(self):
    ...
@text_as_shapes.setter
def text_as_shapes(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions)
