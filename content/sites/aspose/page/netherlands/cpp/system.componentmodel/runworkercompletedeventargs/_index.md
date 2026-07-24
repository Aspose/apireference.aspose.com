---
title: "System::ComponentModel::RunWorkerCompletedEventArgs klasse"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::RunWorkerCompletedEventArgs klasse. Een instantie van deze klasse wordt doorgegeven als argument aan de RunWorkerCompletedEventHandler‑delegate. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1300
url: /nl/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


Een instantie van deze klasse wordt doorgegeven als argument aan de RunWorkerCompletedEventHandler‑delegate. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Result](./get_result/)() const | Haalt een waarde op die het resultaat van een asynchrone bewerking vertegenwoordigt. |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | RTTI-informatie. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Zie ook

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
