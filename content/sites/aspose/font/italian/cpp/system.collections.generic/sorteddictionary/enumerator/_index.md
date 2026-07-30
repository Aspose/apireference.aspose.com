---
title: "System::Collections::Generic::SortedDictionary::Enumerator classe"
linktitle: "Enumerator"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::SortedDictionary::Enumerator classe. Tipo di enumeratore per iterare attraverso il dizionario. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.collections.generic/sorteddictionary/enumerator/
---
## Enumerator class


[Enumerator](./) type to iterate through dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Costruisce un enumeratore su un dizionario specifico. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) alias di tipo. |
## Vedi anche

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
