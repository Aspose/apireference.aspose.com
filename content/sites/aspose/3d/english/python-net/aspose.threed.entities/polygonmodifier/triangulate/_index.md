---
title: triangulate method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.threed.entities/polygonmodifier/triangulate/
is_root: false
---

## triangulate(, scene) {#aspose.threed.Scene}

Convert all polygon-based meshes into full triangle mesh



```python

@staticmethod
def triangulate(scene):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | aspose.threed.Scene | The scene to process |

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


## triangulate(, mesh) {#aspose.threed.entities.Mesh}

Convert a polygon-based mesh into full triangle mesh


### Returns 


The generated new triangle mesh


```python

@staticmethod
def triangulate(mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | aspose.threed.entities.Mesh | The original non-triangle mesh |

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


## triangulate(, control_points) {#list}





```python

@staticmethod
def triangulate(control_points):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | list |  |


## triangulate(, control_points, polygons) {#list-list}





```python

@staticmethod
def triangulate(control_points, polygons):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | list |  |
| polygons | list |  |


## triangulate(, control_points, polygon) {#list-list}





```python

@staticmethod
def triangulate(control_points, polygon):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | list |  |
| polygon | list |  |


## triangulate(, control_points, polygons, generate_normals, nor_out) {#list-list-bool-any}





```python

@staticmethod
def triangulate(control_points, polygons, generate_normals, nor_out):
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
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`PolygonModifier`](/3d/python-net/aspose.threed.entities/polygonmodifier)
