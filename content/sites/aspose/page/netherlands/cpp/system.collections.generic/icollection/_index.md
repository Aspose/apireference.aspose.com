---
title: "System::Collections::Generic::ICollection klasse"
linktitle: "ICollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::ICollection klasse. Interface van een collectie van elementen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1900
url: /nl/cpp/system.collections.generic/icollection/
---
## ICollection class


Interface van een verzameling elementen. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Add](./add/)(const T\&) | Voegt een element toe aan de collectie. |
| virtual [Clear](./clear/)() | Verwijdert alle elementen uit de collectie. |
| virtual [Contains](./contains/)(const T\&) const | Controleert of een element aanwezig is in de collectie. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | Kopieert alle collectie‑elementen naar bestaande array‑elementen. |
| virtual [get_Count](./get_count/)() const | Haalt het aantal elementen op in de collectie. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | Controleert of de collectie alleen‑lezen is. |
| [get_SyncRoot](./get_syncroot/)() const | Haalt het object op waarmee de collectie wordt gesynchroniseerd. |
| [ICollection](./icollection/)() | Standaardconstructor. |
| [ICollection](./icollection/)(const ICollection\&) | Copy-constructor. |
| [ICollection](./icollection/)(ICollection\&&) | Move-constructor. |
| [operator=](./operator=/)(ICollection\&&) | Verplaatsings-toewijzingsoperator. |
| [operator=](./operator=/)(const ICollection\&) | Verplaatsings-toewijzingsoperator. |
| virtual [Remove](./remove/)(const T\&) | Verwijdert element uit de collectie. |
| virtual [~ICollection](./~icollection/)() | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ThisType](./thistype/) | Naam van het collectietype. |
| [ValueType](./valuetype/) | RTTI-informatie. |

## Zie ook

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
