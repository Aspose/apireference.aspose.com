---
title: "Aspose::Font::Font::GetGlyphById method"
linktitle: "GetGlyphById"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Font::GetGlyphById method. Restituisce il glifo tramite l'ID del glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. GlyphId - oggetto derivato. Per esempio: Type1''s id è un nome di glifo, istanza della classe (GlyphStringId). TTF''s id è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 1700
url: /it/cpp/aspose.font/font/getglyphbyid/
---
## Font::GetGlyphById method


Restituisce il glifo per ID glifo. L'ID glifo è un numero univoco per un glifo, dipendente dal tipo di carattere. GlyphId - oggetto derivato. Per esempio: l'ID di [Type1](../../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Font::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Id del glifo. |

### ReturnValue

Glifo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
