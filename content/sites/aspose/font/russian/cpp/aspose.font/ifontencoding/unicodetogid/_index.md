---
title: "Aspose::Font::IFontEncoding::UnicodeToGid method"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::IFontEncoding::UnicodeToGid. Декодирует Unicode и возвращает glyph id. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1''s является именем глифа, экземпляром класса (GlyphStringId). Идентификатор TTF''s — целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding::UnicodeToGid method


Декодирует Unicode и возвращает glyph id. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../../aspose.font.type1/)'s является именем глифа, экземпляром класса ([GlyphStringId](../)). Идентификатор TTF's — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)).

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::UnicodeToGid(uint32_t unicode)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| unicode | uint32_t | Unicode, для получения идентификатора глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным Unicode.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
