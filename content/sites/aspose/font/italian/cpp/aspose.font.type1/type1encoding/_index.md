---
title: "Aspose::Font::Type1::Type1Encoding classe"
linktitle: "Type1Encoding"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Type1::Type1Encoding classe. Rappresenta la codifica Type1Font in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.type1/type1encoding/
---
## Type1Encoding class


Rappresenta la codifica [Type1](../)[Font](../../aspose.font/font/).

```cpp
class Type1Encoding : public Aspose::Font::IFontEncoding,
                      public Aspose::Font::ISupportsNameAddressing
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Decodifica Gid in unicode. L'ID glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di [Type1](../) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Metodo di decodifica parametrizzata. Non supportato per il tipo [Type1](../)[Font](../../aspose.font/font/). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Codifica il glifo. Per i font TTF il codice carattere è unicode. Non supportato per i tipi [Type1](../)[Font](../../aspose.font/font/). |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Restituisce la mappa di codifica nome → codice carattere. Nota: il codice carattere non è Unicode. Il codice carattere è un indice di carattere nella "table" di codifica del [Font](../../aspose.font/font/). |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Decodifica Gid in Unicode. L'ID glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di [Type1](../) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Restituisce GlyphId per unicode. O notdef se il font non contiene un glifo per l'unicode. L'ID glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID di [Type1](../) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
## Vedi anche

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
