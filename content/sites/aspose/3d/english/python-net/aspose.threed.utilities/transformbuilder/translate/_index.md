﻿---
title: translate method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.threed.utilities/transformbuilder/translate/
is_root: false
---

## translate(self, v) {#aspose.threed.utilities.Vector3}

Chain a translation transform



```python

def translate(self, v):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| v | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) |  |

### Example 


```python
from aspose.threed.utilities import TransformBuilder, Vector3

tb = TransformBuilder()
tb.translate(Vector3(0, 10, 0))
print(f"Transform Matrix: {tb.matrix}")

```


## translate(self, tx, ty, tz) {#float-float-float}

Chain a translation transform



```python

def translate(self, tx, ty, tz):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| tx | float |  |
| ty | float |  |
| tz | float |  |

### Example 


```python
from aspose.threed.utilities import TransformBuilder

tb = TransformBuilder()
tb.translate(0, 10, 0)
print(f"Transform Matrix: {tb.matrix}")

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder)
