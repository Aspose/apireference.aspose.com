---
title: Struct Rectangle
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Rectangle struct. Stores a set of four integers that represent the location and size of a rectangle
type: docs
weight: 1000
url: /net/aspose.drawing/rectangle/
---
## Rectangle structure

Stores a set of four integers that represent the location and size of a rectangle.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Constructors

| Name | Description |
| --- | --- |
| [Rectangle](rectangle/#constructor)(Point, Size) | Initializes a new instance of the `Rectangle` struct with the specified location and size. |
| [Rectangle](rectangle/#constructor_1)(int, int, int, int) | Initializes a new instance of the Rectangle structure with the specified location and size. |

## Properties

| Name | Description |
| --- | --- |
| [Bottom](../../aspose.drawing/rectangle/bottom/) { get; } | Gets the y-coordinate that is the sum of the Y and Height property values of this Rectangle structure. |
| [Height](../../aspose.drawing/rectangle/height/) { get; set; } | Gets or sets the height of this Rectangle structure. |
| [IsEmpty](../../aspose.drawing/rectangle/isempty/) { get; } | Gets a value indicating whether all numeric properties of this `Rectangle` have values of zero. |
| [Left](../../aspose.drawing/rectangle/left/) { get; } | Gets the x-coordinate of the left edge of this Rectangle structure. |
| [Location](../../aspose.drawing/rectangle/location/) { get; set; } | Gets or sets the coordinates of the upper-left corner of this Rectangle structure. |
| [Right](../../aspose.drawing/rectangle/right/) { get; } | Gets the x-coordinate that is the sum of X and Width property values of this Rectangle structure. |
| [Size](../../aspose.drawing/rectangle/size/) { get; set; } | Gets or sets the size of this Rectangle. |
| [Top](../../aspose.drawing/rectangle/top/) { get; } | Gets the y-coordinate of the top edge of this Rectangle structure. |
| [Width](../../aspose.drawing/rectangle/width/) { get; set; } | Gets or sets the width of this Rectangle structure. |
| [X](../../aspose.drawing/rectangle/x/) { get; set; } | Gets or sets the x-coordinate of the upper-left corner of this Rectangle structure. |
| [Y](../../aspose.drawing/rectangle/y/) { get; set; } | Gets or sets the y-coordinate of the upper-left corner of this Rectangle structure. |

## Methods

| Name | Description |
| --- | --- |
| static [Ceiling](../../aspose.drawing/rectangle/ceiling/)(RectangleF) | Converts the specified RectangleF structure to a Rectangle structure by rounding the RectangleF values to the next higher integer values. |
| static [FromLTRB](../../aspose.drawing/rectangle/fromltrb/)(int, int, int, int) | Creates a Rectangle structure with the specified edge locations. |
| static [Inflate](../../aspose.drawing/rectangle/inflate/)(Rectangle, int, int) | Creates a `Rectangle` that is inflated by the specified amount. |
| static [Intersect](../../aspose.drawing/rectangle/intersect/)(Rectangle, Rectangle) | Returns a third Rectangle structure that represents the intersection of two other Rectangle structures. If there is no intersection, an empty Rectangle is returned. |
| static [Round](../../aspose.drawing/rectangle/round/)(RectangleF) | Converts the specified RectangleF to a Rectangle by rounding the RectangleF values to the nearest integer values. |
| static [Truncate](../../aspose.drawing/rectangle/truncate/)(RectangleF) | Converts the specified RectangleF to a Rectangle by truncating the RectangleF values. |
| static [Union](../../aspose.drawing/rectangle/union/)(Rectangle, Rectangle) | Gets a Rectangle structure that contains the union of two Rectangle structures. |
| [Contains](../../aspose.drawing/rectangle/contains/#contains)(Point) | Determines if the specified point is contained within this Rectangle structure. |
| [Contains](../../aspose.drawing/rectangle/contains/#contains_1)(Rectangle) | Determines if the rectangular region represented by *rect* is entirely contained within the rectangular region represented by this `Rectangle`. |
| [Contains](../../aspose.drawing/rectangle/contains/#contains_2)(int, int) | Determines if the specified point is contained within this Rectangle structure. |
| override [Equals](../../aspose.drawing/rectangle/equals/#equals_1)(object) | Tests whether obj is a Rectangle structure with the same location and size of this Rectangle structure. |
| [Equals](../../aspose.drawing/rectangle/equals/#equals)(Rectangle) | Tests whether other `Rectangle` structure has the same location and size of this `Rectangle` structure. |
| override [GetHashCode](../../aspose.drawing/rectangle/gethashcode/)() | Returns the hash code for this Rectangle structure. For information about the use of hash codes, see GetHashCode . |
| [Inflate](../../aspose.drawing/rectangle/inflate/#inflate)(Size) | Enlarges this Rectangle by the specified amount. |
| [Inflate](../../aspose.drawing/rectangle/inflate/#inflate_1)(int, int) | Enlarges this Rectangle by the specified amount. |
| [Intersect](../../aspose.drawing/rectangle/intersect/)(Rectangle) | Replaces this Rectangle with the intersection of itself and the specified Rectangle. |
| [IntersectsWith](../../aspose.drawing/rectangle/intersectswith/)(Rectangle) | Determines if this rectangle intersects with *rect*. |
| [Offset](../../aspose.drawing/rectangle/offset/#offset)(Point) | Adjusts the location of this rectangle by the specified amount. |
| [Offset](../../aspose.drawing/rectangle/offset/#offset_1)(int, int) | Adjusts the location of this rectangle by the specified amount. |
| override [ToString](../../aspose.drawing/rectangle/tostring/)() | Converts the attributes of this `Rectangle` to a human readable string. |
| [operator ==](../../aspose.drawing/rectangle/op_equality/) | Tests whether two Rectangle structures have equal location and size. |
| [operator !=](../../aspose.drawing/rectangle/op_inequality/) | Tests whether two Rectangle structures differ in location or size. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../aspose.drawing/rectangle/empty/) | Represents a Rectangle structure with its properties left uninitialized. |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


