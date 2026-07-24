---
title: "System::Text::Encoder-klass"
linktitle: "Encoder"
second_title: "Aspose.Page för C++"
description: "System::Text::Encoder-klass. Inkapslar kodning av teckensekvens till byte‑sekvens. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 900
url: /sv/cpp/system.text/encoder/
---
## Encoder class


Inkapslar kodning av teckensekvens till byte‑sekvens. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class Encoder : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Konverterar tecken till byte. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Konverterar tecken till byte. |
| [get_Fallback](./get_fallback/)() const | Hämtar felhanterings‑fallback. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Hämtar fallback‑buffert. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Hämtar antalet byte som behövs för att koda en buffert. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Hämtar antalet byte som behövs för att koda en buffert. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Hämta de byte som resultat av att koda en buffert. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Hämta de byte som resultat av att koda en buffert. |
| virtual [Reset](./reset/)() | Rensar kodarens interna tillstånd. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Sätter felhanterings‑fallback. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
