---
title: "Aspose::Font::Cff::CffFont 类"
linktitle: "CffFont"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Cff::CffFont 类。表示 C++ 中的紧凑字体格式（CFF）。"
type: docs
weight: 200
url: /zh/cpp/aspose.font.cff/cfffont/
---
## CffFont class


表示紧凑 [Font](../../aspose.font/font/) 格式（CFF）。

```cpp
class CffFont : public Aspose::Font::Font
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | 将 [Font](../../aspose.font/font/) 转换为另一种格式。 |
| [get_CommonFontsSettings](./get_commonfontssettings/)() const | 获取/设置 CFF 字体的通用设置。这些设置在不同场景中使用，并且可以针对每个单独的字体进行更改。 |
| [get_Encoding](./get_encoding/)() override | 获取 [Font](../../aspose.font/font/) 编码。 |
| [get_FontDefinition](./get_fontdefinition/)() override | 获取 [Font](../../aspose.font/font/) 定义。 |
| [get_FontFamily](./get_fontfamily/)() override | 获取 [Font](../../aspose.font/font/) 家族。目前尚未实现 [Font](../../aspose.font/font/) 家族的设置器。 |
| [get_FontName](./get_fontname/)() override | 获取 [Font](../../aspose.font/font/) 字体名称。 |
| [get_FontNames](./get_fontnames/)() override | 获取 [Font](../../aspose.font/font/) 名称。 |
| [get_FontStyle](./get_fontstyle/)() override | 获取 [Font](../../aspose.font/font/) 样式。这是一个在通用类型中计算并表示的值。 |
| [get_FontType](./get_fonttype/)() override | 获取 [Font](../../aspose.font/font/) 类型。返回 [FontType.CFF](../../aspose.font/fonttype/) 值。 |
| [get_GlyphIdType](./get_glyphidtype/)() override | 获取字形 ID 类型规范。 |
| [get_IsCidKeyedFont](./get_iscidkeyedfont/)() | 获取指示该 [Font](../../aspose.font/font/) 为 cid-keyed 的值。 |
| [get_Metrics](./get_metrics/)() override | 获取 [Font](../../aspose.font/font/) 度量。 |
| [get_NumGlyphs](./get_numglyphs/)() override | 获取 [Font](../../aspose.font/font/) 中的字形数量。 |
| [get_PostscriptNames](./get_postscriptnames/)() override | 获取 PostScript [Font](../../aspose.font/font/) 名称。 |
| [get_Style](./get_style/)() override | 获取 [Font](../../aspose.font/font/) 样式。这是由 [Font](../../aspose.font/font/) 文件提供的原始字符串值。 |
| [get_TopDictDataProvider](./get_topdictdataprovider/)() | 获取 Top DICT INDEX 结构中第一个顶层 DICT 的访问器。 |
| [GetAllGlyphIds](./getallglyphids/)() override | 返回 [Font](../../aspose.font/font/) 中所有可用字形 ID 的数组。字形 ID 是字形的唯一编号，取决于字体类型。CFF [Font](../../aspose.font/font/) 字形 ID 可以是 ([GlyphStringId](../)) 类的实例或 ([GlyphUInt32Id](../)) 类的实例。 |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | 通过字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。CFF [Font](../../aspose.font/font/) 字形 ID 可以是 ([GlyphStringId](../)) 类的实例或 ([GlyphUInt32Id](../)) 类的实例。 |
| [GetGlyphById](./getglyphbyid/)(System::String) | 通过字形名称返回字形。 |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | 根据字形 id 返回字形。 |
| [GetIndexDataProvider](./getindexdataprovider/)(CffDataProviders::CffIndexProviderType) | 获取指定 CFF INDEX 结构类型的提供程序。 |
| [set_CommonFontsSettings](./set_commonfontssettings/)(System::SharedPtr\<CffFontsSettings\>) | 获取/设置 CFF 字体的通用设置。这些设置在不同场景中使用，并且可以针对每个单独的字体进行更改。 |
| [set_FontFamily](./set_fontfamily/)(System::String) override | 获取 [Font](../../aspose.font/font/) 家族。目前尚未实现 [Font](../../aspose.font/font/) 家族的设置器。 |
| [set_FontName](./set_fontname/)(System::String) override | 设置 [Font](../../aspose.font/font/) 字体名称。 |
| [set_Style](./set_style/)(System::String) override | 设置 [Font](../../aspose.font/font/) 样式。这是由 [Font](../../aspose.font/font/) 文件提供的原始字符串值。 |
## 另见

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
