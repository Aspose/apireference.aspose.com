---
title: "System::Collections::Generic::Dictionary classe"
linktitle: "Dictionary"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::Dictionary classe. Dichiarazione in avanti della classe Dictionary in C++."
type: docs
weight: 1100
url: /it/cpp/system.collections.generic/dictionary/
---
## Dictionary class


Dichiarazione in avanti della classe [Dictionary](./).

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| Parametro | Descrizione |
| --- | --- |
| TKey | Tipo di chiave. |
| TValue | Tipo valore. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dictionary](./dictionary/)() | Crea un dizionario vuoto. |
| [Dictionary](./dictionary/)(const map_t\&) | Copia i dati dalla mappa. |
| [Dictionary](./dictionary/)(int) | Sovraccarico che corrisponde alla creazione di un dizionario pre-allocato; in realtà non effettua alcuna allocazione. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Costruttore di copia. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Costruttore di copia. |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Crea un dizionario vuoto. |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Crea un dizionario vuoto. |
| [GetEnumerator](./getenumerator/)() override | Crea un oggetto enumeratore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Puntatore all'interfaccia enumerabile. |
| [IEnumeratorPtr](./ienumeratorptr/) | Puntatore all'enumeratore. |
| [KeyCollection](./keycollection/) | Informazioni RTTI. |
| [KVPair](./kvpair/) | Tipo di coppia chiave-valore. |
| [map_t](./map_t/) | Tipo di dato sottostante. |
| [Ptr](./ptr/) | Tipo puntatore. |
| [ValueCollection](./valuecollection/) | Collezione di valori da estrarre. |
## Osservazioni


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Crea l'istanza della classe Dictionary.
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // Riempi il dizionario.
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // Stampa gli elementi del dizionario.
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## Vedi anche

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
