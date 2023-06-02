---
title: Struct CmykColor
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.CmykColor struct. The CMYK color of pixel
type: docs
weight: 320
url: /net/aspose.cad/cmykcolor/
---
## CmykColor structure

The CMYK color of pixel.

```csharp
public struct CmykColor
```

## Properties

| Name | Description |
| --- | --- |
| static [Empty](../../aspose.cad/cmykcolor/empty/) { get; } | Gets the empty. |
| [C](../../aspose.cad/cmykcolor/c/) { get; } | Gets the cyan component value of this [`Color`](../color/) structure. |
| [IsEmpty](../../aspose.cad/cmykcolor/isempty/) { get; } | Gets a value indicating whether this [`Color`](../color/) structure is uninitialized. |
| [K](../../aspose.cad/cmykcolor/k/) { get; } | Gets the black component value of this [`Color`](../color/) structure. |
| [M](../../aspose.cad/cmykcolor/m/) { get; } | Gets the magenta component value of this [`Color`](../color/) structure. |
| [Y](../../aspose.cad/cmykcolor/y/) { get; } | Gets the yellow component value of this [`Color`](../color/) structure. |

## Methods

| Name | Description |
| --- | --- |
| static [FromParams](../../aspose.cad/cmykcolor/fromparams/)(int, int, int, int) | Creates a `CmykColor` structure from a 32-bit cyan, magenta, yellow and black values. This method is deprecated. Please use more effective Int32). |
| static [ToCmyk](../../aspose.cad/cmykcolor/tocmyk/#tocmyk)(int) | The conversion from 32-bit ARGB to CMYKColor. This method is deprecated. Please use more effective Int32). |
| override [Equals](../../aspose.cad/cmykcolor/equals/)(object) | Determines whether the specified Object, is equal to this instance. |
| override [GetHashCode](../../aspose.cad/cmykcolor/gethashcode/)() | The get hash code. |
| [ToValue](../../aspose.cad/cmykcolor/tovalue/)() | The to value. |
| static [ToArgb32](../../aspose.cad/cmykcolor/toargb32/)(CmykColor[]) | The conversion from CMYKColor to 32-bit ARGB Color using icc conversion with default profiles. This method is deprecated. Please use more effective Int32[]). |
| static [ToCmyk](../../aspose.cad/cmykcolor/tocmyk/#tocmyk_1)(int[]) | The conversion from 32-bit ARGB color to CMYKColor. This method is deprecated. Please use more effective Int32[]). |
| static [ToColor](../../aspose.cad/cmykcolor/tocolor/#tocolor)(CmykColor) | The conversion from CMYKColor to Color. This method is deprecated. Please use more effective Int32). |
| static [ToColor](../../aspose.cad/cmykcolor/tocolor/#tocolor_1)(CmykColor[]) | The conversion from CMYKColor to Color using icc conversion with default profiles. This method is deprecated. Please use more effective Int32[]). |
| static [ToColorIcc](../../aspose.cad/cmykcolor/tocoloricc/#tocoloricc)(CmykColor) | The conversion from CMYKColor to Color using icc conversion with default profiles. This method is deprecated. Please use more effective Int32). |
| static [ToColorIcc](../../aspose.cad/cmykcolor/tocoloricc/#tocoloricc_2)(CmykColor[]) | The conversion from CMYKColor to Color using icc conversion with default profiles. This method is deprecated. Please use more effective Int32[]). |
| static [ToColorIcc](../../aspose.cad/cmykcolor/tocoloricc/#tocoloricc_1)(CmykColor, Stream, Stream) | The conversion from CMYKColor to Color using icc conversion. This method is deprecated. Please use more effective Stream). |
| static [ToColorIcc](../../aspose.cad/cmykcolor/tocoloricc/#tocoloricc_3)(CmykColor[], Stream, Stream) | The conversion from CMYKColor to Color using icc conversion. This method is deprecated. Please use more effective Stream). |

### See Also

* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


