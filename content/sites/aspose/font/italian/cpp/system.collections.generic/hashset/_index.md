---
title: "System::Collections::Generic::HashSet class"
linktitle: "HashSet"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::HashSet class. Dichiarazione in avanti della classe HashSet in C++."
type: docs
weight: 1700
url: /it/cpp/system.collections.generic/hashset/
---
## HashSet class


Dichiarazione in avanti della classe [HashSet](./).

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [HashSet](./hashset/)() | Informazioni RTTI. |
| [HashSet](./hashset/)(int) | Crea un set vuoto con capacità specificata. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | Crea un set vuoto che utilizza il comparatore di uguaglianza specificato. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Crea un hashset basato su valori enumerabili. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [BaseType](./basetype/) | Tipo base. |
| [ThisPtr](./thisptr/) | Tipo puntatore. |
| [ThisType](./thistype/) | Tipo self. |
## Osservazioni


Implementazione di set basata su hashing. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
