---
title: Scene constructor
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed/scene/__init__/
is_root: false
---

## \_\_init\_\_(self) {#}

Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class.



```python

def __init__(self):
    ...
```




## \_\_init\_\_(self, entity) {#aspose.threed.Entity}

Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class with an entity attached to a new node.



```python

def __init__(self, entity):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| entity | [`Entity`](/3d/python-net/aspose.threed/entity) | The initial entity that attached to the scene |

### Example 


The following code shows how to create a [`Scene`](/3d/python-net/aspose.threed/scene) directly from an [`Entity`](/3d/python-net/aspose.threed/entity):

```python
from aspose.threed import Scene
from aspose.threed.entities import Box

scene = Scene(Box())

```


## \_\_init\_\_(self, parent_scene, name) {#aspose.threed.Scene-str}

Initializes a new instance of the [`Scene`](/3d/python-net/aspose.threed/scene) class as a sub-scene.



```python

def __init__(self, parent_scene, name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| parent_scene | [`Scene`](/3d/python-net/aspose.threed/scene) | The parent scene. |
| name | str | Scene's name. |



### See Also
* module [`aspose.threed`](../../)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
