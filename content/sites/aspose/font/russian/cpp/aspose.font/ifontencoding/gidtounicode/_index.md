---
title: "Aspose::Font::IFontEncoding::GidToUnicode method"
linktitle: "GidToUnicode"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::IFontEncoding::GidToUnicode. Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1''s является именем глифа, экземпляром класса (GlyphStringId). Идентификатор TTF''s — целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 400
url: /ru/cpp/aspose.font/ifontencoding/gidtounicode/
---
## IFontEncoding::GidToUnicode method


Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../../aspose.font.type1/)'s является именем глифа, экземпляром класса ([GlyphStringId](../)). Идентификатор TTF's — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)).

```cpp
virtual uint32_t Aspose::Font::IFontEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Идентификатор глифа символа для декодирования. |

### ReturnValue

Значение Unicode, связанное с переданным идентификатором глифа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
