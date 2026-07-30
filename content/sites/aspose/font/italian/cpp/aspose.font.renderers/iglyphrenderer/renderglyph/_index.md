---
title: "Metodo Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph"
linktitle: "RenderGlyph"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph metodo. Renderizza il glifo in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.renderers/iglyphrenderer/renderglyph/
---
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Renderizza il glifo.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Il font che contiene il glifo. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Indice fisico del glifo all'interno del font. Nota che questo non è un Unicode. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Renderizza il glifo, un obiettivo di questa versione sovraccaricata - da utilizzare con la cache per i glifi.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Il font che contiene il glifo. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Indice fisico del glifo all'interno del font. Nota che questo non è un Unicode. |
| glifo | System::SharedPtr\<Glyphs::Glyph\> | Glifo da renderizzare. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice applicata alle coordinate del glifo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Renderizza il glifo.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Il font che contiene il glifo. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Indice fisico del glifo all'interno del font. Nota che questo non è un Unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice applicata alle coordinate del glifo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Renderizza il glifo.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Il font che contiene il glifo. |
| glyphIndex | uint32_t | Indice fisico del glifo all'interno del font. Nota che questo non è un Unicode. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Renderizza il glifo.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Il font che contiene il glifo. |
| glyphIndex | uint32_t | Indice fisico del glifo all'interno del font. Nota che questo non è un Unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice applicata alle coordinate del glifo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
