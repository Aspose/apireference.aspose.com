---
title: "classe System::Collections::Generic::_KeyCollection"
linktitle: "_KeyCollection"
second_title: "Aspose.Font per C++"
description: "Classe System::Collections::Generic::_KeyCollection. Collezione delle chiavi di Dictionary. Riferisce la collezione, non copia nulla. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


Collezione delle chiavi di [Dictionary](../dictionary/). Riferisce la collezione, non copia nulla. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Inizializza la collezione facendo riferimento al dizionario specificato. |
| [Contains](./contains/)(const TKey\&) const override | Verifica se l'elemento è presente nel contenitore. |
| [GetEnumerator](./getenumerator/)() override | Restituisce l'enumeratore che itera le chiavi. |
| [idx_get](./idx_get/)(int) const override | Implementa il metodo [IList](../ilist/). Non supportato. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const begin per il contenitore corrente. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Ottiene l'implementazione dell'iteratore begin per il contenitore corrente. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Ottiene l'implementazione dell'iteratore const end per il contenitore corrente. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Ottiene l'implementazione dell'iteratore end per il contenitore corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [TKey](./tkey/) | Tipo di chiave. |

## Vedi anche

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
