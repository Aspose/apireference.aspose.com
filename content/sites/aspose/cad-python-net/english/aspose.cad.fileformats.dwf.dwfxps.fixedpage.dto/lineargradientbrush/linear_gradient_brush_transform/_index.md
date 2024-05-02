---
title: linear_gradient_brush_transform property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/linear_gradient_brush_transform/
is_root: false
---

## linear_gradient_brush_transform property


Gets or sets the linear gradient brush transform.
Describes the matrix transformation applied to the coordinate space of the brush.
The Transform property is concatenated with the current effective render
transform to yield an effective render transform local to the brush.
The start point and end point are transformed using the local effective render transform.
### Definition:
```python
@property
def linear_gradient_brush_transform(self):
    ...
@linear_gradient_brush_transform.setter
def linear_gradient_brush_transform(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`LinearGradientBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush)
* class [`Transform`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/transform)
