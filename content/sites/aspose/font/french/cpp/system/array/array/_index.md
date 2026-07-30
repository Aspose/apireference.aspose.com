---
title: "System::Array::Array constructor"
linktitle: "Tableau"
second_title: "Aspose.Font pour C++"
description: "System::Array::Array constructor. Construit un tableau vide en C++."
type: docs
weight: 100
url: /fr/cpp/system/array/array/
---
## Array::Array() constructor


Construit un tableau vide.

```cpp
System::Array<T>::Array()
```

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


Construit un objet [Array](../) et le remplit avec les valeurs du tableau spécifié contenant des éléments de type **[UnderlyingType](../underlyingtype/)**.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Paramètre | Description |
| --- | --- |
| InitArraySize | Nombre d'éléments du tableau **init**. |

| Paramètre | Type | Description |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | [Array](../) à copier dans le tableau en cours de construction. |

## Voir aussi

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


Construit un objet [Array](../) et le remplit avec des valeurs copiées d'un objet std::vector dont le type des valeurs est le même que **T** mais différent de **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Paramètre | Description |
| --- | --- |
| Q | Le type des éléments de l'objet std::vector dont les éléments sont copiés |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const std::vector\<Q\>\& | std::vector dont les valeurs sont copiées |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const vector_t\&) constructor


Constructeur de copie.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| assgn | const vector_t\& | std::vector dont les valeurs sont copiées |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T\&) constructor


Constructeur de remplissage.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| count | int | Taille initiale du tableau |
| init | const T\& | La valeur initiale utilisée pour remplir le tableau |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T) constructor


Constructeur de remplissage.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Paramètre | Type | Description |
| --- | --- | --- |
| count | int | Taille initiale du tableau |
| initialisations | const T | Valeurs avec lesquelles remplir le tableau |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


Construit un objet [Array](../) et le remplit avec des valeurs de la liste d'initialisation spécifiée contenant des éléments de type bool.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | Liste d'initialisation contenant des éléments avec lesquels remplir le tableau |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


Construit un objet [Array](../) et le remplit avec des valeurs de la liste d'initialisation spécifiée contenant des éléments de type **[UnderlyingType](../underlyingtype/)**.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | Liste d'initialisation contenant des éléments avec lesquels remplir le tableau |

## Voir aussi

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


Construit un objet [Array](../) et le remplit avec des valeurs déplacées d'un objet std::vector dont le type des valeurs est le même que **T** mais différent de **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Paramètre | Description |
| --- | --- |
| Q | Le type des éléments de l'objet std::vector dont les éléments sont déplacés |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | std::vector\<Q\>\&& | std::vector dont les valeurs sont copiées |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


Constructeur de remplissage.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Paramètre | Description |
| --- | --- |
| ValueType | Type de la valeur initiale |

| Paramètre | Type | Description |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | Taille initiale du tableau |
| init | ValueType | La valeur initiale utilisée pour remplir le tableau |

## Voir aussi

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(vector_t\&&) constructor


Constructeur de déplacement.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | vector_t\&& | std::vector, dont les éléments sont acquis par le tableau |

## Voir aussi

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
