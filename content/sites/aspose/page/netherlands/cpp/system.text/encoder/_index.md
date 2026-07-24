---
title: "System::Text::Encoder klasse"
linktitle: "Encoder"
second_title: "Aspose.Page voor C++"
description: "System::Text::Encoder klasse. Omvat een tekenreeks voor codering in een byte‑reeks. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system.text/encoder/
---
## Encoder class


Omvat een tekenreeks voor codering in een byte‑reeks. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class Encoder : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Converteert tekens naar bytes. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Converteert tekens naar bytes. |
| [get_Fallback](./get_fallback/)() const | Haalt foutafhandelingsfallback op. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Haalt fallback‑buffer op. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Haalt het aantal bytes op dat nodig is om een buffer te coderen. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Haalt het aantal bytes op dat nodig is om een buffer te coderen. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Haalt de bytes op die ontstaan bij het coderen van een buffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Haalt de bytes op die ontstaan bij het coderen van een buffer. |
| virtual [Reset](./reset/)() | Schoont de interne status van de encoder. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Stelt foutafhandelingsfallback in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
