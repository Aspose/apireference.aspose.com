---
title: transpose method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 120
url: /python-net/aspose.threed.utilities/matrix4/transpose/
is_root: false
---

## transpose() {#}

Transposes this instance.


### Returns 


The transposed matrix.


```python
def transpose(self):
    ...
```



### Example 


The following code shows how to transpose a matrix

```python
from aspose.threed.utilities import Matrix4

t = Matrix4.translate(0, 10, 9)
mat = t.transpose()
print(f"Transposed Matrix: {mat}")

```



### See Also
* module [aspose.threed.utilities](../../)
* class [Matrix4](/3d/python-net/aspose.threed.utilities/matrix4)
