---
title: translate method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.threed.utilities/matrix4/translate/
is_root: false
---

## translate(, t) {#aspose.threed.utilities.Vector3}

Creates a matrix that translates along the x-axis, the y-axis and the z-axis


### Returns 





```python

@staticmethod
def translate(t):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| t | aspose.threed.utilities.Vector3 | Translate offset |

### Example 


The following code shows how to create a matrix for translate operation.

```python
from aspose.threed.utilities import Matrix4, Vector3

t = Matrix4.translate(Vector3(10, 0, 0))
pos = Vector3(1, 1, 10)
print(f"Transformed: {t * pos}")

```


## translate(, tx, ty, tz) {#float-float-float}

Creates a matrix that translates along the x-axis, the y-axis and the z-axis


### Returns 





```python

@staticmethod
def translate(tx, ty, tz):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| tx | float | X-coordinate offset |
| ty | float | Y-coordinate offset |
| tz | float | Z-coordinate offset |



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4)
