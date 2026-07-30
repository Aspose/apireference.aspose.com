---
title: "Aspose::Font::IFontEncoding::DecodeToGid method"
linktitle: "DecodeToGid"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::IFontEncoding::DecodeToGid. Декодирует код символа и возвращает glyph id. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1''s является именем глифа, экземпляром класса (GlyphStringId). Идентификатор TTF''s — целочисленный индекс, экземпляр класса (GlyphUInt32Id). Примечание: код символа не обязательно является Unicode. Код символа — индекс символа в таблице кодировки шрифта \"table\" в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding::DecodeToGid method


Декодирует код символа и возвращает glyph id. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../../aspose.font.type1/)'s является именем глифа, экземпляром класса ([GlyphStringId](../)). Идентификатор TTF's — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). Примечание: код символа не обязательно является Unicode. Код символа — индекс символа в кодировке [Font](../../font/) "table".

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGid(uint32_t charCode)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charCode | uint32_t | Код символа, для которого требуется получить идентификатор глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным charCode.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
