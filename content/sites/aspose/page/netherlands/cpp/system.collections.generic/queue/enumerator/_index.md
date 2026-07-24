---
title: "System::Collections::Generic::Queue::Enumerator class"
linktitle: "Enumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::Queue::Enumerator class. Enumerator om door de wachtrij te itereren. Objecten van deze klasse mogen alleen worden toegewezen met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1800
url: /nl/cpp/system.collections.generic/queue/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through queue. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<queue_t>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Construeert een enumerator die naar een specifieke wachtrij wijst. |
## Zie ook

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Queue](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
