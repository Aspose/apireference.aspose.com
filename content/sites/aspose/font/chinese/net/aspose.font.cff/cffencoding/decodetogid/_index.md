---
title: "CffEncoding.DecodeToGid"
second_title: "Aspose.Font for .NET API 参考"
description: "CffEncoding 方法。获取传入 charCode 的 Gid。此方法针对 CFF CIDFonts 设计，其中 charCode 必须是有效的 CID 值。Glyph id 是字形的唯一编号，取决于字体类型。CFF Font 的 glyph id 可以是 GlyphStringId 类或 GlyphUInt32Id 类的实例。"
type: docs
weight: 10
url: /zh/net/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding.DecodeToGid method

获取传入的 charCode 的 Gid。此方法专为 CFF CIDFonts 设计，其中 charCode 必须是有效的 CID 值。Glyph id 是字形的唯一编号，取决于字体类型。CFF 字体的 glyph id 可以是 ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) 类的实例或 ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)) 类的实例。

```csharp
public GlyphId DecodeToGid(uint charCode)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCode | UInt32 | 用于获取字形标识符的字符代码（CID）。 |

### 返回值

与传入的 CID 相关的字形标识符。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [CffEncoding](../)
* namespace [Aspose.Font.Cff](../../../aspose.font.cff/)
* assembly [Aspose.Font](../../../)


