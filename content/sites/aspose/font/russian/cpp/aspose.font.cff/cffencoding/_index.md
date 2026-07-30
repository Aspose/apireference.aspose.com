---
title: "Aspose::Font::Cff::CffEncoding класс"
linktitle: "CffEncoding"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Cff::CffEncoding класс. Представляет кодировку шрифта CFF в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font.cff/cffencoding/
---
## CffEncoding class


Представляет кодировку CFF [Font](../../aspose.font/font/).

```cpp
class CffEncoding : public Aspose::Font::IFontEncoding,
                    public Aspose::Font::ISupportsNameAddressing
```

## Методы

| Метод | Описание |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Получает Gid для переданного charCode. Этот метод предназначен для CFF CIDFonts, где charCode должен быть действительным значением CID. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Glyph id шрифта CFF [Font](../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Параметризованный метод декодирования. Не поддерживается для типа CFF [Font](../../aspose.font/font/). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Кодирует глиф. Не поддерживается для типов CFF [Font](../../aspose.font/font/). |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Возвращает отображение имени в код символа. Примечание: код символа не является Unicode. Код символа — это индекс символа в кодировке [Font](../../aspose.font/font/) "таблица". |
| [GetNameToGidIndex](./getnametogidindex/)() | Возвращает отображение имени в код символа. Примечание: Код символа не является Unicode. Код символа — это индекс символа в кодировке [Font](../../aspose.font/font/) "таблица". |
| [GetNameToSidIndex](./getnametosidindex/)() | Возвращает отображение имени в код символа. Примечание: Код символа не является Unicode. Код символа — это индекс символа в кодировке [Font](../../aspose.font/font/) "таблица". |
| [GetSidName](./getsidname/)(int32_t) | Получает имя для указанного SID. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Декодирует Gid в Unicode. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Glyph id шрифта CFF [Font](../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Декодирует Unicode и возвращает glyph id. Glyph id — уникальный номер глифа, зависящий от типа шрифта. Glyph id шрифта CFF [Font](../../aspose.font/font/) может быть экземпляром класса ([GlyphStringId](../)) или класса ([GlyphUInt32Id](../)). |
## См. также

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
