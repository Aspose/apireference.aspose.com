---
title: "System::Collections::Generic::ISet klasse"
linktitle: "ISet"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::ISet class. Interface van een collectie die een verzameling unieke elementen bevat. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2700
url: /nl/cpp/system.collections.generic/iset/
---
## ISet class


Interface van een collectie die een verzameling unieke elementen bevat. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | Verwijdert een groep elementen. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | Verwijdert elementen die niet aanwezig zijn in een andere container. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | Controleert of de huidige set een strikte subset is van de andere container. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | Controleert of de huidige set een strikte superset is van de andere container. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | Controleert of de huidige set een subset is van de andere container. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | Controleert of de huidige set een superset is van de andere container. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | Controleert of de set overlapt met de andere container. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | Controleert of de set en de container dezelfde elementen bevatten. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | Berekent de symmetrische uitzondering van twee containers. Verwijdert alle elementen die in beide containers aanwezig zijn, maar voegt tegelijkertijd alle elementen toe die aanwezig zijn in **other**, maar niet in de huidige set. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | Voegt elementen toe uit de opgegeven collectie die nog niet aanwezig zijn in de huidige set. |
| virtual [~ISet](./~iset/)() | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | RTTI-informatie. |

## Zie ook

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
