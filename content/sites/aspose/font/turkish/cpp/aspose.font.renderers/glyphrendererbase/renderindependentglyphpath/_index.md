---
title: "Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath yöntemi"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath yöntemi. Bağımsız glif yolu kullanarak glifi renderler. RenderGlyph() fonksiyon ailesi, renderleme sırasında glif yolunu değiştirir. Bu da aynı glifin tekrar yüklenmesi gerekliliğine yol açar. Bu fonksiyon, glif yolunun bir kopyasını kullanır ve orijinal glif yolunu değiştirmez, böylece aynı glif birden çok kez yeniden kullanılabilir. Bu fonksiyonun bu sürümü, C++'da glif önbelleğiyle kullanılmak üzere tasarlanmıştır."
type: docs
weight: 200
url: /tr/cpp/aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/
---
## GlyphRendererBase::RenderIndependentGlyphPath method


Bağımsız glif yolu kullanarak glifi renderler. [RenderGlyph()](../renderglyph/) fonksiyon ailesi, renderleme sırasında glif yolunu değiştirir. Bu da aynı glifin tekrar yüklenmesi gerekliliğine yol açar. Bu fonksiyon, glif yolunun bir kopyasını kullanır ve orijinal glif yolunu değiştirmez, böylece aynı glif birden çok kez yeniden kullanılabilir. Bu fonksiyonun bu sürümü, glif önbelleğiyle kullanılmak üzere tasarlanmıştır.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
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
