---
title: "System::Array::IndexOf yöntemi"
linktitle: "IndexOf"
second_title: "Aspose.Page için C++"
description: "System::Array::IndexOf yöntemi. Belirtilen öğenin dizideki ilk oluşumunun indeksini C++'ta belirler."
type: docs
weight: 2900
url: /tr/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


Belirtilen öğenin dizideki ilk oluşumunun dizinini belirler.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| öğe | const T\& | Belirlenmesi gereken öğe indeksi |

### ReturnValue

Belirtilen öğenin bulunduğu ilk konumun indeksi, öğe bulunamazsa -1

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Belirtilen öğenin dizideki ilk oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| Parameter | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | Belirtilen öğeyi aramak için [Array](../) |
| değer | const ValueType\& | Belirlenmesi gereken öğe indeksi |

### ReturnValue

Belirtilen öğenin bulunduğu ilk konumun indeksi, öğe bulunamazsa -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Belirtilen öğenin dizideki ilk oluşumunun dizinini, belirtilen dizinden başlayarak belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
```


| Parameter | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | Belirtilen öğeyi aramak için [Array](../) |
| değer | const ValueType\& | Belirlenmesi gereken öğe indeksi |
| startIndex | int | Aramanın başlatıldığı indeks |

### ReturnValue

Belirtilen öğenin bulunduğu ilk konumun indeksi, öğe bulunamazsa -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Belirtilen öğenin, başlangıç dizini ve aralıktaki öğe sayısı ile belirtilen dizi öğeleri aralığındaki ilk oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parameter | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | Belirtilen öğeyi aramak için [Array](../) |
| değer | const ValueType\& | Belirlenmesi gereken öğe indeksi |
| startIndex | int | Aramanın başlatıldığı indeks |
| count | int | Aranacak aralıktaki öğe sayısı |

### ReturnValue

Belirtilen öğenin bulunduğu ilk konumun indeksi, öğe bulunamazsa -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
