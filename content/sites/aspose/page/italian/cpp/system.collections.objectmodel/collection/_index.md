---
title: "System::Collections::ObjectModel::Collection classe"
linktitle: "Collezione"
second_title: "Aspose.Page per C++"
description: "System::Collections::ObjectModel::Collection classe. Tipo base per collezioni generiche. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.collections.objectmodel/collection/
---
## Collection class


Tipo base per collezioni generiche. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const T\&) override | Aggiunge il valore al contenitore. |
| [Clear](./clear/)() override | Elimina tutti gli elementi. |
| [Collection](./collection/)() | Crea una collezione vuota. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | Verifica se l'elemento è presente nella collezione. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Copia gli elementi della collezione negli elementi di un array esistente. |
| [crbegin](./crbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento const-qualified della collezione (primo in ordine inverso). |
| [crend](./crend/)() const | Ottiene un iteratore inverso per un elemento const-qualified non esistente prima dell'inizio della collezione. |
| [get_Count](./get_count/)() const override | Ottiene il numero di elementi. |
| [get_Items](./get_items/)() | Accessor interno alla struttura dati. |
| [get_Items](./get_items/)() const | Accessor interno alla struttura dati. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore per iterare attraverso la collezione. |
| [idx_get](./idx_get/)(int) const override | Ottiene il valore all'indice specificato. |
| [idx_set](./idx_set/)(int, T) override | Imposta il valore all'indice specificato. |
| [IndexOf](./indexof/)(const T\&) const override | Cerca l'elemento nella collezione. |
| [Insert](./insert/)(int, const T\&) override | Inserisce l'elemento nella posizione specificata. |
| [operator[]](./operator[]/)(int) | Ottiene il valore all'indice specificato. |
| [operator[]](./operator[]/)(int) const | Ottiene il valore all'indice specificato. |
| [rbegin](./rbegin/)() | Restituisce un iteratore inverso all'ultimo elemento della collezione (primo in ordine inverso). |
| [rbegin](./rbegin/)() const | Restituisce un iteratore inverso all'ultimo elemento della collezione qualificata come const (primo in ordine inverso). |
| [Remove](./remove/)(const T\&) override | Rimuove l'elemento specifico. |
| [RemoveAt](./removeat/)(int) override | Rimuove l'elemento in una posizione specifica. |
| [rend](./rend/)() | Restituisce un iteratore inverso per un elemento inesistente prima dell'inizio della collezione. |
| [rend](./rend/)() const | Restituisce un iteratore inverso per un elemento inesistente prima dell'inizio della collezione qualificata come const. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Rende i puntatori memorizzati deboli (se applicabile). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Vedi anche

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
