---
title: "Aspose::Font::TextUtils::IFontMorseEncoder class"
linktitle: "IFontMorseEncoder"
second_title: "Aspose.Font per C++"
description: "Classe Aspose::Font::TextUtils::IFontMorseEncoder. Dichiarazione della funzionalità per codificare il testo in codice Morse e ottenere il risultato come glifi del font in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.textutils/ifontmorseencoder/
---
## IFontMorseEncoder class


Dichiara la funzionalità per codificare il testo in codice Morse e ottenere il risultato come glifi del font.

```cpp
class IFontMorseEncoder : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, MorseAlphabets, char16_t, char16_t) | Codifica il testo in codice Morse e restituisce il risultato come insieme di glifi (identificatori dei glifi). |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, char16_t, char16_t) | Codifica il testo in codice Morse e restituisce il risultato come insieme di glifi (glyphId). Viene utilizzata un'analisi euristica per calcolare l'alfabeto del testo di input. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, MorseAlphabets, char16_t, char16_t) | Codifica il testo in codice Morse e disegna il risultato in formato PNG. |
| virtual [Encode](./encode/)(System::String, System::SharedPtr\<IFont\>, double, Renderers::RenderingUtils::LineSpacingType, int32_t, int32_t, char16_t, char16_t) | Codifica il testo in codice Morse e disegna il risultato in formato PNG. Viene utilizzata un'analisi euristica per calcolare l'alfabeto del testo di input. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TextUtils](../)
* Library [Aspose.Font for C++](../../)
