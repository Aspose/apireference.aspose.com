---
title: "接口 IFontEncoding"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.IFontEncoding 接口。定义用于字体编码的接口"
type: docs
weight: 490
url: /zh/net/aspose.font/ifontencoding/
---
## IFontEncoding interface

定义 Font 编码的接口。

```csharp
public interface IFontEncoding
```

## 方法

| 名称 | 描述 |
| --- | --- |
| [DecodeToGid](../../aspose.font/ifontencoding/decodetogid/)(uint) | 解码字符码并返回字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，属于 ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) 类的实例。注意：字符码不一定是 Unicode。字符码是字体编码 "table" 中的字符索引。 |
| [DecodeToGidParameterized](../../aspose.font/ifontencoding/decodetogidparameterized/)(IEncodingParameters, uint) | 参数化的解码方法。某些字体类型可能拥有多种编码算法/映射。因此，使用 [`IEncodingParameters`](../iencodingparameters/) 接口来创建具体的字体编码参数。 |
| [Encode](../../aspose.font/ifontencoding/encode/)(uint, uint) | 对字形进行编码。对于 TTF 字体，charCode 为 Unicode。 |
| [GidToUnicode](../../aspose.font/ifontencoding/gidtounicode/)(GlyphId) | 将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例。TTF 的 id 是整数索引，是 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| [UnicodeToGid](../../aspose.font/ifontencoding/unicodetogid/)(uint) | 解码 Unicode 并返回字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，属于 ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) 类的实例。 |

### 另见

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


