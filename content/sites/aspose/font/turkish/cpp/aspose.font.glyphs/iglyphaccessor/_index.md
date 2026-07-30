---
title: "Aspose::Font::Glyphs::IGlyphAccessor sınıfı"
linktitle: "IGlyphAccessor"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor sınıfı. C++'da belirtilen glif tanımlayıcılarını ve glifleri almayı sağlayan işlevselliği tanımlar."
type: docs
weight: 1000
url: /tr/cpp/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor class


Belirtilen glif tanımlayıcılarını ve glifleri almak için işlevselliği tanımlar.

```cpp
class IGlyphAccessor : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | [Glyph](../glyph/) id türü belirtimi. |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Mevcut olan tüm glif kimliklerini döndürür, [Font](../../aspose.font/font/) içinde. [Glyph](../glyph/) kimliği, yazı tipi türüne bağlı olarak bir glif için benzersiz bir sayıdır. Örneğin: [Type1](../../aspose.font.type1/)'in kimliği bir glif adıdır ve ([GlyphStringId](../glyphstringid/)) sınıfının bir örneğidir. TTF'nin kimliği bir int indeksidir ve ([GlyphUInt32Id](../glyphuint32id/)) sınıfının bir örneğidir. |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<GlyphId\>) | Glifi glif kimliğine göre döndürür. [Glyph](../glyph/) kimliği, yazı tipi türüne bağlı olarak bir glif için benzersiz bir sayıdır. [GlyphId](../glyphid/) - türetilmiş nesne. Örneğin: [Type1](../../aspose.font.type1/)'in kimliği bir glif adıdır ve ([GlyphStringId](../glyphstringid/)) sınıfının bir örneğidir. TTF'nin kimliği bir int indeksidir ve ([GlyphUInt32Id](../glyphuint32id/)) sınıfının bir örneğidir. |
| virtual [GetGlyphsForText](./getglyphsfortext/)(System::String) | Metin için glif temsili al. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
