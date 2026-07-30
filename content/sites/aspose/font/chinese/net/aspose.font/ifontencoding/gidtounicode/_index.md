---
title: "IFontEncoding.GidToUnicode"
second_title: "Aspose.Font for .NET API 参考"
description: "IFontEncoding 方法。将 Gid 解码为 Unicode。Glyph id 是针对字形的唯一编号，取决于字体类型。例如，Type1 的 id 是 GlyphStringId 类的字形名称实例。TTF 的 id 是 GlyphUInt32Id 类的整数索引实例"
type: docs
weight: 40
url: /zh/net/aspose.font/ifontencoding/gidtounicode/
---
## IFontEncoding.GidToUnicode method

将 Gid 解码为 unicode。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ([`GlyphStringId`](../../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，属于 ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)) 类的实例。

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
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


