---
title: "System::Collections::Generic::IComparer klasse"
linktitle: "IComparer"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::IComparer klasse. Interface die twee objecten vergelijkt in een groter-gelijk-kleiner zin. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2000
url: /nl/cpp/system.collections.generic/icomparer/
---
## IComparer class


Interface die twee objecten vergelijkt in een groter-gelijk-kleiner zin. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) functie. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [args_type](./args_type/) | RTTI-informatie. |

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
