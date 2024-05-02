---
title: is_closed property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/is_closed/
is_root: false
---

## is_closed property


Gets or sets a value indicating whether is closed.
Specifies whether the path is closed.
If set to true, the stroke is drawn "closed", that is,
the last point in the last segment of the path figure is connected with
the point specified in the StartPoint attribute,
otherwise the stroke is drawn "open", and the last point is not connected to the start point.
Only applicable if the path figure is used in a Path element that specifies a stroke.
### Definition:
```python
@property
def is_closed(self):
    ...
@is_closed.setter
def is_closed(self, value):
    ...
```

### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](../../)
* class [`PathFigure`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure)
