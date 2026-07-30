---
title: "System::Collections::Generic::SortedDictionary classe"
linktitle: "SortedDictionary"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::SortedDictionary classe. Dichiarazione in avanti del tipo di dizionario ordinato in C++."
type: docs
weight: 4000
url: /it/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Dichiarazione in avanti del tipo dizionario ordinato.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | Ottiene il [IComparer<TKey>](../icomparer/) usato per ordinare gli elementi del SortedDictionary<TKey,TValue>. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Funzione di accesso singleton. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore per iterare attraverso il dizionario corrente. |
| [rbegin](./rbegin/)() | Ottiene un iteratore inverso all'ultimo elemento della raccolta (primo in ordine inverso). |
| [rbegin](./rbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento della raccolta qualificata const (primo in ordine inverso). |
| [rend](./rend/)() | Ottiene un iteratore inverso per un elemento non esistente prima dell'inizio della raccolta. |
| [rend](./rend/)() const | Ottiene un iteratore inverso per un elemento non esistente prima dell'inizio della raccolta qualificata const. |
| [SortedDictionary](./sorteddictionary/)() | Costruisce un dizionario vuoto. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Costruisce un dizionario vuoto. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Costruttore di copia. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Costruttore di copia. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipo di iteratore inverso const. |
| [IEnumerablePtr](./ienumerableptr/) | Collezione di elementi identici. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipo. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [KeyCollection](./keycollection/) | Tipo di collezione di chiavi. |
| [KVPair](./kvpair/) | Tipo di coppia chiave-valore. |
| [map_t](./map_t/) | Tipo di dato sottostante. |
| [Ptr](./ptr/) | Tipo puntatore. |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
| [this_t](./this_t/) | Tipo self. |
| [ValueCollection](./valuecollection/) | Tipo di raccolta di valori. |
## Osservazioni


Classe di dizionario ordinato che avvolge STL map. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
