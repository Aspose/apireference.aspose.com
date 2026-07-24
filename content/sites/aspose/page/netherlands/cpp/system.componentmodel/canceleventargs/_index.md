---
title: "System::ComponentModel::CancelEventArgs klasse"
linktitle: "CancelEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::CancelEventArgs klasse. Argumenten van een annuleerbaar event. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


Argumenten van een annuleerbaar event. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | RTTI-informatie. |
| [CancelEventArgs](./canceleventargs/)() | Constructor; stelt Cancel-eigenschap in op false. |
| [get_Cancel](./get_cancel/)() | Haalt waarde op die aangeeft of het event moet worden geannuleerd. |
| [set_Cancel](./set_cancel/)(bool) | Stelt waarde in die aangeeft of het event moet worden geannuleerd. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Zie ook

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
