---
title: Dimension Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Drawing.Dimension class. Provides the base class for dimensions. The general term dimension refers to a number with a unit attached to it and are denoted by UnitType
type: docs
weight: 2830
url: /net/aspose.html.drawing/dimension/
---
## Dimension class

Provides the base class for dimensions. The general term 'dimension' refers to a number with a unit attached to it, and are denoted by [`UnitType`](../unittype/).

```csharp
public abstract class Dimension : Numeric
```

## Properties

| Name | Description |
| --- | --- |
| [UnitType](../../aspose.html.drawing/unit/unittype/) { get; } | Gets the unit type of the [`Unit`](../unit/). |

## Methods

| Name | Description |
| --- | --- |
| [CompareTo](../../aspose.html.drawing/numeric/compareto/)(*[Numeric](../numeric/)*) | Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object. |
| override [Equals](../../aspose.html.drawing/unit/equals/)(*object*) | Determines whether the specified Object, is equal to this instance. |
| override [Equals](../../aspose.html.drawing/numeric/equals/)(*[Unit](../unit/)*) | Determines whether the specified [`Unit`](../unit/), is equal to this instance. |
| override [GetHashCode](../../aspose.html.drawing/numeric/gethashcode/)() | Returns a hash code for this instance. |
| [GetValue](../../aspose.html.drawing/numeric/getvalue/)() | Gets the unit value. |
| [GetValue](../../aspose.html.drawing/numeric/getvalue/)(*[UnitType](../unittype/)*) | Gets the value converted to the specified [`UnitType`](../unittype/). |
| override [ToString](../../aspose.html.drawing/dimension/tostring/)() | Returns a String that represents this instance. |

### See Also

* class [Unit](../unit/)
* class [Numeric](../numeric/)
* namespace [Aspose.Html.Drawing](../../aspose.html.drawing/)
* assembly [Aspose.HTML](../../)
