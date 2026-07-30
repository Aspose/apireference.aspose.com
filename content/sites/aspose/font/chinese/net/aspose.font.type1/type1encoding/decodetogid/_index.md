---
title: "Type1Encoding.DecodeToGid"
second_title: "Aspose.Font for .NET API 参考"
description: "Type1Encoding 方法。将 Gid 解码为 unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如，Type1 的 ID 是 GlyphStringId 类的字形名称实例。TTF 的 ID 是 GlyphUInt32Id 类的整数索引实例。"
type: docs
weight: 10
url: /zh/net/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding.DecodeToGid method

将 Gid 解码为 unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ([`GlyphStringId`](../../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，属于 ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)) 类的实例。

```csharp
public GlyphId DecodeToGid(uint charCode)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| charCode | UInt32 | 用于获取 glyph 标识符的字符代码。 |

### 返回值

传入的字符代码对应的 glyph 标识符。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [Type1Encoding](../)
* namespace [Aspose.Font.Type1](../../../aspose.font.type1/)
* assembly [Aspose.Font](../../../)


