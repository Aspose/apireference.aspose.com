---
title: "System::Globalization::TextElementEnumerator klass"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Page för C++"
description: "System::Globalization::TextElementEnumerator klass. Uppräkning för att iterera genom strängelement (tecken). Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 2700
url: /sv/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


Uppräkning för att iterera genom strängelement (tecken). Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Current](./get_current/)() const | Hämtar det aktuella textelementet. |
| [get_ElementIndex](./get_elementindex/)() const | Hämtar index för det aktuella textelementet. |
| [GetTextElement](./gettextelement/)() const | Hämtar aktuellt element. |
| [MoveNext](./movenext/)() | Flyttar till nästa element. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | Sätter uppräkning till startposition. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
