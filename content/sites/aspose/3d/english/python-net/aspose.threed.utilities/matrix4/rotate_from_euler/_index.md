---
title: rotate_from_euler method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.utilities/matrix4/rotate_from_euler/
is_root: false
---

## rotate_from_euler(, eul) {#aspose.threed.utilities.Vector3}

Create a rotation matrix from Euler angle


### Returns 





```python

@staticmethod
def rotate_from_euler(eul):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| eul | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | Rotation in radian |

### Example 


The following code shows how to create a matrix for rotate operation.

```python
from aspose.threed.utilities import Matrix4, Vector3
import math

t = Matrix4.rotate_from_euler(Vector3(0, math.pi, 0))
pos = Vector3(1, 1, 10)
print(f"Transformed: {t * pos}")

```


## rotate_from_euler(, rx, ry, rz) {#float-float-float}

Create a rotation matrix from Euler angle


### Returns 





```python

@staticmethod
def rotate_from_euler(rx, ry, rz):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rx | float | Rotation in x axis in radian |
| ry | float | Rotation in y axis in radian |
| rz | float | Rotation in z axis in radian |



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4)
