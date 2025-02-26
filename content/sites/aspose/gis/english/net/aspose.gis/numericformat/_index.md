---
title: Class NumericFormat
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.NumericFormat class. NumericFormat are used to format common numeric types in text
type: docs
weight: 3440
url: /net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` are used to format common numeric types in text.

```csharp
public abstract class NumericFormat
```

## Properties

| Name | Description |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | Converts and attempts to ensure that a numeric value that is converted to a string is parsed back into the same numeric value. |

## Methods

| Name | Description |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | Converts a number to a fixed-point text without a scientific notation. |
| static [General](../../aspose.gis/numericformat/general/)(int) | Converts a number to the more compact of either fixed-point or scientific notation, depending on the type of the number and whether a precision specifier is present. Recommended to use. |

## Remarks

There are three types of `NumericFormat`: General - fixed-point or scientific notation. Some number of digits are significant. RoundTrip - fixed-point or scientific notation. Max of digits are significant. Flat - fixed-point notation. Some number of digits are significant.  A `NumericFormat` can be set to [`IGeometry`](../../aspose.gis.geometries/igeometry/) via [`AsText`](../../aspose.gis.geometries/igeometry/astext/) in order to specify the numeric format when translating geometry to its Well-Known Text (WKT) representation.

### See Also

* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


