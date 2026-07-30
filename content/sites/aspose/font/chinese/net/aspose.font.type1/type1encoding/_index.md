---
title: "类 Type1Encoding"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Type1.Type1Encoding 类。表示 Type1 字体编码"
type: docs
weight: 1450
url: /zh/net/aspose.font.type1/type1encoding/
---
## Type1Encoding class

表示 Type1 字体编码。

```csharp
public class Type1Encoding : IFontEncoding, ISupportsNameAddressing
```

## 方法

| 名称 | 描述 |
| --- | --- |
| [DecodeToGid](../../aspose.font.type1/type1encoding/decodetogid/)(uint) | 将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例。TTF 的 id 是整数索引，是 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| [DecodeToGidParameterized](../../aspose.font.type1/type1encoding/decodetogidparameterized/)(IEncodingParameters, uint) | 参数化解码方法。不支持 Type1 字体类型。 |
| [Encode](../../aspose.font.type1/type1encoding/encode/)(uint, uint) | 对字形进行编码。对于 TTF 字体，字符码是 unicode。不支持 Type1 字体类型。 |
| [GetNameToCharCodeIndex](../../aspose.font.type1/type1encoding/getnametocharcodeindex/)() | 返回名称到字符码的编码映射。注意：字符码不是 Unicode。字符码是字体编码 "表" 中的字符索引。 |
| [GidToUnicode](../../aspose.font.type1/type1encoding/gidtounicode/)(GlyphId) | 将 Gid 解码为 Unicode。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，是 ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 id 是整数索引，是 ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) 类的实例。 |
| [UnicodeToGid](../../aspose.font.type1/type1encoding/unicodetogid/)(uint) | 返回对应 unicode 的 GlyphId。如果字体不包含该 unicode 的字形，则返回 notdef。Glyph id 是字形的唯一编号，取决于字体类型。例如：Type1 的 id 是字形名称，是 ([`GlyphStringId`](../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 id 是整数索引，是 ([`GlyphUInt32Id`](../../aspose.font/glyphs/glyphuint32id/)) 类的实例。 |

### 另见

* interface [IFontEncoding](../../aspose.font/ifontencoding/)
* interface [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


