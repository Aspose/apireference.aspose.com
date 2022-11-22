---
title: Mesh constructor
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.entities/mesh/__init__/
is_root: false
---

## Mesh() {#}

Initializes a new instance of the [Mesh](/3d/python-net/aspose.threed.entities/mesh) class.



```python
def __init__(self):
    ...
```




## Mesh(height_map) {#System.Drawing.Bitmap}

Construct a mesh using specified height map, 
            if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)
            The control point's x and y components are normalized pixel coordinate.



```python
def __init__(self, height_map):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| height_map | System.Drawing.Bitmap | Input height map |


## Mesh(name) {#str}

Initializes a new instance of the [Mesh](/3d/python-net/aspose.threed.entities/mesh) class.



```python
def __init__(self, name):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| name | str | Name. |


## Mesh(height_map, transform) {#System.Drawing.Bitmap-aspose.threed.utilities.Matrix4}

Construct a mesh using specified height map, 
            if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)
            The control point's x and y components are normalized pixel coordinate.



```python
def __init__(self, height_map, transform):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| height_map | System.Drawing.Bitmap | Input height map |
| transform | aspose.threed.utilities.Matrix4 | The transform that applied on the control points |


## Mesh(height_map, tri_mesh, transform) {#System.Drawing.Bitmap-bool-aspose.threed.utilities.Matrix4}

Construct a mesh using specified height map, 
            if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z)
            The control point's x and y components are normalized pixel coordinate.



```python
def __init__(self, height_map, tri_mesh, transform):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| height_map | System.Drawing.Bitmap | Input height map |
| tri_mesh | bool |  |
| transform | aspose.threed.utilities.Matrix4 | The transform that applied on the control points |



### See Also
* module [aspose.threed.entities](../../)
* class [Mesh](/3d/python-net/aspose.threed.entities/mesh)
