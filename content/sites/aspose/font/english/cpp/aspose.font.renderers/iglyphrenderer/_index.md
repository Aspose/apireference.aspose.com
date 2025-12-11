---
title: Aspose::Font::Renderers::IGlyphRenderer class
linktitle: IGlyphRenderer
second_title: Aspose.Font for C++
description: 'Aspose::Font::Renderers::IGlyphRenderer class. Interface used to render glyphs in C++.'
type: docs
weight: 300
url: /cpp/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer class


Interface used to render glyphs.

```cpp
class IGlyphRenderer : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) | Renders glyph. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) | Renders glyph. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) | Renders glyph. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) | Renders glyph. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Renders glyph, an objective of this overloaded version - to be used with cache for glyphs. |
| virtual [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Renders glyph using independent glyph path. [RenderGlyph()](./renderglyph/) function family changes glyph path on rendering. It then leads to necessity reload this glyph again. This function uses copy of glyph path and doesn't changes original glyph path, so the same glyph could be reused multiple times. This version of function is intended for use with cache of glyphs. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
