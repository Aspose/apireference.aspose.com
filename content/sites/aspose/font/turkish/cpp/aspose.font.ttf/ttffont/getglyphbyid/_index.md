---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphById yöntemi"
linktitle: "GetGlyphById"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphById yöntemi. Glifi glyph kimliğiyle döndürür. Glyph kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. TTF Font glyph kimliği, (GlyphStringId) sınıfının ya da (GlyphUInt32Id) sınıfının bir örneği olabilir. Ad (string) glyph adresleme, TTF Fontlar için Post tablosu eşlemesi aracılığıyla desteklenir. CFF Font içinde ise, CFF yapıları glifleri isimle adreslemek için kullanılır C++'ta."
type: docs
weight: 1800
url: /tr/cpp/aspose.font.ttf/ttffont/getglyphbyid/
---
## TtfFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Glyph'i glyph kimliğiyle döndürür. Glyph kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. TTF [Font](../../../aspose.font/font/) glyph kimliği, ([GlyphStringId](../)) sınıfının ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. Ad (string) glyph adresleme, TTF Fontlar için Post tablosu eşlemesi aracılığıyla desteklenir. CFF [Font](../../../aspose.font/font/) içinde ise, CFF yapıları glifleri isimle adreslemek için kullanılır.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | System::SharedPtr\<Glyphs::GlyphId\> | Glif kimliği. |

### ReturnValue

Glif.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(System::String) method


Glifi glyph adıyla döndürür. Ad (string) glyph adresleme, TTF fontları için Post tablosu eşlemesi aracılığıyla desteklenir. CFF [Font](../../../aspose.font/font/) içinde ise, CFF yapıları glifleri isimle adreslemek için kullanılır.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::String glyphName)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| glyphName | System::String | Glyph dize tanımlayıcısı. |

### ReturnValue

Glif.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(uint32_t) method


Glif kimliğiyle glifi döndürür.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(uint32_t id)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kimlik | uint32_t | Glif indeksi. |

### ReturnValue

Glif.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
