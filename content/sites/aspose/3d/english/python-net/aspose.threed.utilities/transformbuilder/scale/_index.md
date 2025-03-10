---
title: scale method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 120
url: /python-net/aspose.threed.utilities/transformbuilder/scale/
is_root: false
---

## scale(self, s) {#float}

Chain a scaling transform matrix with a component scaled by s



```python

def scale(self, s):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| s | float |  |

### Example 


```python
from aspose.threed.utilities import TransformBuilder

tb = TransformBuilder()
tb.scale(10)
print(f"Transform Matrix: {tb.matrix}")

```


## scale(self, s) {#aspose.threed.utilities.Vector3}

Chain a scale transform



```python

def scale(self, s):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| s | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) |  |

### Example 


```python
from aspose.threed.utilities import TransformBuilder, Vector3

tb = TransformBuilder()
tb.scale(Vector3(10, 10, 10))
print(f"Transform Matrix: {tb.matrix}")

```


## scale(self, x, y, z) {#float-float-float}

Chain a scaling transform matrix



```python

def scale(self, x, y, z):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| x | float |  |
| y | float |  |
| z | float |  |

### Example 


```python
from aspose.threed.utilities import TransformBuilder

tb = TransformBuilder()
tb.scale(10, 10, 10)
print(f"Transform Matrix: {tb.matrix}")

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder)
