---
title: "Aspose::Font::Type1::Type1MetricFont класс"
linktitle: "Type1MetricFont"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Type1::Type1MetricFont класс. Реализация метрического шрифта Type1. Этот шрифт Type1 создаётся только с использованием метрик. Функции получения глифов и некоторые другие, требующие реального шрифта, не допускаются; недопустимые функции бросают исключение Type1NotSupportedException. Другие свойства (FontName, Weight, Metrics и Encoding) берутся из файла метрик в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class


[Type1](../) metric font implementation. This type1 font is created using metrics only. [Glyphs](../../aspose.font.glyphs/) retrieval functions and some other that require real font are not allowed, not allowed functions throw exception [Type1NotSupportedException](../). Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

```cpp
class Type1MetricFont : public Aspose::Font::Type1::Type1Font
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Кодировка определяется в файле метрик. StandardAdobeEncoding: кодировка заполняется автоматически. |
| [get_FontFamily](./get_fontfamily/)() override | Получает семейство [Font](../../aspose.font/font/). |
| [get_FontName](./get_fontname/)() override | Получает название [Font](../../aspose.font/font/). |
| [get_FontStyle](./get_fontstyle/)() override | Получает стиль [Font](../../aspose.font/font/). Это значение вычисляется и представляется в обобщённом типе. |
| [get_NumGlyphs](./get_numglyphs/)() override | Получает количество глифов в [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Получает стиль [Font](../../aspose.font/font/). |
| [GetAllGlyphIds](./getallglyphids/)() override | Возвращает все идентификаторы глифов, доступные в [Font](../../aspose.font/font/). Не поддерживается для типа [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::String) override | Возвращает глиф по идентификатору глифа. Не поддерживается для типа [Type1MetricFont](./). |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Возвращает глиф по идентификатору глифа. Не поддерживается для типа [Type1MetricFont](./). |
## См. также

* Class [Type1Font](../type1font/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
