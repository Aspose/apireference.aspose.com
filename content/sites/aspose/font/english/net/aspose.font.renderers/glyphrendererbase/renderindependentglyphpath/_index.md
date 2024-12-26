---
title: GlyphRendererBase.RenderIndependentGlyphPath
second_title: Aspose.Font for .NET API Reference
description: GlyphRendererBase method. Renders glyph using independent glyph path. RenderGlyph function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesnt changes original glyph path so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs
type: docs
weight: 20
url: /net/aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/
---
## GlyphRendererBase.RenderIndependentGlyphPath method

Renders glyph using independent glyph path. RenderGlyph() function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn't changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs.

```csharp
public void RenderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, 
    TransformationMatrix glyphPlacementMatrix)
```

| Parameter | Type | Description |
| --- | --- | --- |
| font | IFont | The font that contains the glyph. |
| glyphId | GlyphId | Physical glyph index inside Font. Note that this is not a unicode. |
| glyph | Glyph | Glyph to render. |
| glyphPlacementMatrix | TransformationMatrix | Matrix that is applied to glyph coordinates. |

### See Also

* interface [IFont](../../../aspose.font/ifont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* class [GlyphRendererBase](../)
* namespace [Aspose.Font.Renderers](../../../aspose.font.renderers/)
* assembly [Aspose.Font](../../../)


