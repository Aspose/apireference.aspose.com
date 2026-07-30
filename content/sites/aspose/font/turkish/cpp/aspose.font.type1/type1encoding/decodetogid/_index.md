---
title: "Aspose::Font::Type1::Type1Encoding::DecodeToGid metodu"
linktitle: "DecodeToGid"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Type1::Type1Encoding::DecodeToGid metodu. Gid'yi unicode'a çözer. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: Type1''s kimliği bir glif adıdır, (GlyphStringId) sınıfının bir örneğidir. TTF''s kimliği bir int indeksidir, (GlyphUInt32Id) sınıfının bir örneğidir C++'da."
type: docs
weight: 100
url: /tr/cpp/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding::DecodeToGid method


Gid'yi unicode'a çözer. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../)'s kimliği bir glif adıdır, ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int indeksidir, ([GlyphUInt32Id](../)) sınıfının bir örneğidir.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::DecodeToGid(uint32_t charCode) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| charCode | uint32_t | Glyph tanımlayıcısını almak için karakter kodu. |

### ReturnValue

Geçilen karakter koduna ilişkin glyph tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
