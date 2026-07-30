---
title: "类 GlyphRendererBase"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.Renderers.GlyphRendererBase 类。表示字形渲染器的基类"
type: docs
weight: 580
url: /zh/net/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class

表示字形渲染器的基类。

```csharp
public abstract class GlyphRendererBase : IGlyphRenderer
```

## 方法

| 名称 | 描述 |
| --- | --- |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph)(IFont, GlyphId) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_3)(IFont, uint) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_2)(IFont, GlyphId, TransformationMatrix) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_4)(IFont, uint, TransformationMatrix) | 渲染字形。 |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_1)(IFont, GlyphId, Glyph, TransformationMatrix) | 渲染字形，此重载版本的目标是用于字形缓存。 |
| [RenderIndependentGlyphPath](../../aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/)(IFont, GlyphId, Glyph, TransformationMatrix) | 使用独立的字形路径渲染字形。RenderGlyph() 函数族在渲染时会更改字形路径，这会导致需要再次重新加载该字形。此函数使用字形路径的副本且不更改原始字形路径，因此同一字形可以多次重复使用。此函数版本旨在与字形缓存一起使用。 |

### 另见

* interface [IGlyphRenderer](../iglyphrenderer/)
* namespace [Aspose.Font.Renderers](../../aspose.font.renderers/)
* assembly [Aspose.Font](../../)


