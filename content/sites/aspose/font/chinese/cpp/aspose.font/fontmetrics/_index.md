---
title: "Aspose::Font::FontMetrics 类"
linktitle: "FontMetrics"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::FontMetrics 类。表示 C++ 中的字体度量。"
type: docs
weight: 800
url: /zh/cpp/aspose.font/fontmetrics/
---
## FontMetrics class


表示 [Font](../font/) 度量。

```cpp
class FontMetrics : public Aspose::Font::IFontMetrics
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Ascender](./get_ascender/)() override | 获取 Ascender 值。 |
| [get_Descender](./get_descender/)() override | 获取 Descender 值。 |
| [get_FontBBox](./get_fontbbox/)() override | 获取 [FontBBox](../fontbbox/) 值。 |
| [get_FontMatrix](./get_fontmatrix/)() override | 获取 FontMatrix 值。 |
| [get_IsFixedPitch](./get_isfixedpitch/)() override | 获取 IsFixedPitch 值。 |
| [get_LineGap](./get_linegap/)() override | 获取 LineGap 值。 |
| [get_TypoAscender](./get_typoascender/)() override | 获取 TypoAscender 值。 |
| [get_TypoDescender](./get_typodescender/)() override | 获取 TypoDescender 值。 |
| [get_TypoLineGap](./get_typolinegap/)() override | 获取 TypoLineGap 值。 |
| [get_UnitsPerEM](./get_unitsperem/)() override | 获取 UnitsPerEM 值。 |
| [GetAscender](./getascender/)(double) override | 返回特定 [Font](../font/) 大小的上升线值。 |
| [GetDescender](./getdescender/)(double) override | 返回特定 [Font](../font/) 大小的下降线值。 |
| [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 返回字形 BBox。如果字形未定义 BBox，则返回 [FontBBox](../fontbbox/)。可能会被特定字体编码的继承者覆盖。 |
| [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 返回字形宽度。可能会被特定字体编码的继承者覆盖。 |
| [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) override | 返回字形对的 kerning 值。 |
| [GetTypoAscender](./gettypoascender/)(double) override | 返回特定 [Font](../font/) 大小的下降线值。 |
| [GetTypoDescender](./gettypodescender/)(double) override | 返回特定 [Font](../font/) 大小的下降线值。 |
| [GetTypoLineGap](./gettypolinegap/)(double) override | 返回特定 [Font](../font/) 大小的行间距。 |
| virtual [MeasureString](./measurestring/)(System::String, double) | 测量字符串并返回字符串宽度。 |
| [set_Ascender](./set_ascender/)(double) override | 获取 Ascender 值。 |
| [set_Descender](./set_descender/)(double) override | 获取 Descender 值。 |
| [set_TypoAscender](./set_typoascender/)(double) override | 获取 TypoAscender 值。 |
| [set_TypoDescender](./set_typodescender/)(double) override | 获取 TypoDescender 值。 |
| [set_UnitsPerEM](./set_unitsperem/)(uint32_t) override | 获取 UnitsPerEM 值。 |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | 设置字形宽度。 |
## 另见

* Class [IFontMetrics](../ifontmetrics/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
