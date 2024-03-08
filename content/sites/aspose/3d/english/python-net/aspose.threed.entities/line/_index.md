---
title: Line class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 160
url: /aspose.threed.entities/line/
is_root: false
---

## Line class

A polyline is a path defined by a set of points with [`Geometry.control_points`](/3d/python-net/aspose.threed.entities/geometry#control_points), and connected by [`Line.segments`](/3d/python-net/aspose.threed.entities/line#segments),
which means it can also be a set of connected line segments.
The line is usually a linear object, which means it cannot be used to represent a curve, in order to represent a curve, uses [`NurbsCurve`](/3d/python-net/aspose.threed.entities/nurbscurve).



**Inheritance:** [`Line`](/3d/python-net/aspose.threed.entities/line) → 
[`Curve`](/3d/python-net/aspose.threed.entities/curve) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Line type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.entities/line/__init__/#) | Initializes a new instance of the [`Line`](/3d/python-net/aspose.threed.entities/line) class. |
| [__init__](/3d/python-net/aspose.threed.entities/line/__init__/#str) | Initializes a new instance of the [`Line`](/3d/python-net/aspose.threed.entities/line) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/line/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/line/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/line/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/line/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/line/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/line/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [color](/3d/python-net/aspose.threed.entities/line/color) | Gets or sets the color of the line, default value is white(1, 1, 1) |
| [visible](/3d/python-net/aspose.threed.entities/line/visible) | Gets or sets if the geometry is visible |
| [segments](/3d/python-net/aspose.threed.entities/line/segments) | Gets the segments of the line |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed.entities/line/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed.entities/line/remove_property/#str) | Remove the specified property identified by name |
| [get_property](/3d/python-net/aspose.threed.entities/line/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed.entities/line/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed.entities/line/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [get_bounding_box](/3d/python-net/aspose.threed.entities/line/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [get_entity_renderer_key](/3d/python-net/aspose.threed.entities/line/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [from_points](/3d/python-net/aspose.threed.entities/line/from_points/#list) | Construct a [`Line`](/3d/python-net/aspose.threed.entities/line) instance from a set of points. |
| [make_default_indices](/3d/python-net/aspose.threed.entities/line/make_default_indices/#) | Generate the sequence 0,1,2,3....[`Geometry.control_points`](/3d/python-net/aspose.threed.entities/geometry#control_points).Length-1 to [`Line.segments`](/3d/python-net/aspose.threed.entities/line#segments) so the ControlPoints can be used as a single line |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Curve`](/3d/python-net/aspose.threed.entities/curve)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Line`](/3d/python-net/aspose.threed.entities/line)
* class [`NurbsCurve`](/3d/python-net/aspose.threed.entities/nurbscurve)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
