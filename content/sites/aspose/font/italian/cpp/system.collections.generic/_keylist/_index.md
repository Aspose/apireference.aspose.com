---
title: "System::Collections::Generic::_KeyList classe"
linktitle: "_KeyList"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::_KeyList classe. Implementa l'elenco delle chiavi del dizionario. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.collections.generic/_keylist/
---
## _KeyList class


Implementa l'elenco delle chiavi del dizionario. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| Parametro | Descrizione |
| --- | --- |
| Dict | [Dictionary](../dictionary/) tipo. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | Inizializza la collezione facendo riferimento al dizionario specificato. |
| [Contains](./contains/)(const TKey\&) const override | Verifica se la chiave specificata è presente nella collezione. |
| [idx_get](./idx_get/)(int) const override | Ottiene la chiave nella posizione specificata. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [TKey](./tkey/) | Tipo di chiave. |

## Vedi anche

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
