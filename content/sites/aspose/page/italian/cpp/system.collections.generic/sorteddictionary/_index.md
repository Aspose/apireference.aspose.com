---
title: "classe System::Collections::Generic::SortedDictionary"
linktitle: "SortedDictionary"
second_title: "Aspose.Page per C++"
description: "classe System::Collections::Generic::SortedDictionary. Dichiarazione in avanti del tipo dizionario ordinato in C++."
type: docs
weight: 4000
url: /it/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Dichiarazione in avanti del tipo di dizionario ordinato.

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
| [crbegin](./crbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento const-qualified della collezione (primo in ordine inverso). |
| [crend](./crend/)() const | Ottiene un iteratore inverso per un elemento const-qualified non esistente prima dell'inizio della collezione. |
| [get_Comparer](./get_comparer/)() const | Restituisce il [IComparer<TKey>](../icomparer/) usato per ordinare gli elementi del SortedDictionary<TKey,TValue>. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Funzione di accesso singleton. |
| [GetEnumerator](./getenumerator/)() override | Restituisce l'enumeratore per iterare attraverso il dizionario corrente. |
| [rbegin](./rbegin/)() | Restituisce un iteratore inverso all'ultimo elemento della collezione (primo in ordine inverso). |
| [rbegin](./rbegin/)() const | Restituisce un iteratore inverso all'ultimo elemento della collezione qualificata come const (primo in ordine inverso). |
| [rend](./rend/)() | Restituisce un iteratore inverso per un elemento inesistente prima dell'inizio della collezione. |
| [rend](./rend/)() const | Restituisce un iteratore inverso per un elemento inesistente prima dell'inizio della collezione qualificata come const. |
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
| [KeyCollection](./keycollection/) | Tipo di collezione delle chiavi. |
| [KVPair](./kvpair/) | Tipo di coppia chiave-valore. |
| [map_t](./map_t/) | Tipo di dato sottostante. |
| [Ptr](./ptr/) | Tipo di puntatore. |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
| [this_t](./this_t/) | Tipo self. |
| [ValueCollection](./valuecollection/) | Tipo di collezione dei valori. |
## Osservazioni


Classe di dizionario ordinato che avvolge una mappa STL. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
