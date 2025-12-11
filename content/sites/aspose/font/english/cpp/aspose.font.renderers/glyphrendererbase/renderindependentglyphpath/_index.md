---
title: Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath method
linktitle: RenderIndependentGlyphPath
second_title: Aspose.Font for C++
description: 'Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath method. Renders glyph using independent glyph path. RenderGlyph() function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn''t changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/
---
## GlyphRendererBase::RenderIndependentGlyphPath method


Renders glyph using independent glyph path. [RenderGlyph()](../renderglyph/) function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn't changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The font that contains the glyph. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physical glyph index inside [Font](../../../aspose.font/font/). Note that this is not a unicode. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | Glyph to render. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix that is applied to glyph coordinates. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
