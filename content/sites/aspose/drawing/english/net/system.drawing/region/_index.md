---
title: Class Region
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Region class. Describes the interior of a graphics shape composed of rectangles and paths. This class cannot be inherited
type: docs
weight: 1020
url: /net/system.drawing/region/
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
| [Clone](../../system.drawing/region/clone/)() | Creates an exact copy of this Region. |
| [Complement](../../system.drawing/region/complement/#complement)(GraphicsPath) | Updates this Region to contain the portion of the specified GraphicsPath that does not intersect with this Region. |
| [Complement](../../system.drawing/region/complement/#complement_1)(Rectangle) | Updates this Region to contain the portion of the specified Rectangle structure that does not intersect with this Region. |
| [Complement](../../system.drawing/region/complement/#complement_2)(RectangleF) | Updates this Region to contain the portion of the specified RectangleF structure that does not intersect with this Region. |
| [Complement](../../system.drawing/region/complement/#complement_3)(Region) | Updates this Region to contain the portion of the specified Region that does not intersect with this Region. |
| [Dispose](../../system.drawing/region/dispose/)() | Releases all resources used by this Region. |
| [Equals](../../system.drawing/region/equals/#equals)(Region, Graphics) | Tests whether the specified Region is identical to this Region on the specified drawing surface. |
| [Exclude](../../system.drawing/region/exclude/#exclude)(GraphicsPath) | Updates this Region to contain only the portion of its interior that does not intersect with the specified GraphicsPath. |
| [Exclude](../../system.drawing/region/exclude/#exclude_1)(Rectangle) | Updates this Region to contain only the portion of its interior that does not intersect with the specified Rectangle structure. |
| [Exclude](../../system.drawing/region/exclude/#exclude_2)(RectangleF) | Updates this Region to contain only the portion of its interior that does not intersect with the specified RectangleF structure. |
| [Exclude](../../system.drawing/region/exclude/#exclude_3)(Region) | Updates this Region to contain only the portion of its interior that does not intersect with the specified Region. |
| [GetBounds](../../system.drawing/region/getbounds/)(Graphics) | Gets a RectangleF structure that represents a rectangle that bounds this Region on the drawing surface of a Graphics object. |
| [GetRegionData](../../system.drawing/region/getregiondata/)() | Returns a RegionData that represents the information that describes this Region. |
| [GetRegionScans](../../system.drawing/region/getregionscans/)(Matrix) | Returns an array of RectangleF structures that approximate this Region after the specified matrix transformation is applied. |
| [Intersect](../../system.drawing/region/intersect/#intersect)(GraphicsPath) | Updates this Region to the intersection of itself with the specified GraphicsPath. |
| [Intersect](../../system.drawing/region/intersect/#intersect_1)(Rectangle) | Updates this Region to the intersection of itself with the specified Rectangle structure. |
| [Intersect](../../system.drawing/region/intersect/#intersect_2)(RectangleF) | Updates this Region to the intersection of itself with the specified RectangleF structure. |
| [Intersect](../../system.drawing/region/intersect/#intersect_3)(Region) | Updates this Region to the intersection of itself with the specified Region. |
| [IsEmpty](../../system.drawing/region/isempty/)(Graphics) | Tests whether this Region has an empty interior on the specified drawing surface. |
| [IsInfinite](../../system.drawing/region/isinfinite/)(Graphics) | Tests whether this Region has an infinite interior on the specified drawing surface. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_7)(Point) | Tests whether the specified Point structure is contained within this Region. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_9)(PointF) | Tests whether the specified PointF structure is contained within this Region. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_11)(Rectangle) | Tests whether any portion of the specified Rectangle structure is contained within this Region. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_13)(RectangleF) | Tests whether any portion of the specified RectangleF structure is contained within this Region. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_3)(float, float) | Tests whether the specified point is contained within this Region. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_8)(Point, Graphics) | Tests whether the specified Point structure is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_10)(PointF, Graphics) | Tests whether the specified PointF structure is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_12)(Rectangle, Graphics) | Tests whether any portion of the specified Rectangle structure is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_14)(RectangleF, Graphics) | Tests whether any portion of the specified RectangleF structure is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_6)(float, float, Graphics) | Tests whether the specified point is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_2)(int, int, Graphics) | Tests whether the specified point is contained within this Region object when drawn using the specified Graphics object. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_4)(float, float, float, float) | Tests whether any portion of the specified rectangle is contained within this Region. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible)(int, int, int, int) | Tests whether any portion of the specified rectangle is contained within this Region. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_5)(float, float, float, float, Graphics) | Tests whether any portion of the specified rectangle is contained within this Region when drawn using the specified Graphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_1)(int, int, int, int, Graphics) | Tests whether any portion of the specified rectangle is contained within this Region when drawn using the specified Graphics. |
| [MakeEmpty](../../system.drawing/region/makeempty/)() | Initializes this Region to an empty interior. |
| [MakeInfinite](../../system.drawing/region/makeinfinite/)() | Initializes this Region object to an infinite interior. |
| [Transform](../../system.drawing/region/transform/)(Matrix) | Transforms this Region by the specified Matrix. |
| [Translate](../../system.drawing/region/translate/#translate_1)(float, float) | Offsets the coordinates of this Region by the specified amount. |
| [Translate](../../system.drawing/region/translate/#translate)(int, int) | Offsets the coordinates of this Region by the specified amount. |
| [Union](../../system.drawing/region/union/#union)(GraphicsPath) | Updates this Region to the union of itself and the specified GraphicsPath. |
| [Union](../../system.drawing/region/union/#union_1)(Rectangle) | Updates this Region to the union of itself and the specified Rectangle structure. |
| [Union](../../system.drawing/region/union/#union_2)(RectangleF) | Updates this Region to the union of itself and the specified RectangleF structure. |
| [Union](../../system.drawing/region/union/#union_3)(Region) | Updates this Region to the union of itself and the specified Region. |
| [Xor](../../system.drawing/region/xor/#xor)(GraphicsPath) | Updates this Region to the union minus the intersection of itself with the specified GraphicsPath. |
| [Xor](../../system.drawing/region/xor/#xor_1)(Rectangle) | Updates this Region to the union minus the intersection of itself with the specified Rectangle structure. |
| [Xor](../../system.drawing/region/xor/#xor_2)(RectangleF) | Updates this Region to the union minus the intersection of itself with the specified RectangleF structure. |
| [Xor](../../system.drawing/region/xor/#xor_3)(Region) | Updates this Region to the union minus the intersection of itself with the specified Region. |

### See Also

* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


