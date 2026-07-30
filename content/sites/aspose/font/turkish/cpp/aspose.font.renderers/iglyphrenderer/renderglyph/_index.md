---
title: "Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph yöntemi"
linktitle: "RenderGlyph"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph yöntemi. C++'ta glifi render eder."
type: docs
weight: 100
url: /tr/cpp/aspose.font.renderers/iglyphrenderer/renderglyph/
---
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Glifi render eder.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren font. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Yazı tipindeki fiziksel glif indeksi. Bunun bir Unicode olmadığını unutmayın. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Glifi render eder, bu aşırı yüklenmiş sürümün amacı - glif önbelleğiyle kullanılmak içindir.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren font. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Yazı tipindeki fiziksel glif indeksi. Bunun bir Unicode olmadığını unutmayın. |
| glif | System::SharedPtr\<Glyphs::Glyph\> | Renderlenecek glif. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Glif koordinatlarına uygulanan matris. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Glifi render eder.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren font. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Yazı tipindeki fiziksel glif indeksi. Bunun bir Unicode olmadığını unutmayın. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Glif koordinatlarına uygulanan matris. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Glifi render eder.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren font. |
| glyphIndex | uint32_t | Yazı tipindeki fiziksel glif indeksi. Bunun bir Unicode olmadığını unutmayın. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## IGlyphRenderer::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Glifi render eder.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren font. |
| glyphIndex | uint32_t | Yazı tipindeki fiziksel glif indeksi. Bunun bir Unicode olmadığını unutmayın. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Glif koordinatlarına uygulanan matris. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [IGlyphRenderer](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
