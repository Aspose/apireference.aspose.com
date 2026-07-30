---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid metodo"
linktitle: "DecodeToGid"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGid metodo. L'implementazione DecodeToGlyphId del Font TTF trova la tabella Unicode e restituisce l'id del glifo per il carattere Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di carattere. Per esempio: Type1''s id è un nome di glifo, istanza della classe (GlyphStringId). TTF''s id è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding::DecodeToGid method


TTF [Font](../../../aspose.font/font/)'s implementazione DecodeToGlyphId trova la tabella Unicode e restituisce l'id del glifo per il carattere Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di carattere. Per esempio: [Type1](../../../aspose.font.type1/)'s id è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'id di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGid(uint32_t unicode) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| unicode | uint32_t | Codice carattere per cui ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo al codice carattere fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
