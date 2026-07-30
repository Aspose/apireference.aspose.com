---
title: "Aspose::Font::IFontEncoding::DecodeToGid yöntemi"
linktitle: "DecodeToGid"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::IFontEncoding::DecodeToGid yöntemi. Bir karakter kodunu çözer ve glif kimliğini döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: Type1'in kimliği bir glif adıdır, (GlyphStringId) sınıfının bir örneğidir. TTF'in kimliği bir int indeksidir, (GlyphUInt32Id) sınıfının bir örneğidir. Not: karakter kodu mutlaka unicode olmak zorunda değildir. Karakter kodu, C++'ta Font kodlama \"tablosu\" içinde bir karakter indeksidir."
type: docs
weight: 100
url: /tr/cpp/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding::DecodeToGid method


Bir karakter kodunu çözer ve glif kimliğini döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../../aspose.font.type1/)'in kimliği bir glif adıdır, ([GlyphStringId](../)) sınıfının bir örneği. TTF'nin kimliği bir int dizinidir, ([GlyphUInt32Id](../)) sınıfının bir örneği. Not: karakter kodu mutlaka unicode olmak zorunda değildir. Karakter kodu, [Font](../../font/) kodlaması "tablosu"ndaki bir karakter indeksidir.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGid(uint32_t charCode)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| charCode | uint32_t | Glyph tanımlayıcısını almak için karakter kodu. |

### ReturnValue

Geçilen charCode ile ilişkili glif tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
