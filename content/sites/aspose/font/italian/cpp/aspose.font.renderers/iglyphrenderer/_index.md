---
title: "classe Aspose::Font::Renderers::IGlyphRenderer"
linktitle: "IGlyphRenderer"
second_title: "Aspose.Font per C++"
description: "classe Aspose::Font::Renderers::IGlyphRenderer. Interfaccia utilizzata per renderizzare i glifi in C++."
type: docs
weight: 300
url: /it/cpp/aspose.font.renderers/iglyphrenderer/
---
## IGlyphRenderer class


Interfaccia utilizzata per renderizzare i glifi.

```cpp
class IGlyphRenderer : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t) | Renderizza il glifo. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, uint32_t, System::SharedPtr\<TransformationMatrix\>) | Renderizza il glifo. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>) | Renderizza il glifo. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<TransformationMatrix\>) | Renderizza il glifo. |
| virtual [RenderGlyph](./renderglyph/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Renderizza il glifo, un obiettivo di questa versione sovraccaricata - da utilizzare con la cache per i glifi. |
| virtual [RenderIndependentGlyphPath](./renderindependentglyphpath/)(System::SharedPtr\<IFont\>, System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::Glyph\>, System::SharedPtr\<TransformationMatrix\>) | Renderizza il glifo usando un percorso di glifo indipendente. La famiglia di funzioni [RenderGlyph()](./renderglyph/) modifica il percorso del glifo durante il rendering. Ciò porta alla necessità di ricaricare nuovamente questo glifo. Questa funzione utilizza una copia del percorso del glifo e non modifica il percorso originale, quindi lo stesso glifo può essere riutilizzato più volte. Questa versione della funzione è destinata all'uso con la cache dei glifi. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Renderers](../)
* Library [Aspose.Font for C++](../../)
