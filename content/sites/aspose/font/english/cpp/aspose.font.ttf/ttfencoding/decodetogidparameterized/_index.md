---
title: Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized method
linktitle: DecodeToGidParameterized
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized method. Parametrized version allows to use specific CMap table (not unicode) in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding::DecodeToGidParameterized method


Parametrized version allows to use specific CMap table (not unicode).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementation of [IEncodingParameters](../../../aspose.font/iencodingparameters/)interface. |
| charCode | uint32_t | Character code to get glyph identifier for. |

### ReturnValue

Glyph identifier related to character code passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
