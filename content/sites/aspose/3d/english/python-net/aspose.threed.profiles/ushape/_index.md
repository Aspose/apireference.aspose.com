---
title: UShape class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 150
url: /python-net/aspose.threed.profiles/ushape/
is_root: false
---

## UShape class

IFC compatible U-shape defined by parameters.



**Inheritance:** [UShape](/3d/python-net/aspose.threed.profiles/ushape) → 
[ParameterizedProfile](/3d/python-net/aspose.threed.profiles/parameterizedprofile) → 
[Profile](/3d/python-net/aspose.threed.profiles/profile) → 
[Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The UShape type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [UShape()](/3d/python-net/aspose.threed.profiles/ushape/__init__/#) | Constructor of [UShape](/3d/python-net/aspose.threed.profiles/ushape) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.profiles/ushape/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.profiles/ushape/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.profiles/ushape/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.profiles/ushape/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.profiles/ushape/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.profiles/ushape/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [depth](/3d/python-net/aspose.threed.profiles/ushape/depth) | Gets or sets the length of web. |
| [flange_width](/3d/python-net/aspose.threed.profiles/ushape/flange_width) | Gets or sets the length of flange. |
| [web_thickness](/3d/python-net/aspose.threed.profiles/ushape/web_thickness) | Gets or sets the thickness of web. |
| [flange_thickness](/3d/python-net/aspose.threed.profiles/ushape/flange_thickness) | Gets or sets the thickness of flange. |
| [fillet_radius](/3d/python-net/aspose.threed.profiles/ushape/fillet_radius) | Gets or sets the radius of fillet between flange and web. |
| [edge_radius](/3d/python-net/aspose.threed.profiles/ushape/edge_radius) | Gets or sets the radius of edge in flange's edge. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.profiles/ushape/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.profiles/ushape/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.profiles/ushape/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.profiles/ushape/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.profiles/ushape/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.profiles/ushape/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.profiles/ushape/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_extent()](/3d/python-net/aspose.threed.profiles/ushape/get_extent/#) | Gets the extent in x and y dimension. |


### See Also

* module [aspose.threed.profiles](../)
* class [ParameterizedProfile](/3d/python-net/aspose.threed.profiles/parameterizedprofile)
