---
title: "metodo Aspose::Font::Type1::Type1Encoding::GidToUnicode"
linktitle: "GidToUnicode"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::Type1::Type1Encoding::GidToUnicode. Decodifica Gid in Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1 è un nome di glifo, istanza della classe (GlyphStringId). L'id di TTF è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 500
url: /it/cpp/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding::GidToUnicode method


Decodifica Gid in Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di [Type1](../../) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'id di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)).

```cpp
uint32_t Aspose::Font::Type1::Type1Encoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Identificatore del glifo del simbolo da decodificare. |

### ReturnValue

Valore Unicode relativo all'id del glifo fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
