---
title: Struct Size
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Size struct. Stores an ordered pair of integers typically the width and height of a rectangle
type: docs
weight: 1040
url: /net/aspose.drawing/size/
---
## Size structure

Stores an ordered pair of integers, typically the width and height of a rectangle.

```csharp
public struct Size : IEquatable<Size>
```

## Constructors

| Name | Description |
| --- | --- |
| [Size](size/#constructor)(Point) | Initializes a new instance of the `Size` struct from the specified Point. |
| [Size](size/#constructor_1)(int, int) | Initializes a new instance of the `Size` struct from the specified dimensions. |

## Properties

| Name | Description |
| --- | --- |
| [Height](../../aspose.drawing/size/height/) { get; set; } | Gets or sets the vertical component of this Size. |
| [IsEmpty](../../aspose.drawing/size/isempty/) { get; } | Gets a value indicating whether this Size has width and height of 0. |
| [Width](../../aspose.drawing/size/width/) { get; set; } | Gets or sets the horizontal component of this Size. |

## Methods

| Name | Description |
| --- | --- |
| static [Add](../../aspose.drawing/size/add/)(Size, Size) | Adds the width and height of one Size structure to the width and height of another Size structure. |
| static [Ceiling](../../aspose.drawing/size/ceiling/)(SizeF) | Converts the specified SizeF structure to a Size structure by rounding the values of the Size structure to the next higher integer values. |
| static [Round](../../aspose.drawing/size/round/)(SizeF) | Converts the specified SizeF structure to a Size structure by rounding the values of the SizeF structure to the nearest integer values. |
| static [Subtract](../../aspose.drawing/size/subtract/)(Size, Size) | Subtracts the width and height of one Size structure from the width and height of another Size structure. |
| static [Truncate](../../aspose.drawing/size/truncate/)(SizeF) | Converts the specified SizeF structure to a Size structure by truncating the values of the SizeF structure to the next lower integer values. |
| override [Equals](../../aspose.drawing/size/equals/#equals_1)(object) | Tests to see whether the specified object is a Size with the same dimensions as this Size. |
| [Equals](../../aspose.drawing/size/equals/#equals)(Size) | Tests whether other `Size` structure has the same size of this `Size` structure. |
| override [GetHashCode](../../aspose.drawing/size/gethashcode/)() | Returns a hash code for this Size structure. |
| override [ToString](../../aspose.drawing/size/tostring/)() | Converts the attributes of this `Size` to a human readable string. |
| [operator +](../../aspose.drawing/size/op_addition/) | Adds the width and height of one Size structure to the width and height of another Size structure. |
| [operator /](../../aspose.drawing/size/op_division/#op_division) | Divides `Size` by an Int32 producing `Size`. (2 operators) |
| [operator ==](../../aspose.drawing/size/op_equality/) | Tests whether two Size structures are equal. |
| [explicit operator](../../aspose.drawing/size/op_explicit/) | Converts the specified Size to a Point. |
| [implicit operator](../../aspose.drawing/size/op_implicit/) | Converts the specified Size to a SizeF. |
| [operator !=](../../aspose.drawing/size/op_inequality/) | Tests whether two Size structures are different. |
| [operator *](../../aspose.drawing/size/op_multiply/#op_multiply_1) | Multiplies a `Size` by an Int32 producing `Size`. (4 operators) |
| [operator -](../../aspose.drawing/size/op_subtraction/) | Subtracts the width and height of one Size structure from the width and height of another Size structure. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../aspose.drawing/size/empty/) | Gets a Size structure that has a Height and Width value of 0. |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


