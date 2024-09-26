---
title: Aspose::Font::IFontEncoding::DecodeToGidParameterized method
linktitle: DecodeToGidParameterized
second_title: Aspose.Font for C++
description: 'Aspose::Font::IFontEncoding::DecodeToGidParameterized method. Parameterized decode method in C++.'
type: docs
weight: 500
url: /cpp/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding::DecodeToGidParameterized method


Parameterized decode method.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementation of [IEncodingParameters](../../iencodingparameters/) interface. |
| charCode | uint32_t | Character code to get glyph identifier for. |

### ReturnValue

Glyph identifier related to char code passed.
## Remarks


Some font types can have multiple encoding algorithms/maps. So, [IEncodingParameters](../../iencodingparameters/) interface is used to create concrete font encoding parameters.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../iencodingparameters/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
