---
title: rotate method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.utilities/matrix4/rotate/
is_root: false
---

## rotate(, q) {#aspose.threed.utilities.Quaternion}

Create a rotation matrix from a quaternion


### Returns 





```python

@staticmethod
def rotate(q):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| q | aspose.threed.utilities.Quaternion | Rotation quaternion |


## rotate(, angle, axis) {#float-aspose.threed.utilities.Vector3}

Create a rotation matrix by rotation angle and axis


### Returns 





```python

@staticmethod
def rotate(angle, axis):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| angle | float | Rotate angle in radian |
| axis | aspose.threed.utilities.Vector3 | Rotation axis |

### Example 


The following code shows how to create a matrix for rotate operation.

```python
from aspose.threed.utilities import Matrix4, Vector3
import math

t = Matrix4.rotate(math.pi, Vector3(0, 1, 0))
pos = Vector3(1, 1, 10)
print(f"Transformed: {t * pos}")

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4)
