---
title: "Aspose::Font::Type1::Type1MetricFont 类"
linktitle: "Type1MetricFont"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Type1::Type1MetricFont 类。Type1 度量字体实现。此 type1 字体仅使用度量创建。不允许使用字形检索函数以及其他需要真实字体的功能，不允许的功能会抛出异常 Type1NotSupportedException。其他属性（FontName、Weight、Metrics 和 Encoding）来自 C++ 中的度量文件。"
type: docs
weight: 500
url: /zh/cpp/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class


[Type1](../) metric font implementation. This type1 font is created using metrics only. [Glyphs](../../aspose.font.glyphs/) retrieval functions and some other that require real font are not allowed, not allowed functions throw exception [Type1NotSupportedException](../). Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

```cpp
class Type1MetricFont : public Aspose::Font::Type1::Type1Font
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | 编码在度量文件中定义。StandardAdobeEncoding：编码会自动填充。 |
| [get_FontFamily](./get_fontfamily/)() override | 获取 [Font](../../aspose.font/font/) 家族。 |
| [get_FontName](./get_fontname/)() override | 获取 [Font](../../aspose.font/font/) 名称。 |
| [get_FontStyle](./get_fontstyle/)() override | 获取 [Font](../../aspose.font/font/) 样式。这是一个在通用类型中计算并表示的值。 |
| [get_NumGlyphs](./get_numglyphs/)() override | 获取 [Font](../../aspose.font/font/) 中的字形数量。 |
| [get_Style](./get_style/)() override | 获取 [Font](../../aspose.font/font/) 样式。 |
| [GetAllGlyphIds](./getallglyphids/)() override | 返回在 [Font](../../aspose.font/font/) 中可用的所有字形 ID。对 [Type1MetricFont](./) 类型不支持。 |
| [GetGlyphById](./getglyphbyid/)(System::String) override | 根据字形 ID 返回字形。对 [Type1MetricFont](./) 类型不支持。 |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 根据字形 ID 返回字形。对 [Type1MetricFont](./) 类型不支持。 |
## 另见

* Class [Type1Font](../type1font/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
