---
title: from_raw_data method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.threed.entities/trimesh/from_raw_data/
is_root: false
---

## from_raw_data(, vd, vertices, indices, generate_vertex_mapping) {#aspose.threed.utilities.VertexDeclaration-bytes-list-bool}

Create TriMesh from raw data


### Returns 


The [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh) instance that encapsulated the input byte array.


```python

@staticmethod
def from_raw_data(vd, vertices, indices, generate_vertex_mapping):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| vd | aspose.threed.utilities.VertexDeclaration | Vertex declaration, must contains at least one field. |
| vertices | bytes | The input vertex data, the minimum length of the vertices must be greater or equal to vertex declaration's size |
| indices | list | The triangle indices |
| generate_vertex_mapping | bool | Generate [`Vertex`](/3d/python-net/aspose.threed.utilities/vertex) for each vertex, which is not necessary for just serialization/deserialization. |
### Remarks

The returned TriMesh will not copy the input byte array for performance, external changes on the array will be reflected to this instance.
### Example 


The following code shows how to construct a TriMesh from raw bytes, this is useful when build your own 3D format

```python
from aspose.threed.entities import TriMesh
from aspose.threed.utilities import VertexDeclaration, VertexFieldDataType, VertexFieldSemantic

indices = [0, 1, 2 ]
vertices = [                0, 0, 0, 191,                 0, 0, 0, 0,                 0, 0, 0, 191,                 0, 0, 0, 191,                 0, 0, 0, 0,                 0, 0, 0, 63,                 0, 0, 0, 63,                 0, 0, 0, 0,                 0, 0, 0, 63
]
vd = VertexDeclaration()
vd.add_field(VertexFieldDataType.F_VECTOR3, VertexFieldSemantic.POSITION)
triMesh = TriMesh.from_raw_data(vd, vertices, indices, True)

```



### See Also
* module [`aspose.threed.entities`](../../)
* class [`TriMesh`](/3d/python-net/aspose.threed.entities/trimesh)
* class [`Vertex`](/3d/python-net/aspose.threed.utilities/vertex)
