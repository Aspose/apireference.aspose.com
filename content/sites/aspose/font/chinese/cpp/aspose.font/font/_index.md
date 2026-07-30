---
title: "Aspose::Font::Font 类"
linktitle: "Font"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::Font 类。表示 C++ 中的基础 Font 类。"
type: docs
weight: 400
url: /zh/cpp/aspose.font/font/
---
## Font class


表示基础 [Font](./) 类。

```cpp
class Font : public virtual Aspose::Font::IFont,
             public Aspose::Font::Glyphs::IGlyphAccessor,
             public Aspose::Font::IFontSaver,
             public Aspose::Font::Licensing::IVentureLicenseTarget
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Convert](./convert/)(Aspose::Font::FontType) | 将 [Font](./) 转换为其他格式。 |
| virtual [get_Encoding](./get_encoding/)() | 获取 [Font](./) 编码。 |
| virtual [get_FontDefinition](./get_fontdefinition/)() | 获取 [Font](./) 定义。 |
| virtual [get_FontFamily](./get_fontfamily/)() | 获取或设置 [Font](./) 家族。 |
| virtual [get_FontName](./get_fontname/)() | 获取或设置 [Font](./) 字体名称。 |
| virtual [get_FontNames](./get_fontnames/)() | 获取 [Font](./) 名称。 |
| [get_FontSaver](./get_fontsaver/)() override | 获取 [Font](./) 保存功能。 |
| virtual [get_FontStyle](./get_fontstyle/)() | 获取 [Font](./) 样式。这是一个以通用类型计算并表示的值。 |
| virtual [get_FontType](./get_fonttype/)() | 获取 [Font](./) 类型。 |
| [get_GlyphAccessor](./get_glyphaccessor/)() override | [Font](./) 字形访问器。检索字形及其标识符。 |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | 字形 ID 类型规范。供需要了解 'bytes[]' 实际类型的使用者使用。 |
| virtual [get_Metrics](./get_metrics/)() | 获取 [Font](./) 度量。 |
| virtual [get_NumGlyphs](./get_numglyphs/)() | 获取 [Font](./) 中的字形数量。 |
| virtual [get_PostscriptNames](./get_postscriptnames/)() | 获取 PostScript [Font](./) 名称。 |
| virtual [get_Style](./get_style/)() | 获取或设置 [Font](./) 样式。这是由 [Font](./) 文件提供的原始字符串值。 |
| virtual [GetAllGlyphIds](./getallglyphids/)() | 返回在 [Font](./) 中可用的所有字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如： [Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。 |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) | 根据字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。GlyphId 是派生对象。例如： [Type1](../../aspose.font.type1/) 的 ID 是字形名称，是 ([GlyphStringId](../)) 类的实例。TTF 的 ID 是整数索引，是 ([GlyphUInt32Id](../)) 类的实例。 |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | 获取文本的字形表示。 |
| static [Open](./open/)(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) | 使用 FontDefinition 对象打开字体。 |
| static [Open](./open/)(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) | 使用字体类型和流源打开字体。 |
| static [Open](./open/)(Aspose::Font::FontType, System::String) | 使用字体类型和字体文件名打开字体。 |
| static [Open](./open/)(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) | 使用字体类型和字体数据字节数组打开字体。 |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) override | 将 [Font](./) 保存为原始格式。 |
| [Save](./save/)(System::String) override | 将 [Font](./) 保存为原始格式。 |
| [SaveToFormat](./savetoformat/)(System::SharedPtr\<System::IO::Stream\>, FontSavingFormats) override | 将 [Font](./) 保存为指定格式。 |
| virtual [set_FontFamily](./set_fontfamily/)(System::String) | 获取或设置 [Font](./) 家族。 |
| virtual [set_FontName](./set_fontname/)(System::String) | 获取或设置 [Font](./) 字体名称。 |
| virtual [set_Style](./set_style/)(System::String) | 获取或设置 [Font](./) 样式。这是由 [Font](./) 文件提供的原始字符串值。 |
## 另见

* Class [IFont](../ifont/)
* Class [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* Class [IFontSaver](../ifontsaver/)
* Class [IVentureLicenseTarget](../../aspose.font.licensing/iventurelicensetarget/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
