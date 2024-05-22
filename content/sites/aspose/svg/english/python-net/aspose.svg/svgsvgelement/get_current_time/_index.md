---
title: get_current_time method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 240
url: /python-net/aspose.svg/svgsvgelement/get_current_time/
is_root: false
---

## get_current_time {#}

Returns the current time in seconds relative to the start time for the current SVG document fragment. If getCurrentTime is called before the document timeline has begun (for example, by script running in a ‘script’ element before the document's SVGLoad event is dispatched), then 0 is returned.


### Returns 


The current time in seconds, or 0 if the document timeline has not yet begun.


```python
def get_current_time(self):
    ...
```





### See Also
* module [`aspose.svg`](../../)
* class [`SVGSVGElement`](/svg/python-net/aspose.svg/svgsvgelement)
