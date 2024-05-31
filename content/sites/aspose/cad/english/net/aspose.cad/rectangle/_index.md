---
title: Struct Rectangle
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Rectangle struct. Stores a set of four integers that represent the location and size of a rectangle
type: docs
weight: 37150
url: /net/aspose.cad/rectangle/
---
## Rectangle structure

Stores a set of four integers that represent the location and size of a rectangle.

```csharp
public struct Rectangle
```

## Constructors

| Name | Description |
| --- | --- |
| [Rectangle](rectangle/#constructor)(Point, Size) | Initializes a new instance of the `Rectangle` structure with the specified location and size. |
| [Rectangle](rectangle/#constructor_1)(int, int, int, int) | Initializes a new instance of the `Rectangle` structure with the specified location and size. |

## Properties

| Name | Description |
| --- | --- |
| static [Empty](../../aspose.cad/rectangle/empty/) { get; } | Gets a new instance of the `Rectangle` structure that has [`X`](./x/), [`Y`](./y/), [`Width`](./width/) and [`Height`](./height/) values set to zero. |
| [Bottom](../../aspose.cad/rectangle/bottom/) { get; set; } | Gets or sets the y-coordinate that is the sum of the [`Y`](./y/) and [`Height`](./height/) property values of this `Rectangle` structure. |
| [Height](../../aspose.cad/rectangle/height/) { get; set; } | Gets or sets the height of this `Rectangle` structure. |
| [IsEmpty](../../aspose.cad/rectangle/isempty/) { get; } | Gets a value indicating whether all numeric properties of this `Rectangle` have values of zero. |
| [Left](../../aspose.cad/rectangle/left/) { get; set; } | Gets or sets the x-coordinate of the left edge of this `Rectangle` structure. |
| [Location](../../aspose.cad/rectangle/location/) { get; set; } | Gets or sets the coordinates of the upper-left corner of this `Rectangle` structure. |
| [Right](../../aspose.cad/rectangle/right/) { get; set; } | Gets or sets the x-coordinate that is the sum of [`X`](./x/) and [`Width`](./width/) property values of this `Rectangle` structure. |
| [Size](../../aspose.cad/rectangle/size/) { get; set; } | Gets or sets the size of this `Rectangle`. |
| [Top](../../aspose.cad/rectangle/top/) { get; set; } | Gets or sets the y-coordinate of the top edge of this `Rectangle` structure. |
| [Width](../../aspose.cad/rectangle/width/) { get; set; } | Gets or sets the width of this `Rectangle` structure. |
| [X](../../aspose.cad/rectangle/x/) { get; set; } | Gets or sets the x-coordinate of the upper-left corner of this `Rectangle` structure. |
| [Y](../../aspose.cad/rectangle/y/) { get; set; } | Gets or sets the y-coordinate of the upper-left corner of this `Rectangle` structure. |

## Methods

| Name | Description |
| --- | --- |
| static [Ceiling](../../aspose.cad/rectangle/ceiling/)(RectangleF) | Converts the specified [`RectangleF`](../rectanglef/) structure to a `Rectangle` structure by rounding the [`RectangleF`](../rectanglef/) values to the next higher integer values. |
| static [FromLeftTopRightBottom](../../aspose.cad/rectangle/fromlefttoprightbottom/)(int, int, int, int) | Creates a `Rectangle` structure with the specified edge locations. |
| static [FromPoints](../../aspose.cad/rectangle/frompoints/)(Point, Point) | Creates a new `Rectangle` from two points specified. Two verticales of the created `Rectangle` will be equal to the passed *point1* and *point2*. These would be typically the opposite vertices. |
| static [Inflate](../../aspose.cad/rectangle/inflate/)(Rectangle, int, int) | Creates and returns an inflated copy of the specified `Rectangle` structure. The copy is inflated by the specified amount. The original `Rectangle` structure remains unmodified. |
| static [Intersect](../../aspose.cad/rectangle/intersect/)(Rectangle, Rectangle) | Returns a third `Rectangle` structure that represents the intersection of two other `Rectangle` structures. If there is no intersection, an empty `Rectangle` is returned. |
| static [Round](../../aspose.cad/rectangle/round/)(RectangleF) | Converts the specified [`RectangleF`](../rectanglef/) to a `Rectangle` by rounding the [`RectangleF`](../rectanglef/) values to the nearest integer values. |
| static [Truncate](../../aspose.cad/rectangle/truncate/)(RectangleF) | Converts the specified [`RectangleF`](../rectanglef/) to a `Rectangle` by truncating the [`RectangleF`](../rectanglef/) values. |
| static [Union](../../aspose.cad/rectangle/union/)(Rectangle, Rectangle) | Gets a `Rectangle` structure that contains the union of two `Rectangle` structures. |
| [Contains](../../aspose.cad/rectangle/contains/#contains)(Point) | Determines if the specified point is contained within this `Rectangle` structure. |
| [Contains](../../aspose.cad/rectangle/contains/#contains_1)(Rectangle) | Determines if the rectangular region represented by *rect* is entirely contained within this `Rectangle` structure. |
| [Contains](../../aspose.cad/rectangle/contains/#contains_2)(int, int) | Determines if the specified point is contained within this `Rectangle` structure. |
| override [Equals](../../aspose.cad/rectangle/equals/)(object) | Tests whether *obj* is a `Rectangle` structure with the same location and size of this `Rectangle` structure. |
| override [GetHashCode](../../aspose.cad/rectangle/gethashcode/)() | Returns the hash code for this `Rectangle` structure. |
| [Inflate](../../aspose.cad/rectangle/inflate/#inflate)(Size) | Inflates this `Rectangle` by the specified amount. |
| [Inflate](../../aspose.cad/rectangle/inflate/#inflate_1)(int, int) | Inflates this `Rectangle` by the specified amount. |
| [Intersect](../../aspose.cad/rectangle/intersect/)(Rectangle) | Replaces this `Rectangle` with the intersection of itself and the specified `Rectangle`. |
| [IntersectsWith](../../aspose.cad/rectangle/intersectswith/)(Rectangle) | Determines if this rectangle intersects with *rect*. |
| [Normalize](../../aspose.cad/rectangle/normalize/)() | Normalizes the rectangle by making it's width and height positive, left less than right and top less than bottom. |
| [Offset](../../aspose.cad/rectangle/offset/#offset)(Point) | Adjusts the location of this rectangle by the specified amount. |
| [Offset](../../aspose.cad/rectangle/offset/#offset_1)(int, int) | Adjusts the location of this rectangle by the specified amount. |
| override [ToString](../../aspose.cad/rectangle/tostring/)() | Converts the attributes of this `Rectangle` to a human-readable string. |
| [operator ==](../../aspose.cad/rectangle/op_equality/) | Tests whether two `Rectangle` structures have equal location and size. |
| [operator !=](../../aspose.cad/rectangle/op_inequality/) | Tests whether two `Rectangle` structures differ in location or size. |

### See Also

* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


