---
title: "méthode Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph"
linktitle: "RenderGlyph"
second_title: "Aspose.Font pour C++"
description: "méthode Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph. Rend le glyphe en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.renderers/glyphrendererbase/renderglyph/
---
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Rend le glyphe.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Le [Font](../../../aspose.font/font/) qui contient le glyphe. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Indice physique du glyphe à l'intérieur du [Font](../../../aspose.font/font/). Notez que ce n'est pas un unicode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Rend le glyphe, un objectif de cette version surchargée - à utiliser avec le cache des glyphes.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| police | System::SharedPtr\<IFont\> | La police qui contient le glyphe. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Indice physique du glyphe à l'intérieur du [Font](../../../aspose.font/font/). Notez que ce n'est pas un unicode. |
| glyphe | System::SharedPtr\<Glyphs::Glyph\> | Glyphe à rendre. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice appliquée aux coordonnées du glyphe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Rend le glyphe.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Le [Font](../../../aspose.font/font/) qui contient le glyphe. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Indice physique du glyphe à l'intérieur du [Font](../../../aspose.font/font/). Notez que ce n'est pas un unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice appliquée aux coordonnées du glyphe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Rend le glyphe.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Le [Font](../../../aspose.font/font/) qui contient le glyphe. |
| glyphIndex | uint32_t | Indice physique du glyphe à l'intérieur du [Font](../../../aspose.font/font/). Notez que ce n'est pas un unicode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Rend le glyphe.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Le [Font](../../../aspose.font/font/) qui contient le glyphe. |
| glyphIndex | uint32_t | Indice physique du glyphe à l'intérieur du [Font](../../../aspose.font/font/). Notez que ce n'est pas un unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice appliquée aux coordonnées du glyphe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
