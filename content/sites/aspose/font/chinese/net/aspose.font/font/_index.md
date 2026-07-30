---
title: "类 Font"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Font 类。表示基础 Font 类"
type: docs
weight: 270
url: /zh/net/aspose.font/font/
---
## Font class

表示基础 Font 类。

```csharp
public abstract class Font : IFont, IFontSaver, IGlyphAccessor
```

## 属性

| 名称 | 描述 |
| --- | --- |
| abstract [Encoding](../../aspose.font/font/encoding/) { get; } | 获取字体编码。 |
| abstract [FontDefinition](../../aspose.font/font/fontdefinition/) { get; } | 获取字体定义。 |
| abstract [FontFamily](../../aspose.font/font/fontfamily/) { get; set; } | 获取或设置字体族。 |
| abstract [FontName](../../aspose.font/font/fontname/) { get; set; } | 获取或设置字体面名称。 |
| abstract [FontNames](../../aspose.font/font/fontnames/) { get; } | 获取字体名称。 |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | 获取字体保存功能。 |
| abstract [FontStyle](../../aspose.font/font/fontstyle/) { get; } | 获取字体样式。这是一个计算后并以通用类型表示的值。 |
| abstract [FontType](../../aspose.font/font/fonttype/) { get; } | 获取 Font 类型。Type1、TrueType 等。 |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | 字体字形访问器。检索字形及其标识符。 |
| abstract [GlyphIdType](../../aspose.font/font/glyphidtype/) { get; } | Glyph id 类型规范。供需要了解 'bytes[]' 实际类型的使用者使用。 |
| abstract [Metrics](../../aspose.font/font/metrics/) { get; } | 获取字体度量。 |
| abstract [NumGlyphs](../../aspose.font/font/numglyphs/) { get; } | 获取字体中的字形数量。 |
| abstract [PostscriptNames](../../aspose.font/font/postscriptnames/) { get; } | 获取 PostScript 字体名称。 |
| abstract [Style](../../aspose.font/font/style/) { get; set; } | 获取或设置字体样式。这是由字体文件提供的原始字符串值。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| static [Open](../../aspose.font/font/open/#open_3)(FontDefinition) | 使用 FontDefinition 对象打开字体。 |
| static [Open](../../aspose.font/font/open/#open_1)(FontType, byte[]) | 使用字体类型和字体数据字节数组打开字体。 |
| static [Open](../../aspose.font/font/open/#open)(FontType, StreamSource) | 使用字体类型和流源打开字体。 |
| static [Open](../../aspose.font/font/open/#open_2)(FontType, string) | 使用字体类型和字体文件名打开字体。 |
| abstract [Convert](../../aspose.font/font/convert/)(FontType) | 将字体转换为其他格式。 |
| abstract [GetAllGlyphIds](../../aspose.font/font/getallglyphids/)() | 返回字体中可用的所有 glyph id。Glyph id 是 glyph 的唯一编号，取决于字体类型。例如：Type1 的 id 是 glyph 名称，是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例。TTF 的 id 是整数索引，是 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| abstract [GetGlyphById](../../aspose.font/font/getglyphbyid/)(GlyphId) | 通过字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。GlyphId - 派生对象。例如：Type1 的 ID 是字形名称，是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，是 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | 获取文本的字形表示。 |
| virtual [Save](../../aspose.font/font/save/#save)(Stream) | 将字体保存为原始格式。 |
| virtual [Save](../../aspose.font/font/save/#save_1)(string) | 将字体保存为原始格式。 |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | 将字体保存为指定格式。 |

### 另见

* interface [IFont](../ifont/)
* interface [IFontSaver](../ifontsaver/)
* interface [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


