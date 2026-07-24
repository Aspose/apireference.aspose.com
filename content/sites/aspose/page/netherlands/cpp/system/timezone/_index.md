---
title: "System::TimeZone klasse"
linktitle: "TimeZone"
second_title: "Aspose.Page voor C++"
description: "System::TimeZone klasse. Vertegenwoordigt een tijdzone. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 6200
url: /nl/cpp/system/timezone/
---
## TimeZone class


Vertegenwoordigt een tijdzone. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TimeZone : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | Retourneert een nieuwe instantie van de [TimeZone](./) klasse die de huidige tijdzone vertegenwoordigt. |
| virtual [get_DaylightName](./get_daylightname/)() const | Retourneert een naam voor de zomertijd van de tijdzone die wordt vertegenwoordigd door het huidige object. |
| virtual [get_StandardName](./get_standardname/)() const | Retourneert een naam voor de standaardtijd van de tijdzone die wordt vertegenwoordigd door het huidige object. |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | Retourneert de zomertijdperiode voor een bepaald jaar. |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | Retourneert de UTC-offset voor de opgegeven lokale tijd. |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | Bepaalt of de datum- en tijdwaarde die wordt vertegenwoordigd door het opgegeven [DateTime](../datetime/) object binnen het bereik van de zomertijd valt voor de tijdzone die wordt vertegenwoordigd door het huidige [TimeZone](./) object. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
