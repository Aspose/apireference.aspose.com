---
title: CShape class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed.profiles/cshape/
is_root: false
---

## CShape class

IFC compatible C-shape profile that defined by parameters.
The center position of the profile is in the center of the bounding box.



**Inheritance:** [`CShape`](/3d/python-net/aspose.threed.profiles/cshape) → 
[`ParameterizedProfile`](/3d/python-net/aspose.threed.profiles/parameterizedprofile) → 
[`Profile`](/3d/python-net/aspose.threed.profiles/profile) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The CShape type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.profiles/cshape/__init__/#) | Constructor of [`CShape`](/3d/python-net/aspose.threed.profiles/cshape) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.profiles/cshape/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.profiles/cshape/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.profiles/cshape/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.profiles/cshape/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.profiles/cshape/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.profiles/cshape/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [depth](/3d/python-net/aspose.threed.profiles/cshape/depth) | Gets or sets the depth of the profile. |
| [width](/3d/python-net/aspose.threed.profiles/cshape/width) | Gets or sets the width of the profile. |
| [girth](/3d/python-net/aspose.threed.profiles/cshape/girth) | Gets or sets the length of girth. |
| [wall_thickness](/3d/python-net/aspose.threed.profiles/cshape/wall_thickness) | Gets or sets the thickness of the wall. |
| [internal_fillet_radius](/3d/python-net/aspose.threed.profiles/cshape/internal_fillet_radius) | Gets or sets the internal fillet radius. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/cshape/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.profiles/cshape/remove_property/#str) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.profiles/cshape/get_property/#str) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.profiles/cshape/set_property/#str-any) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.profiles/cshape/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.profiles/cshape/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.profiles/cshape/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`get_extent(self)`](/3d/python-net/aspose.threed.profiles/cshape/get_extent/#) | Gets the extent in x and y dimension. |



### See Also
* module [`aspose.threed.profiles`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`CShape`](/3d/python-net/aspose.threed.profiles/cshape)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`ParameterizedProfile`](/3d/python-net/aspose.threed.profiles/parameterizedprofile)
* class [`Profile`](/3d/python-net/aspose.threed.profiles/profile)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
