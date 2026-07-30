---
title: "Metodo Aspose::Font::Type1::Type1Encoding::UnicodeToGid"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::Type1::Type1Encoding::UnicodeToGid. Restituisce GlyphId per Unicode. O notdef se il font non contiene un glifo per l'Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1 è un nome di glifo, istanza della classe (GlyphStringId). L'id di TTF è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 600
url: /it/cpp/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding::UnicodeToGid method


Restituisce GlyphId per Unicode. O notdef se il font non contiene un glifo per l'Unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di [Type1](../../) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'id di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::UnicodeToGid(uint32_t unicode) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| unicode | uint32_t | Unicode per ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo all'Unicode fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
