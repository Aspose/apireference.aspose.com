---
title: Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath method
linktitle: RenderIndependentGlyphPath
second_title: Aspose.Font for C++
description: 'Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath method. Renders glyph using independent glyph path. RenderGlyph() function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn''t changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.renderers/iglyphrenderer/renderindependentglyphpath/
---
## IGlyphRenderer::RenderIndependentGlyphPath method


Renders glyph using independent glyph path. [RenderGlyph()](../renderglyph/) function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn't changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The font that contains the glyph. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physical glyph index inside font. Note that this is not a unicode. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | Glyph to render. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix that is applied to glyph coordinates. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
