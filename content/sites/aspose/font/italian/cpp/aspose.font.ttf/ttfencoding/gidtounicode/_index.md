---
title: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode metodo"
linktitle: "GidToUnicode"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::TtfEncoding::GidToUnicode metodo. Decodifica l'id del glifo in Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di carattere. Per esempio: Type1''s id è un nome di glifo, istanza della classe (GlyphStringId). TTF''s id è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 400
url: /it/cpp/aspose.font.ttf/ttfencoding/gidtounicode/
---
## TtfEncoding::GidToUnicode method


Decodifica l'id del glifo in Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di carattere. Per esempio: [Type1](../../../aspose.font.type1/)'s id è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'id di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Ttf::TtfEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Identificatore del glifo del simbolo da decodificare. |

### ReturnValue

Valore Unicode relativo all'id del glifo fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
