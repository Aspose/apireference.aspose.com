---
title: "System::Collections::Generic::IKVCollection klasse"
linktitle: "IKVCollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::IKVCollection klasse. Interface van container die sleutels of waarden van de dictionary‑achtige container bevat. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 2500
url: /nl/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


Interface van container die sleutels of waarden van de dictionary‑achtige container bevat. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) type. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const T\&) override | Voegt item toe aan container. |
| [Clear](./clear/)() override | Verwijdert alle elementen uit container. |
| [Contains](./contains/)(const T\&) const override | Controleert of het item aanwezig is in de container. |
| virtual [get_Count](./get_count/)() const | Geeft aantal elementen in container terug. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Controleert of container alleen-lezen is. |
| virtual [GetEnumerator](./getenumerator/)() | RTTI-informatie. |
| virtual [idx_get](./idx_get/)(int) const | Getter‑functie. |
| [idx_set](./idx_set/)(int, T) override | Setter‑functie. |
| [IndexOf](./indexof/)(const T\&) const override | Geeft index van item in container terug. |
| [Insert](./insert/)(int, const T\&) override | Voegt een item in op een opgegeven positie. |
| [Remove](./remove/)(const T\&) override | Verwijdert item uit container. |
| [RemoveAt](./removeat/)(int) override | Verwijdert item op de opgegeven positie. |

## Zie ook

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
