---
title: Box class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.entities/box/
is_root: false
---

## Box class

Box.



The Box type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Box()](/3d/python-net/aspose.threed.entities/box/__init__/#) | Initializes a new instance of the [Box](/3d/python-net/aspose.threed.entities/box) class. |
| [Box(length, width, height)](/3d/python-net/aspose.threed.entities/box/__init__/#float-float-float) | Initializes a new instance of the [Box](/3d/python-net/aspose.threed.entities/box) class. |
| [Box(name, length, width, height, length_segments, width_segments, height_segments)](/3d/python-net/aspose.threed.entities/box/__init__/#str-float-float-float-int-int-int) | Initializes a new instance of the [Box](/3d/python-net/aspose.threed.entities/box) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/box/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/box/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/box/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/box/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/box/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/box/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/box/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/box/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [length_segments](/3d/python-net/aspose.threed.entities/box/length_segments) | Gets or sets the length segments. |
| [width_segments](/3d/python-net/aspose.threed.entities/box/width_segments) | Gets or sets the width segments |
| [height_segments](/3d/python-net/aspose.threed.entities/box/height_segments) | gets or sets the height segments. |
| [length](/3d/python-net/aspose.threed.entities/box/length) | Gets or sets the length of the box aligned in z-axis. |
| [width](/3d/python-net/aspose.threed.entities/box/width) | Gets or sets the width of the box aligned in x-axis. |
| [height](/3d/python-net/aspose.threed.entities/box/height) | Gets or sets the height of the box aligned in y-axis. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/box/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/box/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/box/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/box/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/box/find_property/#str) | Finds the property.<br/>            It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>            or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/box/get_bounding_box/#) |  |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/box/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [to_mesh()](/3d/python-net/aspose.threed.entities/box/to_mesh/#) | Convert current object to mesh |


### See Also

* module [aspose.threed.entities](../)
* class [Primitive](/3d/python-net/aspose.threed.entities/primitive)
