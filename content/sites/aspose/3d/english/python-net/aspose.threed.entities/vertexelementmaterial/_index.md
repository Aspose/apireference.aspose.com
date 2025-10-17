---
title: VertexElementMaterial class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 490
url: /python-net/aspose.threed.entities/vertexelementmaterial/
is_root: false
---

## VertexElementMaterial class

Defines material index for specified components.

A node can have multiple materials, the [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial) is used to render different part of the geometry in different materials.



**Inheritance:** [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial) → 
[`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement)



The VertexElementMaterial type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/vertexelementmaterial/__init__/#) | Initializes a new instance of the [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial) class. |


### Properties
| Property | Description |
| :- | :- |
| [vertex_element_type](/3d/python-net/aspose.threed.entities/vertexelementmaterial/vertex_element_type) | Gets the type of the [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement) |
| [name](/3d/python-net/aspose.threed.entities/vertexelementmaterial/name) | Gets or sets the name. |
| [mapping_mode](/3d/python-net/aspose.threed.entities/vertexelementmaterial/mapping_mode) | Gets or sets how the element is mapped. |
| [reference_mode](/3d/python-net/aspose.threed.entities/vertexelementmaterial/reference_mode) | Gets or sets how the element is referenced. |
| [indices](/3d/python-net/aspose.threed.entities/vertexelementmaterial/indices) | Gets the indices data |


### Methods
| Method | Description |
| :- | :- |
| [`set_indices(self, data)`](/3d/python-net/aspose.threed.entities/vertexelementmaterial/set_indices/#list) | Load indices |
| [`clear(self)`](/3d/python-net/aspose.threed.entities/vertexelementmaterial/clear/#) | Removes all elements from the direct and the index arrays. |



### Example 


The following code shows how to assign different material to different face of a box.

```python
from aspose import pycore
from aspose.threed.entities import Box, MappingMode, ReferenceMode, VertexElementMaterial, VertexElementType

#  Create a mesh of box(A box is composed by 6 planes)
box = Box().to_mesh()
#  Create a material element on this mesh
mat = pycore.cast(VertexElementMaterial, box.create_element(VertexElementType.MATERIAL, MappingMode.POLYGON, ReferenceMode.INDEX))
#  And specify different material index for each plane
mat.indices.extend([0, 1, 2, 3, 4, 5 ])

```

### See Also
* module [`aspose.threed.entities`](..)
* class [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement)
* class [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial)
