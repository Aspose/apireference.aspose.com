---
title: CenterLineProfile class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.profiles/centerlineprofile/
is_root: false
---

## CenterLineProfile class

IFC compatible center line profile



**Inheritance:** [`CenterLineProfile`](/3d/python-net/aspose.threed.profiles/centerlineprofile) → 
[`Profile`](/3d/python-net/aspose.threed.profiles/profile) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The CenterLineProfile type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, curve, thickness)`](/3d/python-net/aspose.threed.profiles/centerlineprofile/__init__/#aspose.threed.entities.curve-float) | Constructs a new [`CenterLineProfile`](/3d/python-net/aspose.threed.profiles/centerlineprofile) with specified curve as center line. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.profiles/centerlineprofile/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.profiles/centerlineprofile/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.profiles/centerlineprofile/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.profiles/centerlineprofile/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.profiles/centerlineprofile/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.profiles/centerlineprofile/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [thickness](/3d/python-net/aspose.threed.profiles/centerlineprofile/thickness) | Thickness applied along the center line |
| [curve](/3d/python-net/aspose.threed.profiles/centerlineprofile/curve) | The center line curve of the profile |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/centerlineprofile/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/centerlineprofile/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.profiles/centerlineprofile/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.profiles/centerlineprofile/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.profiles/centerlineprofile/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.profiles/centerlineprofile/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.profiles/centerlineprofile/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |



### See Also
* module [`aspose.threed.profiles`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`CenterLineProfile`](/3d/python-net/aspose.threed.profiles/centerlineprofile)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Profile`](/3d/python-net/aspose.threed.profiles/profile)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
