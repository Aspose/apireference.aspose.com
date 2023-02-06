---
title: TrimmedCurve class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 390
url: /python-net/aspose.threed.entities/trimmedcurve/
is_root: false
---

## TrimmedCurve class

A bounded curve that trimmed the basis curve at both ends.



**Inheritance:** [TrimmedCurve](/3d/python-net/aspose.threed.entities/trimmedcurve) → 
[Curve](/3d/python-net/aspose.threed.entities/curve) → 
[Entity](/3d/python-net/aspose.threed/entity) → 
[SceneObject](/3d/python-net/aspose.threed/sceneobject) → 
[A3DObject](/3d/python-net/aspose.threed/a3dobject)



The TrimmedCurve type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [TrimmedCurve()](/3d/python-net/aspose.threed.entities/trimmedcurve/__init__/#) | Constructor of [TrimmedCurve](/3d/python-net/aspose.threed.entities/trimmedcurve) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/trimmedcurve/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/trimmedcurve/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/trimmedcurve/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/trimmedcurve/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/trimmedcurve/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/trimmedcurve/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [color](/3d/python-net/aspose.threed.entities/trimmedcurve/color) | Gets or sets the color of the line, default value is white(1, 1, 1) |
| [basis_curve](/3d/python-net/aspose.threed.entities/trimmedcurve/basis_curve) | The basis curve to be trimmed. |
| [first](/3d/python-net/aspose.threed.entities/trimmedcurve/first) | The first end point to trim, can be a Cartesian point or a real parameter. |
| [second](/3d/python-net/aspose.threed.entities/trimmedcurve/second) | The second end point to trim, can be a Cartesian point or a real parameter. |
| [same_direction](/3d/python-net/aspose.threed.entities/trimmedcurve/same_direction) | Gets or sets whether the trimmed result uses the same direction of the basis curve. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/trimmedcurve/remove_property/#Property) | Removes a dynamic property. |
| [remove_property(property)](/3d/python-net/aspose.threed.entities/trimmedcurve/remove_property/#str) | Remove the specified property identified by name |
| [get_property(property)](/3d/python-net/aspose.threed.entities/trimmedcurve/get_property/#str) | Get the value of specified property |
| [set_property(property, value)](/3d/python-net/aspose.threed.entities/trimmedcurve/set_property/#str-any) | Sets the value of specified property |
| [find_property(property_name)](/3d/python-net/aspose.threed.entities/trimmedcurve/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box()](/3d/python-net/aspose.threed.entities/trimmedcurve/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key()](/3d/python-net/aspose.threed.entities/trimmedcurve/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |



### See Also
* module [aspose.threed.entities](..)
* class [A3DObject](/3d/python-net/aspose.threed/a3dobject)
* class [Curve](/3d/python-net/aspose.threed.entities/curve)
* class [Entity](/3d/python-net/aspose.threed/entity)
* class [SceneObject](/3d/python-net/aspose.threed/sceneobject)
* class [TrimmedCurve](/3d/python-net/aspose.threed.entities/trimmedcurve)
