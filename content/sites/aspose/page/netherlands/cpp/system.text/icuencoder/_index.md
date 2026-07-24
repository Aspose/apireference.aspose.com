---
title: "System::Text::ICUEncoder klasse"
linktitle: "ICUEncoder"
second_title: "Aspose.Page voor C++"
description: "System::Text::ICUEncoder klasse. Encoder die ICU gebruikt voor codering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2100
url: /nl/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Converteert tekens naar bytes. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Converteert tekens naar bytes. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Haalt het aantal bytes op dat nodig is om een buffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Haalt het aantal bytes op dat nodig is om een buffer te coderen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Haalt de bytes op die ontstaan bij het coderen van een buffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Haalt de bytes op die ontstaan bij het coderen van een buffer. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | Constructor. |
| virtual [Reset](./reset/)() | Stelt interne variabelen in op de begintoestand. |
| [~ICUEncoder](./~icuencoder/)() | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Base](./base/) | [Base](./base/) type. |
## Zie ook

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
