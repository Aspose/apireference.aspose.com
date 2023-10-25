---
title: Dimension Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Drawing.Dimension class. Provides the base class for dimensions. The general term dimension refers to a number with a unit attached to it and are denoted by UnitType
type: docs
weight: 1320
url: /net/aspose.svg.drawing/dimension/
---
## Dimension class

Provides the base class for dimensions. The general term 'dimension' refers to a number with a unit attached to it, and are denoted by [`UnitType`](../unittype/).

```csharp
public abstract class Dimension : Numeric
```

## Properties

| Name | Description |
| --- | --- |
| [UnitType](../../aspose.svg.drawing/unit/unittype/) { get; } | Gets the unit type of the [`Unit`](../unit/). |

## Methods

| Name | Description |
| --- | --- |
| [CompareTo](../../aspose.svg.drawing/numeric/compareto/)(Numeric) | Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object. |
| override [Equals](../../aspose.svg.drawing/unit/equals/)(object) | Determines whether the specified Object, is equal to this instance. |
| override [Equals](../../aspose.svg.drawing/numeric/equals/)(Unit) | Determines whether the specified [`Unit`](../unit/), is equal to this instance. |
| override [GetHashCode](../../aspose.svg.drawing/numeric/gethashcode/)() | Returns a hash code for this instance. |
| [GetValue](../../aspose.svg.drawing/numeric/getvalue/)() | Gets the unit value. |
| [GetValue](../../aspose.svg.drawing/numeric/getvalue/)(UnitType) | Gets the value converted to the specified [`UnitType`](../unittype/). |
| override [ToString](../../aspose.svg.drawing/dimension/tostring/)() | Returns a String that represents this instance. |

### See Also

* class [Unit](../unit/)
* class [Numeric](../numeric/)
* namespace [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../)
