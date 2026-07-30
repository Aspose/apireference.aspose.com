---
title: "IFontEncoding.UnicodeToGid"
second_title: "Aspose.Font for .NET API 参考"
description: "IFontEncoding 方法。解码 Unicode 并返回字形 ID。字形 ID 是针对字形的唯一编号，取决于字体类型。例如，Type1 的 ID 是 GlyphStringId 类的字形名称实例。TTF 的 ID 是 GlyphUInt32Id 类的整数索引实例。"
type: docs
weight: 50
url: /zh/net/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding.UnicodeToGid method

解码 Unicode 并返回字形 ID。字形 ID 是针对字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) 类的实例。TTF 的 ID 是整数索引，属于 ([`GlyphUInt32Id`](../../../aspose.font/glyphuint32id/)) 类的实例。

```csharp
public GlyphId UnicodeToGid(uint unicode)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | UInt32 | 用于获取 glyph 标识符的 Unicode。 |

### 返回值

传入的 Unicode 对应的 glyph 标识符。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


