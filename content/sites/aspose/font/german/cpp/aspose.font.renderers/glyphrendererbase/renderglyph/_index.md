---
title: "Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph Methode"
linktitle: "RenderGlyph"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph Methode. Rendert Glyph in C++."
type: docs
weight: 100
url: /de/cpp/aspose.font.renderers/glyphrendererbase/renderglyph/
---
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Rendert Glyph.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Der [Font](../../../aspose.font/font/) der das Glyph enthält. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physikalischer Glyph-Index innerhalb des [Font](../../../aspose.font/font/). Hinweis: Dies ist kein Unicode. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Rendert Glyph, ein Ziel dieser überladenen Version – zur Verwendung mit einem Cache für Glyphs.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Der Font, der das Glyph enthält. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physikalischer Glyph-Index innerhalb des [Font](../../../aspose.font/font/). Hinweis: Dies ist kein Unicode. |
| glyph | System::SharedPtr\<Glyphs::Glyph\> | Glyph zum Rendern. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix, die auf Glyph-Koordinaten angewendet wird. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Rendert Glyph.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Der [Font](../../../aspose.font/font/) der das Glyph enthält. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Physikalischer Glyph-Index innerhalb des [Font](../../../aspose.font/font/). Hinweis: Dies ist kein Unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix, die auf Glyph-Koordinaten angewendet wird. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Rendert Glyph.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Der [Font](../../../aspose.font/font/) der das Glyph enthält. |
| glyphIndex | uint32_t | Physikalischer Glyph-Index innerhalb des [Font](../../../aspose.font/font/). Hinweis: Dies ist kein Unicode. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Rendert Glyph.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Der [Font](../../../aspose.font/font/) der das Glyph enthält. |
| glyphIndex | uint32_t | Physikalischer Glyph-Index innerhalb des [Font](../../../aspose.font/font/). Hinweis: Dies ist kein Unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrix, die auf Glyph-Koordinaten angewendet wird. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
