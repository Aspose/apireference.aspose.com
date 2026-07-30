---
title: "Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph yöntemi"
linktitle: "RenderGlyph"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph yöntemi. C++'da glifi renderler."
type: docs
weight: 100
url: /tr/cpp/aspose.font.renderers/glyphrendererbase/renderglyph/
---
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) method


Glifi render eder.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren [Font](../../../aspose.font/font/). |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Fiziksel glif indeksi [Font](../../../aspose.font/font/) içinde. Not: bu bir unicode değildir. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) method


Glifi render eder, bu aşırı yüklenmiş sürümün amacı - glif önbelleğiyle kullanılmak içindir.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren font. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Fiziksel glif indeksi [Font](../../../aspose.font/font/) içinde. Not: bu bir unicode değildir. |
| glif | System::SharedPtr\<Glyphs::Glyph\> | Renderlenecek glif. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Glif koordinatlarına uygulanan matris. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) method


Glifi render eder.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren [Font](../../../aspose.font/font/). |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Fiziksel glif indeksi [Font](../../../aspose.font/font/) içinde. Not: bu bir unicode değildir. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Glif koordinatlarına uygulanan matris. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t) method


Glifi render eder.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren [Font](../../../aspose.font/font/). |
| glyphIndex | uint32_t | Fiziksel glif indeksi [Font](../../../aspose.font/font/) içinde. Not: bu bir unicode değildir. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
## GlyphRendererBase::RenderGlyph(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) method


Glifi render eder.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderGlyph(System::SharedPtr<IFont> font, uint32_t glyphIndex, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Glifi içeren [Font](../../../aspose.font/font/). |
| glyphIndex | uint32_t | Fiziksel glif indeksi [Font](../../../aspose.font/font/) içinde. Not: bu bir unicode değildir. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Glif koordinatlarına uygulanan matris. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
