---
title: "Classe System::Collections::Generic::Queue::Enumerator"
linktitle: "Enumerator"
second_title: "Aspose.Font per C++"
description: "Classe System::Collections::Generic::Queue::Enumerator. Enumeratore per iterare attraverso la coda. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1800
url: /it/cpp/system.collections.generic/queue/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through queue. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<queue_t>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Costruisce un enumeratore che punta a una coda specifica. |
## Vedi anche

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Queue](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
