---
title: "System::Array::Array yapıcı"
linktitle: "Dizi"
second_title: "Aspose.Font için C++"
description: "System::Array::Array yapıcı. C++'ta boş bir dizi oluşturur."
type: docs
weight: 100
url: /tr/cpp/system/array/array/
---
## Array::Array() constructor


Boş bir dizi oluşturur.

```cpp
System::Array<T>::Array()
```

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


[Array](../) nesnesi oluşturur ve **[UnderlyingType](../underlyingtype/)** türündeki öğeleri içeren belirtilen diziden değerlerle doldurur.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Parametre | Açıklama |
| --- | --- |
| InitArraySize | **init** dizisinin öğe sayısı. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | Oluşturulan diziye kopyalanacak [Array](../). |

## Ayrıca Bakınız

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


[Array](../) nesnesi oluşturur ve değerleri **T** ile aynı türde ancak **[UnderlyingType](../underlyingtype/)**'den farklı bir std::vector nesnesinden kopyalayarak doldurur.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Parametre | Açıklama |
| --- | --- |
| Q | Elemanların kopyalanacağı std::vector nesnesinin öğelerinin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const std::vector\<Q\>\& | değerlerin kopyalanacağı std::vector |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const vector_t\&) constructor


Kopya yapıcı.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| assgn | const vector_t\& | değerlerin kopyalanacağı std::vector |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T\&) constructor


Dolgu kurucusu.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| count | int | Dizinin başlangıç boyutu |
| init | const T\& | Diziyi doldurmak için kullanılan başlangıç değeri |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T) constructor


Dolgu kurucusu.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| count | int | Dizinin başlangıç boyutu |
| başlatır | const T | Diziyi doldurmak için değerler |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


Belirtilen bool türünde öğeler içeren başlatıcı listesinden değerlerle bir [Array](../) nesnesi oluşturur ve doldurur.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | Diziyi doldurmak için öğeler içeren başlatıcı listesi |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


Belirtilen **[UnderlyingType](../underlyingtype/)** türünde öğeler içeren başlatıcı listesinden değerlerle bir [Array](../) nesnesi oluşturur ve doldurur.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | Diziyi doldurmak için öğeler içeren başlatıcı listesi |

## Ayrıca Bakınız

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


Değer türü **T** ile aynı ancak **[UnderlyingType](../underlyingtype/)**'den farklı olan bir std::vector nesnesinden taşınan değerlerle bir [Array](../) nesnesi oluşturur ve doldurur.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Parametre | Açıklama |
| --- | --- |
| Q | Elemanların taşınacağı std::vector nesnesinin öğelerinin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | std::vector\<Q\>\&& | değerlerin kopyalanacağı std::vector |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


Dolgu kurucusu.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Parametre | Açıklama |
| --- | --- |
| ValueType | İlk değerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | Dizinin başlangıç boyutu |
| init | ValueType | Diziyi doldurmak için kullanılan başlangıç değeri |

## Ayrıca Bakınız

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(vector_t\&&) constructor


Taşıma kurucusu.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | vector_t\&& | std::vector, dizinin edindiği öğeler |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
