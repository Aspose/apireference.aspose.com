---
title: "Aspose::Font::Type1::Type1Encoding::GidToUnicode metodu"
linktitle: "GidToUnicode"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Type1::Type1Encoding::GidToUnicode metodu. Gid'yi Unicode'a çözer. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: Type1''s kimliği bir glif adıdır, (GlyphStringId) sınıfının bir örneğidir. TTF''s kimliği bir int indeksidir, (GlyphUInt32Id) sınıfının bir örneğidir C++'da."
type: docs
weight: 500
url: /tr/cpp/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding::GidToUnicode method


Gid'yi Unicode'a çözer. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../)'s kimliği bir glif adıdır, ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int indeksidir, ([GlyphUInt32Id](../)) sınıfının bir örneğidir.

```cpp
uint32_t Aspose::Font::Type1::Type1Encoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Çözülecek sembolün glyph tanımlayıcısı. |

### ReturnValue

Geçilen glyph kimliğine ilişkin Unicode değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
