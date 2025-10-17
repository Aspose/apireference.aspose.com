---
title: ArbitraryProfile class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.profiles/arbitraryprofile/
is_root: false
---

## ArbitraryProfile class

This class allows you to construct a 2D profile directly from arbitrary curve.



**Inheritance:** [`ArbitraryProfile`](/3d/python-net/aspose.threed.profiles/arbitraryprofile) → 
[`Profile`](/3d/python-net/aspose.threed.profiles/profile) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The ArbitraryProfile type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/__init__/#) | Constructor of [`ArbitraryProfile`](/3d/python-net/aspose.threed.profiles/arbitraryprofile) |
| [`__init__(self, curve)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/__init__/#aspose.threed.entities.curve) | Constructor of [`ArbitraryProfile`](/3d/python-net/aspose.threed.profiles/arbitraryprofile) with an initial curve. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.profiles/arbitraryprofile/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.profiles/arbitraryprofile/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.profiles/arbitraryprofile/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.profiles/arbitraryprofile/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.profiles/arbitraryprofile/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.profiles/arbitraryprofile/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [curve](/3d/python-net/aspose.threed.profiles/arbitraryprofile/curve) | The Curve used to construct the profile |
| [holes](/3d/python-net/aspose.threed.profiles/arbitraryprofile/holes) | Holes of the profile, also represented as curve |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.profiles/arbitraryprofile/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |



### See Also
* module [`aspose.threed.profiles`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`ArbitraryProfile`](/3d/python-net/aspose.threed.profiles/arbitraryprofile)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Profile`](/3d/python-net/aspose.threed.profiles/profile)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
