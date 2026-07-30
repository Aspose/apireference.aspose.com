---
title: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid metodu"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid metodu. Unicode için GlyphId döndürür. Veya font unicode için glif içermiyorsa notdef döner. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: Type1''s kimliği bir glif adıdır, (GlyphStringId) sınıfının bir örneğidir. TTF''s kimliği bir int indeksidir, (GlyphUInt32Id) sınıfının bir örneğidir C++'da."
type: docs
weight: 600
url: /tr/cpp/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding::UnicodeToGid method


Unicode için GlyphId döndürür. Veya font unicode için glif içermiyorsa notdef döner. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../)'s kimliği bir glif adıdır, ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int indeksidir, ([GlyphUInt32Id](../)) sınıfının bir örneğidir.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::UnicodeToGid(uint32_t unicode) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| unicode | uint32_t | Glyph tanımlayıcısını almak için unicode. |

### ReturnValue

Geçilen unicode'a ilişkin glyph tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
