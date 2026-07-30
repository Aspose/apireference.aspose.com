---
title: "Méthode System::Collections::Generic::_net_binnary_search"
linktitle: "_net_binnary_search"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Collections::Generic::_net_binnary_search. Implémente la recherche binaire dans un conteneur à accès aléatoire. Spécialisation pour les pointeurs intelligents. Utilise la méthode System::Object::CompareTo en C++."
type: docs
weight: 4900
url: /fr/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implémente la recherche binaire dans un conteneur à accès aléatoire. Spécialisation pour les pointeurs intelligents. Utilise la méthode System::Object::CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Paramètre | Description |
| --- | --- |
| containerT | Type de modèle de conteneur de style STL avec deux arguments de modèle : le type d’élément et le type d’allocation. |
| T | Type d'élément. |
| Allocator | Type d’allocation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| conteneur | const containterT\<T, Allocator\>\& | Conteneur dans lequel rechercher. |
| indice | int | Indice de début de la plage de recherche. |
| count | int | Longueur de la plage de recherche. |
| valeur | T | Valeur à rechercher. |

### ReturnValue

Si trouvé, indice de l'élément suivant ; sinon, complément de l'indice où la recherche s'est arrêtée.

## Voir aussi

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implémente la recherche binaire dans un conteneur à accès aléatoire. Spécialisation pour les types valeur. Utilise la méthode CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Paramètre | Description |
| --- | --- |
| containerT | Type de modèle de conteneur de style STL avec deux arguments de modèle : le type d’élément et le type d’allocation. |
| T | Type d'élément. |
| Allocator | Type d’allocation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| conteneur | const containterT\<T, Allocator\>\& | Conteneur dans lequel rechercher. |
| indice | int | Indice de début de la plage de recherche. |
| count | int | Longueur de la plage de recherche. |
| valeur | T | Valeur à rechercher. |

### ReturnValue

Si trouvé, indice de l'élément suivant ; sinon, complément de l'indice où la recherche s'est arrêtée.

## Voir aussi

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implémente la recherche binaire dans un conteneur à accès aléatoire. Spécialisation pour les types scalaires. Compare les éléments en utilisant les opérateurs supérieur et inférieur.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Paramètre | Description |
| --- | --- |
| containerT | Type de modèle de conteneur de style STL avec deux arguments de modèle : le type d’élément et le type d’allocation. |
| T | Type d'élément. |
| Allocator | Type d’allocation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| conteneur | const containterT\<T, Allocator\>\& | Conteneur dans lequel rechercher. |
| indice | int | Indice de début de la plage de recherche. |
| count | int | Longueur de la plage de recherche. |
| valeur | T | Valeur à rechercher. |

### ReturnValue

Si trouvé, indice de l'élément suivant ; sinon, complément de l'indice où la recherche s'est arrêtée.

## Voir aussi

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Implémente la recherche binaire dans un conteneur à accès aléatoire.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Paramètre | Description |
| --- | --- |
| containerT | Type de modèle de conteneur de style STL avec deux arguments de modèle : le type d’élément et le type d’allocation. |
| T | Type d'élément. |
| Allocator | Type d’allocation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| conteneur | const containterT\<T, Allocator\>\& | Conteneur dans lequel rechercher. |
| indice | int | Indice de début de la plage de recherche. |
| count | int | Longueur de la plage de recherche. |
| valeur | T | Valeur à rechercher. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) objet. |

### ReturnValue

Si trouvé, indice de l'élément suivant ; sinon, complément de l'indice où la recherche s'est arrêtée.

## Voir aussi

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
