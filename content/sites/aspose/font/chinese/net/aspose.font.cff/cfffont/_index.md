---
title: "类 CffFont"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Cff.CffFont 类。表示紧凑字体格式 CFF"
type: docs
weight: 30
url: /zh/net/aspose.font.cff/cfffont/
---
## CffFont class

表示紧凑字体格式（CFF）。

```csharp
public class CffFont : Font
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [CommonFontsSettings](../../aspose.font.cff/cfffont/commonfontssettings/) { get; set; } | 获取/设置 CFF 字体通用的设置。这些设置在不同场景中使用，并且可以针对每个单独的字体进行更改。 |
| override [Encoding](../../aspose.font.cff/cfffont/encoding/) { get; } | 获取字体编码。 |
| override [FontDefinition](../../aspose.font.cff/cfffont/fontdefinition/) { get; } | 获取字体定义。 |
| override [FontFamily](../../aspose.font.cff/cfffont/fontfamily/) { get; set; } | 获取字体族。字体族的设置器尚未实现。 |
| override [FontName](../../aspose.font.cff/cfffont/fontname/) { get; set; } | 获取或设置字体面名称。 |
| override [FontNames](../../aspose.font.cff/cfffont/fontnames/) { get; } | 获取字体名称。 |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | 获取字体保存功能。 |
| override [FontStyle](../../aspose.font.cff/cfffont/fontstyle/) { get; } | 获取字体样式。这是一个计算后并以通用类型表示的值。 |
| override [FontType](../../aspose.font.cff/cfffont/fonttype/) { get; } | 获取字体类型。返回 FontType.CFF 值。 |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | 字体字形访问器。检索字形及其标识符。 |
| override [GlyphIdType](../../aspose.font.cff/cfffont/glyphidtype/) { get; } | 获取字形 ID 类型规范。 |
| [IsCidKeyedFont](../../aspose.font.cff/cfffont/iscidkeyedfont/) { get; } | 获取指示字体为 cid-keyed 的值。 |
| override [Metrics](../../aspose.font.cff/cfffont/metrics/) { get; } | 获取字体度量。 |
| override [NumGlyphs](../../aspose.font.cff/cfffont/numglyphs/) { get; } | 获取字体中的字形数量。 |
| override [PostscriptNames](../../aspose.font.cff/cfffont/postscriptnames/) { get; } | 获取 PostScript 字体名称。 |
| override [Style](../../aspose.font.cff/cfffont/style/) { get; set; } | 获取或设置字体样式。这是由字体文件提供的原始字符串值。 |
| [TopDictDataProvider](../../aspose.font.cff/cfffont/topdictdataprovider/) { get; } | 获取 Top DICT INDEX 结构中第一个顶层 DICT 的访问器。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| override [Convert](../../aspose.font.cff/cfffont/convert/)(FontType) | 将字体转换为其他格式。 |
| override [GetAllGlyphIds](../../aspose.font.cff/cfffont/getallglyphids/)() | 返回字体中所有可用字形 ID 的数组。字形 ID 是字形的唯一编号，取决于字体类型。CFF 字体字形 ID 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| override [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid/#getglyphbyid)(GlyphId) | 通过字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。CFF 字体字形 ID 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid/#getglyphbyid_1)(string) | 通过字形名称返回字形。 |
| [GetGlyphById](../../aspose.font.cff/cfffont/getglyphbyid/#getglyphbyid_2)(uint) | 根据字形 id 返回字形。 |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | 获取文本的字形表示。 |
| [GetIndexDataProvider](../../aspose.font.cff/cfffont/getindexdataprovider/)(CffIndexProviderType) | 获取指定 CFF INDEX 结构类型的提供程序。 |
| virtual [Save](../../aspose.font/font/save/)(Stream) | 将字体保存为原始格式。 |
| virtual [Save](../../aspose.font/font/save/)(string) | 将字体保存为原始格式。 |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | 将字体保存为指定格式。 |

### 另见

* class [Font](../../aspose.font/font/)
* namespace [Aspose.Font.Cff](../../aspose.font.cff/)
* assembly [Aspose.Font](../../)


