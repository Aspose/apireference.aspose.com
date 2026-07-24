---
title: "System::Text::EncoderFallback klass"
linktitle: "EncoderFallback"
second_title: "Aspose.Page för C++"
description: "System::Text::EncoderFallback klass. Tillhandahåller fallback‑API för att hantera kodningsfel. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller assertionsfel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 1200
url: /sv/cpp/system.text/encoderfallback/
---
## EncoderFallback class


Tillhandahåller fallback‑API för att hantera kodningsfel. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller assertionsfel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/)‑pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class EncoderFallback : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Hämtar bufferten som är associerad med fallback‑algoritmen. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Hämtar standardundantagsfallback‑implementation. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Hämtar maximalt antal tecken som kan returneras av fallback. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Hämtar standardersättningsfallback‑implementation. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Hämtar standard säker fallback‑implementation. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
