---
title: Class NurbsCurve
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.NurbsCurve class. NURBS curve is a curve represented by NURBSNonuniform rational basis spline A NURBS curve is defined by its Order a set of weighted ControlPoints and a KnotVectors The w component in control point is used as control points weight whatever it is a TwoDimensional or ThreeDimensional
type: docs
weight: 490
url: /net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[NURBS curve](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) is a curve represented by NURBS(Non-uniform rational basis spline), A NURBS curve is defined by its [`Order`](./order/), a set of weighted [`ControlPoints`](../geometry/controlpoints/) and a [`KnotVectors`](./knotvectors/) The w component in control point is used as control point's weight, whatever it is a TwoDimensional or ThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Constructors

| Name | Description |
| --- | --- |
| [NurbsCurve](nurbscurve/#constructor)() | Initializes a new instance of the `NurbsCurve` class. |
| [NurbsCurve](nurbscurve/#constructor_1)(string) | Initializes a new instance of the `NurbsCurve` class. |

## Properties

| Name | Description |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Gets or sets the color of the line, default value is white(1, 1, 1)(Inherited from [`Curve`](../curve/).) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints/) { get; } | Gets all control points |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype/) { get; set; } | Gets or sets the type of the curve. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension/) { get; set; } | Gets or sets the curve's dimension. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors/) { get; } | Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity/) { get; } | Gets the multiplicity. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Order](../../aspose.threed.entities/nurbscurve/order/) { get; set; } | Gets or sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Rational](../../aspose.threed.entities/nurbscurve/rational/) { get; set; } | Gets or sets whether it is rational, this value indicates whether this `NurbsCurve` is rational spline or non-rational spline. Non-rational B-spline is a special case of rational B-splines. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |

## Methods

| Name | Description |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate/)(int) | Evaluate the NURBS curve |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat/)(double) | Evaluate the curve's point at specified position |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Curve`](../curve/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [Curve](../curve/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


