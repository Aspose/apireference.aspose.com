---
title: rotate_euler_degree method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.threed.utilities/transformbuilder/rotate_euler_degree/
is_root: false
---

## rotate_euler_degree {#float-float-float}

Chain a rotation by Euler angles in degree



```python
def rotate_euler_degree(self, deg_x, deg_y, deg_z):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| deg_x | float |  |
| deg_y | float |  |
| deg_z | float |  |

### Example 


```python
from aspose.threed.utilities import TransformBuilder

tb = TransformBuilder()
tb.rotate_euler_degree(0, 90, 0)
print(f"Transform Matrix: {tb.matrix}")

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder)
