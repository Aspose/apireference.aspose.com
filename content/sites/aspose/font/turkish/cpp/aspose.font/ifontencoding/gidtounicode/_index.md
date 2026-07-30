---
title: "Aspose::Font::IFontEncoding::GidToUnicode yöntemi"
linktitle: "GidToUnicode"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::IFontEncoding::GidToUnicode yöntemi. Gid'yi unicode'a çözer. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: Type1'in kimliği bir glif adıdır, (GlyphStringId) sınıfının bir örneğidir. TTF'in kimliği bir int indeksidir, (GlyphUInt32Id) sınıfının bir örneğidir C++'ta."
type: docs
weight: 400
url: /tr/cpp/aspose.font/ifontencoding/gidtounicode/
---
## IFontEncoding::GidToUnicode method


Gid'yi unicode'a çözer. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../../aspose.font.type1/)'in kimliği bir glif adıdır, ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'in kimliği bir int indeksidir, ([GlyphUInt32Id](../)) sınıfının bir örneğidir.

```cpp
virtual uint32_t Aspose::Font::IFontEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Çözülecek sembolün glyph tanımlayıcısı. |

### ReturnValue

Geçilen glyph kimliğine ilişkin Unicode değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
