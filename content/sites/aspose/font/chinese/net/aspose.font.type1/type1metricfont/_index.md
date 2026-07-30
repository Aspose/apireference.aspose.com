---
title: "类 Type1MetricFont"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Type1.Type1MetricFont 类。Type1 度量字体实现。此 type1 字体仅使用度量创建。需要真实字体的字形检索函数以及其他一些功能不被允许，调用这些不允许的函数会抛出异常 Type1NotSupportedException。其他属性 FontName、Weight、Metrics 和 Encoding 均取自度量文件。"
type: docs
weight: 1480
url: /zh/net/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class

Type1 度量字体实现。此 Type1 字体仅使用度量创建。检索字形的函数以及其他需要真实字体的功能均不被允许，不允许的函数会抛出 Type1NotSupportedException 异常。其他属性（FontName、Weight、Metrics 和 Encoding）取自度量文件。

```csharp
public class Type1MetricFont : Type1Font
```

## 属性

| 名称 | 描述 |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1metricfont/encoding/) { get; } | 编码在度量文件中定义。StandardAdobeEncoding：该编码会自动填充。 |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition/) { get; } | 获取字体定义。 |
| override [FontFamily](../../aspose.font.type1/type1metricfont/fontfamily/) { get; } | 获取字体族。 |
| override [FontName](../../aspose.font.type1/type1metricfont/fontname/) { get; } | 获取字体名称。 |
| override [FontNames](../../aspose.font.type1/type1font/fontnames/) { get; } | 获取字体名称。 |
| [FontSaver](../../aspose.font/font/fontsaver/) { get; } | 获取字体保存功能。 |
| override [FontStyle](../../aspose.font.type1/type1metricfont/fontstyle/) { get; } | 获取字体样式。这是一个计算后并以通用类型表示的值。 |
| override [FontType](../../aspose.font.type1/type1font/fonttype/) { get; } | 获取字体类型。返回 FontType.Type1 值。 |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor/) { get; } | 字体字形访问器。检索字形及其标识符。 |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype/) { get; } | 字形 ID 类型规范。 |
| override [Metrics](../../aspose.font.type1/type1font/metrics/) { get; } | 获取字体度量。 |
| override [NumGlyphs](../../aspose.font.type1/type1metricfont/numglyphs/) { get; } | 获取字体中的字形数量。 |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames/) { get; } | 获取 PostScript 字体名称。 |
| override [Style](../../aspose.font.type1/type1metricfont/style/) { get; } | 获取字体样式。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert/)(FontType) | 将字体转换为其他格式。 |
| override [GetAllGlyphIds](../../aspose.font.type1/type1metricfont/getallglyphids/)() | 返回字体中所有可用的字形 ID。`Type1MetricFont` 类型不支持此操作。 |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid/#getglyphbyid)(GlyphId) | 返回字形 ID 对应的字形。不支持 `Type1MetricFont` 类型。 |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid/#getglyphbyid_1)(string) | 返回字形 ID 对应的字形。不支持 `Type1MetricFont` 类型。 |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid/)(uint) | 根据字形 id 返回字形。 |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext/)(string) | 获取文本的字形表示。 |
| virtual [Save](../../aspose.font/font/save/)(Stream) | 将字体保存为原始格式。 |
| virtual [Save](../../aspose.font/font/save/)(string) | 将字体保存为原始格式。 |
| [SaveToFormat](../../aspose.font/font/savetoformat/)(Stream, FontSavingFormats) | 将字体保存为指定格式。 |

## 示例

注意：如果度量文件将 Encoding 定义为 \"FontSpecific\"，用户应按以下方式提供特定编码：

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u\"space\", u\"a1\", ...}); FontEnvironment::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u\"ZapfDingbats\", zapfDingbatsEncoding);

### 另见

* class [Type1Font](../type1font/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


