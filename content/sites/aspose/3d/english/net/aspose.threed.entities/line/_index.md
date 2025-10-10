---
title: Class Line
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Line class. A polyline is a path defined by a set of points with ControlPoints and connected by Segments which means it can also be a set of connected line segments. The line is usually a linear object which means it cannot be used to represent a curve in order to represent a curve uses NurbsCurve
type: docs
weight: 480
url: /net/aspose.threed.entities/line/
---
## Line class

A polyline is a path defined by a set of points with [`ControlPoints`](../geometry/controlpoints/), and connected by [`Segments`](./segments/), which means it can also be a set of connected line segments. The line is usually a linear object, which means it cannot be used to represent a curve, in order to represent a curve, uses [`NurbsCurve`](../nurbscurve/).

```csharp
public class Line : Curve
```

## Constructors

| Name | Description |
| --- | --- |
| [Line](line/#constructor)() | Initializes a new instance of the `Line` class. |
| [Line](line/#constructor_1)(string) | Initializes a new instance of the `Line` class. |

## Properties

| Name | Description |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Gets or sets the color of the line, default value is white(1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/line/controlpoints/) { get; } | Gets all control points |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [Segments](../../aspose.threed.entities/line/segments/) { get; } | Gets the segments of the line |
| [Visible](../../aspose.threed.entities/line/visible/) { get; set; } | Gets or sets if the geometry is visible |

## Methods

| Name | Description |
| --- | --- |
| static [FromPoints](../../aspose.threed.entities/line/frompoints/)(params Vector3[]) | Construct a `Line` instance from a set of points. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [MakeDefaultIndices](../../aspose.threed.entities/line/makedefaultindices/)() | Generate the sequence 0,1,2,3....[`ControlPoints`](../geometry/controlpoints/).Length-1 to [`Segments`](./segments/) so the ControlPoints can be used as a single line |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [Curve](../curve/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


