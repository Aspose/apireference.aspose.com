---
title: Aspose::Font::Type1::Type1MetricFont class
linktitle: Type1MetricFont
second_title: Aspose.Font for C++
description: 'Aspose::Font::Type1::Type1MetricFont class. Type1 metric font implementation. This type1 font is created using metrics only. Glyphs retrieval functions and some other that require real font are not allowed, not allowed functions throw exception Type1NotSupportedException. Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file in C++.'
type: docs
weight: 500
url: /cpp/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class


[Type1](../) metric font implementation. This type1 font is created using metrics only. [Glyphs](../../aspose.font.glyphs/) retrieval functions and some other that require real font are not allowed, not allowed functions throw exception [Type1NotSupportedException](../). Other properties (FontName, Weight, Metrics and Encoding) are used from metrics file.

```cpp
class Type1MetricFont : public Aspose::Font::Type1::Type1Font
```

## Methods

| Method | Description |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Encoding is defined in metrics file. StandardAdobeEncoding: the encoding is populated automatically. |
| [get_FontFamily](./get_fontfamily/)() override | Gets [Font](../../aspose.font/font/) family. |
| [get_FontName](./get_fontname/)() override | Gets [Font](../../aspose.font/font/) name. |
| [get_FontStyle](./get_fontstyle/)() override | Gets [Font](../../aspose.font/font/) style. This is a value computed and represented in generalized type. |
| [get_NumGlyphs](./get_numglyphs/)() override | Gets number of glyphs in the [Font](../../aspose.font/font/). |
| [get_Style](./get_style/)() override | Gets [Font](../../aspose.font/font/) style. |
| [GetAllGlyphIds](./getallglyphids/)() override | Returns all glyph ids, available in the [Font](../../aspose.font/font/). Not supported for [Type1MetricFont](./) type. |
| [GetGlyphById](./getglyphbyid/)(System::String) override | Returns glyph by glyph id. Not supported for [Type1MetricFont](./) type. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Returns glyph by glyph id. Not supported for [Type1MetricFont](./) type. |
## See Also

* Class [Type1Font](../type1font/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
