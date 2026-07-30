---
title: "System::Array::IndexOf metodu"
linktitle: "IndexOf"
second_title: "Aspose.Font için C++"
description: "System::Array::IndexOf metodu. C++'ta dizide belirtilen öğenin ilk oluşumunun indeksini belirler."
type: docs
weight: 2900
url: /tr/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


Dizide belirtilen öğenin ilk görülme konumunun indeksini belirler.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| öğe | const T\& | Belirlenmesi gereken öğe indeksi |

### ReturnValue

Öğe bulunursa, belirtilen öğenin ilk oluşumunun indeksi, aksi takdirde -1

## Ayrıca Bakınız

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Dizide belirtilen öğenin ilk görülme konumunun indeksini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| Parametre | Açıklama |
| --- | --- |
| ArrayType | Hedef dizideki öğelerin türü |
| ValueType | Dizide aranacak öğenin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | Belirtilen öğeyi aramak için [Array](../) |
| değer | const ValueType\& | Belirlenmesi gereken öğe indeksi |

### ReturnValue

Öğe bulunursa, belirtilen öğenin ilk oluşumunun indeksi, aksi takdirde -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Belirtilen dizide, belirtilen indeksden başlayarak belirtilen öğenin ilk oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
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

### ReturnValue

Öğe bulunursa, belirtilen öğenin ilk oluşumunun indeksi, aksi takdirde -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Başlangıç indeksi ve aralıktaki öğe sayısı ile belirtilen dizi öğeleri aralığında, belirtilen öğenin ilk oluşumunun dizinini belirler.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
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

Öğe bulunursa, belirtilen öğenin ilk oluşumunun indeksi, aksi takdirde -1

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
