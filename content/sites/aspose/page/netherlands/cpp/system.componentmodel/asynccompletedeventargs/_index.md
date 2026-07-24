---
title: "System::ComponentModel::AsyncCompletedEventArgs klasse"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::AsyncCompletedEventArgs klasse. Een instantie van deze klasse wordt als argument doorgegeven aan de AsyncCompletedEventHandler‑delegate. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Een instantie van deze klasse wordt als argument doorgegeven aan de AsyncCompletedEventHandler‑delegate. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Constructor. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Initialiseert een nieuwe instantie van de [System.ComponentModel.AsyncCompletedEventArgs](./) klasse. |
| [get_Cancelled](./get_cancelled/)() const | Haalt een waarde op die aangeeft of een asynchrone bewerking is geannuleerd. true als de achtergrondbewerking is geannuleerd; anders false. Standaard is false. |
| [get_Error](./get_error/)() const | Haalt een waarde op die aangeeft welke fout zich heeft voorgedaan tijdens een asynchrone bewerking. |
| [get_UserState](./get_userstate/)() const | Haalt de unieke identifier op voor de asynchrone taak. Een objectreferentie die de asynchrone taak uniek identificeert; anders null als er geen waarde is ingesteld. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Zie ook

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
