---
title: "IGlyphRenderer.RenderIndependentGlyphPath"
second_title: "Aspose.Font for .NET API 参考"
description: "IGlyphRenderer 方法。使用独立的 glyph 路径渲染 glyph。RenderGlyph 函数族在渲染时会更改 glyph 路径。这导致需要再次重新加载该 glyph。此函数使用 glyph 路径的副本，不会更改原始 glyph 路径，因此同一 glyph 可以多次重复使用。此函数版本旨在与 glyph 缓存一起使用。"
type: docs
weight: 20
url: /zh/net/aspose.font.renderers/iglyphrenderer/renderindependentglyphpath/
---
## IGlyphRenderer.RenderIndependentGlyphPath method

使用独立的字形路径渲染字形。RenderGlyph() 函数族在渲染时会更改字形路径，这会导致需要再次重新加载该字形。此函数使用字形路径的副本且不更改原始字形路径，因此同一字形可以多次重复使用。此函数版本旨在与字形缓存一起使用。

```csharp
public void RenderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, 
    TransformationMatrix glyphPlacementMatrix)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字体 | IFont | 包含该字形的字体。 |
| glyphId | GlyphId | 字体内部的物理 glyph 索引。注意，这不是 Unicode。 |
| 字形 | 字形 | 待渲染的字形。 |
| glyphPlacementMatrix | TransformationMatrix | 应用于字形坐标的矩阵。 |

### 另见

* interface [IFont](../../../aspose.font/ifont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* interface [IGlyphRenderer](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)


