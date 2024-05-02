---
title: try_invert method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.cad.fileformats.glb.transforms/affinetransform/try_invert/
is_root: false
---

## try_invert {#any-any}

Inverts the specified transform. The return value indicates whether the operation succeeded.


### Returns 


True if the operation succeeds.


```python
def try_invert(self, xform, inverse):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| xform | any | The transform to invert. |
| inverse | any | The inverted result. |
### Remarks

SRT format with uneven scale can produce results that differ from a matrix


### See Also
* module [`aspose.cad.fileformats.glb.transforms`](../../)
* class [`AffineTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform)
