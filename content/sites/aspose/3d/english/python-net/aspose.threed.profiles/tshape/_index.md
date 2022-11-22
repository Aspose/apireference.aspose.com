---
title: TShape class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.threed.profiles/tshape/
is_root: false
---

## TShape class

IFC compatible T-shape defined by parameters.



The TShape type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [TShape()](/3d/python-net/aspose.threed.profiles/tshape/__init__/#) | Constructor of [TShape](/3d/python-net/aspose.threed.profiles/tshape) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.profiles/tshape/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.profiles/tshape/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.profiles/tshape/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.profiles/tshape/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.profiles/tshape/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.profiles/tshape/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [depth](/3d/python-net/aspose.threed.profiles/tshape/depth) | Gets or sets the length of the web. |
| [flange_width](/3d/python-net/aspose.threed.profiles/tshape/flange_width) | Gets or sets the length of the flange. |
| [web_thickness](/3d/python-net/aspose.threed.profiles/tshape/web_thickness) | Gets or sets the wall thickness of web. |
| [flange_thickness](/3d/python-net/aspose.threed.profiles/tshape/flange_thickness) | Gets or sets the wall thickness of flange. |
| [fillet_radius](/3d/python-net/aspose.threed.profiles/tshape/fillet_radius) | Gets or sets the radius of fillet between web and flange. |
| [flange_edge_radius](/3d/python-net/aspose.threed.profiles/tshape/flange_edge_radius) | Gets or sets the radius of the flange edge. |
| [web_edge_radius](/3d/python-net/aspose.threed.profiles/tshape/web_edge_radius) | Gets or sets the radius of web edge. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.profiles/tshape/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.profiles/tshape/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.profiles/tshape/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.profiles/tshape/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.profiles/tshape/find_property/#str) | Finds the property.<br/>            It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>            or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.profiles/tshape/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.profiles/tshape/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_extent()](/3d/python-net/aspose.threed.profiles/tshape/get_extent/#) | Gets the extent in x and y dimension. |


### See Also

* module [aspose.threed.profiles](../)
* class [ParameterizedProfile](/3d/python-net/aspose.threed.profiles/parameterizedprofile)
