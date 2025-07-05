---
title: Class GlyphRendererBase
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Renderers.GlyphRendererBase class. Represents base class for glyph renderers
type: docs
weight: 580
url: /net/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class

Represents base class for glyph renderers.

```csharp
public abstract class GlyphRendererBase : IGlyphRenderer
```

## Methods

| Name | Description |
| --- | --- |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph)(IFont, GlyphId) | Renders glyph. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_3)(IFont, uint) | Renders glyph. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_2)(IFont, GlyphId, TransformationMatrix) | Renders glyph. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_4)(IFont, uint, TransformationMatrix) | Renders glyph. |
| [RenderGlyph](../../aspose.font.renderers/glyphrendererbase/renderglyph/#renderglyph_1)(IFont, GlyphId, Glyph, TransformationMatrix) | Renders glyph, an objective of this overloaded version - to be used with cache for glyphs. |
| [RenderIndependentGlyphPath](../../aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/)(IFont, GlyphId, Glyph, TransformationMatrix) | Renders glyph using independent glyph path. RenderGlyph() function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn't changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs. |

### See Also

* interface [IGlyphRenderer](../iglyphrenderer/)
* namespace [Aspose.Font.Renderers](../../aspose.font.renderers/)
* assembly [Aspose.Font](../../)


