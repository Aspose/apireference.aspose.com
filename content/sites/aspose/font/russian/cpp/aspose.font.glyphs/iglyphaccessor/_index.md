---
title: "Класс Aspose::Font::Glyphs::IGlyphAccessor"
linktitle: "IGlyphAccessor"
second_title: "Aspose.Font для C++"
description: "Класс Aspose::Font::Glyphs::IGlyphAccessor. Определяет функциональность для получения указанных идентификаторов глифов и глифов в C++."
type: docs
weight: 1000
url: /ru/cpp/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor class


Определяет функциональность для получения указанных идентификаторов глифов и глифов.

```cpp
class IGlyphAccessor : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | [Glyph](../glyph/) спецификация типа идентификатора. |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Возвращает все идентификаторы глифов, доступные в [Font](../../aspose.font/font/). Идентификатор [Glyph](../glyph/) — уникальный номер глифа, зависящий от типа шрифта. Например, идентификатор [Type1](../../aspose.font.type1/) — это имя глифа, экземпляр класса ([GlyphStringId](../glyphstringid/)). Идентификатор TTF — это целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../glyphuint32id/)). |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<GlyphId\>) | Возвращает глиф по идентификатору глифа. Идентификатор [Glyph](../glyph/) — уникальный номер глифа, зависящий от типа шрифта. [GlyphId](../glyphid/) — производный объект. Например, идентификатор [Type1](../../aspose.font.type1/) — это имя глифа, экземпляр класса ([GlyphStringId](../glyphstringid/)). Идентификатор TTF — это целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../glyphuint32id/)). |
| virtual [GetGlyphsForText](./getglyphsfortext/)(System::String) | Получить представление глифов для текста. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
