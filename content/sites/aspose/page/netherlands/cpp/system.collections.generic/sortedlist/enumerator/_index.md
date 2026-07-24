---
title: "System::Collections::Generic::SortedList::Enumerator klasse"
linktitle: "Enumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::SortedList::Enumerator class. Enumerator-klasse om door de lijst te itereren. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2600
url: /nl/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Maakt een enumerator die door een specifiek woordenboek itereert. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) type-alias. |
## Zie ook

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
