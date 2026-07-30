---
title: "Aspose::Font::IFontMetrics класс"
linktitle: "IFontMetrics"
second_title: "Aspose.Font для C++"
description: "Класс Aspose::Font::IFontMetrics. Определяет интерфейс для инструментов измерения шрифтов в C++."
type: docs
weight: 1600
url: /ru/cpp/aspose.font/ifontmetrics/
---
## IFontMetrics class


Определяет интерфейс для инструментов измерения [Font](../font/).

```cpp
class IFontMetrics : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_Ascender](./get_ascender/)() | Получает значение восходящего знака [Font](../font/) в единицах шрифта. |
| virtual [get_Descender](./get_descender/)() | Получает значение нисходящего знака [Font](../font/) в единицах шрифта. |
| virtual [get_FontBBox](./get_fontbbox/)() | Получает ограничивающий прямоугольник [Font](../font/). |
| virtual [get_FontMatrix](./get_fontmatrix/)() | Получает матрицу преобразования [Font](../font/). |
| virtual [get_IsFixedPitch](./get_isfixedpitch/)() | True, если [Font](../font/) моноширинный. |
| virtual [get_LineGap](./get_linegap/)() | Получает значение LineGap [Font](../font/) в единицах [Font](../font/). |
| virtual [get_TypoAscender](./get_typoascender/)() | Получает типографическое значение восходящего знака [Font](../font/) в единицах шрифта. |
| virtual [get_TypoDescender](./get_typodescender/)() | Получает типографическое значение нисходящего знака [Font](../font/) в единицах [Font](../font/). |
| virtual [get_TypoLineGap](./get_typolinegap/)() | Получает типографическое значение LineGap [Font](../font/) в единицах [Font](../font/). |
| virtual [get_UnitsPerEM](./get_unitsperem/)() | Получает количество единиц на em. |
| virtual [GetAscender](./getascender/)(double) | Возвращает восходящий знак для конкретного размера [Font](../font/). |
| virtual [GetDescender](./getdescender/)(double) | Возвращает нисходящий знак для конкретного размера [Font](../font/). |
| virtual [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) | Возвращает BBox глифа. |
| virtual [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) | Возвращает ширину глифа. |
| virtual [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) | Возвращает значение кернинга для пары глифов. |
| virtual [GetTypoAscender](./gettypoascender/)(double) | Возвращает типографический восходящий знак для конкретного размера [Font](../font/). |
| virtual [GetTypoDescender](./gettypodescender/)(double) | Возвращает типографический нисходящий знак для конкретного размера [Font](../font/). |
| virtual [GetTypoLineGap](./gettypolinegap/)(double) | Возвращает межстрочный интервал для конкретного размера [Font](../font/). |
| virtual [MeasureString](./measurestring/)(System::String, double) | Измеряет строку и возвращает её ширину. |
| virtual [set_Ascender](./set_ascender/)(double) | Получает значение восходящего знака [Font](../font/) в единицах шрифта. |
| virtual [set_Descender](./set_descender/)(double) | Получает значение нисходящего знака [Font](../font/) в единицах шрифта. |
| virtual [set_TypoAscender](./set_typoascender/)(double) | Получает типографическое значение восходящего знака [Font](../font/) в единицах шрифта. |
| virtual [set_TypoDescender](./set_typodescender/)(double) | Получает типографическое значение нисходящего знака [Font](../font/) в единицах [Font](../font/). |
| virtual [set_UnitsPerEM](./set_unitsperem/)(uint32_t) | Получает количество единиц на em. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Устанавливает ширину глифа. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
