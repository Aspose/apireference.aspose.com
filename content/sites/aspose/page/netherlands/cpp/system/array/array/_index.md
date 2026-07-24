---
title: "System::Array::Array constructor"
linktitle: "Array"
second_title: "Aspose.Page voor C++"
description: "System::Array::Array constructor. Construeert een lege array in C++."
type: docs
weight: 100
url: /nl/cpp/system/array/array/
---
## Array::Array() constructor


Construeert een lege array.

```cpp
System::Array<T>::Array()
```

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


Construeert een [Array](../) object en vult het met waarden uit de opgegeven array die elementen van type **[UnderlyingType](../underlyingtype/)** bevat.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Parameter | Beschrijving |
| --- | --- |
| InitArraySize | Aantal elementen van de **init** array. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | [Array](../) om te kopiëren in de te construeren array. |

## Zie ook

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


Construeert een [Array](../) object en vult het met waarden gekopieerd uit een std::vector object waarvan het type van de waarden hetzelfde is als **T**, maar verschilt van **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Parameter | Beschrijving |
| --- | --- |
| Q | Het type van de elementen van het std::vector-object waaruit de elementen gekopieerd moeten worden. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const std::vector\<Q\>\& | std::vector om de waarden van te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const vector_t\&) constructor


Copy-constructor.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| assgn | const vector_t\& | std::vector om waarden te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T\&) constructor


Vullende constructor.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| count | int | Initiële grootte van de array |
| init | const T\& | De initiële waarde die wordt gebruikt om de array mee te vullen |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T) constructor


Vullende constructor.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| count | int | Initiële grootte van de array |
| inits | const T | Waarden om de array mee te vullen |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


Construeert een [Array](../) object en vult het met waarden uit de opgegeven initializer‑list die elementen van het type bool bevat.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | Initializer‑list die elementen bevat om de array mee te vullen |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


Construeert een [Array](../) object en vult het met waarden uit de opgegeven initializer‑list die elementen van type **[UnderlyingType](../underlyingtype/)** bevat.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | Initializer‑list die elementen bevat om de array mee te vullen |

## Zie ook

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


Construeert een [Array](../) object en vult het met waarden verplaatst uit een std::vector object waarvan het type van de waarden hetzelfde is als **T**, maar verschilt van **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Parameter | Beschrijving |
| --- | --- |
| Q | Het type van de elementen van het std::vector-object waaruit de elementen verplaatst worden. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | std::vector\<Q\>\&& | std::vector om de waarden van te kopiëren |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


Vullende constructor.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Parameter | Beschrijving |
| --- | --- |
| ValueType | Type van de initiële waarde |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | Initiële grootte van de array |
| init | ValueType | De initiële waarde die wordt gebruikt om de array mee te vullen |

## Zie ook

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(vector_t\&&) constructor


Move-constructor.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | vector_t\&& | std::vector, elementen waarvan de array wordt verkregen |

## Zie ook

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
