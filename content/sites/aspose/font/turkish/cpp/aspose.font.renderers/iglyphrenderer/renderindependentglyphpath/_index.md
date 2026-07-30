---
title: "Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath yöntemi"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath yöntemi. Bağımsız glif yolu kullanarak glifi render eder. RenderGlyph() fonksiyon ailesi, render sırasında glif yolunu değiştirir. Bu da glifin tekrar yüklenmesi gerekliliğine yol açar. Bu fonksiyon, glif yolunun bir kopyasını kullanır ve orijinal glif yolunu değiştirmez, böylece aynı glif birden fazla kez yeniden kullanılabilir. Bu fonksiyonun bu sürümü, C++'ta glif önbelleğiyle kullanılmak üzere tasarlanmıştır."
type: docs
weight: 200
url: /tr/cpp/aspose.font.renderers/iglyphrenderer/renderindependentglyphpath/
---
## IGlyphRenderer::RenderIndependentGlyphPath method


Bağımsız glif yolu kullanarak glifi renderler. [RenderGlyph()](../renderglyph/) fonksiyon ailesi, renderleme sırasında glif yolunu değiştirir. Bu da aynı glifin tekrar yüklenmesi gerekliliğine yol açar. Bu fonksiyon, glif yolunun bir kopyasını kullanır ve orijinal glif yolunu değiştirmez, böylece aynı glif birden çok kez yeniden kullanılabilir. Bu fonksiyonun bu sürümü, glif önbelleğiyle kullanılmak üzere tasarlanmıştır.

```cpp
virtual void Aspose::Font::Renderers::IGlyphRenderer::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix)=0
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
