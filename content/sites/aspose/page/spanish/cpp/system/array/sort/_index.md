---
title: "Método System::Array::Sort"
linktitle: "Sort"
second_title: "Aspose.Page para C++"
description: "Método System::Array::Sort. Ordena dos arreglos, uno que contiene claves y el otro los elementos correspondientes, basándose en los valores del arreglo que contiene claves, cuyos elementos se comparan usando operator< en C++."
type: docs
weight: 5800
url: /es/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


Ordena dos arreglos, uno que contiene claves y el otro los elementos correspondientes, basándose en los valores del arreglo que contiene claves, cuyos elementos se comparan usando operator<.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| Parámetro | Descripción |
| --- | --- |
| TKey | El tipo de los elementos en el arreglo **keys** |
| TValue | el tipo de los elementos en el arreglo **items** |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) que contiene valores de clave |
| items | const ArrayPtr\<TValue\>\& | [Array](../) que contiene elementos que están mapeados a los valores de clave en el arreglo **keys** |

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


Ordena dos arreglos, uno que contiene claves y el otro los elementos correspondientes, basándose en los valores del arreglo que contiene claves, cuyos elementos se comparan usando el comparador predeterminado.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| Parámetro | Descripción |
| --- | --- |
| TKey | El tipo de los elementos en el arreglo **keys** |
| TValue | el tipo de los elementos en el arreglo **items** |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) que contiene valores de clave |
| items | const ArrayPtr\<TValue\>\& | [Array](../) que contiene elementos que están mapeados a los valores de clave en el arreglo **keys** |
| índice | int | El índice que designa el comienzo del rango a ordenar |
| longitud | int | El número de elementos en el rango a ordenar |

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


Ordena los elementos del arreglo especificado usando el comparador predeterminado.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Arreglo objetivo |

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Ordena los elementos del arreglo especificado usando el comparador especificado.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Arreglo objetivo |
| comparador | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | Objeto IComparer<T> usado para comparar elementos del arreglo |

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


NO IMPLEMENTADO.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


Ordena un rango de elementos del arreglo especificado usando el comparador predeterminado.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Arreglo objetivo |
| startIndex | int | El índice que designa el comienzo del rango de elementos a ordenar |
| count | int | El tamaño del rango de elementos a ordenar |

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
