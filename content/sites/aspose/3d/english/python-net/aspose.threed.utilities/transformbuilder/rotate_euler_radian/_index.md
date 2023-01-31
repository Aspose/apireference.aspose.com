---
title: rotate_euler_radian method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.threed.utilities/transformbuilder/rotate_euler_radian/
is_root: false
---

## rotate_euler_radian(r) {#Vector3}

Chain a rotation by Euler angles in radian



```python
def rotate_euler_radian(self, r):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| r | [Vector3](/3d/python-net/aspose.threed.utilities/vector3) |  |

### Example 


```python
from aspose.threed.utilities import TransformBuilder, Vector3

tb = TransformBuilder()
tb.rotate_euler_radian(Vector3(0, math.pi, 0))
print(f"Transform Matrix: {tb.matrix}")

```


## rotate_euler_radian(x, y, z) {#float-float-float}

Chain a rotation by Euler angles in radian



```python
def rotate_euler_radian(self, x, y, z):
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
tb.rotate_euler_radian(0, math.pi, 0)
print(f"Transform Matrix: {tb.matrix}")

```



### See Also
* module [aspose.threed.utilities](../../)
* class [TransformBuilder](/3d/python-net/aspose.threed.utilities/transformbuilder)
