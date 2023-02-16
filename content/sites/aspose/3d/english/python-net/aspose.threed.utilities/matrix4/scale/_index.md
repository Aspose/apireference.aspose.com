---
title: scale method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed.utilities/matrix4/scale/
is_root: false
---

## scale(s) {#Vector3}

Creates a matrix that scales along the x-axis, the y-axis and the z-axis.


### Returns 





```python
def scale(self, s):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| s | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | Scaling factories applies to the x-axis, the y-axis and the z-axis |

### Example 


The following code shows how to create a matrix for scale operation.

```python
from aspose.threed.utilities import Matrix4, Vector3

t = Matrix4.scale(Vector3(10, 10, 10))
pos = Vector3(1, 1, 10)
print(f"Transformed: {t * pos}")

```


## scale(s) {#float}

Creates a matrix that scales along the x-axis, the y-axis and the z-axis.


### Returns 





```python
def scale(self, s):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| s | float | Scaling factories applies to all axex |


## scale(sx, sy, sz) {#float-float-float}

Creates a matrix that scales along the x-axis, the y-axis and the z-axis.


### Returns 





```python
def scale(self, sx, sy, sz):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| sx | float | Scaling factories applies to the x-axis |
| sy | float | Scaling factories applies to the y-axis |
| sz | float | Scaling factories applies to the z-axis |



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4)
