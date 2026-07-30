---
title: "méthode System::Array::Copy"
linktitle: "Copy"
second_title: "Aspose.Font pour C++"
description: "méthode System::Array::Copy. Copie le nombre spécifié d'éléments du tableau source vers le tableau de destination en C++."
type: docs
weight: 4900
url: /fr/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Copie le nombre spécifié d'éléments du tableau source vers le tableau de destination.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Tableau source |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Copie un nombre spécifié d'éléments du tableau source à partir de l'index spécifié vers la position spécifiée dans le tableau de destination.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans le tableau source |
| DstType | Type des éléments dans le tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Tableau source |
| srcIndex | int64_t | Indice dans le tableau source désignant le début de la plage d'éléments à copier |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| dstIndex | int64_t | Indice dans le tableau de destination où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Copie un nombre spécifié d'éléments du tableau source à partir de l'index spécifié vers la position spécifiée dans la vue du tableau de destination.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans le tableau source |
| DstType | Type des éléments dans la vue du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Tableau source |
| srcIndex | int64_t | Indice dans le tableau source désignant le début de la plage d'éléments à copier |
| dstArray | System::Details::ArrayView\<DstType\> | Vue du tableau de destination |
| dstIndex | int64_t | Indice dans la vue du tableau de destination où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


Copie un nombre spécifié d'éléments du tableau source à partir de l'index spécifié vers la position spécifiée dans le tableau de destination sur la pile.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans le tableau source |
| DstType | Type des éléments dans le tableau de destination sur la pile |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Tableau source |
| srcIndex | int64_t | Indice dans le tableau source désignant le début de la plage d'éléments à copier |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Tableau de destination sur la pile |
| dstIndex | int64_t | Indice dans le tableau de destination sur la pile où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


Copie le nombre spécifié d'éléments du tableau source vers la vue du tableau de destination.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Tableau source |
| dstArray | System::Details::ArrayView\<DstType\> | Vue du tableau de destination |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


Copie le nombre spécifié d'éléments du tableau source vers le tableau de destination sur la pile.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Tableau source |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Tableau de destination sur la pile |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Copie un nombre spécifié d'éléments de la vue du tableau source à partir de l'index spécifié vers la position spécifiée dans le tableau de destination sur la pile.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans le tableau source sur la pile |
| DstType | Type des éléments dans le tableau de destination sur la pile |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | Vue du tableau source |
| srcIndex | int64_t | Indice dans la vue du tableau source désignant le début de la plage d'éléments à copier |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Tableau de destination sur la pile |
| dstIndex | int64_t | Indice dans le tableau de destination sur la pile où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


Copie le nombre spécifié d'éléments de la vue du tableau source vers le tableau de destination.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Vue du tableau source |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Copie un nombre spécifié d'éléments de la vue du tableau source à partir de l'index spécifié vers la position spécifiée dans le tableau de destination.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans la vue du tableau source |
| DstType | Type des éléments dans le tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Vue du tableau source |
| srcIndex | int64_t | Indice dans la vue du tableau source désignant le début de la plage d'éléments à copier |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| dstIndex | int64_t | Indice dans le tableau de destination où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Copie un nombre spécifié d'éléments de la vue du tableau source à partir de l'index spécifié vers la position spécifiée dans la vue du tableau de destination.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans la vue du tableau source |
| DstType | Type des éléments dans la vue du tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Vue du tableau source |
| srcIndex | int64_t | Indice dans la vue du tableau source désignant le début de la plage d'éléments à copier |
| dstArray | System::Details::ArrayView\<DstType\> | Vue du tableau de destination |
| dstIndex | int64_t | Indice dans la vue du tableau de destination où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


Copie le nombre spécifié d'éléments de la vue du tableau source vers la vue du tableau de destination.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Vue du tableau source |
| dstArray | System::Details::ArrayView\<DstType\> | Vue du tableau de destination |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Copie le nombre spécifié d'éléments du tableau source sur la pile vers le tableau de destination.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Tableau source sur la pile |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Copie un nombre spécifié d'éléments du tableau source sur la pile à partir de l'index spécifié vers la position spécifiée dans le tableau de destination.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans le tableau source sur la pile |
| DstType | Type des éléments dans le tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Tableau source sur la pile |
| srcIndex | int64_t | Indice dans le tableau source sur la pile désignant le début de la plage d'éléments à copier |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| dstIndex | int64_t | Indice dans le tableau de destination où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Copie un nombre spécifié d'éléments du tableau source sur la pile à partir de l'index spécifié vers la position spécifiée dans le tableau de destination sur la pile.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans le tableau source sur la pile |
| DstType | Type des éléments dans le tableau de destination sur la pile |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Tableau source sur la pile |
| srcIndex | int64_t | Indice dans le tableau source sur la pile désignant le début de la plage d'éléments à copier |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Tableau de destination sur la pile |
| dstIndex | int64_t | Indice dans le tableau de destination sur la pile où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


Copie le nombre spécifié d'éléments du tableau source sur la pile vers le tableau de destination sur la pile.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Tableau source sur la pile |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Tableau de destination sur la pile |
| count | int64_t | Le nombre d'éléments à copier |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
