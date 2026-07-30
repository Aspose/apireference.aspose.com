---
title: "Aspose::Font::IFontMetrics 类"
linktitle: "IFontMetrics"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::IFontMetrics 类。定义了在 C++ 中用于字体度量工具的接口。"
type: docs
weight: 1600
url: /zh/cpp/aspose.font/ifontmetrics/
---
## IFontMetrics class


定义了一个用于 [Font](../font/) 度量工具的接口。

```cpp
class IFontMetrics : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_Ascender](./get_ascender/)() | 获取 [Font](../font/) 的上升线值（以字体单位计）。 |
| virtual [get_Descender](./get_descender/)() | 获取 [Font](../font/) 的下降线值（以字体单位计）。 |
| virtual [get_FontBBox](./get_fontbbox/)() | 获取 [Font](../font/) 的边界框。 |
| virtual [get_FontMatrix](./get_fontmatrix/)() | 获取 [Font](../font/) 的变换矩阵。 |
| virtual [get_IsFixedPitch](./get_isfixedpitch/)() | 如果 [Font](../font/) 为等宽字体，则为 True。 |
| virtual [get_LineGap](./get_linegap/)() | 获取 [Font](../font/) 的行间距（LineGap）值（以 [Font](../font/) 单位计）。 |
| virtual [get_TypoAscender](./get_typoascender/)() | 获取 [Font](../font/) 的排版上升线值（以字体单位计）。 |
| virtual [get_TypoDescender](./get_typodescender/)() | 获取 [Font](../font/) 的排版下降线值（以 [Font](../font/) 单位计）。 |
| virtual [get_TypoLineGap](./get_typolinegap/)() | 获取 [Font](../font/) 的排版行间距（LineGap）值（以 [Font](../font/) 单位计）。 |
| virtual [get_UnitsPerEM](./get_unitsperem/)() | 获取每个 em 的单位数。 |
| virtual [GetAscender](./getascender/)(double) | 返回特定 [Font](../font/) 大小的上升线值。 |
| virtual [GetDescender](./getdescender/)(double) | 返回特定 [Font](../font/) 大小的下降线值。 |
| virtual [GetGlyphBBox](./getglyphbbox/)(System::SharedPtr\<Glyphs::GlyphId\>) | 返回字形的边界框（BBox）。 |
| virtual [GetGlyphWidth](./getglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>) | 返回字形宽度。 |
| virtual [GetKerningValue](./getkerningvalue/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphId\>) | 返回字形对的 kerning 值。 |
| virtual [GetTypoAscender](./gettypoascender/)(double) | 返回特定 [Font](../font/) 大小的排版上升线值。 |
| virtual [GetTypoDescender](./gettypodescender/)(double) | 返回特定 [Font](../font/) 大小的排版下降线值。 |
| virtual [GetTypoLineGap](./gettypolinegap/)(double) | 返回特定 [Font](../font/) 大小的行间距。 |
| virtual [MeasureString](./measurestring/)(System::String, double) | 测量字符串并返回字符串宽度。 |
| virtual [set_Ascender](./set_ascender/)(double) | 获取 [Font](../font/) 的上升线值（以字体单位计）。 |
| virtual [set_Descender](./set_descender/)(double) | 获取 [Font](../font/) 的下降线值（以字体单位计）。 |
| virtual [set_TypoAscender](./set_typoascender/)(double) | 获取 [Font](../font/) 的排版上升线值（以字体单位计）。 |
| virtual [set_TypoDescender](./set_typodescender/)(double) | 获取 [Font](../font/) 的排版下降线值（以 [Font](../font/) 单位计）。 |
| virtual [set_UnitsPerEM](./set_unitsperem/)(uint32_t) | 获取每个 em 的单位数。 |
| virtual [SetGlyphWidth](./setglyphwidth/)(System::SharedPtr\<Glyphs::GlyphId\>, double) | 设置字形宽度。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
