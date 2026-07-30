---
title: "System::Collections::Generic::IList class"
linktitle: "IList"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::IList class. Interfaccia di contenitore indicizzato di elementi. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2600
url: /it/cpp/system.collections.generic/ilist/
---
## IList class


Interfaccia di contenitore indicizzato di elementi. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Verifica se la collezione ha dimensione fissa. |
| virtual [idx_get](./idx_get/)(int) const | Ottiene l'elemento all'indice specificato. |
| virtual [idx_set](./idx_set/)(int, T) | Imposta l'elemento all'indice specificato. |
| virtual [IndexOf](./indexof/)(const T\&) const | Restituisce l'indice della prima occorrenza dell'elemento nel contenitore. |
| virtual [Insert](./insert/)(int, const T\&) | Inserisce l'elemento nella posizione specificata, spostando gli altri elementi. |
| virtual [RemoveAt](./removeat/)(int) | Rimuove l'elemento all'indice specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Informazioni RTTI. |
| [ThisType](./thistype/) | Questo tipo. |
| [ValueType](./valuetype/) | Tipo valore. |

## Vedi anche

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
