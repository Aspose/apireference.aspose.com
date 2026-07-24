---
title: "System::Collections::Concurrent::ConcurrentDictionary klasse"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Concurrent::ConcurrentDictionary klasse. Thread‑veilige woordenboekimplementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 100
url: /nl/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


Thread‑veilige woordenboekimplementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Parameter | Beschrijving |
| --- | --- |
| TKey | Sleuteltype. |
| TValue | Waarde‑type. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | Voegt een waarde toe aan het woordenboek. |
| [Clear](./clear/)() override | Verwijdert alle elementen in de container. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | Kopieert container‑elementen naar bestaande array‑elementen. |
| [get_KeysInternal](./get_keysinternal/)() const override | Haalt de wrappercollectie op om toegang te krijgen tot de sleutels van de dictionary. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | RTTI-informatie. |
| [Remove](./remove/)(const TKey\&) override | Verwijdert element uit de container. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | Probeert een sleutel/waarde-paar toe te voegen aan de dictionary. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | Implementatietype. |
| [ThisType](./thistype/) | Dit type. |
## Opmerkingen



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // Maak een instantie van de ConcurrentDictionary-klasse aan.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // Vul de concurrent dictionary.
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## Zie ook

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Page for C++](../../)
