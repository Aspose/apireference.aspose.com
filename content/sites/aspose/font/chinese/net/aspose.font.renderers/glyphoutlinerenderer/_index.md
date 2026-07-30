---
title: "类 GlyphOutlineRenderer"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Renderers.GlyphOutlineRenderer 类。表示字形轮廓渲染器"
type: docs
weight: 570
url: /zh/net/aspose.font.renderers/glyphoutlinerenderer/
---
## GlyphOutlineRenderer class

表示字形轮廓渲染器。

```csharp
public class GlyphOutlineRenderer : GlyphRendererBase
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [GlyphOutlineRenderer](glyphoutlinerenderer/)(IGlyphOutlinePainter) | 初始化新的 `GlyphOutlineRenderer` 对象。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, uint) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId, TransformationMatrix) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, uint, TransformationMatrix) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId, Glyph, TransformationMatrix) | 渲染字形，此重载版本的目标是用于字形缓存。 |
| [RenderIndependentGlyphPath](../../aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/)(IFont, GlyphId, Glyph, TransformationMatrix) | 使用独立的字形路径渲染字形。RenderGlyph() 函数族在渲染时会更改字形路径，这会导致需要再次重新加载该字形。此函数使用字形路径的副本且不更改原始字形路径，因此同一字形可以多次重复使用。此函数版本旨在与字形缓存一起使用。 |

### 另见

* class [GlyphRendererBase](../glyphrendererbase/)
* namespace [Aspose.Font.Renderers](../../aspose.font.renderers/)
* assembly [Aspose.Font](../../)


