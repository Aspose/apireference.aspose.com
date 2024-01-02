---
title: Struct Size
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Size struct. Represents size
type: docs
weight: 36930
url: /net/aspose.cad/size/
---
## Size structure

Represents size.

```csharp
public struct Size
```

## Constructors

| Name | Description |
| --- | --- |
| [Size](size/#constructor)(Point) | Initializes a new instance of the `Size` structure from the specified [`Point`](../point/). |
| [Size](size/#constructor_1)(int, int) | Initializes a new instance of the `Size` structure from the specified dimensions. |

## Properties

| Name | Description |
| --- | --- |
| static [Empty](../../aspose.cad/size/empty/) { get; } | Gets a new instance of the `Size` structure that has [`Width`](./width/) and [`Height`](./height/) values set to zero. |
| [Height](../../aspose.cad/size/height/) { get; set; } | Gets or sets the vertical component of this `Size`. |
| [IsEmpty](../../aspose.cad/size/isempty/) { get; } | Gets a value indicating whether this `Size` has width and height of 0. |
| [Width](../../aspose.cad/size/width/) { get; set; } | Gets or sets the horizontal component of this `Size`. |

## Methods

| Name | Description |
| --- | --- |
| static [Add](../../aspose.cad/size/add/)(Size, Size) | Adds the width and height of one `Size` structure to the width and height of another `Size` structure. |
| static [Ceiling](../../aspose.cad/size/ceiling/)(SizeF) | Converts the specified [`SizeF`](../sizef/) structure to a `Size` structure by rounding the values of the `Size` structure to the next higher integer values. |
| static [Round](../../aspose.cad/size/round/)(SizeF) | Converts the specified [`SizeF`](../sizef/) structure to a `Size` structure by rounding the values of the [`SizeF`](../sizef/) structure to the nearest integer values. |
| static [Subtract](../../aspose.cad/size/subtract/)(Size, Size) | Subtracts the width and height of one `Size` structure from the width and height of another `Size` structure. |
| static [Truncate](../../aspose.cad/size/truncate/)(SizeF) | Converts the specified [`SizeF`](../sizef/) structure to a `Size` structure by truncating the values of the [`SizeF`](../sizef/) structure to the next lower integer values. |
| override [Equals](../../aspose.cad/size/equals/)(object) | Tests to see whether the specified object is a `Size` with the same dimensions as this `Size`. |
| override [GetHashCode](../../aspose.cad/size/gethashcode/)() | Returns a hash code for this `Size` structure. |
| override [ToString](../../aspose.cad/size/tostring/)() | Creates a human-readable string that represents this `Size`. |
| [operator +](../../aspose.cad/size/op_addition/) | Adds the width and height of one `Size` structure to the width and height of another `Size` structure. |
| [operator ==](../../aspose.cad/size/op_equality/) | Tests whether two `Size` structures are equal. |
| [explicit operator](../../aspose.cad/size/op_explicit/) | Converts the specified `Size` to a [`Point`](../point/). |
| [implicit operator](../../aspose.cad/size/op_implicit/) | Converts the specified `Size` to a [`SizeF`](../sizef/). |
| [operator !=](../../aspose.cad/size/op_inequality/) | Tests whether two `Size` structures are different. |
| [operator -](../../aspose.cad/size/op_subtraction/) | Subtracts the width and height of one `Size` structure from the width and height of another `Size` structure. |

### See Also

* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


