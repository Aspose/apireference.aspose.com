---
title: Class PrecisionModel
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.PrecisionModel class. PrecisionModel specifies a number of significant digits in a coordinate
type: docs
weight: 3700
url: /net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` specifies a number of significant digits in a coordinate.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Properties

| Name | Description |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Returns an exact precision model. According to exact precision model all digits in a double value are significant. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Gets a value indicating whether this precision model is exact. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Gets a value indicating whether this precision model is rounding. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Gets a number of significant digits in a precision model if it is rounding. |

## Methods

| Name | Description |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Returns a rounding precision model. According to rounding precision model only a limited number of digits are significant. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Indicates whether the current object is equal to another object of the same type. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Indicates whether the current object is equal to another object of the same type. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Serves as the default hash function. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | Implements the operator ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | Implements the operator !=. |

## Remarks

There are two types of PrecisionModel: Exact `PrecisionModel` (all digits are significant);Rounded `PrecisionModel` (some number of digits are significant). A `PrecisionModel` can be set to [`VectorLayer`](../vectorlayer/) via [`DriverOptions`](../driveroptions/) in order to round coordinates when writing or reading geometries.

### See Also

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


