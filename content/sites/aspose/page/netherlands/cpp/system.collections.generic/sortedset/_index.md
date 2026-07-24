---
title: "System::Collections::Generic::SortedSet klasse"
linktitle: "SortedSet"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::SortedSet klasse. Voorwaartse declaratie van de SortedSet-klasse in C++."
type: docs
weight: 4400
url: /nl/cpp/system.collections.generic/sortedset/
---
## SortedSet class


Voorwaartse declaratie van de [SortedSet](./) klasse.

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Max](./get_max/)() const | Haalt de maximale waarde op in de [SortedSet](./). |
| [SortedSet](./sortedset/)() | RTTI-informatie. |
| [SortedSet](./sortedset/)(int) | Maakt een lege set met opgegeven capaciteit. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | Maakt een lege set die de opgegeven gelijkheidsvergelijker gebruikt. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Maakt een [SortedSet](./) op basis van enumerable waarden. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | Vaas type. |
| [ThisPtr](./thisptr/) | Pointertype. |
| [ThisType](./thistype/) | Zelftype. |
## Opmerkingen


Implementatie van een set geordende objecten. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
