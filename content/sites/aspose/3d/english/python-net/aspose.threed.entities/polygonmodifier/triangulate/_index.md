---
title: triangulate method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed.entities/polygonmodifier/triangulate/
is_root: false
---

## triangulate(scene) {#Scene}

Convert all polygon-based meshes into full triangle mesh



```python
def triangulate(self, scene):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| scene | [Scene](/3d/python-net/aspose.threed/scene) | The scene to process |


## triangulate(mesh) {#Mesh}

Convert a polygon-based mesh into full triangle mesh

### Returns 


The generated new triangle mesh


```python
def triangulate(self, mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | [Mesh](/3d/python-net/aspose.threed.entities/mesh) | The original non-triangle mesh |


## triangulate(control_points) {#System.Collections.Generic.IList<Aspose.ThreeD.Utilities.Vector4>}



```python
def triangulate(self, control_points):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | System.Collections.Generic.IList<Aspose.ThreeD.Utilities.Vector4> |  |


## triangulate(control_points, polygons) {#System.Collections.Generic.IList<Aspose.ThreeD.Utilities.Vector4>-System.Collections.Generic.IList<int[]>}



```python
def triangulate(self, control_points, polygons):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | System.Collections.Generic.IList<Aspose.ThreeD.Utilities.Vector4> |  |
| polygons | System.Collections.Generic.IList<int[]> |  |


## triangulate(control_points, polygon) {#System.Collections.Generic.IList<Aspose.ThreeD.Utilities.Vector4>-int[]}



```python
def triangulate(self, control_points, polygon):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | System.Collections.Generic.IList<Aspose.ThreeD.Utilities.Vector4> |  |
| polygon | int[] |  |


## triangulate(control_points, polygons, generate_normals, nor_out) {#System.Collections.Generic.IList<Aspose.ThreeD.Utilities.Vector4>-System.Collections.Generic.IList<int[]>-bool-Aspose.ThreeD.Utilities.Vector3[]&}



```python
def triangulate(self, control_points, polygons, generate_normals, nor_out):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| control_points | System.Collections.Generic.IList<Aspose.ThreeD.Utilities.Vector4> |  |
| polygons | System.Collections.Generic.IList<int[]> |  |
| generate_normals | bool |  |
| nor_out | Aspose.ThreeD.Utilities.Vector3[]& |  |



### See Also
* module [aspose.threed.entities](../../)
* class [PolygonModifier](/3d/python-net/aspose.threed.entities/polygonmodifier)
