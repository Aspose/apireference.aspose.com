---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized yöntemi"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized yöntemi. Parametreli çözümleme yöntemi. C++'da CFF Font türü için desteklenmez."
type: docs
weight: 200
url: /tr/cpp/aspose.font.cff/cffencoding/decodetogidparameterized/
---
## CffEncoding::DecodeToGidParameterized method


Parametreli çözümleme yöntemi. CFF [Font](../../../aspose.font/font/) türü için desteklenmez.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementation of [IEncodingParameters](../../../aspose.font/iencodingparameters/)interface. |
| charCode | uint32_t | Glyph tanımlayıcısını almak için karakter kodu. |

### ReturnValue

Geçilen charCode ile ilişkili glif tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
