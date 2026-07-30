---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid yöntemi"
linktitle: "DecodeToGid"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid yöntemi. TTF Font''s DecodeToGlyphId uygulaması unicode tablosunu bulur ve unicode karakteri için glyph kimliğini döndürür. Glyph kimliği, yazı tipine bağlı olarak benzersiz bir sayıdır. Örneğin: Type1''s kimliği bir glyph adıdır, (GlyphStringId) sınıfının bir örneğidir. TTF''s kimliği bir int dizinidir, C++'ta (GlyphUInt32Id) sınıfının bir örneğidir."
type: docs
weight: 100
url: /tr/cpp/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding::DecodeToGid method


TTF [Font](../../../aspose.font/font/)'s DecodeToGlyphId uygulaması unicode tablosunu bulur ve unicode karakteri için glyph kimliğini döndürür. Glyph kimliği, yazı tipine bağlı olarak benzersiz bir sayıdır. Örneğin: [Type1](../../../aspose.font.type1/)'s kimliği bir glyph adıdır, ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int dizinidir, ([GlyphUInt32Id](../)) sınıfının bir örneğidir.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGid(uint32_t unicode) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| unicode | uint32_t | Glyph tanımlayıcısını almak için karakter kodu. |

### ReturnValue

Geçilen karakter koduna ilişkin glyph tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
