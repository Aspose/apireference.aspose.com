---
title: IFontEncoding.DecodeToGidParameterized
second_title: Aspose.Font for .NET API Reference
description: IFontEncoding method. Parameterized decode method. Some font types can have multiple encoding algorithms/maps. So IEncodingParameters interface is used to create concrete font encoding parameters
type: docs
weight: 20
url: /net/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding.DecodeToGidParameterized method

Parameterized decode method. Some font types can have multiple encoding algorithms/maps. So, [`IEncodingParameters`](../../iencodingparameters/) interface is used to create concrete font encoding parameters.

```csharp
public GlyphId DecodeToGidParameterized(IEncodingParameters parameters, uint charCode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| parameters | IEncodingParameters | Implementation of [`IEncodingParameters`](../../iencodingparameters/) interface. |
| charCode | UInt32 | Character code to get glyph identifier for. |

### Return Value

Glyph identifier related to char code passed.

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IEncodingParameters](../../iencodingparameters/)
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


