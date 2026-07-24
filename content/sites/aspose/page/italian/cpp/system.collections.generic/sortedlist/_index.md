---
title: "Classe System::Collections::Generic::SortedList"
linktitle: "SortedList"
second_title: "Aspose.Page per C++"
description: "Classe System::Collections::Generic::SortedList. Lista ordinata che avvolge la struttura FlatMap. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 4200
url: /it/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Lista ordinata che avvolge la struttura FlatMap. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
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
| [crbegin](./crbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento const-qualified della collezione (primo in ordine inverso). |
| [crend](./crend/)() const | Ottiene un iteratore inverso per un elemento const-qualified non esistente prima dell'inizio della collezione. |
| [get_Capacity](./get_capacity/)() const | Ottiene la capacità corrente dell'elenco. |
| virtual [get_Keys](./get_keys/)() const | Accede alla collezione delle chiavi. |
| virtual [get_Values](./get_values/)() const | Accede alla collezione dei valori. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore che itera attraverso la lista corrente. |
| [IndexOfKey](./indexofkey/)(TKey) const | Cerca una chiave specifica. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Cerca un valore specifico. |
| [rbegin](./rbegin/)() | Restituisce un iteratore inverso all'ultimo elemento della collezione (primo in ordine inverso). |
| [rbegin](./rbegin/)() const | Restituisce un iteratore inverso all'ultimo elemento della collezione qualificata come const (primo in ordine inverso). |
| [RemoveAt](./removeat/)(int) | Rimuove l'elemento alla posizione specificata. |
| [rend](./rend/)() | Restituisce un iteratore inverso per un elemento inesistente prima dell'inizio della collezione. |
| [rend](./rend/)() const | Restituisce un iteratore inverso per un elemento inesistente prima dell'inizio della collezione qualificata come const. |
| [set_Capacity](./set_capacity/)(int) | Imposta la capacità della lista corrente. |
| [SortedList](./sortedlist/)() | Crea una lista vuota. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Crea una lista vuota. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Costruttore di copia. |
| [SortedList](./sortedlist/)(const map_t\&) | Costruttore di copia. |
| [SortedList](./sortedlist/)(int) | Crea una lista vuota. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipo di iteratore inverso const. |
| [IEnumerablePtr](./ienumerableptr/) | Collezione dello stesso tipo di coppie. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipo. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [KeyCollection](./keycollection/) | Tipo di collezione delle chiavi. |
| [KVPair](./kvpair/) | Tipo di coppia chiave-valore. |
| [map_t](./map_t/) | Tipo di dato sottostante. |
| [Ptr](./ptr/) | Tipo di puntatore. |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
| [this_t](./this_t/) | Questo tipo. |
| [ValueCollection](./valuecollection/) | Tipo di collezione dei valori. |

## Vedi anche

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
