---
title: "Aspose::Font::IFontEncoding::UnicodeToGid yöntemi"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::IFontEncoding::UnicodeToGid yöntemi. Bir unicode'ı çözer ve glif kimliğini döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: Type1'in kimliği bir glif adıdır, (GlyphStringId) sınıfının bir örneğidir. TTF'in kimliği bir int indeksidir, (GlyphUInt32Id) sınıfının bir örneğidir C++'ta."
type: docs
weight: 500
url: /tr/cpp/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding::UnicodeToGid method


Bir unicode'ı çözer ve glif kimliğini döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../../aspose.font.type1/)'in kimliği bir glif adıdır, ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'in kimliği bir int indeksidir, ([GlyphUInt32Id](../)) sınıfının bir örneğidir.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::UnicodeToGid(uint32_t unicode)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| unicode | uint32_t | Glyph tanımlayıcısını almak için unicode. |

### ReturnValue

Geçilen unicode'a ilişkin glyph tanımlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
