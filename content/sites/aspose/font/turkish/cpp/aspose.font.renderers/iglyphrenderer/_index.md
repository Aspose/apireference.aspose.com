---
title: "Aspose::Font::Renderers::IGlyphRenderer sınıfı"
linktitle: "IGlyphRenderer"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Renderers::IGlyphRenderer sınıfı. C++'da glifleri renderlemek için kullanılan arayüz."
type: docs
weight: 300
url: /tr/cpp/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer class


Glifleri işlemek için kullanılan arabirim.

```cpp
class IGlyphRenderer : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) | Glifi render eder. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) | Glifi render eder. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) | Glifi render eder. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) | Glifi render eder. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Glifi render eder, bu aşırı yüklenmiş sürümün amacı - glif önbelleğiyle kullanılmak içindir. |
| virtual [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Bağımsız bir glif yolu kullanarak glifi render eder. [RenderGlyph()](./renderglyph/) fonksiyon ailesi, render sırasında glif yolunu değiştirir. Bu, glifi tekrar yükleme ihtiyacına yol açar. Bu fonksiyon, glif yolunun bir kopyasını kullanır ve orijinal glif yolunu değiştirmez, böylece aynı glif birden çok kez yeniden kullanılabilir. Bu fonksiyon sürümü, glif önbelleğiyle kullanılmak üzere tasarlanmıştır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
