---
title: "Aspose::Font::Renderers::GlyphRendererBase class"
linktitle: "GlyphRendererBase"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Renderers::GlyphRendererBase class. Rappresenta la classe base per i renderer di glifi in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.renderers/glyphrendererbase/
---
## GlyphRendererBase class


Rappresenta la classe base per i renderer di glifi.

```cpp
class GlyphRendererBase : public Aspose::Font::Renderers::IGlyphRenderer
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) override | Renderizza il glifo. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) override | Renderizza il glifo. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) override | Renderizza il glifo. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) override | Renderizza il glifo. |
| [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Renderizza il glifo, un obiettivo di questa versione sovraccaricata - da utilizzare con la cache per i glifi. |
| [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) override | Renderizza il glifo usando un percorso di glifo indipendente. La famiglia di funzioni [RenderGlyph()](./renderglyph/) modifica il percorso del glifo durante il rendering. Ciò porta alla necessità di ricaricare nuovamente questo glifo. Questa funzione utilizza una copia del percorso del glifo e non modifica il percorso originale, quindi lo stesso glifo può essere riutilizzato più volte. Questa versione della funzione è destinata all'uso con la cache dei glifi. |
## Vedi anche

* Class [IGlyphRenderer](../iglyphrenderer/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
