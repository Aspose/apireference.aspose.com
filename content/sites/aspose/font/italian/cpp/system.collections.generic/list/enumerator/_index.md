---
title: "System::Collections::Generic::List::Enumerator classe"
linktitle: "Enumerator"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::List::Enumerator classe. Enumerator per iterare attraverso gli elementi della lista. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 6100
url: /it/cpp/system.collections.generic/list/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through list elements. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<vector_t>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Crea un enumeratore che itera attraverso una lista specifica. |
## Vedi anche

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
