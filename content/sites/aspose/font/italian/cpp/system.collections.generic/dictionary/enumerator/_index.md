---
title: "System::Collections::Generic::Dictionary::Enumerator classe"
linktitle: "Enumerator"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::Dictionary::Enumerator classe. Enumeratore che consente di iterare attraverso il dizionario. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.collections.generic/dictionary/enumerator/
---
## Enumerator class


[Enumerator](./) that allows iterating through the dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Informazioni RTTI. |
| [Enumerator](./enumerator/)(Ptr) | Crea enumeratore. |
## Vedi anche

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
