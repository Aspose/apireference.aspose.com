---
title: "Aspose::Font::IFontEncoding::UnicodeToGid metodo"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::IFontEncoding::UnicodeToGid metodo. Decodifica un unicode e restituisce l'id del glifo. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1''s è un nome di glifo, istanza della classe (GlyphStringId). L'id di TTF''s è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 500
url: /it/cpp/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding::UnicodeToGid method


Decodifica un unicode e restituisce l'id del glifo. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: [Type1](../../../aspose.font.type1/)'s id è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'id di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)).

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::UnicodeToGid(uint32_t unicode)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| unicode | uint32_t | Unicode per ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo all'Unicode fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
