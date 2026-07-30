---
title: "Aspose::Font::Ttf::TtfEncoding class"
linktitle: "TtfEncoding"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::TtfEncoding class. Rappresenta la codifica del Font TTF in C++."
type: docs
weight: 400
url: /it/cpp/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class


Rappresenta la codifica del TTF [Font](../../aspose.font/font/).

```cpp
class TtfEncoding : public Aspose::Font::IFontEncoding
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | L'implementazione DecodeToGlyphId del TTF [Font](../../aspose.font/font/) trova la tabella Unicode e restituisce l'ID del glifo per il carattere Unicode. L'ID del glifo è un numero unico per un glifo, dipendente dal tipo di font. Per esempio: l'ID del [Type1](../../aspose.font.type1/) è un nome di glifo, istanza della classe ([GlyphStringId](../)). L'ID del TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | La versione parametrizzata consente di utilizzare una tabella CMap specifica (non Unicode). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Codifica il glifo. Per i font TTF il codice del carattere è Unicode. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Decodifica l'ID glifo in Unicode. L'ID glifo è un numero unico per un glifo, dipendente dal tipo di carattere. Per esempio: l'ID di [Type1](../../aspose.font.type1/) è un nome glifo, istanza della classe ([GlyphStringId](../)). L'ID di TTF è un indice intero, istanza della classe ([GlyphUInt32Id](../)). |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Decodifica un Unicode e restituisce l'ID glifo. |
## Vedi anche

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
