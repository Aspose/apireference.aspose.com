---
title: Patch class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 220
url: /aspose.threed.entities/patch/
is_root: false
---

## Patch class

A [`Patch`](/3d/python-net/aspose.threed.entities/patch) is a parametric modeling surface, similar to [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface), it's also defined by two 
[`PatchDirection`](/3d/python-net/aspose.threed.entities/patchdirection), the [`Patch.u`](/3d/python-net/aspose.threed.entities/patch#u) and [`Patch.v`](/3d/python-net/aspose.threed.entities/patch#v).

But difference between [`Patch`](/3d/python-net/aspose.threed.entities/patch) and [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface) is that the [`PatchDirection`](/3d/python-net/aspose.threed.entities/patchdirection) curve 
can be one of [`PatchDirectionType.BEZIER`](/3d/python-net/aspose.threed.entities/patchdirectiontype#BEZIER), [`PatchDirectionType.QUADRATIC_BEZIER`](/3d/python-net/aspose.threed.entities/patchdirectiontype#QUADRATIC_BEZIER), [`PatchDirectionType.BASIS_SPLINE`](/3d/python-net/aspose.threed.entities/patchdirectiontype#BASIS_SPLINE), [`PatchDirectionType.CARDINAL_SPLINE`](/3d/python-net/aspose.threed.entities/patchdirectiontype#CARDINAL_SPLINE) and [`PatchDirectionType.LINEAR`](/3d/python-net/aspose.threed.entities/patchdirectiontype#LINEAR)



**Inheritance:** [`Patch`](/3d/python-net/aspose.threed.entities/patch) → 
[`Geometry`](/3d/python-net/aspose.threed.entities/geometry) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Patch type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.entities/patch/__init__/#) | Initializes a new instance of the [`Patch`](/3d/python-net/aspose.threed.entities/patch) class. |
| [__init__](/3d/python-net/aspose.threed.entities/patch/__init__/#str) | Initializes a new instance of the [`Patch`](/3d/python-net/aspose.threed.entities/patch) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/patch/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/patch/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/patch/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/patch/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/patch/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/patch/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [visible](/3d/python-net/aspose.threed.entities/patch/visible) | Gets or sets if the geometry is visible |
| [deformers](/3d/python-net/aspose.threed.entities/patch/deformers) | Gets all deformers associated with this geometry. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/patch/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/patch/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [vertex_elements](/3d/python-net/aspose.threed.entities/patch/vertex_elements) | Gets all vertex elements |
| [u](/3d/python-net/aspose.threed.entities/patch/u) | Gets the u direction. |
| [v](/3d/python-net/aspose.threed.entities/patch/v) | Gets the v direction. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.entities/patch/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.entities/patch/remove_property/#str) | Remove the specified property identified by name |
| [create_element](/3d/python-net/aspose.threed.entities/patch/create_element/#aspose.threed.entities.VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element](/3d/python-net/aspose.threed.entities/patch/create_element/#aspose.threed.entities.VertexElementType-aspose.threed.entities.MappingMode-aspose.threed.entities.ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element_uv](/3d/python-net/aspose.threed.entities/patch/create_element_uv/#aspose.threed.entities.TextureMapping) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [create_element_uv](/3d/python-net/aspose.threed.entities/patch/create_element_uv/#aspose.threed.entities.TextureMapping-aspose.threed.entities.MappingMode-aspose.threed.entities.ReferenceMode) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [get_property](/3d/python-net/aspose.threed.entities/patch/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.entities/patch/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.entities/patch/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box](/3d/python-net/aspose.threed.entities/patch/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key](/3d/python-net/aspose.threed.entities/patch/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_element](/3d/python-net/aspose.threed.entities/patch/get_element/#aspose.threed.entities.VertexElementType) | Gets a vertex element with specified type |
| [get_vertex_element_of_uv](/3d/python-net/aspose.threed.entities/patch/get_vertex_element_of_uv/#aspose.threed.entities.TextureMapping) | Gets a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [add_element](/3d/python-net/aspose.threed.entities/patch/add_element/#aspose.threed.entities.VertexElement) | Adds an existing vertex element to current geometry |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface)
* class [`Patch`](/3d/python-net/aspose.threed.entities/patch)
* class [`PatchDirection`](/3d/python-net/aspose.threed.entities/patchdirection)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv)
