---
title: from_mesh method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /aspose.threed.entities/trimesh/from_mesh/
is_root: false
---

## from_mesh {#aspose.threed.utilities.VertexDeclaration-aspose.threed.entities.Mesh}

Create a TriMesh from given mesh object with given vertex layout.


### Returns 


Instance of TriMesh converted from input mesh with specified vertex's memory layout


```python
def from_mesh(self, declaration, mesh):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| declaration | aspose.threed.utilities.VertexDeclaration | Vertex's type definition, or memory layout |
| mesh | [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) | Source mesh |


## from_mesh {#aspose.threed.entities.Mesh-bool}

Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure.


### Returns 


The [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh) generated from given [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)


```python
def from_mesh(self, mesh, use_float):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| mesh | [`Mesh`](/3d/python-net/aspose.threed.entities/mesh) |  |
| use_float | bool | Use float type instead of double type for each vertex element component. |



### See Also
* module [`aspose.threed.entities`](../../)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh)
