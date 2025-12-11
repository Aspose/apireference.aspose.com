---
title: Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph method
linktitle: RenderGlyph
second_title: Aspose.Font for C++
description: 'Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph method. Renders glyph in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.renderers/iglyphrenderer/renderglyph/
---
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Renders glyph.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The font that contains the glyph. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physical glyph index inside font. Note that this is not a unicode. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Renders glyph, an objective of this overloaded version - to be used with cache for glyphs.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
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
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Renders glyph.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The font that contains the glyph. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physical glyph index inside font. Note that this is not a unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix that is applied to glyph coordinates. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Renders glyph.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The font that contains the glyph. |
| glyphIndex | uint32_t | Physical glyph index inside font. Note that this is not a unicode. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Renders glyph.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The font that contains the glyph. |
| glyphIndex | uint32_t | Physical glyph index inside font. Note that this is not a unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix that is applied to glyph coordinates. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
