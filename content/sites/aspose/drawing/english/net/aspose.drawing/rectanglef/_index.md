---
title: Struct RectangleF
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.RectangleF struct. Stores a set of four floatingpoint numbers that represent the location and size of a rectangle. For more advanced region functions use a Region object
type: docs
weight: 1010
url: /net/aspose.drawing/rectanglef/
---
## RectangleF structure

Stores a set of four floating-point numbers that represent the location and size of a rectangle. For more advanced region functions, use a Region object.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Constructors

| Name | Description |
| --- | --- |
| [RectangleF](rectanglef/#constructor)(PointF, SizeF) | Initializes a new instance of the RectangleF structure with the specified location and size. |
| [RectangleF](rectanglef/#constructor_1)(float, float, float, float) | Initializes a new instance of the RectangleF structure with the specified location and size. |

## Properties

| Name | Description |
| --- | --- |
| [Bottom](../../aspose.drawing/rectanglef/bottom/) { get; } | Gets the y-coordinate that is the sum of Y and Height of this RectangleF structure. |
| [Height](../../aspose.drawing/rectanglef/height/) { get; set; } | Gets or sets the height of this RectangleF structure. |
| [IsEmpty](../../aspose.drawing/rectanglef/isempty/) { get; } | Gets a value indicating whether the Width or Height property of this RectangleF has a value of zero. |
| [Left](../../aspose.drawing/rectanglef/left/) { get; } | Gets the x-coordinate of the left edge of this RectangleF structure. |
| [Location](../../aspose.drawing/rectanglef/location/) { get; set; } | Gets or sets the coordinates of the upper-left corner of this RectangleF structure. |
| [Right](../../aspose.drawing/rectanglef/right/) { get; } | Gets the x-coordinate that is the sum of X and Width of this RectangleF structure. |
| [Size](../../aspose.drawing/rectanglef/size/) { get; set; } | Gets or sets the size of this RectangleF. |
| [Top](../../aspose.drawing/rectanglef/top/) { get; } | Gets the y-coordinate of the top edge of this RectangleF structure. |
| [Width](../../aspose.drawing/rectanglef/width/) { get; set; } | Gets or sets the width of this RectangleF structure. |
| [X](../../aspose.drawing/rectanglef/x/) { get; set; } | Gets or sets the x-coordinate of the upper-left corner of this RectangleF structure. |
| [Y](../../aspose.drawing/rectanglef/y/) { get; set; } | Gets or sets the x-coordinate of the upper-left corner of this RectangleF structure. |

## Methods

| Name | Description |
| --- | --- |
| static [FromLTRB](../../aspose.drawing/rectanglef/fromltrb/)(float, float, float, float) | Creates a RectangleF structure with upper-left corner and lower-right corner at the specified locations. |
| static [Inflate](../../aspose.drawing/rectanglef/inflate/)(RectangleF, float, float) | Creates and returns an inflated copy of the specified RectangleF structure. The copy is inflated by the specified amount. The original rectangle remains unmodified. |
| static [Intersect](../../aspose.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | Returns a RectangleF structure that represents the intersection of two rectangles. If there is no intersection, and empty RectangleF is returned. |
| static [Union](../../aspose.drawing/rectanglef/union/)(RectangleF, RectangleF) | Creates the smallest possible third rectangle that can contain both of two rectangles that form a union. |
| [Contains](../../aspose.drawing/rectanglef/contains/#contains)(PointF) | Determines if the specified point is contained within this RectangleF structure. |
| [Contains](../../aspose.drawing/rectanglef/contains/#contains_1)(RectangleF) | Determines if the rectangular region represented by *rect* is entirely contained within this RectangleF structure. |
| [Contains](../../aspose.drawing/rectanglef/contains/#contains_2)(float, float) | Determines if the specified point is contained within this RectangleF structure. |
| override [Equals](../../aspose.drawing/rectanglef/equals/#equals_1)(object) | Determines whether the specified Object, is equal to this instance. |
| [Equals](../../aspose.drawing/rectanglef/equals/#equals)(RectangleF) | Tests whether other `RectangleF` structure has the same location and size of this `RectangleF` structure. |
| override [GetHashCode](../../aspose.drawing/rectanglef/gethashcode/)() | Returns a hash code for this instance. |
| [Inflate](../../aspose.drawing/rectanglef/inflate/#inflate)(SizeF) | Inflates this RectangleF by the specified amount. |
| [Inflate](../../aspose.drawing/rectanglef/inflate/#inflate_1)(float, float) | Inflates this RectangleF structure by the specified amount. |
| [Intersect](../../aspose.drawing/rectanglef/intersect/)(RectangleF) | Replaces this RectangleF structure with the intersection of itself and the specified RectangleF structure. |
| [IntersectsWith](../../aspose.drawing/rectanglef/intersectswith/)(RectangleF) | Determines if this rectangle intersects with *rect*. |
| [Offset](../../aspose.drawing/rectanglef/offset/#offset)(PointF) | Adjusts the location of this rectangle by the specified amount. |
| [Offset](../../aspose.drawing/rectanglef/offset/#offset_1)(float, float) | Adjusts the location of this rectangle by the specified amount. |
| override [ToString](../../aspose.drawing/rectanglef/tostring/)() | Converts the attributes of this [`Rectangle`](../rectangle/) to a human readable string. |
| [operator ==](../../aspose.drawing/rectanglef/op_equality/) | Tests whether two RectangleF structures have equal location and size. |
| [implicit operator](../../aspose.drawing/rectanglef/op_implicit/) | Converts the specified Rectangle structure to a RectangleF structure. |
| [operator !=](../../aspose.drawing/rectanglef/op_inequality/) | Tests whether two RectangleF structures differ in location or size. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../aspose.drawing/rectanglef/empty/) | Represents an instance of the RectangleF class with its members uninitialized. |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


