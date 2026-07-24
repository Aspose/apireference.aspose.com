---
title: "System::Collections::Generic::SortedDictionary::Enumerator class"
linktitle: "Enumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::SortedDictionary::Enumerator class. Enumeratortype om door de dictionary te itereren. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wrap deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2100
url: /nl/cpp/system.collections.generic/sorteddictionary/enumerator/
---
## Enumerator class


[Enumerator](./) type to iterate through dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Construeert een enumerator over een specifieke dictionary. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) type-alias. |
## Zie ook

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
