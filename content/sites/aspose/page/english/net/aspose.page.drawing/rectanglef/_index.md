---
title: Struct RectangleF
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.RectangleF struct. Stores a set of four floatingpoint numbers that represent the location and size of a rectangle
type: docs
weight: 370
url: /net/aspose.page.drawing/rectanglef/
---
## RectangleF structure

Stores a set of four floating-point numbers that represent the location and size of a rectangle.

```csharp
public struct RectangleF
```

## Constructors

| Name | Description |
| --- | --- |
| [RectangleF](rectanglef/#constructor)(PointF, SizeF) | Initializes a new instance of the `RectangleF` class with the specified location and size. |
| [RectangleF](rectanglef/#constructor_1)(float, float, float, float) | Initializes a new instance of the `RectangleF` class with the specified location and size. |

## Properties

| Name | Description |
| --- | --- |
| [Bottom](../../aspose.page.drawing/rectanglef/bottom/) { get; } | Gets the y-coordinate that is the sum of [`Y`](./y/) and [`Height`](./height/) of this `RectangleF` structure. |
| [Height](../../aspose.page.drawing/rectanglef/height/) { get; set; } | Gets or sets the height of this `RectangleF` structure. |
| [IsEmpty](../../aspose.page.drawing/rectanglef/isempty/) { get; } | Tests whether the [`Width`](./width/) or [`Height`](./height/) property of this `RectangleF` has a value of zero. |
| [Left](../../aspose.page.drawing/rectanglef/left/) { get; } | Gets the x-coordinate of the left edge of this `RectangleF` structure. |
| [Location](../../aspose.page.drawing/rectanglef/location/) { get; set; } | Gets or sets the coordinates of the upper-left corner of this `RectangleF` structure. |
| [Right](../../aspose.page.drawing/rectanglef/right/) { get; } | Gets the x-coordinate that is the sum of [`X`](./x/) and [`Width`](./width/) of this `RectangleF` structure. |
| [Size](../../aspose.page.drawing/rectanglef/size/) { get; set; } | Gets or sets the size of this `RectangleF`. |
| [Top](../../aspose.page.drawing/rectanglef/top/) { get; } | Gets the y-coordinate of the top edge of this `RectangleF` structure. |
| [Width](../../aspose.page.drawing/rectanglef/width/) { get; set; } | Gets or sets the width of this `RectangleF` structure. |
| [X](../../aspose.page.drawing/rectanglef/x/) { get; set; } | Gets or sets the x-coordinate of the upper-left corner of this `RectangleF` structure. |
| [Y](../../aspose.page.drawing/rectanglef/y/) { get; set; } | Gets or sets the y-coordinate of the upper-left corner of this `RectangleF` structure. |

## Methods

| Name | Description |
| --- | --- |
| static [FromLTRB](../../aspose.page.drawing/rectanglef/fromltrb/)(float, float, float, float) | Creates a `RectangleF` structure with upper-left corner and lower-right corner at the specified locations. |
| static [Inflate](../../aspose.page.drawing/rectanglef/inflate/)(RectangleF, float, float) | Creates and returns an inflated copy of the specified `RectangleF` structure. The copy is inflated by the specified amount. The original rectangle remains unmodified. |
| static [Intersect](../../aspose.page.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | Returns a `RectangleF` structure that represents the intersection of two rectangles. If there is no intersection, and empty `RectangleF` is returned. |
| static [Union](../../aspose.page.drawing/rectanglef/union/)(RectangleF, RectangleF) | Creates the smallest possible third rectangle that can contain both of two rectangles that form a union. |
| [Clone](../../aspose.page.drawing/rectanglef/clone/)() | Clones this Aspose.Page.Drawing.RectangleF. |
| [Contains](../../aspose.page.drawing/rectanglef/contains/#contains)(PointF) | Determines if the specified point is contained within this `RectangleF` structure. |
| [Contains](../../aspose.page.drawing/rectanglef/contains/#contains_1)(RectangleF) | Determines if the rectangular region represented by *rect* is entirely contained within this `RectangleF` structure. |
| [Contains](../../aspose.page.drawing/rectanglef/contains/#contains_2)(float, float) | Determines if the specified point is contained within this `RectangleF` structure. |
| override [Equals](../../aspose.page.drawing/rectanglef/equals/)(object) | Tests whether *obj* is a `RectangleF` with the same location and size of this `RectangleF`. |
| override [GetHashCode](../../aspose.page.drawing/rectanglef/gethashcode/)() | Gets the hash code for this `RectangleF` structure. For information about the use of hash codes, see Object.GetHashCode. |
| [Inflate](../../aspose.page.drawing/rectanglef/inflate/#inflate)(SizeF) | Inflates this `RectangleF` by the specified amount. |
| [Inflate](../../aspose.page.drawing/rectanglef/inflate/#inflate_1)(float, float) | Inflates this `RectangleF` structure by the specified amount. |
| [Intersect](../../aspose.page.drawing/rectanglef/intersect/)(RectangleF) | Replaces this `RectangleF` structure with the intersection of itself and the specified `RectangleF` structure. |
| [IntersectsWith](../../aspose.page.drawing/rectanglef/intersectswith/)(RectangleF) | Determines if this rectangle intersects with *rect*. |
| [Offset](../../aspose.page.drawing/rectanglef/offset/#offset)(PointF) | Adjusts the location of this rectangle by the specified amount. |
| [Offset](../../aspose.page.drawing/rectanglef/offset/#offset_1)(float, float) | Adjusts the location of this rectangle by the specified amount. |
| override [ToString](../../aspose.page.drawing/rectanglef/tostring/)() | Converts the Location and [`Size`](../size/) of this `RectangleF` to a human-readable string. |
| [operator ==](../../aspose.page.drawing/rectanglef/op_equality/) | Tests whether two `RectangleF` structures have equal location and size. |
| [operator !=](../../aspose.page.drawing/rectanglef/op_inequality/) | Tests whether two `RectangleF` structures differ in location or size. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../aspose.page.drawing/rectanglef/empty/) | Represents an instance of the `RectangleF` class with its members uninitialized. |

### See Also

* namespace [Aspose.Page.Drawing](../../aspose.page.drawing/)
* assembly [Aspose.Page](../../)


