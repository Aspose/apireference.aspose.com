---
title: "Aspose::Font::Cff::CffEncoding::GidToUnicode метод"
linktitle: "GidToUnicode"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Cff::CffEncoding::GidToUnicode метод. Декодирует Gid в Unicode. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF Font может быть экземпляром класса (GlyphStringId) или класса (GlyphUInt32Id) в C++."
type: docs
weight: 800
url: /ru/cpp/aspose.font.cff/cffencoding/gidtounicode/
---
## CffEncoding::GidToUnicode method


Декодирует Gid в Unicode. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF [Font](../../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Cff::CffEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Идентификатор глифа символа для декодирования. |

### ReturnValue

Значение Unicode, связанное с переданным идентификатором глифа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
