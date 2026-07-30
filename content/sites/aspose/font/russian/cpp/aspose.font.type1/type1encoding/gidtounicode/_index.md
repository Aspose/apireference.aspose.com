---
title: "Aspose::Font::Type1::Type1Encoding::GidToUnicode метод"
linktitle: "GidToUnicode"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Type1::Type1Encoding::GidToUnicode метод. Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — имя глифа, экземпляр класса (GlyphStringId). Идентификатор TTF — целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding::GidToUnicode method


Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../) — имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Type1::Type1Encoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Идентификатор глифа символа для декодирования. |

### ReturnValue

Значение Unicode, связанное с переданным идентификатором глифа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
