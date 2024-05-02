---
title: radial_gradient_brush_transform property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radial_gradient_brush_transform/
is_root: false
---

## radial_gradient_brush_transform property


Gets or sets the radial gradient brush transform.
Describes the matrix transformation applied to the coordinate space of the brush.
The Transform property is concatenated with the current effective render transform
to yield an effective render transform local to the brush. The center, gradient origin,
x radius, and y radius are transformed using the local effective render transform.
### Definition:
```python
@property
def radial_gradient_brush_transform(self):
    ...
@radial_gradient_brush_transform.setter
def radial_gradient_brush_transform(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`RadialGradientBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush)
* class [`Transform`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/transform)
