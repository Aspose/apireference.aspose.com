---
title: "接口 IGlyphRenderer"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Renderers.IGlyphRenderer 接口。用于渲染字形的接口"
type: docs
weight: 590
url: /zh/net/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer interface

用于渲染字形的接口。

```csharp
public interface IGlyphRenderer
```

## 方法

| 名称 | 描述 |
| --- | --- |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph)(IFont, GlyphId) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph_3)(IFont, uint) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph_2)(IFont, GlyphId, TransformationMatrix) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph_4)(IFont, uint, TransformationMatrix) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/iglyphrenderer/renderglyph/#renderglyph_1)(IFont, GlyphId, Glyph, TransformationMatrix) | 渲染字形，此重载版本的目标是用于字形缓存。 |
| [RenderIndependentGlyphPath](../../aspose.font.renderers/iglyphrenderer/renderindependentglyphpath/)(IFont, GlyphId, Glyph, TransformationMatrix) | 使用独立的字形路径渲染字形。RenderGlyph() 函数族在渲染时会更改字形路径，这会导致需要再次重新加载该字形。此函数使用字形路径的副本且不更改原始字形路径，因此同一字形可以多次重复使用。此函数版本旨在与字形缓存一起使用。 |

### 另见

* namespace [Aspose.Font.Renderers](../../aspose.font.renderers/)
* assembly [Aspose.Font](../../)


