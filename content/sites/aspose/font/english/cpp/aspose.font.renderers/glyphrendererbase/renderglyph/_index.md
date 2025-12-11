---
title: Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph method
linktitle: RenderGlyph
second_title: Aspose.Font for C++
description: 'Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph method. Renders glyph in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.renderers/glyphrendererbase/renderglyph/
---
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Renders glyph.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The [Font](../../../aspose.font/font/) that contains the glyph. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physical glyph index inside [Font](../../../aspose.font/font/). Note that this is not a unicode. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Renders glyph, an objective of this overloaded version - to be used with cache for glyphs.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
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
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Renders glyph.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The [Font](../../../aspose.font/font/) that contains the glyph. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physical glyph index inside [Font](../../../aspose.font/font/). Note that this is not a unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix that is applied to glyph coordinates. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Renders glyph.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The [Font](../../../aspose.font/font/) that contains the glyph. |
| glyphIndex | uint32_t | Physical glyph index inside [Font](../../../aspose.font/font/). Note that this is not a unicode. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Renders glyph.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | The [Font](../../../aspose.font/font/) that contains the glyph. |
| glyphIndex | uint32_t | Physical glyph index inside [Font](../../../aspose.font/font/). Note that this is not a unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix that is applied to glyph coordinates. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
