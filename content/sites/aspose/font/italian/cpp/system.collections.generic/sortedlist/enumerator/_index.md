---
title: "System::Collections::Generic::SortedList::Enumerator classe"
linktitle: "Enumerator"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::SortedList::Enumerator classe. Classe enumeratore per iterare attraverso la lista. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2600
url: /it/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Crea un enumeratore che itera attraverso un dizionario specifico. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) alias di tipo. |
## Vedi anche

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
