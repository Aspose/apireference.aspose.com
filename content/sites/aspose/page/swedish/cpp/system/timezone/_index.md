---
title: "System::TimeZone class"
linktitle: "TimeZone"
second_title: "Aspose.Page för C++"
description: "System::TimeZone‑klassen. Representerar en tidszon. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 6200
url: /sv/cpp/system/timezone/
---
## TimeZone class


Representerar en tidszon. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../smartptr/)‑pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class TimeZone : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | Returnerar en ny instans av [TimeZone](./)‑klassen som representerar den aktuella tidszonen. |
| virtual [get_DaylightName](./get_daylightname/)() const | Returnerar ett namn för sommartiden för tidszonen som representeras av det aktuella objektet. |
| virtual [get_StandardName](./get_standardname/)() const | Returnerar ett namn för standardtiden för tidszonen som representeras av det aktuella objektet. |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | Returnerar sommartidsperioden för ett specifikt år. |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | Returnerar UTC‑förskjutningen för den angivna lokala tiden. |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | Avgör om datum- och tidsvärdet som representeras av det angivna [DateTime](../datetime/)‑objektet faller inom sommartidsintervallet för tidszonen som representeras av det aktuella [TimeZone](./)‑objektet. |
## Se även

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
