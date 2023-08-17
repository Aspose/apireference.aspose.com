---
title: Rectangle
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 1040
url: /net/system.drawing/rectangle/
---
## Rectangle structure

Stores a set of four integers that represent the location and size of a rectangle.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Constructors

| Name | Description |
| --- | --- |
| [Rectangle](rectangle)(Point, Size) | Initializes a new instance of the [`Rectangle`](../rectangle) struct with the specified location and size. |
| [Rectangle](rectangle)(int, int, int, int) | Initializes a new instance of the Rectangle structure with the specified location and size. |

## Properties

| Name | Description |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | Gets the y-coordinate that is the sum of the Y and Height property values of this Rectangle structure. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | Gets or sets the height of this Rectangle structure. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | Gets a value indicating whether all numeric properties of this [`Rectangle`](../rectangle) have values of zero. |
| [Left](../../system.drawing/rectangle/left) { get; } | Gets the x-coordinate of the left edge of this Rectangle structure. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | Gets or sets the coordinates of the upper-left corner of this Rectangle structure. |
| [Right](../../system.drawing/rectangle/right) { get; } | Gets the x-coordinate that is the sum of X and Width property values of this Rectangle structure. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | Gets or sets the size of this Rectangle. |
| [Top](../../system.drawing/rectangle/top) { get; } | Gets the y-coordinate of the top edge of this Rectangle structure. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | Gets or sets the width of this Rectangle structure. |
| [X](../../system.drawing/rectangle/x) { get; set; } | Gets or sets the x-coordinate of the upper-left corner of this Rectangle structure. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | Gets or sets the y-coordinate of the upper-left corner of this Rectangle structure. |

## Methods

| Name | Description |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | Converts the specified RectangleF structure to a Rectangle structure by rounding the RectangleF values to the next higher integer values. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | Creates a Rectangle structure with the specified edge locations. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | Creates a [`Rectangle`](../rectangle) that is inflated by the specified amount. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | Returns a third Rectangle structure that represents the intersection of two other Rectangle structures. If there is no intersection, an empty Rectangle is returned. |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | Converts the specified RectangleF to a Rectangle by rounding the RectangleF values to the nearest integer values. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | Converts the specified RectangleF to a Rectangle by truncating the RectangleF values. |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | Gets a Rectangle structure that contains the union of two Rectangle structures. |
| [Contains](../../system.drawing/rectangle/contains)(Point) | Determines if the specified point is contained within this Rectangle structure. |
| [Contains](../../system.drawing/rectangle/contains)(Rectangle) | Determines if the rectangular region represented by *rect* is entirely contained within the rectangular region represented by this [`Rectangle`](../rectangle). |
| [Contains](../../system.drawing/rectangle/contains)(int, int) | Determines if the specified point is contained within this Rectangle structure. |
| override [Equals](../../system.drawing/rectangle/equals)(object) | Tests whether obj is a Rectangle structure with the same location and size of this Rectangle structure. |
| [Equals](../../system.drawing/rectangle/equals)(Rectangle) | Tests whether other [`Rectangle`](../rectangle) structure has the same location and size of this [`Rectangle`](../rectangle) structure. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | Returns the hash code for this Rectangle structure. For information about the use of hash codes, see GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate)(Size) | Enlarges this Rectangle by the specified amount. |
| [Inflate](../../system.drawing/rectangle/inflate)(int, int) | Enlarges this Rectangle by the specified amount. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | Replaces this Rectangle with the intersection of itself and the specified Rectangle. |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | Determines if this rectangle intersects with *rect*. |
| [Offset](../../system.drawing/rectangle/offset)(Point) | Adjusts the location of this rectangle by the specified amount. |
| [Offset](../../system.drawing/rectangle/offset)(int, int) | Adjusts the location of this rectangle by the specified amount. |
| override [ToString](../../system.drawing/rectangle/tostring)() | Converts the attributes of this [`Rectangle`](../rectangle) to a human readable string. |
| [operator ==](../../system.drawing/rectangle/op_equality) | Tests whether two Rectangle structures have equal location and size. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | Tests whether two Rectangle structures differ in location or size. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | Represents a Rectangle structure with its properties left uninitialized. |

### See Also

* namespace [System.Drawing](../../system.drawing)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
