---
title: "Aspose::Font::Renderers::IGlyphRenderer Klasse"
linktitle: "IGlyphRenderer"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Renderers::IGlyphRenderer Klasse. Schnittstelle zum Rendern von Glyphen in C++."
type: docs
weight: 300
url: /de/cpp/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer class


Schnittstelle zum Rendern von Glyphen.

```cpp
class IGlyphRenderer : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) | Rendert Glyph. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) | Rendert Glyph. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) | Rendert Glyph. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) | Rendert Glyph. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Rendert Glyph, ein Ziel dieser überladenen Version – zur Verwendung mit einem Cache für Glyphs. |
| virtual [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Rendert Glyph mit einem unabhängigen Glyph-Pfad. Die Funktionsfamilie [RenderGlyph()](./renderglyph/) ändert den Glyph-Pfad beim Rendern. Das führt dazu, dass dieser Glyph erneut geladen werden muss. Diese Funktion verwendet eine Kopie des Glyph-Pfads und ändert den ursprünglichen Glyph-Pfad nicht, sodass derselbe Glyph mehrfach wiederverwendet werden kann. Diese Funktionsversion ist für die Verwendung mit einem Glyph-Cache vorgesehen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
