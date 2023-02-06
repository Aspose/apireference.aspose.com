---
title: Entity class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.threed/entity/
is_root: false
---

## Entity class

The base class of all entities.
Entity represents a concrete object that attached under a node like [Light](/3d/python-net/aspose.threed.entities/light)/[Geometry](/3d/python-net/aspose.threed.entities/geometry).



**Inheritance:** [Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The Entity type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed/entity/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed/entity/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed/entity/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed/entity/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed/entity/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed/entity/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed/entity/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed/entity/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed/entity/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed/entity/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed/entity/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed/entity/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed/entity/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |



### See Also
* module [aspose.threed](..)
* class [A3DObject](/3d/python-net/aspose.threed/a3dobject)
* class [Entity](/3d/python-net/aspose.threed/entity)
* class [Geometry](/3d/python-net/aspose.threed.entities/geometry)
* class [Light](/3d/python-net/aspose.threed.entities/light)
* class [SceneObject](/3d/python-net/aspose.threed/sceneobject)
