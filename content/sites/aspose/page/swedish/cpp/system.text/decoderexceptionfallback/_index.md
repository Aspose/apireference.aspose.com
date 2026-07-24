---
title: "System::Text::DecoderExceptionFallback-klass"
linktitle: "DecoderExceptionFallback"
second_title: "Aspose.Page för C++"
description: "System::Text::DecoderExceptionFallback-klass. Tillhandahåller en undantagskastande reservstrategi. Objekt av den här klassen bör endast allokeras med System::MakeObject() funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 300
url: /sv/cpp/system.text/decoderexceptionfallback/
---
## DecoderExceptionFallback class


Tillhandahåller en undantagskastande reservstrategi. Objekt av den här klassen bör endast allokeras med hjälp av [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kommer att resultera i körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class DecoderExceptionFallback : public System::Text::DecoderFallback
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Skapar reservbuffer. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Hämtar maximalt antal tecken som instansen kan returnera. |
## Se även

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
