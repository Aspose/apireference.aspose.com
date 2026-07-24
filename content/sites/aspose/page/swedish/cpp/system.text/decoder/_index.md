---
title: "System::Text::Decoder‑klass"
linktitle: "Decoder"
second_title: "Aspose.Page för C++"
description: "System::Text::Decoder‑klass. Inkapslar avkodning av byte‑sekvens till tecken‑sekvens. Objekt av den här klassen bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 200
url: /sv/cpp/system.text/decoder/
---
## Decoder class


Inkapslar avkodning av byte‑sekvens till tecken‑sekvens. Objekt av den här klassen bör endast allokeras med hjälp av funktionen [System::MakeObject()](../../system/makeobject/) . Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class Decoder : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Konverterar byte till tecken. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Konverterar byte till tecken. |
| [get_Fallback](./get_fallback/)() const | Hämtar felhanterings‑fallback. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Hämtar fallback‑buffert. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Hämtar antalet tecken som behövs för att avkoda en buffert. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Hämtar antalet tecken som behövs för att avkoda en buffert. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Hämtar antalet tecken som behövs för att avkoda en buffert. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Hämta tecknen som resultat av att avkoda en buffert. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Hämta tecknen som resultat av att avkoda en buffert. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Hämta tecknen som resultat av att avkoda en buffert. |
| virtual [Reset](./reset/)() | Rensar kodarens interna tillstånd. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Sätter felhanterings‑fallback. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
