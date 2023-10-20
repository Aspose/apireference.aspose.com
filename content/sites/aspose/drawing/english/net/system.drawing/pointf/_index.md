---
title: Struct PointF
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.PointF struct. Represents an ordered pair of floatingpoint x and ycoordinates that defines a point in a twodimensional plane
type: docs
weight: 910
url: /net/system.drawing/pointf/
---
## PointF structure

Represents an ordered pair of floating-point x- and y-coordinates that defines a point in a two-dimensional plane.

```csharp
public struct PointF : IEquatable<PointF>
```

## Constructors

| Name | Description |
| --- | --- |
| [PointF](pointf/)(float, float) | Initializes a new instance of the PointF structure with the specified coordinates. |

## Properties

| Name | Description |
| --- | --- |
| [IsEmpty](../../system.drawing/pointf/isempty/) { get; } | Gets a value indicating whether this PointF is empty. |
| [X](../../system.drawing/pointf/x/) { get; set; } | Gets or sets the x-coordinate of this PointF. |
| [Y](../../system.drawing/pointf/y/) { get; set; } | Gets or sets the y-coordinate of this PointF. |

## Methods

| Name | Description |
| --- | --- |
| static [Add](../../system.drawing/pointf/add/#add)(PointF, Size) | Translates a given PointF by a specified SizeF. |
| static [Add](../../system.drawing/pointf/add/#add_1)(PointF, SizeF) | Translates a given PointF by a specified SizeF. |
| static [Subtract](../../system.drawing/pointf/subtract/#subtract)(PointF, Size) | Translates a `PointF` by the negative of a given [`Size`](../size/) . |
| static [Subtract](../../system.drawing/pointf/subtract/#subtract_1)(PointF, SizeF) | Translates a `PointF` by the negative of a given [`Size`](../size/) . |
| override [Equals](../../system.drawing/pointf/equals/#equals_1)(object) | Specifies whether this PointF contains the same coordinates as the specified Object. |
| [Equals](../../system.drawing/pointf/equals/#equals)(PointF) | Tests whether other `PointF` structure has the same location of this `PointF` structure. |
| override [GetHashCode](../../system.drawing/pointf/gethashcode/)() | Returns a hash code for this instance. |
| override [ToString](../../system.drawing/pointf/tostring/)() | Converts the attributes of this `PointF` to a human readable string. |
| [operator +](../../system.drawing/pointf/op_addition/#op_addition) | Translates a `PointF` by a given [`Size`](../size/) . (2 operators) |
| [operator ==](../../system.drawing/pointf/op_equality/) | Compares two PointF structures. The result specifies whether the values of the X and Y properties of the two PointF structures are equal. |
| [operator !=](../../system.drawing/pointf/op_inequality/) | Determines whether the coordinates of the specified points are not equal. |
| [operator -](../../system.drawing/pointf/op_subtraction/#op_subtraction) | Translates a `PointF` by the negative of a given [`Size`](../size/) . (2 operators) |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../system.drawing/pointf/empty/) | Represents a new instance of the PointF class with member data left uninitialized. |

### See Also

* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


