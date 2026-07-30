---
title: "System::Array::LastIndexOf yöntemi"
linktitle: "LastIndexOf"
second_title: "Aspose.Font için C++"
description: "System::Array::LastIndexOf yöntemi. Başlangıç indeksi ve aralıktaki öğe sayısı ile belirtilen dizi aralığında belirtilen öğenin son görülüşünün indeksini C++'da belirler."
type: docs
weight: 5500
url: /tr/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Başlangıç indeksi ve aralıktaki öğe sayısı ile belirtilen dizi öğeleri aralığında, belirtilen öğenin son oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parametre | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | Belirtilen öğeyi aramak için [Array](../) |
| değer | const ValueType\& | Belirlenmesi gereken öğe indeksi |
| startIndex | int | Aramanın başlatıldığı indeks |
| count | int | Aranacak aralığın öğe sayısı |

### ReturnValue

Öğe bulunursa belirtilen öğenin son görülüşünün indeksi, aksi takdirde -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Belirtilen dizide belirtilen öğenin son oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| Parametre | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parametre | Tür | Açıklama |
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
* Library [Aspose.Font for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Belirtilen dizide, belirtilen indeksden başlayarak belirtilen öğenin son oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| Parametre | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parametre | Tür | Açıklama |
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
* Library [Aspose.Font for C++](../../../)
