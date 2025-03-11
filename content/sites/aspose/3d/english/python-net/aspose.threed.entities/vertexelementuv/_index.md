---
title: VertexElementUV class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 520
url: /python-net/aspose.threed.entities/vertexelementuv/
is_root: false
---

## VertexElementUV class

Defines the UV coordinates for specified components.
A geometry can have multiple [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) elements, and each one have different [`TextureMapping`](/3d/python-net/aspose.threed.entities/texturemapping)s.



**Inheritance:** [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) → 
[`VertexElementVector4`](/3d/python-net/aspose.threed.entities/vertexelementvector4) → 
[`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement)



The VertexElementUV type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/vertexelementuv/__init__/#) | Initializes a new instance of the [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) class.<br/>The default texture mapping type is [`TextureMapping.DIFFUSE`](/3d/python-net/aspose.threed.entities/texturemapping#DIFFUSE) |
| [`__init__(self, texture_mapping)`](/3d/python-net/aspose.threed.entities/vertexelementuv/__init__/#aspose.threed.entities.texturemapping) | Initializes a new instance of the [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) class. |


### Properties
| Property | Description |
| :- | :- |
| [vertex_element_type](/3d/python-net/aspose.threed.entities/vertexelementuv/vertex_element_type) | Gets the type of the [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement) |
| [name](/3d/python-net/aspose.threed.entities/vertexelementuv/name) | Gets or sets the name. |
| [mapping_mode](/3d/python-net/aspose.threed.entities/vertexelementuv/mapping_mode) | Gets or sets how the element is mapped. |
| [reference_mode](/3d/python-net/aspose.threed.entities/vertexelementuv/reference_mode) | Gets or sets how the element is referenced. |


### Methods
| Method | Description |
| :- | :- |
| [`add_data(self, data)`](/3d/python-net/aspose.threed.entities/vertexelementuv/add_data/#list) |  |
| [`add_data(self, data)`](/3d/python-net/aspose.threed.entities/vertexelementuv/add_data/#list) |  |
| [`set_indices(self, data)`](/3d/python-net/aspose.threed.entities/vertexelementuv/set_indices/#list) | Load indices |
| [`clear(self)`](/3d/python-net/aspose.threed.entities/vertexelementuv/clear/#) | Removes all elements from the direct and the index arrays. |
| [`copy_to(self, target)`](/3d/python-net/aspose.threed.entities/vertexelementuv/copy_to/#aspose.threed.entities.vertexelementvector4) | Copies data to specified element |
| [`set_data(self, data)`](/3d/python-net/aspose.threed.entities/vertexelementuv/set_data/#list) | Load data |



### See Also
* module [`aspose.threed.entities`](..)
* class [`TextureMapping`](/3d/python-net/aspose.threed.entities/texturemapping)
* class [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement)
* class [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv)
* class [`VertexElementVector4`](/3d/python-net/aspose.threed.entities/vertexelementvector4)
