---
title: create_polygon method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.threed.entities/mesh/create_polygon/
is_root: false
---

## create_polygon(indices) {#list}

Creates a new polygon with all vertices defined in `indices`.
To create polygon vertex by vertex, please use [PolygonBuilder](/3d/python-net/aspose.threed.entities/polygonbuilder).



```python
def create_polygon(self, indices):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| indices | list | Array of the polygon indices, each index points to a control point that forms the polygon. |

### Example 


```python

indices = [0, 1, 2]
mesh.create_polygon(indices)

```


## create_polygon(indices, offset, length) {#list-int-int}

Creates a new polygon with all vertices defined in `indices`.
To create polygon vertex by vertex, please use [PolygonBuilder](/3d/python-net/aspose.threed.entities/polygonbuilder).



```python
def create_polygon(self, indices, offset, length):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| indices | list | Array of the polygon indices, each index points to a control point that forms the polygon. |
| offset | int | The offset of the first polygon index |
| length | int | The length of the indices |

### Example 


```python

indices = [0, 1, 2]
mesh.create_polygon(indices)

```


## create_polygon(v1, v2, v3) {#int-int-int}

Create a polygon with 3 vertices(triangle)



```python
def create_polygon(self, v1, v2, v3):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| v1 | int | Index of the first vertex |
| v2 | int | Index of the second vertex |
| v3 | int | Index of the third vertex |


## create_polygon(v1, v2, v3, v4) {#int-int-int-int}

Create a polygon with 4 vertices(quad)



```python
def create_polygon(self, v1, v2, v3, v4):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| v1 | int | Index of the first vertex |
| v2 | int | Index of the second vertex |
| v3 | int | Index of the third vertex |
| v4 | int | Index of the fourth vertex |



### See Also
* module [aspose.threed.entities](../../)
* class [Mesh](/3d/python-net/aspose.threed.entities/mesh)
