---
title: "metodo Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath"
linktitle: "RenderIndependentGlyphPath"
second_title: "Aspose.Font per C++"
description: "metodo Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath. Renderizza il glifo usando un percorso di glifo indipendente. La famiglia di funzioni RenderGlyph() modifica il percorso del glifo durante il rendering. Ciò porta alla necessità di ricaricare nuovamente questo glifo. Questa funzione utilizza una copia del percorso del glifo e non modifica il percorso originale del glifo, così lo stesso glifo può essere riutilizzato più volte. Questa versione della funzione è destinata all'uso con una cache di glifi in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.renderers/glyphrendererbase/renderindependentglyphpath/
---
## GlyphRendererBase::RenderIndependentGlyphPath method


Renderizza il glifo usando un percorso di glifo indipendente. La famiglia di funzioni [RenderGlyph()](../renderglyph/) modifica il percorso del glifo durante il rendering. Ciò porta alla necessità di ricaricare nuovamente questo glifo. Questa funzione utilizza una copia del percorso del glifo e non modifica il percorso originale del glifo, così lo stesso glifo può essere riutilizzato più volte. Questa versione della funzione è destinata all'uso con una cache di glifi.

```cpp
void Aspose::Font::Renderers::GlyphRendererBase::RenderIndependentGlyphPath(System::SharedPtr<IFont> font, System::SharedPtr<Glyphs::GlyphId> glyphId, System::SharedPtr<Glyphs::Glyph> glyph, System::SharedPtr<TransformationMatrix> glyphPlacementMatrix) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | System::SharedPtr\<IFont\> | Il font che contiene il glifo. |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Indice fisico del glifo all'interno del [Font](../../../aspose.font/font/). Nota che questo non è un Unicode. |
| glifo | System::SharedPtr\<Glyphs::Glyph\> | Glifo da renderizzare. |
| glyphPlacementMatrix | System::SharedPtr\<TransformationMatrix\> | Matrice applicata alle coordinate del glifo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFont](../../../aspose.font/ifont/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TransformationMatrix](../../../aspose.font/transformationmatrix/)
* Class [GlyphRendererBase](../)
* Namespace [Aspose::Font::Renderers](../../)
* Library [Aspose.Font for C++](../../../)
