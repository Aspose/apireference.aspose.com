---
title: "Aspose::Font::Glyphs::GlyphId sınıfı"
linktitle: "GlyphId"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Glyphs::GlyphId sınıfı. Font içinde mevcut olan glif kimliklerini temsil eder. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. Örneğin: Type1'in kimliği bir glif adıdır, (GlyphStringId) sınıfının bir örneği. TTF'nin kimliği bir int indeksidir, C++'da (GlyphUInt32Id) sınıfının bir örneği."
type: docs
weight: 500
url: /tr/cpp/aspose.font.glyphs/glyphid/
---
## GlyphId class


Glif kimliklerini temsil eder, [Font](../../aspose.font/font/) içinde mevcuttur. [Glyph](../glyph/) kimliği bir glif için benzersiz bir sayıdır ve font tipine bağlıdır. Örneğin: [Type1](../../aspose.font.type1/)'in kimliği bir glif adıdır, ([GlyphStringId](../glyphstringid/)) sınıfının bir örneği. TTF'nin kimliği bir int indeksidir, ([GlyphUInt32Id](../glyphuint32id/)) sınıfının bir örneği.

```cpp
class GlyphId : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<GlyphId\>) |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | İki glif kimliği eşit değilse true döndürür. |
| virtual [GetHashCode](./gethashcode/)() const | Nesnenin hash kodunu döndürür. |
| virtual [ToGlyphStringId](./toglyphstringid/)() | Sanal olarak [GlyphUInt32Id](../glyphuint32id/) öğesine dönüştürür. [GlyphUInt32Id](../glyphuint32id/) örnek döndürmek için geçersiz kılar. |
| virtual [ToGlyphUInt32Id](./toglyphuint32id/)() | Sanal olarak [GlyphUInt32Id](../glyphuint32id/) öğesine dönüştürür. [GlyphUInt32Id](../glyphuint32id/) örnek döndürmek için geçersiz kılar. |
| virtual [ToString](./tostring/)() const | Glif kimliğinin string temsilini döndürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
