---
title: get_local_transform method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.cad.fileformats.glb/node/get_local_transform/
is_root: false
---

## get_local_transform {#aspose.cad.fileformats.glb.Animation-float}

Gets the local transform of this node in a given animation at a given time.


### Returns 


the sampled transform.


```python
def get_local_transform(self, animation, time):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| animation | [`Animation`](/cad/python-net/aspose.cad.fileformats.glb/animation) | the animation to sample. |
| time | float | the time offset within the animation. |
### Remarks

This is a convenience method, but it's slow, it's better to cache [`Node.get_curve_samplers`](/cad/python-net/aspose.cad.fileformats.glb/node/get_curve_samplers).


### See Also
* module [`aspose.cad.fileformats.glb`](../../)
* class [`AffineTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform)
* class [`Node`](/cad/python-net/aspose.cad.fileformats.glb/node)
