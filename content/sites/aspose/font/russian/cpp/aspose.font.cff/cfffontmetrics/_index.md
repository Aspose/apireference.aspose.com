---
title: "Aspose::Font::Cff::CffFontMetrics класс"
linktitle: "CffFontMetrics"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Cff::CffFontMetrics класс. Представляет метрики шрифта CFF в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class


Представляет метрики CFF [Font](../../aspose.font/font/).

```cpp
class CffFontMetrics : public Aspose::Font::FontMetrics
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | Возвращает значение Ascender. |
| [get_Descender](./get_descender/)() override | Возвращает значение Descender. |
| [get_FontBBox](./get_fontbbox/)() override | Получает значение [FontBBox](../../aspose.font/fontbbox/). |
| [get_FontMatrix](./get_fontmatrix/)() override | Возвращает значение FontMatrix. |
| [get_UnitsPerEM](./get_unitsperem/)() override | Получает значение UnitsPerEM. |
| [GetFontMatrixForGlyph](./getfontmatrixforglyph/)(System::SharedPtr\<Glyphs::GlyphId\>) | Вычисляет матрицу преобразования для глифа, указанного по id. |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Возвращает ширину глифа. Может быть переопределено конкретными наследниками кодировки [Font](../../aspose.font/font/). |
| [MeasureString](./measurestring/)(System::String, double) override | Измеряет строку и возвращает её ширину. |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | Устанавливает ширину глифа. |
## См. также

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
