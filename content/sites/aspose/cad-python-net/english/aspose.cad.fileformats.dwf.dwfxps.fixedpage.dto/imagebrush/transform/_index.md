---
title: transform property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush/transform/
is_root: false
---

## transform property


Gets or sets the transform.
Describes the matrix transformation applied to the coordinate space of the brush.
The Transform property is concatenated with the current effective render
transform to yield an effective render transform local to the brush.
The viewport for the brush is transformed using the local effective render transform.
### Definition:
```python
@property
def transform(self):
    ...
@transform.setter
def transform(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`ImageBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/imagebrush)
