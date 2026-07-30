---
title: "Type1Encoding.GidToUnicode"
second_title: "Aspose.Font for .NET API 参考"
description: "Type1Encoding 方法。将 Gid 解码为 Unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如，Type1 的 ID 是 GlyphStringId 类的字形名称实例。TTF 的 ID 是 GlyphUInt32Id 类的整数索引实例。"
type: docs
weight: 50
url: /zh/net/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding.GidToUnicode method

将 Gid 解码为 Unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，属于 ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) 类的实例。

```csharp
public uint GidToUnicode(GlyphId gid)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| gid | GlyphId | 要解码的符号的 glyph 标识符。 |

### 返回值

传入的 glyph id 对应的 Unicode 值。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [Type1Encoding](../)
* namespace [Aspose.Font.Type1](../../../aspose.font.type1/)
* assembly [Aspose.Font](../../../)


