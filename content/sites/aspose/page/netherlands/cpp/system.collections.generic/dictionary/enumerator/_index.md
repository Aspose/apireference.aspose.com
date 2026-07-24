---
title: "System::Collections::Generic::Dictionary::Enumerator class"
linktitle: "Enumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::Dictionary::Enumerator class. Enumerator die itereren door de dictionary mogelijk maakt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 1000
url: /nl/cpp/system.collections.generic/dictionary/enumerator/
---
## Enumerator class


[Enumerator](./) that allows iterating through the dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | RTTI-informatie. |
| [Enumerator](./enumerator/)(Ptr) | Maakt enumerator aan. |
## Zie ook

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
