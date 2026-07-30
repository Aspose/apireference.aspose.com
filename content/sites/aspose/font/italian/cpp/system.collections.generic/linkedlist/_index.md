---
title: "classe System::Collections::Generic::LinkedList"
linktitle: "LinkedList"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::LinkedList. Dichiarazione forward di LinkedList in C++."
type: docs
weight: 3100
url: /it/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di valore contenuto. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const T\&) override | Aggiunge **element** alla fine della lista. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Aggiunge **element** dopo **node** della lista. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Aggiunge **newNode** dopo **node** della lista. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Aggiunge **element** prima di **node** della lista. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Aggiunge **newNode** prima di **node** della lista. |
| [AddFirst](./addfirst/)(const T\&) | Aggiunge **element** all'inizio della lista. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Aggiunge **newNode** all'inizio della lista. |
| [AddLast](./addlast/)(const T\&) | Aggiunge **element** alla fine della lista. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Aggiunge **newNode** alla fine della lista. |
| [begin](./begin/)() | Ottiene l'iteratore al primo elemento della raccolta. |
| [begin](./begin/)() const | Ottiene l'iteratore al primo elemento della collezione qualificata come const. |
| [cbegin](./cbegin/)() const | Ottiene l'iteratore al primo elemento qualificato come const della collezione. |
| [cend](./cend/)() const | Ottiene l'iteratore per un elemento qualificato const inesistente oltre la fine della collezione. |
| [Clear](./clear/)() override | Elimina tutti gli elementi nella lista. |
| [Contains](./contains/)(const T\&) const override | Verifica se **element** è presente nella lista. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Copia i dati del contenitore negli elementi dell'array esistente. |
| [crbegin](./crbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento qualificato const della raccolta (primo in ordine inverso). |
| [crend](./crend/)() const | Ottiene un iteratore inverso per un elemento qualificato const non esistente prima dell'inizio della raccolta. |
| [end](./end/)() | Ottiene l'iteratore per un elemento inesistente oltre la fine della collezione. |
| [end](./end/)() const | Ottiene l'iteratore per un elemento inesistente oltre la fine della collezione qualificata come const. |
| [Find](./find/)(const T\&) const | Esegue la ricerca in direzione forward di un **element** nella lista. |
| [FindLast](./findlast/)(const T\&) const | Esegue la ricerca in direzione reverse di un **element** nella lista. |
| [get_Count](./get_count/)() const override | Ottiene il numero di elementi nella lista. |
| [get_First](./get_first/)() const | Ottiene il puntatore al primo elemento nella lista. |
| [get_Last](./get_last/)() const | Ottiene il puntatore all'ultimo elemento nella lista. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore per iterare attraverso l'attuale [LinkedList](./). |
| [LinkedList](./linkedlist/)() | Crea un [LinkedList](./) vuoto. |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Costruttore di copia. |
| [rbegin](./rbegin/)() | Ottiene un iteratore inverso all'ultimo elemento della raccolta (primo in ordine inverso). |
| [rbegin](./rbegin/)() const | Ottiene un iteratore inverso all'ultimo elemento della raccolta qualificata const (primo in ordine inverso). |
| [Remove](./remove/)(const T\&) override | Rimuove la prima occorrenza dell'**element** specificato dalla lista. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Rimuove il nodo dalla lista. |
| [RemoveFirst](./removefirst/)() | Rimuove il primo nodo dalla lista. |
| [RemoveLast](./removelast/)() | Rimuove l'ultimo nodo dalla lista. |
| [rend](./rend/)() | Ottiene un iteratore inverso per un elemento non esistente prima dell'inizio della raccolta. |
| [rend](./rend/)() const | Ottiene un iteratore inverso per un elemento non esistente prima dell'inizio della raccolta qualificata const. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipo di iteratore inverso const. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [list_t](./list_t/) | Tipo di dato sottostante. |
| [reverse_iterator](./reverse_iterator/) | Tipo di iteratore inverso. |
## Osservazioni


Contenitore di lista collegata. Implementa un wrapper su std::list. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Crea un'istanza della classe LinkedList.
  auto list = MakeObject<LinkedList<int>>();

  // Riempire la lista collegata.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Stampa gli elementi della lista collegata.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## Vedi anche

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
