---
title: "System::Text::Decoder klasse"
linktitle: "Decoder"
second_title: "Aspose.Page voor C++"
description: "System::Text::Decoder klasse. Omvat het decoderen van een byte‑reeks naar een tekenreeks. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.text/decoder/
---
## Decoder class


Omvat het decoderen van een byte‑reeks naar een tekenreeks. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class Decoder : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Converteert bytes naar tekens. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Converteert bytes naar tekens. |
| [get_Fallback](./get_fallback/)() const | Haalt foutafhandelingsfallback op. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Haalt fallback‑buffer op. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Haalt het aantal tekens op dat nodig is om een buffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Haalt het aantal tekens op dat nodig is om een buffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Haalt het aantal tekens op dat nodig is om een buffer te decoderen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Haal de tekens op die voortkomen uit het decoderen van een buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Haal de tekens op die voortkomen uit het decoderen van een buffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Haal de tekens op die voortkomen uit het decoderen van een buffer. |
| virtual [Reset](./reset/)() | Schoont de interne status van de decoder. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Stelt foutafhandelingsfallback in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
