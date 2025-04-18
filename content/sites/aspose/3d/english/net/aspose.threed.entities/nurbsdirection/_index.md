---
title: Class NurbsDirection
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.NurbsDirection class. A 3D NurbsSurface has two direction the U and V the NurbsDirection defines data for each direction. A direction is actually a NURBS curve that means its also defined by its Order a KnotVectors and a set of weighted control pointsdefined in NurbsSurface
type: docs
weight: 500
url: /net/aspose.threed.entities/nurbsdirection/
---
## NurbsDirection class

A 3D [`NurbsSurface`](../nurbssurface/) has two direction, the [`U`](../nurbssurface/u/) and [`V`](../nurbssurface/v/), the `NurbsDirection` defines data for each direction. A direction is actually a NURBS curve, that means it's also defined by its [`Order`](./order/), a [`KnotVectors`](./knotvectors/), and a set of weighted control points(defined in [`NurbsSurface`](../nurbssurface/)).

```csharp
public class NurbsDirection
```

## Constructors

| Name | Description |
| --- | --- |
| [NurbsDirection](nurbsdirection/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.threed.entities/nurbsdirection/count/) { get; set; } | Gets or sets the count of control points in current direction. |
| [Divisions](../../aspose.threed.entities/nurbsdirection/divisions/) { get; set; } | Gets or sets the number of divisions between adjacent control points in current direction. |
| [KnotVectors](../../aspose.threed.entities/nurbsdirection/knotvectors/) { get; } | Gets the knot vector, it is a sequence of parameter values that determines where and how the control points affect the NURBS curve. |
| [Multiplicity](../../aspose.threed.entities/nurbsdirection/multiplicity/) { get; } | Gets the multiplicity. |
| [Order](../../aspose.threed.entities/nurbsdirection/order/) { get; set; } | Gets or sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [Type](../../aspose.threed.entities/nurbsdirection/type/) { get; set; } | Gets or sets the type of the current direction. |

### See Also

* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


