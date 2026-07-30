---
title: "Aspose::Font::Type1::Type1Encoding::DecodeToGid метод"
linktitle: "DecodeToGid"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Type1::Type1Encoding::DecodeToGid метод. Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — имя глифа, экземпляр класса (GlyphStringId). Идентификатор TTF — целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding::DecodeToGid method


Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../) — имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::DecodeToGid(uint32_t charCode) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charCode | uint32_t | Код символа, для которого требуется получить идентификатор глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным кодом символа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
