---
title: Geometry class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 110
url: /aspose.threed.entities/geometry/
is_root: false
---

## Geometry class

The base class of all renderable geometric objects (like [`Mesh`](/3d/python-net/aspose.threed.entities/mesh), [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface), [`Patch`](/3d/python-net/aspose.threed.entities/patch) and etc.).




The [`Geometry`](/3d/python-net/aspose.threed.entities/geometry) base class supports:  

* **Control point management** , control points defines the base 3D spatial structure of the geometry, different geometric types has different way to define concrete 3D models. **Vertex element definition** , vertex elements applies extra information like normals/uv coordinates/vertex colors to the geometry, see [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement) for more details.**Object deforming** , [`Deformer`](/3d/python-net/aspose.threed.deformers/deformer) can be bonded to animate geometry's shape.

* **Control point management** , control points defines the base 3D spatial structure of the geometry, different geometric types has different way to define concrete 3D models. **Vertex element definition** , vertex elements applies extra information like normals/uv coordinates/vertex colors to the geometry, see [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement) for more details.**Object deforming** , [`Deformer`](/3d/python-net/aspose.threed.deformers/deformer) can be bonded to animate geometry's shape.

* **Control point management** , control points defines the base 3D spatial structure of the geometry, different geometric types has different way to define concrete 3D models. **Vertex element definition** , vertex elements applies extra information like normals/uv coordinates/vertex colors to the geometry, see [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement) for more details.**Object deforming** , [`Deformer`](/3d/python-net/aspose.threed.deformers/deformer) can be bonded to animate geometry's shape.



**Inheritance:** [`Geometry`](/3d/python-net/aspose.threed.entities/geometry) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Geometry type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.entities/geometry/__init__/#str) | Initializes a new instance of the [`Geometry`](/3d/python-net/aspose.threed.entities/geometry) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/geometry/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/geometry/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/geometry/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/geometry/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/geometry/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/geometry/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [visible](/3d/python-net/aspose.threed.entities/geometry/visible) | Gets or sets if the geometry is visible |
| [deformers](/3d/python-net/aspose.threed.entities/geometry/deformers) | Gets all deformers associated with this geometry. |
| [control_points](/3d/python-net/aspose.threed.entities/geometry/control_points) | Gets all control points |
| [cast_shadows](/3d/python-net/aspose.threed.entities/geometry/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/geometry/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [vertex_elements](/3d/python-net/aspose.threed.entities/geometry/vertex_elements) | Gets all vertex elements |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.entities/geometry/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.entities/geometry/remove_property/#str) | Remove the specified property identified by name |
| [create_element](/3d/python-net/aspose.threed.entities/geometry/create_element/#aspose.threed.entities.VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element](/3d/python-net/aspose.threed.entities/geometry/create_element/#aspose.threed.entities.VertexElementType-aspose.threed.entities.MappingMode-aspose.threed.entities.ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element_uv](/3d/python-net/aspose.threed.entities/geometry/create_element_uv/#aspose.threed.entities.TextureMapping) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [create_element_uv](/3d/python-net/aspose.threed.entities/geometry/create_element_uv/#aspose.threed.entities.TextureMapping-aspose.threed.entities.MappingMode-aspose.threed.entities.ReferenceMode) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [get_property](/3d/python-net/aspose.threed.entities/geometry/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.entities/geometry/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.entities/geometry/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box](/3d/python-net/aspose.threed.entities/geometry/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key](/3d/python-net/aspose.threed.entities/geometry/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_element](/3d/python-net/aspose.threed.entities/geometry/get_element/#aspose.threed.entities.VertexElementType) | Gets a vertex element with specified type |
| [get_vertex_element_of_uv](/3d/python-net/aspose.threed.entities/geometry/get_vertex_element_of_uv/#aspose.threed.entities.TextureMapping) | Gets a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [add_element](/3d/python-net/aspose.threed.entities/geometry/add_element/#aspose.threed.entities.VertexElement) | Adds an existing vertex element to current geometry |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Deformer`](/3d/python-net/aspose.threed.deformers/deformer)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
* class [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface)
* class [`Patch`](/3d/python-net/aspose.threed.entities/patch)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`VertexElement`](/3d/python-net/aspose.threed.entities/vertexelement)
* class [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv)
