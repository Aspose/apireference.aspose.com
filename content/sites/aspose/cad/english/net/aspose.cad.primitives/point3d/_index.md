---
title: Class Point3D
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Primitives.Point3D class. Represents class to work with 3D point and special operations for it
type: docs
weight: 36820
url: /net/aspose.cad.primitives/point3d/
---
## Point3D class

Represents class to work with 3D point and special operations for it.

```csharp
public class Point3D : Point2D
```

## Constructors

| Name | Description |
| --- | --- |
| [Point3D](point3d/#constructor)() | Initializes a new instance of the Point3D class |
| [Point3D](point3d/#constructor_1)(double, double) | Initializes a new instance of the Point3D class |
| [Point3D](point3d/#constructor_2)(double, double, double) | Initializes a new instance of the Point3D class |
| [Point3D](point3d/#constructor_3)(double, double, double, double) | Initializes a new instance of the Point3D class |

## Properties

| Name | Description |
| --- | --- |
| [CoordinateArray](../../aspose.cad.primitives/point3d/coordinatearray/) { get; } |  |
| [W](../../aspose.cad.primitives/point3d/w/) { get; set; } | Gets or sets W coordinate |
| [X](../../aspose.cad.primitives/point2d/x/) { get; set; } | Gets or sets the x. |
| [Y](../../aspose.cad.primitives/point2d/y/) { get; set; } | Gets or sets the y. |
| [Z](../../aspose.cad.primitives/point3d/z/) { get; set; } | Gets or sets Z coordinate |

## Methods

| Name | Description |
| --- | --- |
| static [CrossProduct](../../aspose.cad.primitives/point3d/crossproduct/)(Point3D, Point3D) | Gets cross-product of a points |
| static [NormalVector](../../aspose.cad.primitives/point3d/normalvector/)(Point3D, Point3D, Point3D) | Get normal vector of a plane. |
| static [Spherical](../../aspose.cad.primitives/point3d/spherical/)(double, double, double) | Get point in spherical coordinates |
| [Copy](../../aspose.cad.primitives/point3d/copy/)() | Creates copy of current point |
| [Distance](../../aspose.cad.primitives/point2d/distance/)(Point2D) |  |
| [Distance](../../aspose.cad.primitives/point3d/distance/#distance_1)(Point3D) |  |
| [Equality](../../aspose.cad.primitives/point3d/equality/)(object) | Does the real comparison of 3D points |
| override [Equals](../../aspose.cad.primitives/point3d/equals/#equals_1)(object) | Allows to compare 3D points. |
| override [Equals](../../aspose.cad.primitives/point3d/equals/#equals)(Point2D) | Overrides the Equals of 2D point so the called comparison would be 3D |
| [EqualsSoft](../../aspose.cad.primitives/point3d/equalssoft/)(object, double) | Allows to compare 3D points with specified threshold. |
| override [GetHashCode](../../aspose.cad.primitives/point3d/gethashcode/)() | Return hash code for object. |
| [Normalize](../../aspose.cad.primitives/point3d/normalize/)() | Normalizes the specified origin. |
| static [Distance](../../aspose.cad.primitives/point3d/distance/)(Point3D, Point3D) | Gets distance between points |
| static [DotProduct](../../aspose.cad.primitives/point3d/dotproduct/)(Point3D, Point3D) | Gets dot product between two vectors. |
| [operator +](../../aspose.cad.primitives/point3d/op_addition/) | Implements the operator +. |
| [operator ==](../../aspose.cad.primitives/point3d/op_equality/) | Allows to compare 3D points. |
| [operator !=](../../aspose.cad.primitives/point3d/op_inequality/) | Allows to compare 3D points. |
| [operator *](../../aspose.cad.primitives/point3d/op_multiply/) | Implements the operator *. |
| [operator -](../../aspose.cad.primitives/point3d/op_subtraction/) | Implements the operator -. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Zero](../../aspose.cad.primitives/point3d/zero/) |  |

### See Also

* class [Point2D](../point2d/)
* namespace [Aspose.CAD.Primitives](../../aspose.cad.primitives/)
* assembly [Aspose.CAD](../../)


