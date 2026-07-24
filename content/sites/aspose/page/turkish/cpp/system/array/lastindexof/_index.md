---
title: "System::Array::LastIndexOf method"
linktitle: "LastIndexOf"
second_title: "Aspose.Page için C++"
description: "System::Array::LastIndexOf yöntemi. C++'da başlangıç indeksi ve aralıktaki öğe sayısı ile belirtilen dizinin bir aralığında belirtilen öğenin son görülüşünün indeksini belirler."
type: docs
weight: 5500
url: /tr/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Belirtilen öğenin, başlangıç dizini ve aralıktaki öğe sayısı ile belirtilen dizi öğeleri aralığındaki son oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
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

Öğe bulunursa belirtilen öğenin son görülüşünün indeksi, aksi takdirde -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Belirtilen öğenin dizideki son oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| Parameter | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | Belirtilen öğeyi aramak için [Array](../) |
| değer | const ValueType\& | Belirlenmesi gereken öğe indeksi |

### ReturnValue

Öğe bulunursa belirtilen öğenin son görülüşünün indeksi, aksi takdirde -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Belirtilen öğenin dizideki son oluşumunun dizinini, belirtilen dizinden başlayarak belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| Parameter | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | Belirtilen öğeyi aramak için [Array](../) |
| değer | const ValueType\& | Belirlenmesi gereken öğe indeksi |
| startIndex | int | Aramanın başlatıldığı indeks |

### ReturnValue

Öğe bulunursa belirtilen öğenin son görülüşünün indeksi, aksi takdirde -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
