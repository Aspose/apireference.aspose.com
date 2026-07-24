---
title: "System::Collections::Generic::IEnumerator klasse"
linktitle: "IEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::IEnumerator klasse. Interface van een enumerator die kan worden gebruikt om door enkele elementen te itereren. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2300
url: /nl/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


Interface van enumerator die kan worden gebruikt om door enkele elementen te itereren. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | Bereidt de iterator voor om te worden gebruikt door de VirtualizedIterator klasse. |
| [CloneIterator](./cloneiterator/)() const override | Kloont de huidige iterator. |
| virtual [Current](./current/)() const | Haalt het huidige element op. |
| virtual [get_Current](./get_current/)() const | Haalt het huidige element op. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | Verplaatst de iterator één stap vooruit. |
| [InitializeIterator](./initializeiterator/)() override | Voert de eerste [MoveNext()](./movenext/) oproep uit en bereidt het enumerator‑object voor om te worden gebruikt door VirtualizedIterator. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | Markeert de enumerator die eigendom is van de gevirtualiseerde iterator. |
| virtual [MoveNext](./movenext/)() | Verplaatst de enumerator naar het volgende element. Als er eerder geen element werd gerefereerd, wordt de referentie ingesteld op het eerste beschikbare element. Als het einde van de container is bereikt, gebeurt er niets. |
| virtual [Reset](./reset/)() | Reset de enumerator naar de positie vóór het eerste element. |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ValueType](./valuetype/) | Waarde‑type. |
## Opmerkingen



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Maak de List‑klasse‑instantie aan.
  auto collection = MakeObject<List<int>>();

  // Vul de lijst.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // Haal de enumerator van de lijst op.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // Haal het huidige element op en druk het af.
    std::cout << enumerator->get_Current() << ' ';
  }

  // Reset de enumerator.
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
