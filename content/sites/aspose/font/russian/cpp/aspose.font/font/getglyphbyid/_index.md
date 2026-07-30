---
title: "Aspose::Font::Font::GetGlyphById метод"
linktitle: "GetGlyphById"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Font::GetGlyphById метод. Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. GlyphId — производный объект. Например: Type1''s id — имя глифа, экземпляр класса (GlyphStringId). TTF''s id — целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 1700
url: /ru/cpp/aspose.font/font/getglyphbyid/
---
## Font::GetGlyphById method


Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. GlyphId — производный объект. Например: [Type1](../../../aspose.font.type1/) имеет идентификатор‑имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Font::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override=0
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
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
