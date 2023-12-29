---
title: rotate_radian method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 110
url: /aspose.threed.utilities/transformbuilder/rotate_radian/
is_root: false
---

## rotate_radian {#float-aspose.threed.utilities.Vector3}

Chain a rotation transform in radian



```python
def rotate_radian(self, angle, axis):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| angle | float | The angle to rotate in radian |
| axis | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | The axis to rotate |

### Example 


```python
from aspose.threed.utilities import TransformBuilder, Vector3
import math

tb = TransformBuilder()
tb.rotate_radian(math.pi, Vector3.Y_AXIS)
print(f"Transform Matrix: {tb.matrix}")

```


## rotate_radian {#aspose.threed.utilities.Vector3-aspose.threed.utilities.RotationOrder}

Append rotation with specified order



```python
def rotate_radian(self, rot, order):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rot | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | Rotation in radian |
| order | [`RotationOrder`](/3d/python-net/aspose.threed.utilities/rotationorder) |  |

### Example 


```python
from aspose.threed.utilities import RotationOrder, TransformBuilder, Vector3

tb = TransformBuilder()
tb.rotate_radian(Vector3(0.3, 0.4, 0.1), RotationOrder.YZX)
print(f"Transform Matrix: {tb.matrix}")

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder)
