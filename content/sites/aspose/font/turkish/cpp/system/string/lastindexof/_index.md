---
title: "System::String::LastIndexOf yöntemi"
linktitle: "LastIndexOf"
second_title: "Aspose.Font için C++"
description: "System::String::LastIndexOf yöntemi. C++'ta karakter geriye doğru arama."
type: docs
weight: 2400
url: /tr/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


Karakter geri arama.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | char_t | Aranacak karakter. |

### ReturnValue

Son karakter konumunun indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Karakter geri arama.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | char_t | Aranacak karakter. |
| startIndex | int32_t | Aramaya başlanacak indeks. |

### ReturnValue

startIndex'ten itibaren son karakter konumunun indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Karakter geri arama.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | char_t | Aranacak karakter. |
| startIndex | int32_t | Aramaya başlanacak indeks. |
| count | int32_t | Aranacak karakter sayısı |

### ReturnValue

startIndex'ten itibaren son karakter konumunun indeksi veya bulunamazsa -1.

## Ayrıca Bakınız

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


Alt dize geri arama.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Aranacak alt dize. |
| startIndex | int | Kaynak dizede aramaya başlanacak konum. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) modu. |

### ReturnValue

Son bulunan alt dizenin indeksi veya bulunamazsa -1. Boş arama dizesi için her zaman dize uzunluğunu döndürür.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


Alt dize geri arama.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Aranacak alt dize. |
| startIndex | int | Kaynak dizede aramaya başlanacak konum. |

### ReturnValue

Son bulunan alt dizenin indeksi veya bulunamazsa -1. Boş arama dizesi için her zaman dize uzunluğunu döndürür.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


Alt dize geri arama.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | Aranacak alt dize. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) modu. |

### ReturnValue

Son bulunan alt dizenin indeksi veya bulunamazsa -1. Boş arama dizesi için her zaman dize uzunluğunu döndürür.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Alt dize geri arama.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Aranacak alt dize. |
| startIndex | int | Kaynak dizede aramaya başlanacak konum. |
| count | int | Aranacak karakter sayısı. |
| comparisonType | StringComparison | [Comparison](../../comparison/) modu. |

### ReturnValue

Son bulunan alt dizenin indeksi veya bulunamazsa -1. Boş arama dizesi için her zaman startIndex+count değerini döndürür.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
