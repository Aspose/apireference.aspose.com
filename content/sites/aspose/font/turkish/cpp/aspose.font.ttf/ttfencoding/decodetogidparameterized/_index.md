---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized yöntemi"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized yöntemi. Parametreli sürüm, C++'ta belirli bir CMap tablosunu (unicode değil) kullanmaya izin verir."
type: docs
weight: 200
url: /tr/cpp/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding::DecodeToGidParameterized method


Parametreli sürüm, belirli bir CMap tablosu (unicode olmayan) kullanılmasına izin verir.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementation of [IEncodingParameters](../../../aspose.font/iencodingparameters/)interface. |
| charCode | uint32_t | Glyph tanımlayıcısını almak için karakter kodu. |

### ReturnValue

Geçilen karakter koduna ilişkin glyph tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
