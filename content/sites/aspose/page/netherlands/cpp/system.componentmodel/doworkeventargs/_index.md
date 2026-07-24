---
title: "System::ComponentModel::DoWorkEventArgs klasse"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::DoWorkEventArgs klasse. DoWork-gebeurtenisargumenten. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


DoWork-gebeurtenisargumenten. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | RTTI-informatie. |
| [get_Argument](./get_argument/)() | Haalt Argument-eigenschap op; niet geïmplementeerd. |
| [get_Result](./get_result/)() | Haalt Result-eigenschap op; niet geïmplementeerd. |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Stelt Result-eigenschap in; niet geïmplementeerd. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Zie ook

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
