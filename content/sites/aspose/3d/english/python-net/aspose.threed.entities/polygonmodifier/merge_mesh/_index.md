---
title: merge_mesh method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed.entities/polygonmodifier/merge_mesh/
is_root: false
---

## merge_mesh(, scene) {#aspose.threed.Scene}

Convert a whole scene to a single transformed mesh
Vertex elements like normal/texture coordinates are not supported yet


### Returns 


The merged mesh


```python

@staticmethod
def merge_mesh(scene):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | [`Scene`](/3d/python-net/aspose.threed/scene) | The scene to merge |

### Example 


The following code shows how to merge all objects from a scene into a single mesh.

```python
from aspose.threed import Scene
from aspose.threed.entities import PolygonModifier

# Input file may contains multiple objects
scene = Scene.from_file("input.fbx")
# now merge them into a single mesh
merged = PolygonModifier.merge_mesh(scene)
# then we save it to a file with only one mesh
newScene = Scene(merged)
newScene.save("test.obj")

```


## merge_mesh(, nodes) {#list}





```python

@staticmethod
def merge_mesh(nodes):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| nodes | list |  |


## merge_mesh(, node) {#aspose.threed.Node}

Convert a whole node to a single transformed mesh
Vertex elements like normal/texture coordinates are not supported yet


### Returns 


Merged mesh


```python

@staticmethod
def merge_mesh(node):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | [`Node`](/3d/python-net/aspose.threed/node) | The node to merge |

### Example 


The following code shows how to merge all objects from nodes into a single mesh.

```python
from aspose.threed import Scene
from aspose.threed.entities import PolygonModifier

# Input file may contains multiple objects
scene = Scene.from_file("input.fbx")
# now merge them into a single mesh
merged = PolygonModifier.merge_mesh(scene.root_node)
# then we save it to a file with only one mesh
newScene = Scene(merged)
newScene.save("test.obj")

```



### See Also
* module [`aspose.threed.entities`](../../)
* class [`PolygonModifier`](/3d/python-net/aspose.threed.entities/polygonmodifier)
