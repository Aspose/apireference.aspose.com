---
title: "Aspose::Font::IFontEncoding class"
linktitle: "IFontEncoding"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::IFontEncoding class. Определяет интерфейс для кодирования шрифтов в C++."
type: docs
weight: 1400
url: /ru/cpp/aspose.font/ifontencoding/
---
## IFontEncoding class


Определяет интерфейс для кодирования [Font](../font/).

```cpp
class IFontEncoding : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [DecodeToGid](./decodetogid/)(uint32_t) | Декодирует код символа и возвращает идентификатор глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../aspose.font.type1/) — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — это целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). Примечание: код символа не обязательно является юникодом. Код символа — это индекс символа в таблице кодировки [Font](../font/) "table". |
| virtual [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) | Параметризованный метод декодирования. |
| virtual [Encode](./encode/)(uint32_t, uint32_t) | Кодирует глиф. Для шрифтов TTF код символа является юникодом. |
| virtual [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) | Декодирует Gid в юникод. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../aspose.font.type1/) — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — это целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
| virtual [UnicodeToGid](./unicodetogid/)(uint32_t) | Декодирует юникод и возвращает идентификатор глифа. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../../aspose.font.type1/) — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — это целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
