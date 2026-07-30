---
title: "Aspose::Font::Renderers::GlyphRendererBase class"
linktitle: "GlyphRendererBase"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Renderers::GlyphRendererBase class. C++'de glif renderleyicileri için temel sınıfı temsil eder."
type: docs
weight: 200
url: /tr/cpp/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class


Glif işleyicileri için temel sınıfı temsil eder.

```cpp
class GlyphRendererBase : public Aspose::Font::Renderers::IGlyphRenderer
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) override | Glifi render eder. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) override | Glifi render eder. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Glifi render eder. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) override | Glifi render eder. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Glifi render eder, bu aşırı yüklenmiş sürümün amacı - glif önbelleğiyle kullanılmak içindir. |
| [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Bağımsız bir glif yolu kullanarak glifi render eder. [RenderGlyph()](./renderglyph/) fonksiyon ailesi, render sırasında glif yolunu değiştirir. Bu, glifi tekrar yükleme ihtiyacına yol açar. Bu fonksiyon, glif yolunun bir kopyasını kullanır ve orijinal glif yolunu değiştirmez, böylece aynı glif birden çok kez yeniden kullanılabilir. Bu fonksiyon sürümü, glif önbelleğiyle kullanılmak üzere tasarlanmıştır. |
## Ayrıca Bakınız

* Class [IGlyphRenderer](../iglyphrenderer/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
