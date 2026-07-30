---
title: "类 TtfFont"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Ttf.TtfFont 类。表示 TrueType 字体 TTF"
type: docs
weight: 870
url: /zh/net/aspose.font.ttf/ttffont/
---
## TtfFont class

表示 TrueType 字体（TTF）。

```csharp
public class TtfFont : Font
```

## 属性

| 名称 | 描述 |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont/) { get; } | 获取 CFF 字体（如果存在）。 |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding/) { get; } | 获取字体编码。 |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition/) { get; } | 获取字体定义。 |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily/) { get; set; } | 获取或设置字体族。 |
| override [FontName](../../aspose.font.ttf/ttffont/fontname/) { get; set; } | 获取或设置字体面名称。 |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames/) { get; } | 获取字体名称。 |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | 获取字体保存功能。 |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle/) { get; } | 获取字体样式。这是一个计算后并以通用类型表示的值。 |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype/) { get; } | 获取字体类型。返回 FontType.TTF 值。 |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | 字体字形访问器。检索字形及其标识符。 |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype/) { get; } | 获取字形 ID 类型规范。 |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic/) { get; } | 如果字体是符号字体，则返回 true。 |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics/) { get; } | 获取字体度量。 |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs/) { get; } | 获取字体中的字形数量。 |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames/) { get; } | 获取 Postscript 字体名称。 |
| override [Style](../../aspose.font.ttf/ttffont/style/) { get; set; } | 获取或设置字体样式。这是由字体文件提供的原始字符串值。 |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables/) { get; } | 获取 TTF 表。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert/#convert)(FontType) | 将字体转换为其他格式。 |
| [Convert](../../aspose.font.ttf/ttffont/convert/#convert_1)(FontType, ICollection&lt;uint&gt;) | 在限制字符集的情况下将字体转换为其他格式 |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids/)() | 返回字体中所有可用字形 id 的数组。字形 id 是字形的唯一编号，取决于字体类型。TTF 字体的字形 id 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。名称（string）字形寻址在 TTF 字体中通过 Post 表映射得到支持。若字体为 CFF，则使用 CFF 结构通过名称寻址字形。 |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid)(GlyphId) | 根据字形 id 返回字形。字形 id 是字形的唯一编号，取决于字体类型。TTF 字体的字形 id 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。名称（string）字形寻址在 TTF 字体中通过 Post 表映射得到支持。若字体为 CFF，则使用 CFF 结构通过名称寻址字形。 |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid_1)(string) | 根据字形名称返回字形。名称（string）字形寻址在 TTF 字体中通过 Post 表映射得到支持。若字体为 CFF，则使用 CFF 结构通过名称寻址字形。 |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid/#getglyphbyid_2)(uint) | 根据字形 id 返回字形。 |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | 获取通过传入的字形标识符的字形，并用该字形的组件填充传入的字形标识符列表。字形 id 是字形的唯一编号，取决于字体类型。TTF 字体的字形 id 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。支持通过 Post 表映射的名称（字符串）字形寻址用于 TTF 字体。若为 CFF 字体，则使用 CFF 结构通过名称寻址字形。 |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid_1)(string, GlyphIdList) | 通过传入的字形名称获取字形，并用该字形的组件填充传入的字形标识符列表。 |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid/#getglyphcomponentsbyid_2)(uint, GlyphIdList) | 通过传入的字形索引获取字形，并用该字形的组件填充传入的字形标识符列表。 |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext/)(string) | 获取文本的字形表示。 |
| virtual [Save](../../aspose.font/font/save/)(Stream) | 将字体保存为原始格式。 |
| virtual [Save](../../aspose.font/font/save/)(string) | 将字体保存为原始格式。 |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | 将字体保存为指定格式。 |

### 另见

* class [Font](../../aspose.font/font/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


