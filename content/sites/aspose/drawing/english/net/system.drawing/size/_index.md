---
title: Struct Size
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Size struct. Stores an ordered pair of integers typically the width and height of a rectangle
type: docs
weight: 1090
url: /net/system.drawing/size/
---
## Size structure

Stores an ordered pair of integers, typically the width and height of a rectangle.

```csharp
public struct Size : IEquatable<Size>
```

## Constructors

| Name | Description |
| --- | --- |
| [Size](size/#constructor_1)(Point) | Initializes a new instance of the `Size` struct from the specified Point. |
| [Size](size/#constructor)(int, int) | Initializes a new instance of the `Size` struct from the specified dimensions. |

## Properties

| Name | Description |
| --- | --- |
| [Height](../../system.drawing/size/height/) { get; set; } | Gets or sets the vertical component of this Size. |
| [IsEmpty](../../system.drawing/size/isempty/) { get; } | Gets a value indicating whether this Size has width and height of 0. |
| [Width](../../system.drawing/size/width/) { get; set; } | Gets or sets the horizontal component of this Size. |

## Methods

| Name | Description |
| --- | --- |
| static [Add](../../system.drawing/size/add/)(Size, Size) | Adds the width and height of one Size structure to the width and height of another Size structure. |
| static [Ceiling](../../system.drawing/size/ceiling/)(SizeF) | Converts the specified SizeF structure to a Size structure by rounding the values of the Size structure to the next higher integer values. |
| static [Round](../../system.drawing/size/round/)(SizeF) | Converts the specified SizeF structure to a Size structure by rounding the values of the SizeF structure to the nearest integer values. |
| static [Subtract](../../system.drawing/size/subtract/)(Size, Size) | Subtracts the width and height of one Size structure from the width and height of another Size structure. |
| static [Truncate](../../system.drawing/size/truncate/)(SizeF) | Converts the specified SizeF structure to a Size structure by truncating the values of the SizeF structure to the next lower integer values. |
| override [Equals](../../system.drawing/size/equals/#equals_1)(object) | Tests to see whether the specified object is a Size with the same dimensions as this Size. |
| [Equals](../../system.drawing/size/equals/#equals)(Size) | Tests whether other `Size` structure has the same size of this `Size` structure. |
| override [GetHashCode](../../system.drawing/size/gethashcode/)() | Returns a hash code for this Size structure. |
| override [ToString](../../system.drawing/size/tostring/)() | Converts the attributes of this `Size` to a human readable string. |
| [operator +](../../system.drawing/size/op_addition/) | Adds the width and height of one Size structure to the width and height of another Size structure. |
| [operator /](../../system.drawing/size/op_division/#op_division) | Divides `Size` by an Int32 producing `Size`. (2 operators) |
| [operator ==](../../system.drawing/size/op_equality/) | Tests whether two Size structures are equal. |
| [explicit operator](../../system.drawing/size/op_explicit/) | Converts the specified Size to a Point. |
| [implicit operator](../../system.drawing/size/op_implicit/) | Converts the specified Size to a SizeF. |
| [operator !=](../../system.drawing/size/op_inequality/) | Tests whether two Size structures are different. |
| [operator *](../../system.drawing/size/op_multiply/#op_multiply) | Multiplies a `Size` by an Int32 producing `Size`. (4 operators) |
| [operator -](../../system.drawing/size/op_subtraction/) | Subtracts the width and height of one Size structure from the width and height of another Size structure. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [Empty](../../system.drawing/size/empty/) | Gets a Size structure that has a Height and Width value of 0. |

### See Also

* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


