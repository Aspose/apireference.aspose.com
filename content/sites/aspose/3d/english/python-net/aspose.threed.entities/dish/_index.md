---
title: Dish class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed.entities/dish/
is_root: false
---

## Dish class

Parameterized dish.



**Inheritance:** [`Dish`](/3d/python-net/aspose.threed.entities/dish) → 
[`Primitive`](/3d/python-net/aspose.threed.entities/primitive) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Dish type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Dish()](/3d/python-net/aspose.threed.entities/dish/__init__/#) | Create a new dish instance with default radius(10) and default height(5) |
| [Dish(radius, height)](/3d/python-net/aspose.threed.entities/dish/__init__/#float-float) | Create a new dish instance with specified radius and height |
| [Dish(name, radius, height, width_segments, height_segments)](/3d/python-net/aspose.threed.entities/dish/__init__/#str-float-float-int-int) | Create a new dish instance with specified radius and height |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/dish/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/dish/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/dish/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/dish/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/dish/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/dish/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/dish/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/dish/receive_shadows) | Gets or sets whether this geometry can receive shadow. |
| [height](/3d/python-net/aspose.threed.entities/dish/height) | Height of the dish |
| [radius](/3d/python-net/aspose.threed.entities/dish/radius) | Radius of the dish |
| [width_segments](/3d/python-net/aspose.threed.entities/dish/width_segments) | Gets or sets the width segments |
| [height_segments](/3d/python-net/aspose.threed.entities/dish/height_segments) | Gets or sets the height segments |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/dish/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/dish/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/dish/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/dish/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/dish/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/dish/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/dish/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [to_mesh()](/3d/python-net/aspose.threed.entities/dish/to_mesh/#) | Convert current object to mesh |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Dish`](/3d/python-net/aspose.threed.entities/dish)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Primitive`](/3d/python-net/aspose.threed.entities/primitive)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
