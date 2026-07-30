---
title: "Aspose::Font::Cff::CffEncoding class"
linktitle: "CffEncoding"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Cff::CffEncoding class. Rappresenta la codifica del Font CFF in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.cff/cffencoding/
---
## CffEncoding class


Rappresenta la codifica del CFF [Font](../../aspose.font/font/).

```cpp
class CffEncoding : public Aspose::Font::IFontEncoding,
                    public Aspose::Font::ISupportsNameAddressing
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Restituisce il Gid per il charCode fornito. Questo metodo è progettato per CFF CIDFonts, dove charCode deve essere un valore CID valido. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'ID del glifo del CFF [Font](../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Metodo di decodifica parametrizzato. Non supportato per il tipo CFF [Font](../../aspose.font/font/). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Codifica il glifo. Non supportato per i tipi CFF [Font](../../aspose.font/font/). |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Restituisce la mappa di codifica nome → codice carattere. Nota: il codice carattere non è Unicode. Il codice carattere è un indice di carattere nella "table" di codifica del [Font](../../aspose.font/font/). |
| [GetNameToGidIndex](./getnametogidindex/)() | Restituisce la mappa di codifica nome → codice carattere. Nota: il codice carattere non è Unicode. Il codice carattere è un indice di carattere nella "table" di codifica del [Font](../../aspose.font/font/). |
| [GetNameToSidIndex](./getnametosidindex/)() | Restituisce la mappa di codifica nome → codice carattere. Nota: il codice carattere non è Unicode. Il codice carattere è un indice di carattere nella "table" di codifica del [Font](../../aspose.font/font/). |
| [GetSidName](./getsidname/)(int32_t) | Restituisce il nome per il SID specificato. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Decodifica il Gid in Unicode. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'ID del glifo del CFF [Font](../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Decodifica un Unicode e restituisce l'ID del glifo. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. L'ID del glifo del CFF [Font](../../aspose.font/font/) può essere un'istanza della classe ([GlyphStringId](../)) o della classe ([GlyphUInt32Id](../)). |
## Vedi anche

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
