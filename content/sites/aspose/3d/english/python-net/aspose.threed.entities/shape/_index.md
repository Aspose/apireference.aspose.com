---
title: Shape class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 350
url: /python-net/aspose.threed.entities/shape/
is_root: false
---

## Shape class

The shape describes the deformation on a set of control points, which is similar to the cluster deformer in Maya.
For example, we can add a shape to a created geometry. 
And the shape and the geometry have the same topological information but different position of the control points. 
With varying amounts of influence, the geometry performs a deformation effect.



**Inheritance:** [`Shape`](/3d/python-net/aspose.threed.entities/shape) → 
[`Geometry`](/3d/python-net/aspose.threed.entities/geometry) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Shape type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/shape/__init__/#) | Initializes a new instance of the [`Shape`](/3d/python-net/aspose.threed.entities/shape) class. |
| [`__init__(self, name)`](/3d/python-net/aspose.threed.entities/shape/__init__/#system.string) | Initializes a new instance of the [`Shape`](/3d/python-net/aspose.threed.entities/shape) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/shape/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/shape/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/shape/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/shape/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/shape/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/shape/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [visible](/3d/python-net/aspose.threed.entities/shape/visible) | Gets or sets if the geometry is visible |
| [deformers](/3d/python-net/aspose.threed.entities/shape/deformers) | Gets all deformers associated with this geometry. |
| [control_points](/3d/python-net/aspose.threed.entities/shape/control_points) | Gets all control points |
| [cast_shadows](/3d/python-net/aspose.threed.entities/shape/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/shape/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [vertex_elements](/3d/python-net/aspose.threed.entities/shape/vertex_elements) | Gets all vertex elements |
| [indices](/3d/python-net/aspose.threed.entities/shape/indices) | Gets the indices. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/shape/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/shape/remove_property/#system.string) | Remove the specified property identified by name |
| [`create_element(self, type)`](/3d/python-net/aspose.threed.entities/shape/create_element/#aspose.threed.entities.vertexelementtype) | Creates a vertex element with specified type and add it to the geometry. |
| [`create_element(self, type, mapping_mode, reference_mode)`](/3d/python-net/aspose.threed.entities/shape/create_element/#aspose.threed.entities.vertexelementtype-aspose.threed.entities.mappingmode-aspose.threed.entities.referencemode) | Creates a vertex element with specified type and add it to the geometry. |
| [`create_element_uv(self, uv_mapping)`](/3d/python-net/aspose.threed.entities/shape/create_element_uv/#aspose.threed.entities.texturemapping) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [`create_element_uv(self, uv_mapping, mapping_mode, reference_mode)`](/3d/python-net/aspose.threed.entities/shape/create_element_uv/#aspose.threed.entities.texturemapping-aspose.threed.entities.mappingmode-aspose.threed.entities.referencemode) | Creates a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) with given texture mapping type. |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/shape/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/shape/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/shape/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/shape/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/shape/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`get_element(self, type)`](/3d/python-net/aspose.threed.entities/shape/get_element/#aspose.threed.entities.vertexelementtype) | Gets a vertex element with specified type |
| [`get_vertex_element_of_uv(self, texture_mapping)`](/3d/python-net/aspose.threed.entities/shape/get_vertex_element_of_uv/#aspose.threed.entities.texturemapping) | Gets a [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv) instance with given texture mapping type |
| [`add_element(self, element)`](/3d/python-net/aspose.threed.entities/shape/add_element/#aspose.threed.entities.vertexelement) | Adds an existing vertex element to current geometry |
| [`from_control_points(, control_points)`](/3d/python-net/aspose.threed.entities/shape/from_control_points/#list) | Create a shape with specified control points with a default indices. |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Geometry`](/3d/python-net/aspose.threed.entities/geometry)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
* class [`Shape`](/3d/python-net/aspose.threed.entities/shape)
* class [`VertexElementUV`](/3d/python-net/aspose.threed.entities/vertexelementuv)
