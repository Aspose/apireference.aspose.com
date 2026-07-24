---
title: "System::Array::Array yapıcı"
linktitle: "Dizi"
second_title: "Aspose.Page için C++"
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
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


[Array](../) nesnesi oluşturur ve belirtilen, elemanları **[UnderlyingType](../underlyingtype/)** tipinde olan diziden değerlerle doldurur.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Parameter | Açıklama |
| --- | --- |
| InitArraySize | **init** dizisinin eleman sayısı. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | Oluşturulan diziye kopyalanacak [Array](../). |

## Ayrıca Bakınız

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


[Array](../) nesnesi oluşturur ve değerleri **T** ile aynı tipte ancak **[UnderlyingType](../underlyingtype/)** tipinden farklı bir std::vector nesnesinden kopyalanarak doldurur.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Parameter | Açıklama |
| --- | --- |
| Q | Elemanların kopyalanacağı std::vector nesnesinin eleman tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const std::vector\<Q\>\& | değerlerin kopyalanacağı std::vector |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const vector_t\&) constructor


Kopya yapıcı.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| assgn | const vector_t\& | değerlerin kopyalanacağı std::vector |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T\&) constructor


Dolgu kurucusu.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| count | int | Dizinin başlangıç boyutu |
| init | const T\& | Diziyi doldurmak için kullanılan başlangıç değeri |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T) constructor


Dolgu kurucusu.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| count | int | Dizinin başlangıç boyutu |
| inits | const T | Diziyi doldurmak için değerler |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


Belirtilen, bool türünde öğeler içeren başlatıcı listesinden değerlerle bir [Array](../) nesnesi oluşturur ve doldurur.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | Diziyi doldurmak için öğeler içeren başlatıcı listesi |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


Belirtilen, **[UnderlyingType](../underlyingtype/)** türünde öğeler içeren başlatıcı listesinden değerlerle bir [Array](../) nesnesi oluşturur ve doldurur.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | Diziyi doldurmak için öğeler içeren başlatıcı listesi |

## Ayrıca Bakınız

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


Değer türü **T** ile aynı ancak **[UnderlyingType](../underlyingtype/)**'den farklı olan bir std::vector nesnesinden taşınan değerlerle bir [Array](../) nesnesi oluşturur ve doldurur.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Parameter | Açıklama |
| --- | --- |
| Q | Elemanların taşınacağı std::vector nesnesinin öğelerinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | std::vector\<Q\>\&& | değerlerin kopyalanacağı std::vector |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


Dolgu kurucusu.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Parameter | Açıklama |
| --- | --- |
| ValueType | Başlangıç değerinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | Dizinin başlangıç boyutu |
| init | ValueType | Diziyi doldurmak için kullanılan başlangıç değeri |

## Ayrıca Bakınız

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(vector_t\&&) constructor


Taşıma kurucusu.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | vector_t\&& | std::vector, dizinin elde ettiği öğeler |

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
