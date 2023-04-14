---
title: CompositeCurve class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.threed.entities/compositecurve/
is_root: false
---

## CompositeCurve class

A [`CompositeCurve`](/3d/python-net/aspose.threed.entities/compositecurve) is consisting of several curve segments.



**Inheritance:** [`CompositeCurve`](/3d/python-net/aspose.threed.entities/compositecurve) → 
[`Curve`](/3d/python-net/aspose.threed.entities/curve) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The CompositeCurve type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.entities/compositecurve/__init__/#) | Constructor of [`CompositeCurve`](/3d/python-net/aspose.threed.entities/compositecurve) |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/compositecurve/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/compositecurve/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/compositecurve/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/compositecurve/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/compositecurve/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/compositecurve/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [color](/3d/python-net/aspose.threed.entities/compositecurve/color) | Gets or sets the color of the line, default value is white(1, 1, 1) |
| [segments](/3d/python-net/aspose.threed.entities/compositecurve/segments) | The segments of the curve. |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.entities/compositecurve/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.entities/compositecurve/remove_property/#str) | Remove the specified property identified by name |
| [get_property](/3d/python-net/aspose.threed.entities/compositecurve/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.entities/compositecurve/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.entities/compositecurve/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box](/3d/python-net/aspose.threed.entities/compositecurve/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key](/3d/python-net/aspose.threed.entities/compositecurve/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [add_segment](/3d/python-net/aspose.threed.entities/compositecurve/add_segment/#aspose.threed.entities.Curve-bool) | The |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`CompositeCurve`](/3d/python-net/aspose.threed.entities/compositecurve)
* class [`Curve`](/3d/python-net/aspose.threed.entities/curve)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
