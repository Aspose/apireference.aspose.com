---
title: Class GlyphOutlineRenderer
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Renderers.GlyphOutlineRenderer class. Represents glyph outline renderer
type: docs
weight: 570
url: /net/aspose.font.renderers/glyphoutlinerenderer/
---
## GlyphOutlineRenderer class

Represents glyph outline renderer.

```csharp
public class GlyphOutlineRenderer : GlyphRendererBase
```

## Constructors

| Name | Description |
| --- | --- |
| [GlyphOutlineRenderer](glyphoutlinerenderer/)(IGlyphOutlinePainter) | Initializes new `GlyphOutlineRenderer` object. |

## Methods

| Name | Description |
| --- | --- |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId) | Renders glyph. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, uint) | Renders glyph. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId, TransformationMatrix) | Renders glyph. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, uint, TransformationMatrix) | Renders glyph. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/)(IFont, GlyphId, Glyph, TransformationMatrix) | Renders glyph, an objective of this overloaded version - to be used with cache for glyphs. |
| [RenderIndependentGlyphPath](../../aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/)(IFont, GlyphId, Glyph, TransformationMatrix) | Renders glyph using independent glyph path. RenderGlyph() function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn't changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs. |

### See Also

* class [GlyphRendererBase](../glyphrendererbase/)
* namespace [Aspose.Font.Renderers](../../aspose.font.renderers/)
* assembly [Aspose.Font](../../)


