---
title: "System::Collections::Generic::SortedSet classe"
linktitle: "SortedSet"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::SortedSet classe. Dichiarazione in avanti della classe SortedSet in C++."
type: docs
weight: 4400
url: /it/cpp/system.collections.generic/sortedset/
---
## SortedSet class


Dichiarazione in avanti della classe [SortedSet](./).

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Max](./get_max/)() const | Ottiene il valore massimo nel [SortedSet](./). |
| [SortedSet](./sortedset/)() | Informazioni RTTI. |
| [SortedSet](./sortedset/)(int) | Crea un set vuoto con capacità specificata. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | Crea un set vuoto che utilizza il comparatore di uguaglianza specificato. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Crea [SortedSet](./) basato su valori enumerabili. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Tipo vaso. |
| [ThisPtr](./thisptr/) | Tipo puntatore. |
| [ThisType](./thistype/) | Tipo self. |
## Osservazioni


Implementazione di un insieme di oggetti ordinati. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverrà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
