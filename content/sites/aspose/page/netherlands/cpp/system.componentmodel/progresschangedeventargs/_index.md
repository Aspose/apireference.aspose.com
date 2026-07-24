---
title: "System::ComponentModel::ProgressChangedEventArgs klasse"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::ProgressChangedEventArgs klasse. Een instantie van deze klasse wordt doorgegeven als argument aan de ProgressChangedEventHandler‑delegate. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1100
url: /nl/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Een instantie van deze klasse wordt als argument doorgegeven aan de ProgressChangedEventHandler delegate. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | Haalt het voortgangspercentage van de asynchrone taak op. |
| [get_UserState](./get_userstate/)() const | Haalt een unieke gebruikersstatus op. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | Constructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Zie ook

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
