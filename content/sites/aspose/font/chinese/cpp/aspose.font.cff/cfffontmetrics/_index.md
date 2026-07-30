---
title: "Aspose::Font::Cff::CffFontMetrics 类"
linktitle: "CffFontMetrics"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Cff::CffFontMetrics 类。表示在 C++ 中的 CFF 字体度量。"
type: docs
weight: 300
url: /zh/cpp/aspose.font.cff/cfffontmetrics/
---
## CffFontMetrics class


表示 CFF [Font](../../aspose.font/font/) 度量。

```cpp
class CffFontMetrics : public Aspose::Font::FontMetrics
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | 获取 Ascender 值。 |
| [get_Descender](./get_descender/)() override | 获取 Descender 值。 |
| [get_FontBBox](./get_fontbbox/)() override | 获取 [FontBBox](../../aspose.font/fontbbox/) 值。 |
| [get_FontMatrix](./get_fontmatrix/)() override | 获取 FontMatrix 值。 |
| [get_UnitsPerEM](./get_unitsperem/)() override | 获取 UnitsPerEM 值。 |
| [GetFontMatrixForGlyph](./getfontmatrixforglyph/)(System::SharedPtr\<Glyphs::GlyphId\>) | 计算由 id 指定的字形的变换矩阵。 |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 返回字形宽度。可能被特定的 [Font](../../aspose.font/font/) 编码继承者覆盖。 |
| [MeasureString](./measurestring/)(System::String, double) override | 测量字符串并返回字符串宽度。 |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | 设置字形宽度。 |
## 另见

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
