---
title: "classe System::Collections::Generic::ICollection"
linktitle: "ICollection"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::ICollection. Interfaccia di una collezione di elementi. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1900
url: /it/cpp/system.collections.generic/icollection/
---
## ICollection class


Interfaccia di una collezione di elementi. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Add](./add/)(const T\&) | Aggiunge un elemento alla collezione. |
| virtual [Clear](./clear/)() | Elimina tutti gli elementi dalla collezione. |
| virtual [Contains](./contains/)(const T\&) const | Verifica se l'elemento è presente nella collezione. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | Copia tutti gli elementi della collezione in elementi di un array esistente. |
| virtual [get_Count](./get_count/)() const | Ottiene il numero di elementi nella collezione. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | Verifica se la collezione è di sola lettura. |
| [get_SyncRoot](./get_syncroot/)() const | Ottiene l'oggetto attraverso il quale la collezione è sincronizzata. |
| [ICollection](./icollection/)() | Costruttore predefinito. |
| [ICollection](./icollection/)(const ICollection\&) | Costruttore di copia. |
| [ICollection](./icollection/)(ICollection\&&) | Costruttore di spostamento. |
| [operator=](./operator=/)(ICollection\&&) | Operatore di assegnazione di spostamento. |
| [operator=](./operator=/)(const ICollection\&) | Operatore di assegnazione di spostamento. |
| virtual [Remove](./remove/)(const T\&) | Elimina l'elemento dalla collezione. |
| virtual [~ICollection](./~icollection/)() | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ThisType](./thistype/) | Nome del tipo di collezione. |
| [ValueType](./valuetype/) | Informazioni RTTI. |

## Vedi anche

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
