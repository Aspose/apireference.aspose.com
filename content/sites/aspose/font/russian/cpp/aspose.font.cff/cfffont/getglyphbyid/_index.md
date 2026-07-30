---
title: "Aspose::Font::Cff::CffFont::GetGlyphById метод"
linktitle: "GetGlyphById"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Cff::CffFont::GetGlyphById метод. Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF Font может быть экземпляром класса (GlyphStringId) или класса (GlyphUInt32Id) в C++."
type: docs
weight: 1800
url: /ru/cpp/aspose.font.cff/cfffont/getglyphbyid/
---
## CffFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF [Font](../../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
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
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(System::String) method


Возвращает глиф по имени глифа.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::String glyphName)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphName | System::String | Имя глифа. |

### ReturnValue

Глиф.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(uint32_t) method


Возвращает глиф по идентификатору глифа.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(uint32_t id)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| id | uint32_t | Идентификатор глифа. |

### ReturnValue

Глиф.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
