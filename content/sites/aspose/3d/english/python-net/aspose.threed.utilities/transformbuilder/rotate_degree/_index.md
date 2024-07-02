---
title: rotate_degree method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed.utilities/transformbuilder/rotate_degree/
is_root: false
---

## rotate_degree {#float-aspose.threed.utilities.Vector3}

Chain a rotation transform in degree



```python
def rotate_degree(self, angle, axis):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| angle | float | The angle to rotate in degree |
| axis | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | The axis to rotate |

### Example 


```python
from aspose.threed.utilities import TransformBuilder, Vector3

tb = TransformBuilder()
tb.rotate_degree(90, Vector3.Y_AXIS)
print(f"Transform Matrix: {tb.matrix}")

```


## rotate_degree {#aspose.threed.utilities.Vector3-aspose.threed.utilities.RotationOrder}

Append rotation with specified order



```python
def rotate_degree(self, rot, order):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rot | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | Rotation in degrees |
| order | [`RotationOrder`](/3d/python-net/aspose.threed.utilities/rotationorder) |  |



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder)
