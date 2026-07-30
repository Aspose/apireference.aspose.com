---
title: "Méthode Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph"
linktitle: "RenderGlyph"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph méthode. Rend le glyphe en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.renderers/iglyphrenderer/renderglyph/
---
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Rend le glyphe.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| police | System::SharedPtr\<IFont\> | La police qui contient le glyphe. |
| idGlyph | System::SharedPtr\<Glyphs::GlyphId\> | Indice de glyphe physique dans la police. Notez que ce n'est pas un Unicode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Rend le glyphe, un objectif de cette version surchargée - à utiliser avec le cache des glyphes.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| police | System::SharedPtr\<IFont\> | La police qui contient le glyphe. |
| idGlyph | System::SharedPtr\<Glyphs::GlyphId\> | Indice de glyphe physique dans la police. Notez que ce n'est pas un Unicode. |
| glyphe | System::SharedPtr\<Glyphs::Glyph\> | Glyphe à rendre. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice appliquée aux coordonnées du glyphe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Rend le glyphe.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| police | System::SharedPtr\<IFont\> | La police qui contient le glyphe. |
| idGlyph | System::SharedPtr\<Glyphs::GlyphId\> | Indice de glyphe physique dans la police. Notez que ce n'est pas un Unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice appliquée aux coordonnées du glyphe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Rend le glyphe.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| police | System::SharedPtr\<IFont\> | La police qui contient le glyphe. |
| glyphIndex | uint32_t | Indice de glyphe physique dans la police. Notez que ce n'est pas un Unicode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Rend le glyphe.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| police | System::SharedPtr\<IFont\> | La police qui contient le glyphe. |
| glyphIndex | uint32_t | Indice de glyphe physique dans la police. Notez que ce n'est pas un Unicode. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice appliquée aux coordonnées du glyphe. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
