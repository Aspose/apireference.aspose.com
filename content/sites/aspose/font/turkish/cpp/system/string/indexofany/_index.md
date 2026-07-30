---
title: "System::String::IndexOfAny metodu"
linktitle: "IndexOfAny"
second_title: "Aspose.Font için C++"
description: "System::String::IndexOfAny yöntemi. C++'da karakter ileri arama."
type: docs
weight: 1600
url: /tr/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Karakter ileri arama.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| c | char_t | Aranacak karakter. |
| startIndex | int | Aramaya başlanacak indeks. |

### ReturnValue

startIndex'ten itibaren ilk karakter konumunun indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Geçirilen karakterlerin herhangi birini tüm dizede arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemsizdir. |

### ReturnValue

İlk eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Geçirilen karakterlerin herhangi birini alt dizede arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemsizdir. |
| startindex | int32_t | Aramaya başlanacak indeks. |

### ReturnValue

İlk eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Geçirilen karakterlerin herhangi birini alt dizede arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemsizdir. |
| startindex | int32_t | Aramaya başlanacak indeks. |
| count | int32_t | Aranacak karakter sayısı. |

### ReturnValue

İlk eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Sonuç olarak, bu içinde str'nin tüm karakterlerini arar. İlk karakter bulunursa, konumu döndürülür, aksi takdirde ikinci karakteri ve böyle devam eder.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../) aramak için karakterler. Karakterlerin sırası önemlidir. |
| startIndex | int | Aramaya başlanacak konum. |

### ReturnValue

Bulunan ilk karakterin indeksi veya hiç bulunamazsa -1.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
