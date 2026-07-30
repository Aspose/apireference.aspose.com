---
title: "Metodo Aspose::Font::Type1::Type1Encoding::DecodeToGid"
linktitle: "DecodeToGid"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::Type1::Type1Encoding::DecodeToGid. Decodifica Gid in Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1 è un nome di glifo, istanza della classe (GlyphStringId). L'id di TTF è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding::DecodeToGid method


Decodifica Gid in Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di [Type1](../../) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'id di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::DecodeToGid(uint32_t charCode) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charCode | uint32_t | Codice carattere per cui ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo al codice carattere fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
