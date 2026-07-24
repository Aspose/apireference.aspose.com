---
title: "System::String::IndexOfAny yöntemi"
linktitle: "IndexOfAny"
second_title: "Aspose.Page için C++"
description: "System::String::IndexOfAny yöntemi. C++'da karakter ileri araması."
type: docs
weight: 1600
url: /tr/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Karakter ileri arama.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| c | char_t | Aranacak karakter. |
| startIndex | int | Aramaya başlanacak indeks. |

### ReturnValue

startIndex'ten itibaren ilk karakter konumunun indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Geçilen karakterlerden herhangi birini tüm dize boyunca arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemli değildir. |

### ReturnValue

ilk eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Geçilen karakterlerden herhangi birini alt dize içinde arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemli değildir. |
| startindex | int32_t | Aramaya başlanacak indeks. |

### ReturnValue

ilk eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Geçilen karakterlerden herhangi birini alt dize içinde arar. İlk dize karakterini anyOf içindeki tüm karakterlerle karşılaştırır, ardından ikinci karakteri ve böyle devam eder. Hedef karakterlerden herhangi biriyle eşleşen ilk karakterin indeksini döndürür.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) aranacak karakterlerin listesi. Sıra önemli değildir. |
| startindex | int32_t | Aramaya başlanacak indeks. |
| count | int32_t | İncelenecek karakter sayısı. |

### ReturnValue

ilk eşleşen karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Dolayısıyla bu içinde str'nin tüm karakterlerini arar. İlk karakter bulunursa konumu döndürülür, aksi takdirde ikinci karakteri ve böyle devam eder.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../) aranan karakterler. Karakterlerin sırası önemlidir. |
| startIndex | int | Aramaya başlanacak konum. |

### ReturnValue

Bulunan ilk karakterin indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
