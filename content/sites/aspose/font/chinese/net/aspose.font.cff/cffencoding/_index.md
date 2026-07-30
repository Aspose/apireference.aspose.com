---
title: "类 CffEncoding"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Cff.CffEncoding 类。表示 CFF 字体编码"
type: docs
weight: 20
url: /zh/net/aspose.font.cff/cffencoding/
---
## CffEncoding class

表示 CFF 字体编码。

```csharp
public class CffEncoding : IFontEncoding, ISupportsNameAddressing
```

## 方法

| 名称 | 描述 |
| --- | --- |
| [DecodeToGid](../../aspose.font.cff/cffencoding/decodetogid/)(uint) | 获取传入的 charCode 对应的 Gid。此方法针对 CFF CIDFonts 设计，其中 charCode 必须是有效的 CID 值。Glyph id 是字形的唯一编号，取决于字体类型。CFF 字体的 glyph id 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| [DecodeToGidParameterized](../../aspose.font.cff/cffencoding/decodetogidparameterized/)(IEncodingParameters, uint) | 参数化解码方法。不支持 CFF 字体类型。 |
| [Encode](../../aspose.font.cff/cffencoding/encode/)(uint, uint) | 对字形进行编码。不支持 CFF 字体类型。 |
| [GetNameToCharCodeIndex](../../aspose.font.cff/cffencoding/getnametocharcodeindex/)() | 返回名称到字符码的编码映射。注意：字符码不是 Unicode。字符码是字体编码 "表" 中的字符索引。 |
| [GetNameToGidIndex](../../aspose.font.cff/cffencoding/getnametogidindex/)() | 返回名称到字符码的编码映射。注意：字符码不是 Unicode。字符码是字体编码 "表" 中的字符索引。 |
| [GetNameToSidIndex](../../aspose.font.cff/cffencoding/getnametosidindex/)() | 返回名称到字符码的编码映射。注意：字符码不是 Unicode。字符码是字体编码 "表" 中的字符索引。 |
| [GetSidName](../../aspose.font.cff/cffencoding/getsidname/)(int) | 获取指定 SID 的名称。 |
| [GidToUnicode](../../aspose.font.cff/cffencoding/gidtounicode/)(GlyphId) | 将 Gid 解码为 unicode。Glyph id 是字形的唯一编号，取决于字体类型。CFF 字体的 glyph id 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |
| [UnicodeToGid](../../aspose.font.cff/cffencoding/unicodetogid/)(uint) | 将 unicode 解码并返回 glyph id。Glyph id 是字形的唯一编号，取决于字体类型。CFF 字体的 glyph id 可以是 ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) 类的实例。 |

### 另见

* interface [IFontEncoding](../../aspose.font/ifontencoding/)
* interface [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* namespace [Aspose.Font.Cff](../../aspose.font.cff/)
* assembly [Aspose.Font](../../)


