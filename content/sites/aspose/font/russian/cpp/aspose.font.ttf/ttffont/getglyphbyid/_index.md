---
title: "Aspose::Font::Ttf::TtfFont::GetGlyphById метод"
linktitle: "GetGlyphById"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Ttf::TtfFont::GetGlyphById метод. Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF Font может быть экземпляром класса (GlyphStringId) или класса (GlyphUInt32Id). Адресация глифов по имени (string) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае шрифта CFF внутри, структуры CFF используются для адресации глифов по имени в C++."
type: docs
weight: 1800
url: /ru/cpp/aspose.font.ttf/ttffont/getglyphbyid/
---
## TtfFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF [Font](../../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). Адресация глифов по имени (string) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае шрифта CFF [Font](../../../aspose.font/font/) внутри, структуры CFF используются для адресации глифов по имени.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Идентификатор глифа. |

### ReturnValue

Глиф.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(System::String) method


Возвращает глиф по имени глифа. Адресация глифов по имени (string) поддерживается для шрифтов TTF через сопоставление таблицы Post. В случае шрифта CFF [Font](../../../aspose.font/font/) внутри, структуры CFF используются для адресации глифов по имени.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::String glyphName)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphName | System::String | Идентификатор строкового глифа. |

### ReturnValue

Глиф.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(uint32_t) method


Возвращает глиф по идентификатору глифа.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(uint32_t id)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| id | uint32_t | Индекс глифа. |

### ReturnValue

Глиф.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
