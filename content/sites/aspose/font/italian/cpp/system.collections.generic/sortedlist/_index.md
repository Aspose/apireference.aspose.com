---
title: "System::Collections::Generic::SortedList classe"
linktitle: "SortedList"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::SortedList classe. Lista ordinata che avvolge la struttura FlatMap. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 4200
url: /it/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Lista ordinata che avvolge la struttura FlatMap. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

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
| [crbegin](./crbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento qualificato const della raccolta (primo in ordine inverso). |
| [crend](./crend/)() const | Ottiene un iteratore inverso per un elemento qualificato const non esistente prima dell'inizio della raccolta. |
| [get_Capacity](./get_capacity/)() const | Ottiene la capacità corrente della lista. |
| virtual [get_Keys](./get_keys/)() const | Accede alla collezione delle chiavi. |
| virtual [get_Values](./get_values/)() const | Accede alla collezione dei valori. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore che itera attraverso la lista corrente. |
| [IndexOfKey](./indexofkey/)(TKey) const | Cerca una chiave specifica. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Cerca un valore specifico. |
| [rbegin](./rbegin/)() | Ottiene un iteratore inverso all'ultimo elemento della raccolta (primo in ordine inverso). |
| [rbegin](./rbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento della raccolta qualificata const (primo in ordine inverso). |
| [RemoveAt](./removeat/)(int) | Rimuove l'elemento alla posizione specificata. |
| [rend](./rend/)() | Ottiene un iteratore inverso per un elemento non esistente prima dell'inizio della raccolta. |
| [rend](./rend/)() const | Ottiene un iteratore inverso per un elemento non esistente prima dell'inizio della raccolta qualificata const. |
| [set_Capacity](./set_capacity/)(int) | Imposta la capacità della lista corrente. |
| [SortedList](./sortedlist/)() | Costruisce una lista vuota. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Costruisce una lista vuota. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Costruttore di copia. |
| [SortedList](./sortedlist/)(const map_t\&) | Costruttore di copia. |
| [SortedList](./sortedlist/)(int) | Costruisce una lista vuota. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipo di iteratore inverso const. |
| [IEnumerablePtr](./ienumerableptr/) | Collezione dello stesso tipo di coppie. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipo. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [KeyCollection](./keycollection/) | Tipo di collezione di chiavi. |
| [KVPair](./kvpair/) | Tipo di coppia chiave-valore. |
| [map_t](./map_t/) | Tipo di dato sottostante. |
| [Ptr](./ptr/) | Tipo puntatore. |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
| [this_t](./this_t/) | Questo tipo. |
| [ValueCollection](./valuecollection/) | Tipo di raccolta di valori. |

## Vedi anche

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
