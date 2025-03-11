---
title: NurbsCurve class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 190
url: /python-net/aspose.threed.entities/nurbscurve/
is_root: false
---

## NurbsCurve class

[NURBS curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) is a curve represented by NURBS(Non-uniform rational basis spline),
A NURBS curve is defined by its [`NurbsCurve.order`](/3d/python-net/aspose.threed.entities/nurbscurve#order), a set of weighted [`Geometry.ControlPoints`](/3d/python-net/aspose.threed.entities/geometry) and a [`NurbsCurve.KnotVectors`](/3d/python-net/aspose.threed.entities/nurbscurve)
The w component in control point is used as control point's weight, whatever it is a [`CurveDimension.TWO_DIMENSIONAL`](/3d/python-net/aspose.threed.entities/curvedimension#TWO_DIMENSIONAL) or [`CurveDimension.THREE_DIMENSIONAL`](/3d/python-net/aspose.threed.entities/curvedimension#THREE_DIMENSIONAL)



**Inheritance:** [`NurbsCurve`](/3d/python-net/aspose.threed.entities/nurbscurve) → 
[`Curve`](/3d/python-net/aspose.threed.entities/curve) → 
[`Entity`](/3d/python-net/aspose.threed/entity) → 
[`SceneObject`](/3d/python-net/aspose.threed/sceneobject) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The NurbsCurve type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/nurbscurve/__init__/#) | Initializes a new instance of the [`NurbsCurve`](/3d/python-net/aspose.threed.entities/nurbscurve) class. |
| [`__init__(self, name)`](/3d/python-net/aspose.threed.entities/nurbscurve/__init__/#str) | Initializes a new instance of the [`NurbsCurve`](/3d/python-net/aspose.threed.entities/nurbscurve) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed.entities/nurbscurve/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed.entities/nurbscurve/properties) | Gets the collection of all properties. |
| [scene](/3d/python-net/aspose.threed.entities/nurbscurve/scene) | Gets the scene that this object belongs to |
| [parent_nodes](/3d/python-net/aspose.threed.entities/nurbscurve/parent_nodes) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [excluded](/3d/python-net/aspose.threed.entities/nurbscurve/excluded) | Gets or sets whether to exclude this entity during exporting. |
| [parent_node](/3d/python-net/aspose.threed.entities/nurbscurve/parent_node) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [color](/3d/python-net/aspose.threed.entities/nurbscurve/color) | Gets or sets the color of the line, default value is white(1, 1, 1) |
| [order](/3d/python-net/aspose.threed.entities/nurbscurve/order) | Gets or sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [dimension](/3d/python-net/aspose.threed.entities/nurbscurve/dimension) | Gets or sets the curve's dimension. |
| [curve_type](/3d/python-net/aspose.threed.entities/nurbscurve/curve_type) | Gets or sets the type of the curve. |
| [rational](/3d/python-net/aspose.threed.entities/nurbscurve/rational) | Gets or sets whether it is rational, this value indicates whether this [`NurbsCurve`](/3d/python-net/aspose.threed.entities/nurbscurve) is rational spline or non-rational spline.<br/>Non-rational B-spline is a special case of rational B-splines. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/nurbscurve/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed.entities/nurbscurve/remove_property/#str) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed.entities/nurbscurve/get_property/#str) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed.entities/nurbscurve/set_property/#str-any) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed.entities/nurbscurve/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`get_bounding_box(self)`](/3d/python-net/aspose.threed.entities/nurbscurve/get_bounding_box/#) | Gets the bounding box of current entity in its object space coordinate system. |
| [`get_entity_renderer_key(self)`](/3d/python-net/aspose.threed.entities/nurbscurve/get_entity_renderer_key/#) | Gets the key of the entity renderer registered in the renderer |
| [`evaluate(self, steps)`](/3d/python-net/aspose.threed.entities/nurbscurve/evaluate/#int) | Evaluate the NURBS curve |
| [`evaluate_at(self, u)`](/3d/python-net/aspose.threed.entities/nurbscurve/evaluate_at/#float) | Evaluate the curve's point at specified position |



### See Also
* module [`aspose.threed.entities`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Curve`](/3d/python-net/aspose.threed.entities/curve)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`NurbsCurve`](/3d/python-net/aspose.threed.entities/nurbscurve)
* class [`SceneObject`](/3d/python-net/aspose.threed/sceneobject)
