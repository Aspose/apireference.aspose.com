---
title: Struct Point
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Point struct. Represents an ordered pair of integer x and ycoordinates that defines a point in a twodimensional plane
type: docs
weight: 900
url: /net/system.drawing/point/
---
## Point structure

Represents an ordered pair of integer x- and y-coordinates that defines a point in a two-dimensional plane.

```csharp
public struct Point : IEquatable<Point>
```

## Constructors

| Name | Description |
| --- | --- |
| [Point](point/#constructor)(int) | Initializes a new instance of the `Point` struct using coordinates specified by an integer value. |
| [Point](point/#constructor_2)(Size) | Initializes a new instance of the `Point` struct from a [`Size`](../size/) . |
| [Point](point/#constructor_1)(int, int) | Initializes a new instance of the `Point` struct with the specified coordinates. |

## Properties

| Name | Description |
| --- | --- |
| [IsEmpty](../../system.drawing/point/isempty/) { get; } | Gets a value indicating whether this this Point is empty. |
| [X](../../system.drawing/point/x/) { get; set; } | Gets or sets the x-coordinate of this Point. |
| [Y](../../system.drawing/point/y/) { get; set; } | Gets or sets the y-coordinate of this Point. |

## Methods

| Name | Description |
| --- | --- |
| static [Add](../../system.drawing/point/add/)(Point, Size) | Adds the specified Size to the specified Point. |
| static [Ceiling](../../system.drawing/point/ceiling/)(PointF) | Converts a [`PointF`](../pointf/) to a `Point` by performing a ceiling operation on all the coordinates. |
| static [Round](../../system.drawing/point/round/)(PointF) | Converts the specified PointF to a Point object by rounding the Point values to the nearest integer. |
| static [Subtract](../../system.drawing/point/subtract/)(Point, Size) | Translates a `Point` by the negative of a given [`Size`](../size/) . |
| static [Truncate](../../system.drawing/point/truncate/)(PointF) | Converts a PointF to a Point by performing a truncate operation on all the coordinates. |
| override [Equals](../../system.drawing/point/equals/#equals_1)(object) | Specifies whether this Point contains the same coordinates as the specified Object. |
| [Equals](../../system.drawing/point/equals/#equals)(Point) | Tests whether other `Point` structure has the same location of this `Point` structure. |
| override [GetHashCode](../../system.drawing/point/gethashcode/)() | Returns a hash code for this Point. |
| [Offset](../../system.drawing/point/offset/#offset_1)(Point) | Translates this Point by the specified Point. |
| [Offset](../../system.drawing/point/offset/#offset)(int, int) | Translates this Point by the specified amount. |
| override [ToString](../../system.drawing/point/tostring/)() | Converts the attributes of this `Point` to a human readable string. |
| [operator +](../../system.drawing/point/op_addition/) | Translates a `Point` by a given [`Size`](../size/) . |
| [operator ==](../../system.drawing/point/op_equality/) | Compares two Point objects. The result specifies whether the values of the X and Y properties of the two Point objects are equal. |
| [explicit operator](../../system.drawing/point/op_explicit/) | Creates a [`Size`](../size/) with the coordinates of the specified `Point`. |
| [implicit operator](../../system.drawing/point/op_implicit/) | Converts the specified Point structure to a PointF structure. |
| [operator !=](../../system.drawing/point/op_inequality/) | Compares two Point objects. The result specifies whether the values of the X or Y properties of the two Point objects are unequal. |
| [operator -](../../system.drawing/point/op_subtraction/) | Translates a `Point` by the negative of a given [`Size`](../size/) . |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../system.drawing/point/empty/) | Represents a Point that has X and Y values set to zero. |

### See Also

* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


