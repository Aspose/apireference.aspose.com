---
title: Struct BoundingBox
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Utilities.BoundingBox struct. The axisaligned bounding box
type: docs
weight: 2570
url: /net/aspose.threed.utilities/boundingbox/
---
## BoundingBox structure

The axis-aligned bounding box

```csharp
public struct BoundingBox
```

## Constructors

| Name | Description |
| --- | --- |
| [BoundingBox](boundingbox/#constructor)(Vector3, Vector3) | Initialize a finite bounding box with given minimum and maximum corner |
| [BoundingBox](boundingbox/#constructor_1)(double, double, double, double, double, double) | Initialize a finite bounding box with given minimum and maximum corner |

## Properties

| Name | Description |
| --- | --- |
| static [Infinite](../../aspose.threed.utilities/boundingbox/infinite/) { get; } | The infinite bounding box |
| static [Null](../../aspose.threed.utilities/boundingbox/null/) { get; } | The null bounding box |
| [Center](../../aspose.threed.utilities/boundingbox/center/) { get; } | The center of the bounding box. |
| [Extent](../../aspose.threed.utilities/boundingbox/extent/) { get; } | Gets the extent of the bounding box. |
| [Maximum](../../aspose.threed.utilities/boundingbox/maximum/) { get; } | The maximum corner of the bounding box |
| [Minimum](../../aspose.threed.utilities/boundingbox/minimum/) { get; } | The minimum corner of the bounding box |
| [Size](../../aspose.threed.utilities/boundingbox/size/) { get; } | The size of the bounding box |

## Methods

| Name | Description |
| --- | --- |
| static [FromGeometry](../../aspose.threed.utilities/boundingbox/fromgeometry/)(Geometry) | Construct a bounding box from given geometry |
| [Contains](../../aspose.threed.utilities/boundingbox/contains/#contains)(BoundingBox) | The bounding box to check if it's inside current bounding box. |
| [Contains](../../aspose.threed.utilities/boundingbox/contains/#contains_1)(Vector3) | Check if the point p is inside the bounding box |
| override [Equals](../../aspose.threed.utilities/boundingbox/equals/)(object) | Determines if two objects are equal |
| override [GetHashCode](../../aspose.threed.utilities/boundingbox/gethashcode/)() | Returns the hash code for this instance |
| [Merge](../../aspose.threed.utilities/boundingbox/merge/#merge)(BoundingBox) | Merges the new box into the current bounding box. |
| [Merge](../../aspose.threed.utilities/boundingbox/merge/#merge_1)(Vector3) | Merge current bounding box with given point |
| [Merge](../../aspose.threed.utilities/boundingbox/merge/#merge_2)(Vector4) | Merge current bounding box with given point |
| [Merge](../../aspose.threed.utilities/boundingbox/merge/#merge_3)(double, double, double) | Merge current bounding box with given point |
| [OverlapsWith](../../aspose.threed.utilities/boundingbox/overlapswith/)(BoundingBox) | Check if current bounding box overlaps with specified bounding box. |
| [Scale](../../aspose.threed.utilities/boundingbox/scale/)() | Calculates the absolute largest coordinate value of any contained point. |
| override [ToString](../../aspose.threed.utilities/boundingbox/tostring/)() | Gets the string representation of the bounding box. |
| [operator *](../../aspose.threed.utilities/boundingbox/op_multiply/) | Operator overloading for multiply, new bounding box's minimum and maximum corner will be transformed by the matrix. |

### Examples

The following code shows how to get a bounding box from an Entity instance.

```csharp
var sphere = new Sphere();
var boundingBox = sphere.GetBoundingBox();
Console.WriteLine("Bounding box = " + boundingBox);
```

### See Also

* namespace [Aspose.ThreeD.Utilities](../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../)


