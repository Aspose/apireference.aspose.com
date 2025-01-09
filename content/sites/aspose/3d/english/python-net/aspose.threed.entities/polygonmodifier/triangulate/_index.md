---
title: triangulate method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 90
url: /aspose.threed.entities/polygonmodifier/triangulate/
is_root: false
---

## triangulate {#aspose.threed.Scene}

Convert all polygon-based meshes into full triangle mesh



```python
def triangulate(self, scene):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | [`Scene`](/3d/python-net/aspose.threed/scene) | The scene to process |

### Example 


The following code shows how to merge all objects from a scene into a single mesh.

```python
from aspose.threed import Scene
from aspose.threed.entities import Cylinder, PolygonModifier

mesh = Cylinder().to_mesh()
# Triangulate this quadrangle-based mesh to triangle-based
mesh = PolygonModifier.triangulate(mesh)
scene = Scene(mesh)
scene.save("test.obj")

```


## triangulate {#aspose.threed.entities.Mesh}

Convert a polygon-based mesh into full triangle mesh


### Returns 


The generated new triangle mesh


```python
def triangulate(self, mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) | The original non-triangle mesh |

### Example 


The following code shows how to merge all objects from a scene into a single mesh.

```python
from aspose.threed import Scene
from aspose.threed.entities import Cylinder, PolygonModifier

mesh = Cylinder().to_mesh()
# Triangulate this quadrangle-based mesh to triangle-based
mesh = PolygonModifier.triangulate(mesh)
scene = Scene(mesh)
scene.save("test.obj")

```


## triangulate {#list}





```python
def triangulate(self, control_points):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | list |  |


## triangulate {#list-list}





```python
def triangulate(self, control_points, polygons):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | list |  |
| polygons | list |  |


## triangulate {#list-list}





```python
def triangulate(self, control_points, polygon):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | list |  |
| polygon | list |  |


## triangulate {#list-list-bool-any}





```python
def triangulate(self, control_points, polygons, generate_normals, nor_out):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | list |  |
| polygons | list |  |
| generate_normals | bool |  |
| nor_out | any |  |



### See Also
* module [`aspose.threed.entities`](../../)
* class [`PolygonModifier`](/3d/python-net/aspose.threed.entities/polygonmodifier)
