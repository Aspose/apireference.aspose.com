---
title: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById метод"
linktitle: "GetGlyphById"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById метод. Возвращает глиф по идентификатору глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. GlyphId — производный объект. Например: идентификатор Type1 — имя глифа, экземпляр класса (GlyphStringId). Идентификатор TTF — целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.font.glyphs/iglyphaccessor/getglyphbyid/
---
## IGlyphAccessor::GetGlyphById method


Возвращает глиф по идентификатору глифа. Идентификатор [Glyph](../../glyph/) — уникальный номер глифа, зависящий от типа шрифта. [GlyphId](../../glyphid/) — производный объект. Например: идентификатор [Type1](../../../aspose.font.type1/) — имя глифа, экземпляр класса ([GlyphStringId](../../glyphstringid/)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../../glyphuint32id/)).

```cpp
virtual System::SharedPtr<Glyph> Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById(System::SharedPtr<GlyphId> id)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| id | System::SharedPtr\<GlyphId\> | идентификатор глифа. |

### ReturnValue

[Glyph](../../glyph/)

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../glyph/)
* Class [GlyphId](../../glyphid/)
* Class [IGlyphAccessor](../)
* Namespace [Aspose::Font::Glyphs](../../)
* Library [Aspose.Font for C++](../../../)
