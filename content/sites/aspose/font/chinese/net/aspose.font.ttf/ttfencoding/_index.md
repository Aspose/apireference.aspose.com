---
title: "类 TtfEncoding"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Ttf.TtfEncoding 类。表示 TTF 字体编码"
type: docs
weight: 850
url: /zh/net/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class

表示 TTF 字体编码。

```csharp
public class TtfEncoding : IFontEncoding
```

## 方法

| 名称 | 描述 |
| --- | --- |
| [DecodeToGid](../../aspose.font.ttf/ttfencoding/decodetogid/)(uint) | TTF 字体的 DecodeToGlyphId 实现查找 unicode 表并返回 unicode 字符的字形 id。字形 id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，是 ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 id 是整数索引，是 ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) 类的实例。 |
| [DecodeToGidParameterized](../../aspose.font.ttf/ttfencoding/decodetogidparameterized/)(IEncodingParameters, uint) | 参数化版本允许使用特定的 CMap 表（非 unicode）。 |
| [Encode](../../aspose.font.ttf/ttfencoding/encode/)(uint, uint) | 对字形进行编码。对于 TTF 字体，字符码为 unicode。 |
| [GidToUnicode](../../aspose.font.ttf/ttfencoding/gidtounicode/)(GlyphId) | 将字形 id 解码为 unicode。字形 id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，是 ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 id 是整数索引，是 ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) 类的实例。 |
| [UnicodeToGid](../../aspose.font.ttf/ttfencoding/unicodetogid/)(uint) | 解码 unicode 并返回字形 id。 |

### 另见

* interface [IFontEncoding](../../aspose.font/ifontencoding/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


