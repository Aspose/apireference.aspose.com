---
title: VertexBufferColumns class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/
is_root: false
---

## VertexBufferColumns class

Represents a vertex buffer, where every vertex attribute is represented as a vector column.



The VertexBufferColumns type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/__init__/#) | Constructs a new instance of VertexBufferColumns |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/__init__/#aspose.cad.fileformats.glb.geometry.VertexBufferColumns) | Constructs a new instance of VertexBufferColumns |


### Properties
| Property | Description |
| :- | :- |
| [morph_targets](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/morph_targets) |  |


### Methods
| Method | Description |
| :- | :- |
| [isolate_columns](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/isolate_columns/#) | Performs an in-place copy of the contents of every column,<br/>which guarantees that the columns of this [`VertexBufferColumns`](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns)<br/>are not shared by any other object and can be modified safely. |
| [with_transform](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/with_transform/#aspose.cad.fileformats.glb.transforms.IGeometryTransform) |  |
| [add_morph_target](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/add_morph_target/#) |  |
| [get_compatible_vertex_type](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns/get_compatible_vertex_type/#) |  |



### Remarks 


One of the use cases of [`VertexBufferColumns`](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns) is to bind the different attribute
columns directly to the [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor) source feed, which means that
if you modify the contents of a column that is bound directly to a model, you're
modifying the model's internal data.

### See Also
* module [`aspose.cad.fileformats.glb.geometry`](..)
* class [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor)
* class [`VertexBufferColumns`](/cad/python-net/aspose.cad.fileformats.glb.geometry/vertexbuffercolumns)
