---
title: "类 Type1Font"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Type1.Type1Font 类。表示 Type1 字体"
type: docs
weight: 1460
url: /zh/net/aspose.font.type1/type1font/
---
## Type1Font class

表示 Type1 字体。

```csharp
public class Type1Font : Font
```

## 属性

| 名称 | 描述 |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1font/encoding/) { get; } | 获取字体编码。 |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition/) { get; } | 获取字体定义。 |
| override [FontFamily](../../aspose.font.type1/type1font/fontfamily/) { get; set; } | 获取字体族。字体族的设置器尚未实现。 |
| override [FontName](../../aspose.font.type1/type1font/fontname/) { get; set; } | 获取字体族名称。字体族名称的 setter 尚未实现。 |
| override [FontNames](../../aspose.font.type1/type1font/fontnames/) { get; } | 获取字体名称。 |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | 获取字体保存功能。 |
| override [FontStyle](../../aspose.font.type1/type1font/fontstyle/) { get; } | 获取字体样式。这是一个计算后并以通用类型表示的值。 |
| override [FontType](../../aspose.font.type1/type1font/fonttype/) { get; } | 获取字体类型。返回 FontType.Type1 值。 |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | 字体字形访问器。检索字形及其标识符。 |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype/) { get; } | 字形 ID 类型规范。 |
| override [Metrics](../../aspose.font.type1/type1font/metrics/) { get; } | 获取字体度量。 |
| override [NumGlyphs](../../aspose.font.type1/type1font/numglyphs/) { get; } | 获取字体中的字形数量。 |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames/) { get; } | 获取 PostScript 字体名称。 |
| override [Style](../../aspose.font.type1/type1font/style/) { get; set; } | 获取字体样式。这是字体文件提供的原始字符串值。Style 的 setter 尚未实现。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert/)(FontType) | 将字体转换为其他格式。 |
| override [GetAllGlyphIds](../../aspose.font.type1/type1font/getallglyphids/)() | 返回字体中所有可用的字形 ID 数组。字形 ID 是字形的唯一编号，取决于字体类型。Type1 字体的字形 ID 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| override [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid)(GlyphId) | 根据字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。Type1 字体的字形 ID 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| virtual [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid_1)(string) | 根据字形 id 返回字形。 |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/#getglyphbyid_2)(uint) | 根据字形 id 返回字形。 |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | 获取文本的字形表示。 |
| virtual [Save](../../aspose.font/font/save/)(Stream) | 将字体保存为原始格式。 |
| virtual [Save](../../aspose.font/font/save/)(string) | 将字体保存为原始格式。 |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | 将字体保存为指定格式。 |

### 另见

* class [Font](../../aspose.font/font/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


