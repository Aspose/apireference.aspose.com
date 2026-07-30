---
title: "Aspose::Font::Ttf::TtfFontMetrics 类"
linktitle: "TtfFontMetrics"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfFontMetrics 类。表示 C++ 中的 TTF 字体度量。"
type: docs
weight: 700
url: /zh/cpp/aspose.font.ttf/ttffontmetrics/
---
## TtfFontMetrics class


表示 TTF [Font](../../aspose.font/font/) 度量。

```cpp
class TtfFontMetrics : public Aspose::Font::FontMetrics
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | 获取 ascender 值。 |
| [get_Descender](./get_descender/)() override | 获取 descender 值。 |
| [get_FontBBox](./get_fontbbox/)() override | 获取 [FontBBox](../../aspose.font/fontbbox/) 值。 |
| [get_FontMatrix](./get_fontmatrix/)() override | 获取 [FontBBox](../../aspose.font/fontbbox/) 值。 |
| [get_LineGap](./get_linegap/)() override | 获取 LineGap 值。 |
| [get_TypoAscender](./get_typoascender/)() override | 获取 TypoAscender 值。 |
| [get_TypoDescender](./get_typodescender/)() override | 获取 TypoDescender 值。 |
| [get_TypoLineGap](./get_typolinegap/)() override | 获取 TypoLineGap 值。 |
| [get_UnitsPerEM](./get_unitsperem/)() override | 获取 UnitsPerEM 值。 |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 返回字形 ID 对应的字形宽度。 |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | 返回字形对的 kerning 值。 |
| [MeasureString](./measurestring/)(System::String, double) override | 测量字符串并返回字符串宽度。 |
| [MeasureString](./measurestring/)(System::ArrayPtr\<uint32_t\>, double) | 测量以字符代码数组表示的文本并返回字符串宽度。 |
| [set_Ascender](./set_ascender/)(double) override | 获取 ascender 值。 |
| [set_Descender](./set_descender/)(double) override | 获取 descender 值。 |
| [set_TypoAscender](./set_typoascender/)(double) override | 获取 TypoAscender 值。 |
| [set_TypoDescender](./set_typodescender/)(double) override | 获取 TypoDescender 值。 |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | 获取 UnitsPerEM 值。 |
| [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) override | 设置字形宽度。 |
## 另见

* Class [FontMetrics](../../aspose.font/fontmetrics/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
