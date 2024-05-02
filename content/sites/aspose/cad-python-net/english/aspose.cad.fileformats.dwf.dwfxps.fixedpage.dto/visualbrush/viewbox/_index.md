---
title: viewbox property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush/viewbox/
is_root: false
---

## viewbox property


Gets or sets the view box.
Specifies the position and dimensions of the brush's source content.
Specifies four comma separated real numbers (x, y, Width, Height), where width and height are non-negative.
The view box defines the default coordinate system for the element specified in the VisualBrush.Visual property element.
The corners of the view box are mapped to the corners of the viewport, thereby providing the default clipping and transform for the brush’s source content.
### Definition:
```python
@property
def viewbox(self):
    ...
@viewbox.setter
def viewbox(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`VisualBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/visualbrush)
