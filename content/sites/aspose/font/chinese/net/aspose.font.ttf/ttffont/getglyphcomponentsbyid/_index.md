---
title: "TtfFont.GetGlyphComponentsById"
second_title: "Aspose.Font for .NET API 参考"
description: "TtfFont 方法。通过传入的字形标识符获取字形，并将该字形的组成字形标识符填充到传入的列表中。字形 id 是字形的唯一编号，取决于字体类型。TTF 字体的字形 id 可以是 GlyphStringId 类或 GlyphUInt32Id 类的实例。通过 Post 表映射支持使用名称字符串对 TTF 字体进行字形寻址。如果是 CFF 字体，则使用 CFF 结构通过名称来寻址字形。"
type: docs
weight: 190
url: /zh/net/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## GetGlyphComponentsById(GlyphId, GlyphIdList) {#getglyphcomponentsbyid}

获取传入的字形标识符对应的字形，并将该字形的组成字形标识符填充到传入的列表中。字形 id 是字形的唯一编号，取决于字体类型。TTF 字体的字形 id 可以是 ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) 类或 ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) 类的实例。名称（字符串）字形寻址通过 Post 表映射支持 TTF 字体。若为 CFF 字体，则使用 CFF 结构通过名称来寻址字形。

```csharp
public virtual void GetGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | GlyphId | 字形 id。 |
| componentsToPopulate | GlyphIdList | 要填充的字形标识符列表。 |

## 备注

应传入空集合 componentsToPopulate，以便其中包含字形组件 ID 列表。

### 另见

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphComponentsById(string, GlyphIdList) {#getglyphcomponentsbyid_1}

通过传入的字形名称获取字形，并用该字形的组件填充传入的字形标识符列表。

```csharp
public void GetGlyphComponentsById(string glyphName, GlyphIdList componentsToPopulate)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | String | 字形名称。 |
| componentsToPopulate | GlyphIdList | 要填充的字形标识符列表。 |

## 备注

应传入空集合 componentsToPopulate，以便其中包含字形组件 ID 列表。

### 另见

* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphComponentsById(uint, GlyphIdList) {#getglyphcomponentsbyid_2}

通过传入的字形索引获取字形，并用该字形的组件填充传入的字形标识符列表。

```csharp
public void GetGlyphComponentsById(uint id, GlyphIdList componentsToPopulate)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | UInt32 | 字形索引。 |
| componentsToPopulate | GlyphIdList | 要填充的字形标识符列表。 |

## 备注

应传入空集合 componentsToPopulate，以便其中包含字形组件 ID 列表。

### 另见

* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


