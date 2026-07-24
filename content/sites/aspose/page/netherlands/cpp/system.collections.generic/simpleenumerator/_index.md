---
title: "System::Collections::Generic::SimpleEnumerator klasse"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::SimpleEnumerator klasse. Iterator‑klasse voor eenvoudige containers die elementen direct houden met behulp van de rbegin()‑ en rend()‑functies. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3900
url: /nl/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


Iterator‑klasse voor eenvoudige containers die elementen direct houden met behulp van de rbegin()‑ en rend()‑functies. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parameter | Beschrijving |
| --- | --- |
| Container | Container‑type om doorheen te itereren. |
| Element | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Kloont de huidige iterator. |
| [get_Current](./get_current/)() const override | Haalt het 'huidige' element op. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Creëert een eenvoudige iterator. |

## Zie ook

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
