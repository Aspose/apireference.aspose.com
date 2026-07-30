---
title: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds метод"
linktitle: "GetAllGlyphIds"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Ttf::TtfFont::GetAllGlyphIds метод. Возвращает массив всех идентификаторов глифов, доступных в шрифте. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF‑шрифта может быть экземпляром класса (GlyphStringId) или класса (GlyphUInt32Id). Адресация глифов по имени (строка) поддерживается для TTF‑шрифтов через сопоставление таблицы Post. В случае наличия внутри CFF‑шрифта используются структуры CFF для адресации глифов по имени в C++."
type: docs
weight: 1700
url: /ru/cpp/aspose.font.ttf/ttffont/getallglyphids/
---
## TtfFont::GetAllGlyphIds method


Возвращает массив всех идентификаторов глифов, доступных в [Font](../../../aspose.font/font/). Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Идентификатор глифа TTF [Font](../../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). Адресация глифов по имени (строка) поддерживается для TTF‑шрифтов через сопоставление таблицы Post. В случае наличия внутри CFF [Font](../../../aspose.font/font/) используются структуры CFF для адресации глифов по имени.

```cpp
System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::Ttf::TtfFont::GetAllGlyphIds() override
```


### ReturnValue

Идентификаторы глифов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
