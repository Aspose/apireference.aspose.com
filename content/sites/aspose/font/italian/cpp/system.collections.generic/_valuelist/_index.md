---
title: "System::Collections::Generic::_ValueList classe"
linktitle: "_ValueList"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::_ValueList classe. Implementa l'elenco dei valori del dizionario. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Implementa l'elenco dei valori del dizionario. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare tale puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Parametro | Descrizione |
| --- | --- |
| Dict | [Dictionary](../dictionary/) tipo. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | Inizializza la collezione facendo riferimento al dizionario specificato. |
| virtual [idx_get](./idx_get/)(int) const | Ottiene il valore nella posizione specificata. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [TValue](./tvalue/) | Tipo valore. |

## Vedi anche

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
