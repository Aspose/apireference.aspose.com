---
title: Class Rectangle
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Rectangle class. Class represents rectangle
type: docs
weight: 9900
url: /net/aspose.pdf/rectangle/
---
## Rectangle class

Class represents rectangle.

```csharp
public sealed class Rectangle : ICloneable
```

## Constructors

| Name | Description |
| --- | --- |
| [Rectangle](rectangle/)(double, double, double, double, bool) | Constructor of Rectangle. |

## Properties

| Name | Description |
| --- | --- |
| static [Empty](../../aspose.pdf/rectangle/empty/) { get; } | Empty rectangle |
| static [Trivial](../../aspose.pdf/rectangle/trivial/) { get; } | Initializes trivial rectangle i.e. rectangle with zero position and size. |
| [Height](../../aspose.pdf/rectangle/height/) { get; } | Height of rectangle. |
| [IsEmpty](../../aspose.pdf/rectangle/isempty/) { get; } | Checks if rectangle is empty. |
| [IsPoint](../../aspose.pdf/rectangle/ispoint/) { get; } | Checks if rectangle is point i.e. LLX is equal URX and LLY is equal URY. |
| [IsTrivial](../../aspose.pdf/rectangle/istrivial/) { get; } | Checks if rectangle is trivial i.e. has zero size and position. |
| [LLX](../../aspose.pdf/rectangle/llx/) { get; set; } | X-coordinate of lower - left corner. |
| [LLY](../../aspose.pdf/rectangle/lly/) { get; set; } | Y - coordinate of lower-left corner. |
| [URX](../../aspose.pdf/rectangle/urx/) { get; set; } | X - coordinate of upper-right corner. |
| [URY](../../aspose.pdf/rectangle/ury/) { get; set; } | Y - coordinate of upper-right corner. |
| [Width](../../aspose.pdf/rectangle/width/) { get; } | Width of rectangle. |

## Methods

| Name | Description |
| --- | --- |
| static [FromRect](../../aspose.pdf/rectangle/fromrect/#fromrect)(Rectangle) | Initializes new rectangle from given instance of System.Drawing.Rectangle. |
| static [FromRect](../../aspose.pdf/rectangle/fromrect/#fromrect_1)(RectangleF) | Initializes new rectangle from given instance of System.Drawing.Rectangle. |
| static [Parse](../../aspose.pdf/rectangle/parse/)(string) | Try to parse string and extract from it rectangle components llx, lly, urx, ury. |
| [Center](../../aspose.pdf/rectangle/center/)() | Returncs coordinates of center of the rectangle. |
| [Clone](../../aspose.pdf/rectangle/clone/)() | Clones the Rectangle object. |
| [Contains](../../aspose.pdf/rectangle/contains/)(Point, bool) | Determinces whether given point is inside of the rectangle. |
| [ContainsLine](../../aspose.pdf/rectangle/containsline/)(double, double, double, double) | Determines whether the rectangle contains a line represented by two points. |
| [ContainsPoint](../../aspose.pdf/rectangle/containspoint/)(double, double) | Determines whether the given point is contained within the rectangle. |
| [Equals](../../aspose.pdf/rectangle/equals/#equals)(Rectangle) | Check if rectangles are equal i.e. have same position and sizes. |
| [Intersect](../../aspose.pdf/rectangle/intersect/)(Rectangle) | Intersects to rectangles. |
| [IsIntersect](../../aspose.pdf/rectangle/isintersect/)(Rectangle) | Determines whether this rectangle intersects with other rectangle. |
| [Join](../../aspose.pdf/rectangle/join/)(Rectangle) | Joins rectangles. |
| [MoveBy](../../aspose.pdf/rectangle/moveby/)(double, double) | Shift rectangle by the specified deltas. |
| [NearEquals](../../aspose.pdf/rectangle/nearequals/)(Rectangle, double) | Check if rectangles are near equal i.e. have near same (up to delta) position and sizes. |
| [Rotate](../../aspose.pdf/rectangle/rotate/#rotate_1)(int) | Rotate rectangle by the specified angle. |
| [Rotate](../../aspose.pdf/rectangle/rotate/#rotate)(Rotation) | Rotate rectangle by the specified angle. |
| [ToPoints](../../aspose.pdf/rectangle/topoints/)() | Converts rectangle into array of points ("QuadPoints"). |
| [ToRect](../../aspose.pdf/rectangle/torect/)() | Converts rectangle to instance of System.Drawing.Rectangle. Floating-point positions and size are truncated. |
| override [ToString](../../aspose.pdf/rectangle/tostring/)() | Gets rectangle string representation. |

### See Also

* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


