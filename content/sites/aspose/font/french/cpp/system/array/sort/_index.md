---
title: "Méthode System::Array::Sort"
linktitle: "Tri"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Array::Sort. Trie deux tableaux, l'un contenant les clés et l'autre les éléments correspondants, en se basant sur les valeurs du tableau contenant les clés, dont les éléments sont comparés à l'aide de l'opérateur< en C++."
type: docs
weight: 5800
url: /fr/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


Trie deux tableaux, l'un contenant les clés et l'autre les éléments correspondants, en fonction des valeurs du tableau contenant les clés, dont les éléments sont comparés à l'aide de l'opérateur <.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| Paramètre | Description |
| --- | --- |
| TKey | Le type des éléments du tableau **keys** |
| TValue | le type des éléments du tableau **items** |

| Paramètre | Type | Description |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) qui contient les valeurs des clés |
| items | const ArrayPtr\<TValue\>\& | [Array](../) qui contient les éléments qui sont associés aux valeurs des clés dans le tableau **keys** |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


Trie deux tableaux, l'un contenant les clés et l'autre les éléments correspondants, en fonction des valeurs du tableau contenant les clés, dont les éléments sont comparés à l'aide du comparateur par défaut.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| Paramètre | Description |
| --- | --- |
| TKey | Le type des éléments du tableau **keys** |
| TValue | le type des éléments du tableau **items** |

| Paramètre | Type | Description |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) qui contient les valeurs des clés |
| items | const ArrayPtr\<TValue\>\& | [Array](../) qui contient les éléments qui sont associés aux valeurs des clés dans le tableau **keys** |
| indice | int | L'index désignant le début de la plage à trier |
| longueur | int | Le nombre d'éléments dans la plage à trier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


Trie les éléments du tableau spécifié en utilisant le comparateur par défaut.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Tableau cible |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Trie les éléments du tableau spécifié en utilisant le comparateur spécifié.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Tableau cible |
| comparateur | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | Objet IComparer<T> utilisé pour comparer les éléments du tableau |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


NON IMPLEMENTÉ.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


Trie une plage d'éléments du tableau spécifié en utilisant le comparateur par défaut.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Tableau cible |
| startIndex | int | L'index désignant le début de la plage d'éléments à trier |
| count | int | La taille de la plage d'éléments à trier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
