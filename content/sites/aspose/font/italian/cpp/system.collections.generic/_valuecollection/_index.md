---
title: "classe System::Collections::Generic::_ValueCollection"
linktitle: "_ValueCollection"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::_ValueCollection. Collezione dei valori di Dictionary. Riferisce la collezione, non copia nulla. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


Collezione dei valori di [Dictionary](../dictionary/). Riferisce la collezione, non copia nulla. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | Inizializza la collezione facendo riferimento al dizionario specificato. |
| [Contains](./contains/)(const TValue\&) const override | Verifica se l'elemento è presente nel contenitore. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore che itera attraverso i valori. |
| [idx_get](./idx_get/)(int) const override | Implementa il metodo [IList](../ilist/). Non supportato. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [TValue](./tvalue/) | Tipo valore. |

## Vedi anche

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
