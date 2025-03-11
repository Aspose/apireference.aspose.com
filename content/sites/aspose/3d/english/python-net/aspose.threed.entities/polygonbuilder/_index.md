---
title: PolygonBuilder class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 260
url: /python-net/aspose.threed.entities/polygonbuilder/
is_root: false
---

## PolygonBuilder class

A helper class to build polygon for [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)



The PolygonBuilder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, mesh)`](/3d/python-net/aspose.threed.entities/polygonbuilder/__init__/#aspose.threed.entities.mesh) | Initializes a new instance of the [`PolygonBuilder`](/3d/python-net/aspose.threed.entities/polygonbuilder) class. |


### Methods
| Method | Description |
| :- | :- |
| [`begin(self)`](/3d/python-net/aspose.threed.entities/polygonbuilder/begin/#) | Begins to add a new polygon |
| [`add_vertex(self, index)`](/3d/python-net/aspose.threed.entities/polygonbuilder/add_vertex/#int) | Adds a vertex index to the polygon |
| [`end(self)`](/3d/python-net/aspose.threed.entities/polygonbuilder/end/#) | Finishes the polygon creation |



### Example 


```python
from aspose.threed.entities import Mesh, PolygonBuilder

mesh = Mesh()
builder = PolygonBuilder(mesh)
builder.begin()
builder.add_vertex(0)
builder.add_vertex(1)
builder.add_vertex(2)
builder.end()

```

Equals to :

```python
from aspose.threed.entities import Mesh

mesh = Mesh()
indices = [0, 1, 2]
mesh.create_polygon(indices)

```

If all indices are ready to use, [`Mesh.create_polygon`](/3d/python-net/aspose.threed.entities/mesh/create_polygon) is preferred, otherwise [`PolygonBuilder`](/3d/python-net/aspose.threed.entities/polygonbuilder) would be a better choice.

### See Also
* module [`aspose.threed.entities`](..)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`PolygonBuilder`](/3d/python-net/aspose.threed.entities/polygonbuilder)
