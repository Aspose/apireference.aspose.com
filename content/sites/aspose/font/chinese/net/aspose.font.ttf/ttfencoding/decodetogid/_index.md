---
title: "TtfEncoding.DecodeToGid"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfEncoding 方法。TTF 字体的 DecodeToGlyphId 实现会查找 unicode 表并返回对应 unicode 字符的 glyph id。glyph id 是针对字形的唯一编号，取决于字体类型。例如，Type1 的 id 是 GlyphStringId 类的字形名称实例。TTF 的 id 是 GlyphUInt32Id 类的整数索引实例。"
type: docs
weight: 10
url: /zh/net/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding.DecodeToGid method

TTF 字体的 DecodeToGlyphId 实现会查找 unicode 表并返回对应 unicode 字符的 glyph id。glyph id 是针对字形的唯一编号，取决于字体类型。例如：Type1 的 id 是 glyph 名称，属于 ([`GlyphStringId`](../../../aspose.font/glyphs/glyphstringid/)) 类的实例。TTF 的 id 是整数索引，属于 ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)) 类的实例。

```csharp
public GlyphId DecodeToGid(uint unicode)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | UInt32 | 用于获取 glyph 标识符的字符代码。 |

### 返回值

传入的字符代码对应的 glyph 标识符。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [TtfEncoding](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


