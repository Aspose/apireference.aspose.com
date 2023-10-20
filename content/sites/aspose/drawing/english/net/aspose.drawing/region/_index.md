---
title: Class Region
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Region class. Describes the interior of a graphics shape composed of rectangles and paths. This class cannot be inherited
type: docs
weight: 1020
url: /net/aspose.drawing/region/
---
## Region class

Describes the interior of a graphics shape composed of rectangles and paths. This class cannot be inherited.

```csharp
public sealed class Region : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Region](region/#constructor)() | Initializes a new instance of the `Region` class. |
| [Region](region/#constructor_1)(GraphicsPath) | Initializes a new instance of the `Region` class with the specified GraphicsPath. |
| [Region](region/#constructor_3)(Rectangle) | Initializes a new instance of the `Region` class from the specified Rectangle structure. |
| [Region](region/#constructor_4)(RectangleF) | Initializes a new instance of the `Region` class from the specified RectangleF structure. |
| [Region](region/#constructor_2)(RegionData) | Initializes a new instance of the `Region` class from the specified data. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.drawing/region/clone/)() | Creates an exact copy of this Region. |
| [Complement](../../aspose.drawing/region/complement/#complement)(GraphicsPath) | Updates this Region to contain the portion of the specified GraphicsPath that does not intersect with this Region. |
| [Complement](../../aspose.drawing/region/complement/#complement_1)(Rectangle) | Updates this Region to contain the portion of the specified Rectangle structure that does not intersect with this Region. |
| [Complement](../../aspose.drawing/region/complement/#complement_2)(RectangleF) | Updates this Region to contain the portion of the specified RectangleF structure that does not intersect with this Region. |
| [Complement](../../aspose.drawing/region/complement/#complement_3)(Region) | Updates this Region to contain the portion of the specified Region that does not intersect with this Region. |
| [Dispose](../../aspose.drawing/region/dispose/)() | Releases all resources used by this Region. |
| [Equals](../../aspose.drawing/region/equals/#equals)(Region, Graphics) | Tests whether the specified Region is identical to this Region on the specified drawing surface. |
| [Exclude](../../aspose.drawing/region/exclude/#exclude)(GraphicsPath) | Updates this Region to contain only the portion of its interior that does not intersect with the specified GraphicsPath. |
| [Exclude](../../aspose.drawing/region/exclude/#exclude_1)(Rectangle) | Updates this Region to contain only the portion of its interior that does not intersect with the specified Rectangle structure. |
| [Exclude](../../aspose.drawing/region/exclude/#exclude_2)(RectangleF) | Updates this Region to contain only the portion of its interior that does not intersect with the specified RectangleF structure. |
| [Exclude](../../aspose.drawing/region/exclude/#exclude_3)(Region) | Updates this Region to contain only the portion of its interior that does not intersect with the specified Region. |
| [GetBounds](../../aspose.drawing/region/getbounds/)(Graphics) | Gets a RectangleF structure that represents a rectangle that bounds this Region on the drawing surface of a Graphics object. |
| [GetRegionData](../../aspose.drawing/region/getregiondata/)() | Returns a RegionData that represents the information that describes this Region. |
| [GetRegionScans](../../aspose.drawing/region/getregionscans/)(Matrix) | Returns an array of RectangleF structures that approximate this Region after the specified matrix transformation is applied. |
| [Intersect](../../aspose.drawing/region/intersect/#intersect)(GraphicsPath) | Updates this Region to the intersection of itself with the specified GraphicsPath. |
| [Intersect](../../aspose.drawing/region/intersect/#intersect_1)(Rectangle) | Updates this Region to the intersection of itself with the specified Rectangle structure. |
| [Intersect](../../aspose.drawing/region/intersect/#intersect_2)(RectangleF) | Updates this Region to the intersection of itself with the specified RectangleF structure. |
| [Intersect](../../aspose.drawing/region/intersect/#intersect_3)(Region) | Updates this Region to the intersection of itself with the specified Region. |
| [IsEmpty](../../aspose.drawing/region/isempty/)(Graphics) | Tests whether this Region has an empty interior on the specified drawing surface. |
| [IsInfinite](../../aspose.drawing/region/isinfinite/)(Graphics) | Tests whether this Region has an infinite interior on the specified drawing surface. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible)(Point) | Tests whether the specified Point structure is contained within this Region. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_2)(PointF) | Tests whether the specified PointF structure is contained within this Region. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_4)(Rectangle) | Tests whether any portion of the specified Rectangle structure is contained within this Region. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_6)(RectangleF) | Tests whether any portion of the specified RectangleF structure is contained within this Region. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_11)(float, float) | Tests whether the specified point is contained within this Region. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_1)(Point, Graphics) | Tests whether the specified Point structure is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_3)(PointF, Graphics) | Tests whether the specified PointF structure is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_5)(Rectangle, Graphics) | Tests whether any portion of the specified Rectangle structure is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_7)(RectangleF, Graphics) | Tests whether any portion of the specified RectangleF structure is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_12)(float, float, Graphics) | Tests whether the specified point is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_8)(int, int, Graphics) | Tests whether the specified point is contained within this Region object when drawn using the specified Graphics object. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_13)(float, float, float, float) | Tests whether any portion of the specified rectangle is contained within this Region. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_9)(int, int, int, int) | Tests whether any portion of the specified rectangle is contained within this Region. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_14)(float, float, float, float, Graphics) | Tests whether any portion of the specified rectangle is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../aspose.drawing/region/isvisible/#isvisible_10)(int, int, int, int, Graphics) | Tests whether any portion of the specified rectangle is contained within this Region when drawn using the specified Graphics. |
| [MakeEmpty](../../aspose.drawing/region/makeempty/)() | Initializes this Region to an empty interior. |
| [MakeInfinite](../../aspose.drawing/region/makeinfinite/)() | Initializes this Region object to an infinite interior. |
| [Transform](../../aspose.drawing/region/transform/)(Matrix) | Transforms this Region by the specified Matrix. |
| [Translate](../../aspose.drawing/region/translate/#translate_1)(float, float) | Offsets the coordinates of this Region by the specified amount. |
| [Translate](../../aspose.drawing/region/translate/#translate)(int, int) | Offsets the coordinates of this Region by the specified amount. |
| [Union](../../aspose.drawing/region/union/#union)(GraphicsPath) | Updates this Region to the union of itself and the specified GraphicsPath. |
| [Union](../../aspose.drawing/region/union/#union_1)(Rectangle) | Updates this Region to the union of itself and the specified Rectangle structure. |
| [Union](../../aspose.drawing/region/union/#union_2)(RectangleF) | Updates this Region to the union of itself and the specified RectangleF structure. |
| [Union](../../aspose.drawing/region/union/#union_3)(Region) | Updates this Region to the union of itself and the specified Region. |
| [Xor](../../aspose.drawing/region/xor/#xor)(GraphicsPath) | Updates this Region to the union minus the intersection of itself with the specified GraphicsPath. |
| [Xor](../../aspose.drawing/region/xor/#xor_1)(Rectangle) | Updates this Region to the union minus the intersection of itself with the specified Rectangle structure. |
| [Xor](../../aspose.drawing/region/xor/#xor_2)(RectangleF) | Updates this Region to the union minus the intersection of itself with the specified RectangleF structure. |
| [Xor](../../aspose.drawing/region/xor/#xor_3)(Region) | Updates this Region to the union minus the intersection of itself with the specified Region. |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


