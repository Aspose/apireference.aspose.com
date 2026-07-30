---
title: "Aspose::Font::FontMetrics class"
linktitle: "FontMetrics"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::FontMetrics class. Представляет метрики шрифта в C++."
type: docs
weight: 800
url: /ru/cpp/aspose.font/fontmetrics/
---
## FontMetrics class


Представляет метрики [Font](../font/).

```cpp
class FontMetrics : public Aspose::Font::IFontMetrics
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Возвращает значение Ascender. |
| [get_Descender](./get_descender/)() override | Возвращает значение Descender. |
| [get_FontBBox](./get_fontbbox/)() override | Получает значение [FontBBox](../fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | Возвращает значение FontMatrix. |
| [get_IsFixedPitch](./get_isfixedpitch/)() override | Получает значение IsFixedPitch. |
| [get_LineGap](./get_linegap/)() override | Получает значение LineGap. |
| [get_TypoAscender](./get_typoascender/)() override | Получает значение TypoAscender. |
| [get_TypoDescender](./get_typodescender/)() override | Получает значение TypoDescender. |
| [get_TypoLineGap](./get_typolinegap/)() override | Получает значение TypoLineGap. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Получает значение UnitsPerEM. |
| [GetAscender](./getascender/)(double) override | Возвращает восходящий знак для конкретного размера [Font](../font/). |
| [GetDescender](./getdescender/)(double) override | Возвращает нисходящий знак для конкретного размера [Font](../font/). |
| [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Возвращает BBox глифа. Возвращает [FontBBox](../fontbbox/), если BBox не был определён для глифа. Может быть переопределено конкретными наследниками кодировки шрифта. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Возвращает ширину глифа. Может быть переопределено конкретными наследниками кодировки шрифта. |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Возвращает значение кернинга для пары глифов. |
| [GetTypoAscender](./gettypoascender/)(double) override | Возвращает нисходящий знак для конкретного размера [Font](../font/). |
| [GetTypoDescender](./gettypodescender/)(double) override | Возвращает нисходящий знак для конкретного размера [Font](../font/). |
| [GetTypoLineGap](./gettypolinegap/)(double) override | Возвращает межстрочный интервал для конкретного размера [Font](../font/). |
| virtual [MeasureString](./measurestring/)(System::String, double) | Измеряет строку и возвращает её ширину. |
| [set_Ascender](./set_ascender/)(double) override | Возвращает значение Ascender. |
| [set_Descender](./set_descender/)(double) override | Возвращает значение Descender. |
| [set_TypoAscender](./set_typoascender/)(double) override | Получает значение TypoAscender. |
| [set_TypoDescender](./set_typodescender/)(double) override | Получает значение TypoDescender. |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | Получает значение UnitsPerEM. |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | Устанавливает ширину глифа. |
## См. также

* Class [IFontMetrics](../ifontmetrics/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
