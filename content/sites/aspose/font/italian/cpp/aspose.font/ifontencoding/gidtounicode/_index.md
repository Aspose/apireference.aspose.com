---
title: "Aspose::Font::IFontEncoding::GidToUnicode metodo"
linktitle: "GidToUnicode"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::IFontEncoding::GidToUnicode metodo. Decodifica Gid in unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'id di Type1''s è un nome di glifo, istanza della classe (GlyphStringId). L'id di TTF''s è un indice intero, istanza della classe (GlyphUInt32Id) in C++."
type: docs
weight: 400
url: /it/cpp/aspose.font/ifontencoding/gidtounicode/
---
## IFontEncoding::GidToUnicode method


Decodifica Gid in unicode. L'id del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: [Type1](../../../aspose.font.type1/)'s id è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'id di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)).

```cpp
virtual uint32_t Aspose::Font::IFontEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Identificatore del glifo del simbolo da decodificare. |

### ReturnValue

Valore Unicode relativo all'id del glifo fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
