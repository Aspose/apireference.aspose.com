---
title: "Aspose::Font::IFontEncoding class"
linktitle: "IFontEncoding"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::IFontEncoding class. Definisce un'interfaccia per la codifica dei Font in C++."
type: docs
weight: 1400
url: /it/cpp/aspose.font/ifontencoding/
---
## IFontEncoding class


Definisce un'interfaccia per la codifica di [Font](../font/).

```cpp
class IFontEncoding : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [DecodeToGid](./decodetogid/)(uint32_t) | Decodifica un codice carattere e restituisce l'ID del glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di carattere. Per esempio: l'ID di [Type1](../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). Nota: il codice carattere non è necessariamente Unicode. Il codice carattere è un indice di carattere nella "tabella" di codifica di [Font](../font/). |
| virtual [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) | Metodo di decodifica parametrizzato. |
| virtual [Encode](./encode/)(uint32_t, uint32_t) | Codifica il glifo. Per i font TTF il charCode è Unicode. |
| virtual [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) | Decodifica Gid in Unicode. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di carattere. Per esempio: l'ID di [Type1](../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
| virtual [UnicodeToGid](./unicodetogid/)(uint32_t) | Decodifica un Unicode e restituisce l'ID del glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di carattere. Per esempio: l'ID di [Type1](../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
