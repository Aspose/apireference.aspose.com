---
title: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid метод"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid метод. Возвращает GlyphId для Unicode. Или notdef, если шрифт не содержит глиф для данного Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — имя глифа, экземпляр класса (GlyphStringId). Идентификатор TTF — целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 600
url: /ru/cpp/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding::UnicodeToGid method


Возвращает GlyphId для Unicode. Или notdef, если шрифт не содержит глиф для данного Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../) — имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::UnicodeToGid(uint32_t unicode) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| unicode | uint32_t | Unicode, для получения идентификатора глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным Unicode.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
