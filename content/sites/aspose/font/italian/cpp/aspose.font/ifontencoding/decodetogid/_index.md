---
title: "Aspose::Font::IFontEncoding::DecodeToGid metodo"
linktitle: "DecodeToGid"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::IFontEncoding::DecodeToGid metodo. Decodifica un codice carattere e restituisce l'id del glifo. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1''s è un nome di glifo, istanza della classe (GlyphStringId). L'id di TTF''s è un indice intero, istanza della classe (GlyphUInt32Id). Nota: il codice carattere non è necessariamente un unicode. Il codice carattere è un indice di carattere nella \"tabella\" di codifica del Font in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding::DecodeToGid method


Decodifica un codice carattere e restituisce l'id del glifo. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: [Type1](../../../aspose.font.type1/)'s id è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'id di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). Nota: il codice carattere non è necessariamente un unicode. Il codice carattere è un indice di carattere nella codifica del [Font](../../font/) "tabella".

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGid(uint32_t charCode)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charCode | uint32_t | Codice carattere per cui ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo al charCode fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
