---
title: "IFontEncoding.DecodeToGid"
second_title: "Aspose.Font for .NET API 参考"
description: "IFontEncoding 方法。解码字符码并返回字形 ID。字形 ID 是针对字形的唯一编号，取决于字体类型。例如，Type1 的 ID 是 GlyphStringId 类的字形名称实例。TTF 的 ID 是 GlyphUInt32Id 类的整数索引实例。注意，字符码不一定是 Unicode。字符码是字体编码表中的字符索引。"
type: docs
weight: 10
url: /zh/net/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding.DecodeToGid method

解码字符码并返回字形 ID。字形 ID 是针对字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，属于 ([`GlyphUInt32Id`](../../../aspose.font/glyphuint32id/)) 类的实例。注意：字符码不一定是 Unicode。字符码是字体编码 “表” 中的字符索引。

```csharp
public GlyphId DecodeToGid(uint charCode)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCode | UInt32 | 用于获取 glyph 标识符的字符代码。 |

### 返回值

与传入的 charCode 相关的字形标识符。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


