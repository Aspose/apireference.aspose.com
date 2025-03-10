---
title: rotate method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.utilities/transformbuilder/rotate/
is_root: false
---

## rotate(self, q) {#aspose.threed.utilities.Quaternion}

Chain a rotation by a quaternion



```python

def rotate(self, q):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| q | [`Quaternion`](/3d/python-net/aspose.threed.utilities/quaternion) |  |

### Example 


```python
from aspose.threed.utilities import Quaternion, TransformBuilder
import math

tb = TransformBuilder()
tb.rotate(Quaternion.from_euler_angle(0, math.pi, 0))
print(f"Transform Matrix: {tb.matrix}")

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder)
