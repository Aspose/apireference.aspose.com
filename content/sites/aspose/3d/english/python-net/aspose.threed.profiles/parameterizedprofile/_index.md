---
title: ParameterizedProfile class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.threed.profiles/parameterizedprofile/
is_root: false
---

## ParameterizedProfile class

The base class of all parameterized profiles.



**Inheritance:** [ParameterizedProfile](/3d/python-net/aspose.threed.profiles/parameterizedprofile) → 
[Profile](/3d/python-net/aspose.threed.profiles/profile) → 
[Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The ParameterizedProfile type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.profiles/parameterizedprofile/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.profiles/parameterizedprofile/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.profiles/parameterizedprofile/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.profiles/parameterizedprofile/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.profiles/parameterizedprofile/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.profiles/parameterizedprofile/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.profiles/parameterizedprofile/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.profiles/parameterizedprofile/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.profiles/parameterizedprofile/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.profiles/parameterizedprofile/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.profiles/parameterizedprofile/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.profiles/parameterizedprofile/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.profiles/parameterizedprofile/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [get_extent()](/3d/python-net/aspose.threed.profiles/parameterizedprofile/get_extent/#) | Gets the extent in x and y dimension. |


### See Also

* module [aspose.threed.profiles](../)
* class [Profile](/3d/python-net/aspose.threed.profiles/profile)
