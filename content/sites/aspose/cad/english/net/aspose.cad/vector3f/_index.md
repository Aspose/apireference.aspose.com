---
title: Struct Vector3F
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Vector3F struct. Vector with 3 float parameters
type: docs
weight: 37080
url: /net/aspose.cad/vector3f/
---
## Vector3F structure

Vector with 3 float parameters

```csharp
public struct Vector3F : IEquatable<Vector3F>
```

## Constructors

| Name | Description |
| --- | --- |
| [Vector3F](vector3f/#constructor_1)(float) | Initializes a new instance of the `Vector3F` struct. |
| [Vector3F](vector3f/#constructor)(Vector3F) | Initializes a new instance of the `Vector3F` struct. |
| [Vector3F](vector3f/#constructor_2)(float, float, float) | Initializes a new instance of the `Vector3F` struct. |

## Properties

| Name | Description |
| --- | --- |
| [B](../../aspose.cad/vector3f/b/) { get; set; } | Blue component |
| [G](../../aspose.cad/vector3f/g/) { get; set; } | Green component |
| [Item](../../aspose.cad/vector3f/item/) { get; } | Gets a coordinate at the specified index. |
| [Length](../../aspose.cad/vector3f/length/) { get; } | Length |
| [R](../../aspose.cad/vector3f/r/) { get; set; } | Red component |
| [SquareLength](../../aspose.cad/vector3f/squarelength/) { get; } | Square length |

## Methods

| Name | Description |
| --- | --- |
| static [CrossProduct](../../aspose.cad/vector3f/crossproduct/)(Vector3F, Vector3F) | Returns the cross product of two vectors. |
| static [NewellFaceNormal](../../aspose.cad/vector3f/newellfacenormal/)(List&lt;Vector3F&gt;, List&lt;int&gt;) | Calculates normal of face by newell's method. |
| static [Reflect](../../aspose.cad/vector3f/reflect/)(Vector3F, Vector3F) | Calculates a reflected vector. |
| static [XAxis](../../aspose.cad/vector3f/xaxis/)() | Creates x-axis. |
| static [YAxis](../../aspose.cad/vector3f/yaxis/)() | Creates y-axis. |
| static [ZAxis](../../aspose.cad/vector3f/zaxis/)() | Creates z-axis. |
| static [Zero](../../aspose.cad/vector3f/zero/)() | Creates vector with (0, 0, 0). |
| override [Equals](../../aspose.cad/vector3f/equals/#equals_1)(object) | Returns a boolean indicating whether the given Object is equal to this Vector3F instance. |
| [Equals](../../aspose.cad/vector3f/equals/#equals)(Vector3F) | Returns a boolean indicating whether the given Vector3F is equal to this Vector3F instance. |
| override [GetHashCode](../../aspose.cad/vector3f/gethashcode/)() | Returns the hash code for this instance. |
| [Normalized](../../aspose.cad/vector3f/normalized/)() | Creates normilized vector. |
| [SafeNormalized](../../aspose.cad/vector3f/safenormalized/)() | Creates normilized vector safely(returns self if length is zero). |
| [To2F](../../aspose.cad/vector3f/to2f/)() | Creates Vector2F. |
| [ToVector4F](../../aspose.cad/vector3f/tovector4f/)(float) | Creates Vector4F. |
| static [DotProduct](../../aspose.cad/vector3f/dotproduct/)(Vector3F, Vector3F) | Returns the dot product of two vectors. |
| [operator +](../../aspose.cad/vector3f/op_addition/) | Adds two vectors together. |
| [operator ==](../../aspose.cad/vector3f/op_equality/) | Returns a boolean indicating whether the two given vectors are equal. |
| [operator !=](../../aspose.cad/vector3f/op_inequality/) | Returns a boolean indicating whether the two given vectors are not equal. |
| [operator *](../../aspose.cad/vector3f/op_multiply/#op_multiply_2) | Multiplies vector by scalar value. (3 operators) |
| [operator -](../../aspose.cad/vector3f/op_subtraction/) | Negates a given vector. (2 operators) |

## Fields

| Name | Description |
| --- | --- |
| [X](../../aspose.cad/vector3f/x/) | X coordinate |
| [Y](../../aspose.cad/vector3f/y/) | Y coordinate |
| [Z](../../aspose.cad/vector3f/z/) | Z coordinate |

### See Also

* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


