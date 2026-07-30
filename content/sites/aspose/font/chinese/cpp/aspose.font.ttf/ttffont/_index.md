---
title: "Aspose::Font::Ttf::TtfFont 类"
linktitle: "TtfFont"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Ttf::TtfFont 类。表示 C++ 中的 TrueType 字体 (TTF)。"
type: docs
weight: 600
url: /zh/cpp/aspose.font.ttf/ttffont/
---
## TtfFont class


表示 TrueType [Font](../../aspose.font/font/) (TTF)。

```cpp
class TtfFont : public Aspose::Font::Font
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | 将 [Font](../../aspose.font/font/) 转换为另一种格式。 |
| [Convert](./convert/)(Aspose::Font::FontType, System::SharedPtr\<System::Collections::Generic::ICollection\<uint32_t\>\>) | 在限制字符集的情况下，将 [Font](../../aspose.font/font/) 转换为另一种格式。 |
| virtual [get_CffFont](./get_cfffont/)() | 获取 CFF [Font](../../aspose.font/font/)（如果存在）。 |
| [get_Encoding](./get_encoding/)() override | 获取 [Font](../../aspose.font/font/) 编码。 |
| [get_FontDefinition](./get_fontdefinition/)() override | 获取 [Font](../../aspose.font/font/) 定义。 |
| [get_FontFamily](./get_fontfamily/)() override | 获取或设置 [Font](../../aspose.font/font/) 家族。 |
| [get_FontName](./get_fontname/)() override | 获取或设置 [Font](../../aspose.font/font/) 字体名称。 |
| [get_FontNames](./get_fontnames/)() override | 获取 [Font](../../aspose.font/font/) 名称。 |
| [get_FontStyle](./get_fontstyle/)() override | 获取 [Font](../../aspose.font/font/) 样式。这是一个在通用类型中计算并表示的值。 |
| [get_FontType](./get_fonttype/)() override | 获取 [Font](../../aspose.font/font/) 类型。返回 [FontType.TTF](../../aspose.font/fonttype/) 值。 |
| [get_GlyphIdType](./get_glyphidtype/)() override | 获取字形 ID 类型规范。 |
| [get_IsSymbolic](./get_issymbolic/)() | 如果 [Font](../../aspose.font/font/) 为符号字体，则返回 true。 |
| [get_Metrics](./get_metrics/)() override | 获取 [Font](../../aspose.font/font/) 度量。 |
| [get_NumGlyphs](./get_numglyphs/)() override | 获取 [Font](../../aspose.font/font/) 中的字形数量。 |
| [get_PostscriptNames](./get_postscriptnames/)() override | 获取 Postscript [Font](../../aspose.font/font/) 名称。 |
| [get_Style](./get_style/)() override | 获取或设置 [Font](../../aspose.font/font/) 样式。这是由 [Font](../../aspose.font/font/) 文件提供的原始字符串值。 |
| virtual [get_TtfTables](./get_ttftables/)() | 获取 TTF 表。 |
| [GetAllGlyphIds](./getallglyphids/)() override | 返回在 [Font](../../aspose.font/font/) 中可用的所有字形 id 的数组。字形 id 是字形的唯一编号，取决于字体类型。TTF [Font](../../aspose.font/font/) 的字形 id 可以是 ([GlyphStringId](../)) 类的实例或 ([GlyphUInt32Id](../)) 类的实例。通过 Post 表映射，支持使用名称（字符串）对 TTF 字体进行字形寻址。如果字体内部为 CFF [Font](../../aspose.font/font/)，则使用 CFF 结构通过名称寻址字形。 |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 根据字形 id 返回字形。字形 id 是字形的唯一编号，取决于字体类型。TTF [Font](../../aspose.font/font/) 的字形 id 可以是 ([GlyphStringId](../)) 类的实例或 ([GlyphUInt32Id](../)) 类的实例。通过 Post 表映射，支持使用名称（字符串）对 TTF 字体进行字形寻址。如果字体内部为 CFF [Font](../../aspose.font/font/)，则使用 CFF 结构通过名称寻址字形。 |
| [GetGlyphById](./getglyphbyid/)(System::String) | 根据字形名称返回字形。通过 Post 表映射，支持使用名称（字符串）对 TTF 字体进行字形寻址。如果字体内部为 CFF [Font](../../aspose.font/font/)，则使用 CFF 结构通过名称寻址字形。 |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | 根据字形 id 返回字形。 |
| virtual [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) | 通过传入的字形标识获取字形，并将该字形的组成部分填充到传入的字形标识列表中。字形 id 是字形的唯一编号，取决于字体类型。TTF [Font](../../aspose.font/font/) 的字形 id 可以是 ([GlyphStringId](../)) 类的实例或 ([GlyphUInt32Id](../)) 类的实例。通过 Post 表映射，支持使用名称（字符串）对 TTF 字体进行字形寻址。如果字体内部为 CFF [Font](../../aspose.font/font/)，则使用 CFF 结构通过名称寻址字形。 |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) | 通过传入的字形名称获取字形，并将该字形的组成部分填充到传入的字形标识列表中。 |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) | 通过传入的字形索引获取字形，并将该字形的组成部分填充到传入的字形标识列表中。 |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | 获取文本的字形表示。 |
| [set_FontFamily](./set_fontfamily/)(System::String) override | 获取或设置 [Font](../../aspose.font/font/) 家族。 |
| [set_FontName](./set_fontname/)(System::String) override | 获取或设置 [Font](../../aspose.font/font/) 字体名称。 |
| [set_Style](./set_style/)(System::String) override | 获取或设置 [Font](../../aspose.font/font/) 样式。这是由 [Font](../../aspose.font/font/) 文件提供的原始字符串值。 |
## 另见

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
