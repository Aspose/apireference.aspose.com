---
title: "Classe System::Collections::Generic::SortedSet"
linktitle: "SortedSet"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::SortedSet. Déclaration anticipée de la classe SortedSet en C++."
type: docs
weight: 4400
url: /fr/cpp/system.collections.generic/sortedset/
---
## SortedSet class


Déclaration anticipée de la classe [SortedSet](./).

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Max](./get_max/)() const | Obtient la valeur maximale dans le [SortedSet](./). |
| [SortedSet](./sortedset/)() | Informations RTTI. |
| [SortedSet](./sortedset/)(int) | Crée un ensemble vide avec la capacité spécifiée. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | Crée un ensemble vide qui utilise le comparateur d'égalité spécifié. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Crée un [SortedSet](./) à partir de valeurs énumérables. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Type vase. |
| [ThisPtr](./thisptr/) | Type de pointeur. |
| [ThisType](./thistype/) | Type auto. |
## Remarques


Implémentation d'un ensemble d'objets ordonnés. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

## Voir aussi

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
