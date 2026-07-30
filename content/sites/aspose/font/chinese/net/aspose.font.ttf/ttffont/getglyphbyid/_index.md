---
title: "TtfFont.GetGlyphById"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfFont 方法。根据字形 ID 返回字形。字形 ID 是针对字形的唯一编号，取决于字体类型。TTF 字体的字形 ID 可以是 GlyphStringId 类或 GlyphUInt32Id 类的实例。通过 Post 表映射支持使用名称字符串对 TTF 字体进行字形寻址。如果是 CFF 字体，则使用 CFF 结构通过名称来寻址字形。"
type: docs
weight: 180
url: /zh/net/aspose.font.ttf/ttffont/getglyphbyid/
---
## GetGlyphById(GlyphId) {#getglyphbyid}

根据字形 ID 返回字形。字形 ID 是针对字形的唯一编号，取决于字体类型。TTF 字体的字形 ID 可以是 ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) 类或 ([`GlyphUInt32Id`](../../../aspose.font/glyphs/glyphuint32id/)) 类的实例。通过 Post 表映射支持使用名称（字符串）对 TTF 字体进行字形寻址。如果是 CFF 字体，则使用 CFF 结构通过名称来寻址字形。

```csharp
public override Glyph GetGlyphById(GlyphId id)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | GlyphId | 字形 id。 |

### 返回值

字形。

### 另见

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphById(string) {#getglyphbyid_1}

根据字形名称返回字形。名称（string）字形寻址在 TTF 字体中通过 Post 表映射得到支持。若字体为 CFF，则使用 CFF 结构通过名称寻址字形。

```csharp
public Glyph GetGlyphById(string glyphName)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | String | 字形字符串标识符。 |

### 返回值

字形。

### 另见

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphById(uint) {#getglyphbyid_2}

根据字形 id 返回字形。

```csharp
public Glyph GetGlyphById(uint id)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | UInt32 | 字形索引。 |

### 返回值

字形。

### 另见

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


