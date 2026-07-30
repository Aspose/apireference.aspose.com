---
title: "System::Collections::CollectionBase classe"
linktitle: "CollectionBase"
second_title: "Aspose.Font per C++"
description: "System::Collections::CollectionBase classe. Fornisce una classe base astratta per una collezione tipizzata in modo forte in C++."
type: docs
weight: 300
url: /it/cpp/system.collections/collectionbase/
---
## CollectionBase class


Fornisce una classe base astratta per una collezione tipizzata fortemente.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elementi della collezione |
## Nested classes

* Class [ListImpl](./listimpl/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clear](./clear/)() | Rimuove tutti gli oggetti dall'istanza della collezione. Questo metodo non può essere sovrascritto. |
| [get_Capacity](./get_capacity/)() | Restituisce il numero di elementi che la collezione può contenere. |
| [get_Count](./get_count/)() | Restituisce il numero di elementi contenuti nell'istanza della collezione. Questo metodo non può essere sovrascritto. |
| [GetEnumerator](./getenumerator/)() override | Restituisce un enumeratore che itera attraverso l'istanza della collezione. |
| [RemoveAt](./removeat/)(int32_t) | Rimuove l'elemento all'indice specificato dell'istanza della collezione. Questo metodo non è sovrascrivibile. |
| [set_Capacity](./set_capacity/)(int32_t) | Imposta il numero di elementi che la collezione può contenere. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del template a un puntatore debole (invece di condiviso). Consente di passare i puntatori nei contenitori alla modalità debole. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |

## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
