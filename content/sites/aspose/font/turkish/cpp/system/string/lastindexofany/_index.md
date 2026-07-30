---
title: "System::String::LastIndexOfAny yöntemi"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Font için C++"
description: "System::String::LastIndexOfAny yöntemi. Verilen karakterlerden herhangi birini bütün dize içinde geriye doğru arar. Son dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından bir önceki karakteri ve böyle devam eder. C++'da bulunan ilk eşleşmenin indeksini döndürür."
type: docs
weight: 2500
url: /tr/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


Geçirilen karakterlerin herhangi birini tüm dizede geriye doğru arar. Son dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından bir önceki karakteri ve böyle devam eder. Bulunan ilk eşleşmenin indeksini döndürür.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemsizdir. |

### ReturnValue

Son eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Geçirilen karakterlerin herhangi birini alt dizede geriye doğru arar. Son dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından bir önceki karakteri ve böyle devam eder. Bulunan ilk eşleşmenin indeksini döndürür.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemsizdir. |
| startindex | int32_t | Aramaya başlanacak indeks. |

### ReturnValue

Son eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Geçirilen karakterlerin herhangi birini alt dizede geriye doğru arar. Son dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından bir önceki karakteri ve böyle devam eder. Bulunan ilk eşleşmenin indeksini döndürür.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemsizdir. |
| startindex | int32_t | Aramaya başlanacak indeks. |
| count | int32_t | Aranacak karakter sayısı. |

### ReturnValue

Son eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
