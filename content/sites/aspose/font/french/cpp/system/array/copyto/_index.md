---
title: "méthode System::Array::CopyTo"
linktitle: "CopyTo"
second_title: "Aspose.Font pour C++"
description: "méthode System::Array::CopyTo. Copie tous les éléments du tableau actuel vers le tableau de destination spécifié. Les éléments sont insérés dans le tableau de destination à partir de l'indice spécifié par l'argument arrayIndex en C++."
type: docs
weight: 900
url: /fr/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Copie tous les éléments du tableau actuel vers le tableau de destination spécifié. Les éléments sont insérés dans le tableau de destination à partir de l'index spécifié par l'argument arrayIndex.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Tableau de destination |
| arrayIndex | int | Indice dans le tableau de destination où commencer à insérer les éléments copiés |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Copie tous les éléments du tableau actuel vers le tableau de destination spécifié. Les éléments sont insérés dans le tableau de destination à partir de l'index spécifié par l'argument dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Paramètre | Description |
| --- | --- |
| DstType | Type des éléments dans le tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| dstIndex | int64_t | Indice dans le tableau de destination où commencer à insérer les éléments copiés |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Copie un nombre spécifié d'éléments du tableau actuel à partir de la position spécifiée vers le tableau de destination spécifié. Les éléments sont insérés dans le tableau de destination à partir de l'index spécifié par l'argument dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Paramètre | Description |
| --- | --- |
| DstType | Type des éléments dans le tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| srcIndex | int64_t | Indice dans le tableau source où commencer à copier les éléments |
| dstIndex | int64_t | Indice dans le tableau de destination où commencer à insérer les éléments copiés |
| count | int64_t | Nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Copie tous les éléments de la vue du tableau actuel vers la vue du tableau de destination spécifiée. Les éléments sont insérés dans la vue du tableau de destination à partir de l'index spécifié par l'argument dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Paramètre | Description |
| --- | --- |
| DstType | Type des éléments dans la vue du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Vue du tableau de destination |
| dstIndex | int64_t | Indice dans la vue du tableau de destination où commencer à insérer les éléments copiés |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Copie un nombre spécifié d'éléments du tableau actuel à partir de la position spécifiée vers la vue du tableau de destination spécifiée. Les éléments sont insérés dans la vue du tableau de destination à partir de l'index spécifié par l'argument dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Paramètre | Description |
| --- | --- |
| DstType | Type des éléments dans la vue du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Vue du tableau de destination |
| srcIndex | int64_t | Indice dans le tableau source où commencer à copier les éléments |
| dstIndex | int64_t | Indice dans la vue du tableau de destination où commencer à insérer les éléments copiés |
| count | int64_t | Nombre d'éléments à copier |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
