---
title: "класс Aspose::Font::Type1::Type1Encoding"
linktitle: "Type1Encoding"
second_title: "Aspose.Font для C++"
description: "класс Aspose::Font::Type1::Type1Encoding. Представляет кодировку Type1Font в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.type1/type1encoding/
---
## Type1Encoding class


Представляет кодировку [Type1](../)[Font](../../aspose.font/font/).

```cpp
class Type1Encoding : public Aspose::Font::IFontEncoding,
                      public Aspose::Font::ISupportsNameAddressing
```

## Методы

| Метод | Описание |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Декодирует Gid в unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../) — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Параметризованный метод декодирования. Не поддерживается для типа [Type1](../)[Font](../../aspose.font/font/). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Кодирует глиф. Для шрифтов TTF код символа — unicode. Не поддерживается для типов [Type1](../)[Font](../../aspose.font/font/). |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Возвращает отображение имени в код символа. Примечание: Код символа не является Unicode. Код символа — это индекс символа в кодировке [Font](../../aspose.font/font/) "таблица". |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../) — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Возвращает GlyphId для unicode. Или notdef, если шрифт не содержит глифа для данного unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Например: идентификатор [Type1](../) — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
## См. также

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
