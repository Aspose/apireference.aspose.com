---
title: "Aspose::Font::Cff::CffEncoding::UnicodeToGid метод"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Cff::CffEncoding::UnicodeToGid метод. Декодирует юникод и возвращает идентификатор глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF Font может быть экземпляром класса (GlyphStringId) или класса (GlyphUInt32Id) в C++."
type: docs
weight: 900
url: /ru/cpp/aspose.font.cff/cffencoding/unicodetogid/
---
## CffEncoding::UnicodeToGid method


Декодирует юникод и возвращает идентификатор глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF [Font](../../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::UnicodeToGid(uint32_t unicode) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| unicode | uint32_t | Unicode, для получения идентификатора глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным Unicode.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
