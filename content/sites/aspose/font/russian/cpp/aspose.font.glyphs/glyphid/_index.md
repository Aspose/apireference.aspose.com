---
title: "Класс Aspose::Font::Glyphs::GlyphId"
linktitle: "GlyphId"
second_title: "Aspose.Font для C++"
description: "Класс Aspose::Font::Glyphs::GlyphId. Представляет идентификаторы глифов, доступные в шрифте. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор Type1 — это имя глифа, экземпляр класса (GlyphStringId). Идентификатор TTF — это целочисленный индекс, экземпляр класса (GlyphUInt32Id) в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.font.glyphs/glyphid/
---
## GlyphId class


Представляет идентификаторы глифов, доступные в [Font](../../aspose.font/font/). Идентификатор [Glyph](../glyph/) — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../aspose.font.type1/) — это имя глифа, экземпляр класса ([GlyphStringId](../glyphstringid/)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../glyphuint32id/)).

```cpp
class GlyphId : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<GlyphId\>) |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Возвращает true, если два идентификатора глифов не равны. |
| virtual [GetHashCode](./gethashcode/)() const | Возвращает хеш-код объекта. |
| virtual [ToGlyphStringId](./toglyphstringid/)() | Виртуальное приведение к [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) переопределяется, чтобы возвращать экземпляр. |
| virtual [ToGlyphUInt32Id](./toglyphuint32id/)() | Виртуальное приведение к [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) переопределяется, чтобы возвращать экземпляр. |
| virtual [ToString](./tostring/)() const | Возвращает строковое представление идентификатора глифа. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
