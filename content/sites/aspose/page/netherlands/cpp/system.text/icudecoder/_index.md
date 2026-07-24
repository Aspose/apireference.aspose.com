---
title: "System::Text::ICUDecoder klasse"
linktitle: "ICUDecoder"
second_title: "Aspose.Page voor C++"
description: "System::Text::ICUDecoder klasse. Decoder die ICU gebruikt voor decodering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2000
url: /nl/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Converteert bytes naar tekens. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Converteert bytes naar tekens. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Haalt het aantal tekens op dat nodig is om een buffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Haalt het aantal tekens op dat nodig is om een buffer te decoderen. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Haalt het aantal tekens op dat nodig is om een buffer te decoderen. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Haal de tekens op die voortkomen uit het decoderen van een buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Haal de tekens op die voortkomen uit het decoderen van een buffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Haal de tekens op die voortkomen uit het decoderen van een buffer. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | Constructor. |
| virtual [Reset](./reset/)() | Stelt interne variabelen in op de begintoestand. |
| virtual [~ICUDecoder](./~icudecoder/)() | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Base](./base/) | [Base](./base/) type. |
## Zie ook

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
