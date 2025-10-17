---
title: from_file method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.threed/scene/from_file/
is_root: false
---

## from_file(, file_name) {#System.String}

Opens the scene from given path



```python

@staticmethod
def from_file(file_name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_name | System.String | File name. |
### Exceptions
| Exception | Description |
| :- | :- |
| IOException | Thrown when failed at reading input |
| [`ImportException`](/3d/python-net/aspose.threed/importexception) | Thrown when input is not a valid 3D format |



### Example 


The following code shows how to create a scene from a file

```python
from aspose.threed import Scene

scene = Scene.from_file("input.fbx")

```



### See Also
* module [`aspose.threed`](../../)
* class [`ImportException`](/3d/python-net/aspose.threed/importexception)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
