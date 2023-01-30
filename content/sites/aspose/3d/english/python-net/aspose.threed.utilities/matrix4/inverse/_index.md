---
title: inverse method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.utilities/matrix4/inverse/
is_root: false
---

## inverse() {#}

Inverses this instance.


### Returns 


Inverse matrix4


```python
def inverse(self):
    ...
```



### Example 


The following code shows how to inverse a matrix

```python
from aspose.threed.utilities import Matrix4

t = Matrix4.translate(0, 10, 9)
mat = t.inverse()
print(f"Inversed Matrix: {mat}")

```



### See Also
* module [aspose.threed.utilities](../../)
* class [Matrix4](/3d/python-net/aspose.threed.utilities/matrix4)
