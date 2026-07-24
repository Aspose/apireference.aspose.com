---
title: "System::EventArgs class"
linktitle: "EventArgs"
second_title: "Aspose.Page voor C++"
description: "System::EventArgs class. De basisklasse voor klassen die een context vertegenwoordigen die wordt doorgegeven aan de gebeurtenisabonnees wanneer een gebeurtenis wordt geactiveerd. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2500
url: /nl/cpp/system/eventargs/
---
## EventArgs class


De basisklasse voor klassen die een context vertegenwoordigen die wordt doorgegeven aan de gebeurtenisabonnees wanneer een gebeurtenis wordt geactiveerd. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class EventArgs : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [EventArgs](./eventargs/)() | Constructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Een statisch lid dat een "lege" [EventArgs](./) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
