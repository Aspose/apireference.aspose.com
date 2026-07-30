---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid method"
linktitle: "DecodeToGid"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Ttf::TtfEncoding::DecodeToGid. Реализация DecodeToGlyphId в шрифте TTF ищет таблицу Unicode и возвращает идентификатор глифа для символа Unicode. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — это имя глифа, экземпляр класса (GlyphStringId). Идентификатор TTF — это целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding::DecodeToGid method


Реализация DecodeToGlyphId в TTF [Font](../../../aspose.font/font/) ищет таблицу Unicode и возвращает идентификатор глифа для символа Unicode. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: [Type1](../../../aspose.font.type1/) — идентификатор — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — это целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGid(uint32_t unicode) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| unicode | uint32_t | Код символа, для которого требуется получить идентификатор глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным кодом символа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
