---
title: Pyramid class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 290
url: /python-net/aspose.threed.entities/pyramid/
is_root: false
---

## Pyramid class

Parameterized pyramid.



**Inheritance:** [Pyramid](/3d/python-net/aspose.threed.entities/pyramid) → 
[Primitive](/3d/python-net/aspose.threed.entities/primitive) → 
[Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The Pyramid type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Pyramid()](/3d/python-net/aspose.threed.entities/pyramid/__init__/#) | Construct a new pyramid instance with default bottom area(10, 10) and default height(5) |
| [Pyramid(xbottom, ybottom, height)](/3d/python-net/aspose.threed.entities/pyramid/__init__/#float-float-float) | Construct a new pyramid instance with specified bottom area |
| [Pyramid(xbottom, ybottom, xtop, ytop, height)](/3d/python-net/aspose.threed.entities/pyramid/__init__/#float-float-float-float-float) | Construct a new pyramid instance with specified bottom area and top area and height. |
| [Pyramid(name, xbottom, ybottom, xtop, ytop, height)](/3d/python-net/aspose.threed.entities/pyramid/__init__/#str-float-float-float-float-float) | Construct a new pyramid instance with specified bottom area and top area and height. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/pyramid/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/pyramid/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/pyramid/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/pyramid/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/pyramid/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/pyramid/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/pyramid/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/pyramid/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [bottom_area](/3d/python-net/aspose.threed.entities/pyramid/bottom_area) | Area of the bottom cap |
| [top_area](/3d/python-net/aspose.threed.entities/pyramid/top_area) | Area of the top cap |
| [bottom_offset](/3d/python-net/aspose.threed.entities/pyramid/bottom_offset) | Offset for bottom vertices |
| [height](/3d/python-net/aspose.threed.entities/pyramid/height) | Height of the pyramid |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/pyramid/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/pyramid/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/pyramid/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/pyramid/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/pyramid/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/pyramid/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/pyramid/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [to_mesh()](/3d/python-net/aspose.threed.entities/pyramid/to_mesh/#) | Convert current object to mesh |



### See Also
* module [aspose.threed.entities](..)
* class [A3DObject](/3d/python-net/aspose.threed/a3dobject)
* class [Entity](/3d/python-net/aspose.threed/entity)
* class [Primitive](/3d/python-net/aspose.threed.entities/primitive)
* class [Pyramid](/3d/python-net/aspose.threed.entities/pyramid)
* class [SceneObject](/3d/python-net/aspose.threed/sceneobject)
