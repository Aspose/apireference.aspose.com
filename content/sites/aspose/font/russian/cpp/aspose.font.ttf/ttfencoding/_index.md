---
title: "Aspose::Font::Ttf::TtfEncoding class"
linktitle: "TtfEncoding"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Ttf::TtfEncoding class. Представляет кодировку TTF Font на C++."
type: docs
weight: 400
url: /ru/cpp/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class


Представляет кодировку TTF [Font](../../aspose.font/font/).

```cpp
class TtfEncoding : public Aspose::Font::IFontEncoding
```

## Методы

| Метод | Описание |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Реализация DecodeToGlyphId у TTF [Font](../../aspose.font/font/) ищет таблицу Unicode и возвращает идентификатор глифа для символа Unicode. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например, идентификатор [Type1](../../aspose.font.type1/) — это имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Параметризованная версия позволяет использовать конкретную таблицу CMap (не Unicode). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Кодирует глиф. Для шрифтов TTF код символа — Unicode. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Декодирует идентификатор глифа в Unicode. Идентификатор глифа — уникальный номер глифа, зависящий от типа шрифта. Например: [Type1](../../aspose.font.type1/) имеет идентификатор‑имя глифа, экземпляр класса ([GlyphStringId](../)). Идентификатор TTF — это целочисленный индекс, экземпляр класса ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Декодирует Unicode и возвращает идентификатор глифа. |
## См. также

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
