---
title: "classe System::Collections::Generic::List"
linktitle: "List"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::List. Dichiarazione anticipata di List in C++."
type: docs
weight: 3300
url: /it/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | Specifico per C++. |
| [Add](./add/)(const T\&) override | Aggiunge un elemento alla fine della lista. |
| [AddInitializer](./addinitializer/)(int, const T *) | Aggiunge elementi alla lista; usato durante la traduzione degli inizializzatori. |
| [AddRange](./addrange/)(IEnumerablePtr) | Aggiunge tutti gli elementi dalla collezione (o da sé) alla fine della lista corrente. |
| [AsReadOnly](./asreadonly/)() | Ottiene un riferimento di sola lettura a questa collezione. |
| [begin](./begin/)() | Ottiene l'iteratore al primo elemento della raccolta. |
| [begin](./begin/)() const | Ottiene l'iteratore al primo elemento della collezione qualificata come const. |
| [BinarySearch](./binarysearch/)(const T\&) const | Cerca l'elemento in una lista ordinata. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Cerca l'elemento in una lista ordinata. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Cerca l'elemento in una lista ordinata. |
| [cbegin](./cbegin/)() const | Ottiene l'iteratore al primo elemento qualificato come const della collezione. |
| [cend](./cend/)() const | Ottiene l'iteratore per un elemento qualificato const inesistente oltre la fine della collezione. |
| [Clear](./clear/)() override | Elimina tutti gli elementi. |
| [Contains](./contains/)(const T\&) const override | Verifica se l'elemento è presente nell'elenco. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | Crea una lista di elementi convertiti in un tipo diverso. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Copia gli elementi della lista in elementi di un array esistente. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | Copia tutti gli elementi in elementi di un array esistente. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | Copia gli elementi a partire dall'indice specificato in elementi di un array esistente. |
| [crbegin](./crbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento qualificato const della raccolta (primo in ordine inverso). |
| [crend](./crend/)() const | Ottiene un iteratore inverso per un elemento qualificato const non esistente prima dell'inizio della raccolta. |
| [data](./data/)() | Funzione di accesso alla struttura dati sottostante. |
| [data](./data/)() const | Funzione di accesso alla struttura dati sottostante. |
| [end](./end/)() | Ottiene l'iteratore per un elemento inesistente oltre la fine della collezione. |
| [end](./end/)() const | Ottiene l'iteratore per un elemento inesistente oltre la fine della collezione qualificata come const. |
| [Exists](./exists/)(System::Predicate\<T\>) | Verifica se nella lista esiste un elemento che soddisfa un predicato specifico. |
| [Find](./find/)(System::Predicate\<T\>) | Cerca un elemento che soddisfa un predicato specifico. |
| [FindAll](./findall/)(System::Predicate\<T\>) | Cerca elementi che soddisfano un predicato specifico. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | Cerca un elemento che soddisfa un predicato specifico. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | Cerca un elemento che soddisfa un predicato specifico. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | Cerca un elemento che soddisfa un predicato specifico. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | Cerca l'ultimo elemento che soddisfa un predicato specifico. |
| [ForEach](./foreach/)(System::Action\<T\>) | Applica un'azione a tutti gli elementi della lista. |
| [get_Capacity](./get_capacity/)() const | Ottiene la capacità corrente della lista. |
| [get_Count](./get_count/)() const override | Ottiene il numero di elementi nella lista corrente. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore per iterare attraverso gli elementi della lista. |
| [GetRange](./getrange/)(int, int) | Crea una porzione della lista. |
| [idx_get](./idx_get/)(int) const override | Ottiene l'elemento in una posizione specifica. |
| [idx_set](./idx_set/)(int, T) override | Imposta l'elemento in una posizione specifica. |
| [IndexOf](./indexof/)(const T\&) const override | Ottiene il primo indice dell'elemento specifico. |
| [IndexOf](./indexof/)(const T\&, int) const | Cerca l'elemento specifico nella lista. |
| [Insert](./insert/)(int, const T\&) override | Inserisce l'elemento nella posizione specificata. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | Inserisce un intervallo di dati nella posizione specifica. |
| [LastIndexOf](./lastindexof/)(const T\&) const | Cerca l'oggetto specificato e restituisce l'indice basato su zero dell'ultima occorrenza nell'intera lista. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | Cerca l'oggetto specificato e restituisce l'indice basato su zero dell'ultima occorrenza nell'intervallo di elementi nella [List](./) che si estende dal primo elemento all'indice specificato. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | Cerca l'oggetto specificato e restituisce l'indice basato su zero dell'ultima occorrenza nell'intervallo di elementi nella [List](./) che contiene il numero specificato di elementi e termina all'indice specificato. |
| [List](./list/)() | Crea una lista vuota. |
| [List](./list/)(int) | Crea una lista con capacità predefinita. |
| [List](./list/)(IEnumerablePtr) | Costruttore di copia. |
| [operator[]](./operator[]/)(int) | Funzione di accesso. |
| [operator[]](./operator[]/)(int) const | Funzione di accesso. |
| [rbegin](./rbegin/)() | Ottiene un iteratore inverso all'ultimo elemento della raccolta (primo in ordine inverso). |
| [rbegin](./rbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento della raccolta qualificata const (primo in ordine inverso). |
| [Remove](./remove/)(const T\&) override | Rimuove la prima istanza dell'elemento specifico dall'elenco. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | Rimuove tutti gli elementi che corrispondono al predicato specifico. |
| [RemoveAt](./removeat/)(int) override | Rimuove l'elemento alla posizione specificata. |
| [RemoveRange](./removerange/)(int, int) | Rimuove una porzione della lista. |
| [rend](./rend/)() | Ottiene un iteratore inverso per un elemento non esistente prima dell'inizio della raccolta. |
| [rend](./rend/)() const | Ottiene un iteratore inverso per un elemento non esistente prima dell'inizio della raccolta qualificata const. |
| [Reverse](./reverse/)() | Inverte l'ordine degli elementi dell'intera lista. |
| [Reverse](./reverse/)(int, int) | Inverte l'ordine degli elementi della porzione della lista. |
| [set_Capacity](./set_capacity/)(int) | Imposta la capacità della lista. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Ordina gli elementi nella lista. |
| [Sort](./sort/)() | Ordina gli elementi nella lista usando il comparatore predefinito. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | Ordina gli elementi nella porzione della lista. |
| [Sort](./sort/)(Comparison\<T\>, bool) | Ordina gli elementi nella lista. |
| [ToArray](./toarray/)() const | Converte la lista in un array. |
| [TrimExcess](./trimexcess/)() | Adatta la capacità della lista alla sua dimensione. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | Determina se ogni elemento nella collezione corrisponde alle condizioni definite dal predicato specificato. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Tipo di interfaccia. |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipo di iteratore inverso const. |
| [IEnumerablePtr](./ienumerableptr/) | Contenitore che contiene elementi dello stesso tipo che gestiamo. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipo. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
| [ValueType](./valuetype/) | Questo tipo. |
| [vector_t](./vector_t/) | Informazioni RTTI. |
## Osservazioni


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Crea la prima lista.
  auto list1 = MakeObject<List<int>>();

  // Riempi la prima lista.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // Ordina la prima lista.
  // Gli elementi della prima lista saranno: {-5, 1, 3, 8}
  list1->Sort();

  // Rimuovi l'elemento all'indice 2.
  // Gli elementi della prima lista saranno: {-5, 1, 8}
  list1->RemoveAt(2);

  // Inserisci l'elemento all'indice 1.
  // Gli elementi della prima lista saranno: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // Crea la seconda lista.
  auto list2 = MakeObject<List<int>>();

  // Riempi la seconda lista.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // Aggiungi gli elementi dalla seconda lista alla prima.
  list1->AddRange(list2);

  // Stampa gli elementi della prima lista.
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## Vedi anche

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
