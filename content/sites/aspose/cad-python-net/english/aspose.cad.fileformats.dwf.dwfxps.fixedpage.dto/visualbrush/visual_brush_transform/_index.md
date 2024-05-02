---
title: visual_brush_transform property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/visual_brush_transform/
is_root: false
---

## visual_brush_transform property


Gets or sets the visual brush transform.
Describes the matrix transformation applied to the coordinate space of the brush.
The Transform property is concatenated with the current effective render transform to yield an effective render  transform local to the brush.
The viewport for the brush is transformed using the local effective render transform.
### Definition:
```python
@property
def visual_brush_transform(self):
    ...
@visual_brush_transform.setter
def visual_brush_transform(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`Transform`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/transform)
* class [`VisualBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush)
