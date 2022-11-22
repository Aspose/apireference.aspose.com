---
title: NurbsSurface class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 210
url: /python-net/aspose.threed.entities/nurbssurface/
is_root: false
---

## NurbsSurface class

[NurbsSurface](/3d/python-net/aspose.threed.entities/nurbssurface) is a surface represented by [NURBS(Non-uniform rational basis spline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline),
A [NurbsSurface](/3d/python-net/aspose.threed.entities/nurbssurface) is defined by two [NurbsDirection](/3d/python-net/aspose.threed.entities/nurbsdirection)[NurbsSurface.u](/3d/python-net/aspose.threed.entities/nurbssurface#u) and [NurbsSurface.v](/3d/python-net/aspose.threed.entities/nurbssurface#v).
The w component in control point is used as control point's weight whatever the direction's type is a [CurveDimension.TWO_DIMENSIONAL](/3d/python-net/aspose.threed.entities/curvedimension#TWO_DIMENSIONAL) or [CurveDimension.THREE_DIMENSIONAL](/3d/python-net/aspose.threed.entities/curvedimension#THREE_DIMENSIONAL)



**Inheritance:** [NurbsSurface](/3d/python-net/aspose.threed.entities/nurbssurface) → 
[Geometry](/3d/python-net/aspose.threed.entities/geometry) → 
[Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The NurbsSurface type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [NurbsSurface()](/3d/python-net/aspose.threed.entities/nurbssurface/__init__/#) | Initializes a new instance of the [NurbsSurface](/3d/python-net/aspose.threed.entities/nurbssurface) class. |
| [NurbsSurface(name)](/3d/python-net/aspose.threed.entities/nurbssurface/__init__/#str) | Initializes a new instance of the [NurbsSurface](/3d/python-net/aspose.threed.entities/nurbssurface) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/nurbssurface/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/nurbssurface/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/nurbssurface/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/nurbssurface/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/nurbssurface/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/nurbssurface/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [visible](/3d/python-net/aspose.threed.entities/nurbssurface/visible) | Gets or sets if the geometry is visible |
| [deformers](/3d/python-net/aspose.threed.entities/nurbssurface/deformers) | Gets all deformers associated with this geometry. |
| [control_points](/3d/python-net/aspose.threed.entities/nurbssurface/control_points) | Gets all control points |
| [cast_shadows](/3d/python-net/aspose.threed.entities/nurbssurface/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/nurbssurface/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [vertex_elements](/3d/python-net/aspose.threed.entities/nurbssurface/vertex_elements) | Gets all vertex elements |
| [u](/3d/python-net/aspose.threed.entities/nurbssurface/u) | Gets the NURBS surface's U direction |
| [v](/3d/python-net/aspose.threed.entities/nurbssurface/v) | Gets the NURBS surface's V direction |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/nurbssurface/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/nurbssurface/remove_property/#str) | Remove the specified property identified by name |
| [create_element(type)](/3d/python-net/aspose.threed.entities/nurbssurface/create_element/#VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element(type, mapping_mode, reference_mode)](/3d/python-net/aspose.threed.entities/nurbssurface/create_element/#VertexElementType-MappingMode-ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [create_element_uv(uv_mapping)](/3d/python-net/aspose.threed.entities/nurbssurface/create_element_uv/#TextureMapping) | Creates a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [create_element_uv(uv_mapping, mapping_mode, reference_mode)](/3d/python-net/aspose.threed.entities/nurbssurface/create_element_uv/#TextureMapping-MappingMode-ReferenceMode) | Creates a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [get_property(property)](/3d/python-net/aspose.threed.entities/nurbssurface/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/nurbssurface/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/nurbssurface/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/nurbssurface/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/nurbssurface/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_element(type)](/3d/python-net/aspose.threed.entities/nurbssurface/get_element/#VertexElementType) | Gets a vertex element with specified type |
| [get_vertex_element_of_uv(texture_mapping)](/3d/python-net/aspose.threed.entities/nurbssurface/get_vertex_element_of_uv/#TextureMapping) | Gets a [VertexElementUV](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [add_element(element)](/3d/python-net/aspose.threed.entities/nurbssurface/add_element/#VertexElement) | Adds an existing vertex element to current geometry |
| [to_mesh()](/3d/python-net/aspose.threed.entities/nurbssurface/to_mesh/#) | Convert the NURBS surface to the mesh |


### See Also

* module [aspose.threed.entities](../)
* class [Geometry](/3d/python-net/aspose.threed.entities/geometry)
