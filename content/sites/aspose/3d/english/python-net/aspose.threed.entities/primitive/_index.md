---
title: Primitive class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 280
url: /python-net/aspose.threed.entities/primitive/
is_root: false
---

## Primitive class

Base class for all primitives



**Inheritance:** [`Primitive`](/3d/python-net/aspose.threed.entities/primitive) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Primitive type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/primitive/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/primitive/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/primitive/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/primitive/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/primitive/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/primitive/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [cast_shadows](/3d/python-net/aspose.threed.entities/primitive/cast_shadows) | Gets or sets whether this geometry can cast shadow |
| [receive_shadows](/3d/python-net/aspose.threed.entities/primitive/receive_shadows) | Gets or sets whether this geometry can receive shadow. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/primitive/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/primitive/remove_property/#str) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/primitive/get_property/#str) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/primitive/set_property/#str-any) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/primitive/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/primitive/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/primitive/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`to_mesh(self)`](/3d/python-net/aspose.threed.entities/primitive/to_mesh/#) | Convert current object to mesh |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Primitive`](/3d/python-net/aspose.threed.entities/primitive)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
