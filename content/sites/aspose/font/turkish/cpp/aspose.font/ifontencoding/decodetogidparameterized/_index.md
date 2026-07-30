---
title: "Aspose::Font::IFontEncoding::DecodeToGidParameterized yöntemi"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::IFontEncoding::DecodeToGidParameterized yöntemi. C++'ta parametreli çözümleme yöntemi."
type: docs
weight: 200
url: /tr/cpp/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding::DecodeToGidParameterized method


Parametreli çözümleme yöntemi.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | [IEncodingParameters](../../iencodingparameters/) arayüzünün uygulanması. |
| charCode | uint32_t | Glyph tanımlayıcısını almak için karakter kodu. |

### ReturnValue

Geçilen karakter koduna ilişkin glif tanımlayıcısı.
## Açıklamalar


Bazı yazı tipi türleri birden fazla kodlama algoritması/hariç harita içerebilir. Bu yüzden, [IEncodingParameters](../../iencodingparameters/) arayüzü somut yazı tipi kodlama parametreleri oluşturmak için kullanılır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../iencodingparameters/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
