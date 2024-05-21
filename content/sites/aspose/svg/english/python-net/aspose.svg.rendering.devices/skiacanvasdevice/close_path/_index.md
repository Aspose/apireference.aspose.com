---
title: close_path method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.svg.rendering.devices/skiacanvasdevice/close_path/
is_root: false
---

## close_path {#}

Closes the current subpath by appending a straight line segment from the current point to the starting point of the subpath. 
If the current subpath is already closed, "ClosePath" does nothing.
This operator terminates the current subpath. Appending another segment to the current path begins a new subpath, 
even if the new segment begins at the endpoint reached by the "ClosePath" method.



```python
def close_path(self):
    ...
```





### See Also
* module [`aspose.svg.rendering.devices`](../../)
* class [`SkiaCanvasDevice`](/svg/python-net/aspose.svg.rendering.devices/skiacanvasdevice)
