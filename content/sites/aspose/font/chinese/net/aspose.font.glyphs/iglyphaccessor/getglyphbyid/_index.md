---
title: "IGlyphAccessor.GetGlyphById"
second_title: "Aspose.Font for .NET API 参考"
description: "IGlyphAccessor 方法。返回通过字形 ID 获取的字形。字形 ID 是字形的唯一编号，取决于字体类型。GlyphId 派生对象。例如 Type1 的 ID 是 GlyphStringId 类的字形名称实例。TTF 的 ID 是 GlyphUInt32Id 类的整数索引实例"
type: docs
weight: 30
url: /zh/net/aspose.font.glyphs/iglyphaccessor/getglyphbyid/
---
## IGlyphAccessor.GetGlyphById method

返回通过字形 ID 获取的字形。字形 ID 是字形的唯一编号，取决于字体类型。GlyphId - 派生对象。例如：Type1 的 ID 是字形名称，实例为 ([`GlyphStringId`](../../glyphstringid/)) 类。TTF 的 ID 是整数索引，实例为 ([`GlyphUInt32Id`](../../glyphuint32id/)) 类。

```csharp
public Glyph GetGlyphById(GlyphId id)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | GlyphId | 字形 ID。 |

### 返回值

字形

### 另见

* class [Glyph](../../glyph/)
* class [GlyphId](../../glyphid/)
* interface [IGlyphAccessor](../)
* namespace [Aspose.Font.Glyphs](../../../aspose.font.glyphs/)
* assembly [Aspose.Font](../../../)


