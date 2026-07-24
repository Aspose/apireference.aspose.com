---
title: "System::Collections::CollectionBase klasse"
linktitle: "CollectionBase"
second_title: "Aspose.Page voor C++"
description: "System::Collections::CollectionBase klasse. Biedt een abstracte basisklasse voor een sterk getypeerde collectie in C++."
type: docs
weight: 300
url: /nl/cpp/system.collections/collectionbase/
---
## CollectionBase class


Biedt een abstracte basisklasse voor een sterk getypeerde collectie.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type van elementen van de collectie |
## Nested classes

* Class [ListImpl](./listimpl/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clear](./clear/)() | Verwijdert alle objecten uit de collectie-instantie. Deze methode kan niet worden overschreven. |
| [get_Capacity](./get_capacity/)() | Retourneert het aantal elementen dat de collectie kan bevatten. |
| [get_Count](./get_count/)() | Retourneert het aantal elementen dat zich in de collectie-instantie bevindt. Deze methode kan niet worden overschreven. |
| [GetEnumerator](./getenumerator/)() override | Retourneert een enumerator die door de collectie-instantie iterereert. |
| [RemoveAt](./removeat/)(int32_t) | Verwijdert het element op de opgegeven index van de collectie-instantie. Deze methode is niet overschrijfbaar. |
| [set_Capacity](./set_capacity/)(int32_t) | Stelt het aantal elementen in dat de collectie kan bevatten. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |

## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
