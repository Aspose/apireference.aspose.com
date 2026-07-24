---
title: "System::ComponentModel::PropertyChangedEventArgs klasse"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::PropertyChangedEventArgs klasse. Argumenten van het PropertyChanged‑event. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1200
url: /nl/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


Argumenten van PropertyChanged‑evenement. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | RTTI-informatie. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | Initialiseert PropertyChanged‑evenementargumenten. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Zie ook

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
