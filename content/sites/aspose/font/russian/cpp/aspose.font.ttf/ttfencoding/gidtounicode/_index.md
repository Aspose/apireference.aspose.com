---
title: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode метод"
linktitle: "GidToUnicode"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Ttf::TtfEncoding::GidToUnicode. Декодирует идентификатор глифа в юникод. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — это имя глифа, экземпляр класса (GlyphStringId). Идентификатор TTF — это целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.font.ttf/ttfencoding/gidtounicode/
---
## TtfEncoding::GidToUnicode method


Декодирует идентификатор глифа в юникод. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: [Type1](../../../aspose.font.type1/) — идентификатор — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — это целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Ttf::TtfEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Идентификатор глифа символа для декодирования. |

### ReturnValue

Значение Unicode, связанное с переданным идентификатором глифа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
