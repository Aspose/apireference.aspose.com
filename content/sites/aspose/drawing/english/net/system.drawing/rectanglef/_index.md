---
title: Struct RectangleF
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.RectangleF struct. Stores a set of four floatingpoint numbers that represent the location and size of a rectangle. For more advanced region functions use a Region object
type: docs
weight: 1060
url: /net/system.drawing/rectanglef/
---
## RectangleF structure

Stores a set of four floating-point numbers that represent the location and size of a rectangle. For more advanced region functions, use a Region object.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Constructors

| Name | Description |
| --- | --- |
| [RectangleF](rectanglef/#constructor_1)(PointF, SizeF) | Initializes a new instance of the RectangleF structure with the specified location and size. |
| [RectangleF](rectanglef/#constructor)(float, float, float, float) | Initializes a new instance of the RectangleF structure with the specified location and size. |

## Properties

| Name | Description |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom/) { get; } | Gets the y-coordinate that is the sum of Y and Height of this RectangleF structure. |
| [Height](../../system.drawing/rectanglef/height/) { get; set; } | Gets or sets the height of this RectangleF structure. |
| [IsEmpty](../../system.drawing/rectanglef/isempty/) { get; } | Gets a value indicating whether the Width or Height property of this RectangleF has a value of zero. |
| [Left](../../system.drawing/rectanglef/left/) { get; } | Gets the x-coordinate of the left edge of this RectangleF structure. |
| [Location](../../system.drawing/rectanglef/location/) { get; set; } | Gets or sets the coordinates of the upper-left corner of this RectangleF structure. |
| [Right](../../system.drawing/rectanglef/right/) { get; } | Gets the x-coordinate that is the sum of X and Width of this RectangleF structure. |
| [Size](../../system.drawing/rectanglef/size/) { get; set; } | Gets or sets the size of this RectangleF. |
| [Top](../../system.drawing/rectanglef/top/) { get; } | Gets the y-coordinate of the top edge of this RectangleF structure. |
| [Width](../../system.drawing/rectanglef/width/) { get; set; } | Gets or sets the width of this RectangleF structure. |
| [X](../../system.drawing/rectanglef/x/) { get; set; } | Gets or sets the x-coordinate of the upper-left corner of this RectangleF structure. |
| [Y](../../system.drawing/rectanglef/y/) { get; set; } | Gets or sets the x-coordinate of the upper-left corner of this RectangleF structure. |

## Methods

| Name | Description |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb/)(float, float, float, float) | Creates a RectangleF structure with upper-left corner and lower-right corner at the specified locations. |
| static [Inflate](../../system.drawing/rectanglef/inflate/)(RectangleF, float, float) | Creates and returns an inflated copy of the specified RectangleF structure. The copy is inflated by the specified amount. The original rectangle remains unmodified. |
| static [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | Returns a RectangleF structure that represents the intersection of two rectangles. If there is no intersection, and empty RectangleF is returned. |
| static [Union](../../system.drawing/rectanglef/union/)(RectangleF, RectangleF) | Creates the smallest possible third rectangle that can contain both of two rectangles that form a union. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_1)(PointF) | Determines if the specified point is contained within this RectangleF structure. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_2)(RectangleF) | Determines if the rectangular region represented by *rect* is entirely contained within this RectangleF structure. |
| [Contains](../../system.drawing/rectanglef/contains/#contains)(float, float) | Determines if the specified point is contained within this RectangleF structure. |
| override [Equals](../../system.drawing/rectanglef/equals/#equals_1)(object) | Determines whether the specified Object, is equal to this instance. |
| [Equals](../../system.drawing/rectanglef/equals/#equals)(RectangleF) | Tests whether other `RectangleF` structure has the same location and size of this `RectangleF` structure. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode/)() | Returns a hash code for this instance. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate_1)(SizeF) | Inflates this RectangleF by the specified amount. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate)(float, float) | Inflates this RectangleF structure by the specified amount. |
| [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF) | Replaces this RectangleF structure with the intersection of itself and the specified RectangleF structure. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith/)(RectangleF) | Determines if this rectangle intersects with *rect*. |
| [Offset](../../system.drawing/rectanglef/offset/#offset_1)(PointF) | Adjusts the location of this rectangle by the specified amount. |
| [Offset](../../system.drawing/rectanglef/offset/#offset)(float, float) | Adjusts the location of this rectangle by the specified amount. |
| override [ToString](../../system.drawing/rectanglef/tostring/)() | Converts the attributes of this [`Rectangle`](../rectangle/) to a human readable string. |
| [operator ==](../../system.drawing/rectanglef/op_equality/) | Tests whether two RectangleF structures have equal location and size. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit/) | Converts the specified Rectangle structure to a RectangleF structure. |
| [operator !=](../../system.drawing/rectanglef/op_inequality/) | Tests whether two RectangleF structures differ in location or size. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty/) | Represents an instance of the RectangleF class with its members uninitialized. |

### See Also

* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


