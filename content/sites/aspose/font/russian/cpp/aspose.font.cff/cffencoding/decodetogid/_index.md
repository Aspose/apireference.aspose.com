---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGid метод"
linktitle: "DecodeToGid"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGid метод. Получает Gid для переданного charCode. Этот метод предназначен для CFF CIDFonts, где charCode должен быть действительным значением CID. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF Font может быть экземпляром класса (GlyphStringId) или класса (GlyphUInt32Id) в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding::DecodeToGid method


Получает Gid для переданного charCode. Этот метод предназначен для CFF CIDFonts, где charCode должен быть действительным значением CID. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа CFF [Font](../../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGid(uint32_t charCode) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charCode | uint32_t | Код символа (CID) для получения идентификатора глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным CID.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
