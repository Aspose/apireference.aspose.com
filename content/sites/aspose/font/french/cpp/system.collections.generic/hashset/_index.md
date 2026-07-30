---
title: "System::Collections::Generic::HashSet classe"
linktitle: "HashSet"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::HashSet classe. Déclaration anticipée de la classe HashSet en C++."
type: docs
weight: 1700
url: /fr/cpp/system.collections.generic/hashset/
---
## HashSet class


Déclaration anticipée de la classe [HashSet](./).

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [HashSet](./hashset/)() | Informations RTTI. |
| [HashSet](./hashset/)(int) | Crée un ensemble vide avec la capacité spécifiée. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | Crée un ensemble vide qui utilise le comparateur d'égalité spécifié. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Crée un HashSet basé sur des valeurs énumérables. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [BaseType](./basetype/) | Type de base. |
| [ThisPtr](./thisptr/) | Type de pointeur. |
| [ThisType](./thistype/) | Type auto. |
## Remarques


Implémentation d'ensemble basée sur le hachage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
