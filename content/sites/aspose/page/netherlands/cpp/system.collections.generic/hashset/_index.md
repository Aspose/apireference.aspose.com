---
title: "System::Collections::Generic::HashSet klasse"
linktitle: "HashSet"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::HashSet klasse. Voorwaartse declaratie van de HashSet‑klasse in C++."
type: docs
weight: 1700
url: /nl/cpp/system.collections.generic/hashset/
---
## HashSet class


Voorwaartse declaratie van de [HashSet](./) klasse.

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [HashSet](./hashset/)() | RTTI-informatie. |
| [HashSet](./hashset/)(int) | Maakt een lege set met opgegeven capaciteit. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | Maakt een lege set die de opgegeven gelijkheidsvergelijker gebruikt. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Maakt een hashset op basis van doorzoekbare waarden. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | Basistype. |
| [ThisPtr](./thisptr/) | Pointertype. |
| [ThisType](./thistype/) | Zelftype. |
## Opmerkingen


Set-implementatie gebaseerd op hashing. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
