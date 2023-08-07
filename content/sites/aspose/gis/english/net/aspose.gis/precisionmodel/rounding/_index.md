---
title: PrecisionModel.Rounding
second_title: Aspose.GIS for .NET API Reference
description: PrecisionModel method. Returns a rounding precision model. According to rounding precision model only a limited number of digits are significant
type: docs
weight: 20
url: /net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

Returns a rounding precision model. According to rounding precision model only a limited number of digits are significant.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| Parameter | Type | Description |
| --- | --- | --- |
| significantDigits | Int32 | Number of significant digits. |

### Return Value

Rounding Precision model.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Number of significant digits is less then 0 or more than 15. |

## Remarks

When applied to a coordinate, the following code is used to reduce precision:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### See Also

* class [PrecisionModel](../)
* namespace [Aspose.Gis](../../precisionmodel/)
* assembly [Aspose.GIS](../../../)


