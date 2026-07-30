---
title: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode yöntemi"
linktitle: "GidToUnicode"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode yöntemi. Glyph kimliğini unicode'a çözer. Glyph kimliği, yazı tipine bağlı olarak benzersiz bir sayıdır. Örneğin: Type1''s kimliği bir glyph adıdır, (GlyphStringId) sınıfının bir örneğidir. TTF''s kimliği bir int dizinidir, C++'ta (GlyphUInt32Id) sınıfının bir örneğidir."
type: docs
weight: 400
url: /tr/cpp/aspose.font.ttf/ttfencoding/gidtounicode/
---
## TtfEncoding::GidToUnicode method


Glyph kimliğini unicode'a çözer. Glyph kimliği, yazı tipine bağlı olarak benzersiz bir sayıdır. Örneğin: [Type1](../../../aspose.font.type1/)'s kimliği bir glyph adıdır, ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int dizinidir, ([GlyphUInt32Id](../)) sınıfının bir örneğidir.

```cpp
uint32_t Aspose::Font::Ttf::TtfEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Çözülecek sembolün glyph tanımlayıcısı. |

### ReturnValue

Geçilen glyph kimliğine ilişkin Unicode değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
