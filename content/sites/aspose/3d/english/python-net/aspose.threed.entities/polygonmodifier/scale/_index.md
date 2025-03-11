---
title: scale method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.entities/polygonmodifier/scale/
is_root: false
---

## scale(, scene, scale) {#aspose.threed.Scene-aspose.threed.utilities.Vector3}

Scale all geometries(Scale the control points not the transformation matrix) in this scene



```python

@staticmethod
def scale(scene, scale):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | [`Scene`](/3d/python-net/aspose.threed/scene) | The scene to scale |
| scale | aspose.threed.utilities.Vector3 | The scale factor |

### Example 


The following code shows how to scale all geometries in scene by 10 times.
		
```python
from aspose.threed import Scene
from aspose.threed.entities import PolygonModifier
from aspose.threed.utilities import Vector3

# Load a test file for scaling
scene = Scene.from_file("input.fbx")
# scale all geometries 10 times.
PolygonModifier.scale(scene, Vector3(10, 10, 10))
scene.save("test.obj")

```


## scale(, node, scale) {#aspose.threed.Node-aspose.threed.utilities.Vector3}

Scale all geometries(Scale the control points not the transformation matrix) in this node



```python

@staticmethod
def scale(node, scale):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | [`Node`](/3d/python-net/aspose.threed/node) | The node to scale |
| scale | aspose.threed.utilities.Vector3 | The scale factor |

### Example 


The following code shows how to scale all geometries in scene by 10 times.
		 
```python
from aspose.threed import Scene
from aspose.threed.entities import PolygonModifier
from aspose.threed.utilities import Vector3

# Load a test file for scaling
scene = Scene.from_file("input.fbx")
# scale all geometries 10 times.
PolygonModifier.scale(scene.root_node, Vector3(10, 10, 10))
scene.save("test.obj")

```



### See Also
* module [`aspose.threed.entities`](../../)
* class [`PolygonModifier`](/3d/python-net/aspose.threed.entities/polygonmodifier)
