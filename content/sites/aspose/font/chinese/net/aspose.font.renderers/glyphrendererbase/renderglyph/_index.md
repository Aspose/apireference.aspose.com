---
title: "GlyphRendererBase.RenderGlyph"
second_title: "Aspose.Font for .NET API 参考"
description: "GlyphRendererBase 方法。渲染字形"
type: docs
weight: 10
url: /zh/net/aspose.font.renderers/glyphrendererbase/renderglyph/
---
## RenderGlyph(IFont, uint) {#renderglyph_3}

渲染字形。

```csharp
public void RenderGlyph(IFont font, uint glyphIndex)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | IFont | 包含该字形的字体。 |
| glyphIndex | UInt32 | 字体内部的物理字形索引。请注意，这不是 Unicode。 |

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* class [GlyphRendererBase](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)

---

## RenderGlyph(IFont, uint, TransformationMatrix) {#renderglyph_4}

渲染字形。

```csharp
public void RenderGlyph(IFont font, uint glyphIndex, TransformationMatrix glyphPlacementMatrix)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | IFont | 包含该字形的字体。 |
| glyphIndex | UInt32 | 字体内部的物理字形索引。请注意，这不是 Unicode。 |
| glyphPlacementMatrix | TransformationMatrix | 应用于字形坐标的矩阵。 |

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* class [GlyphRendererBase](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)

---

## RenderGlyph(IFont, GlyphId) {#renderglyph}

渲染字形。

```csharp
public void RenderGlyph(IFont font, GlyphId glyphId)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | IFont | 包含该字形的字体。 |
| glyphId | GlyphId | 字体内部的物理字形索引。请注意，这不是 Unicode。 |

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [GlyphRendererBase](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)

---

## RenderGlyph(IFont, GlyphId, TransformationMatrix) {#renderglyph_2}

渲染字形。

```csharp
public void RenderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | IFont | 包含该字形的字体。 |
| glyphId | GlyphId | 字体内部的物理字形索引。请注意，这不是 Unicode。 |
| glyphPlacementMatrix | TransformationMatrix | 应用于字形坐标的矩阵。 |

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* class [GlyphRendererBase](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)

---

## RenderGlyph(IFont, GlyphId, Glyph, TransformationMatrix) {#renderglyph_1}

渲染字形，此重载版本的目标是用于字形缓存。

```csharp
public void RenderGlyph(IFont font, GlyphId glyphId, Glyph glyph, 
    TransformationMatrix glyphPlacementMatrix)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | IFont | 包含该字形的字体。 |
| glyphId | GlyphId | 字体内部的物理字形索引。请注意，这不是 Unicode。 |
| 字形 | 字形 | 待渲染的字形。 |
| glyphPlacementMatrix | TransformationMatrix | 应用于字形坐标的矩阵。 |

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* class [GlyphRendererBase](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)


