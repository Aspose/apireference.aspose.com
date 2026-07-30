---
title: "System::Get yöntemi"
linktitle: "Al"
second_title: "Aspose.Font için C++"
description: "System::Get yöntemi. Verilen tuple'ın N'inci öğesini almak için işlev. C++'ta temel nesne için aşırı yükleme."
type: docs
weight: 20800
url: /tr/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Verilen tuple'ın N'inci öğesini almak için işlev. Temel nesne için aşırı yükleme.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parametre | Açıklama |
| --- | --- |
| N | öğe indeksi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nesne | const SharedPtr\<Object\>\& | incelenen nesne. |

### ReturnValue

N'inci tuple öğesinin nesne olarak döndürülmüş değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Verilen tuple'ın N'inci öğesini almak için işlev. Paylaşımlı işaretçiler için aşırı yükleme.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parametre | Açıklama |
| --- | --- |
| N | öğe indeksi. |
| T | incelenen nesnenin tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nesne | const SharedPtr\<T\>\& | incelenen nesne. |

### ReturnValue

N'inci tuple öğesinin değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const T\&) method


Verilen tuple'ın N'inci öğesini almak için işlev. Deconstruct yöntemi olan nesneler için aşırı yükleme.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parametre | Açıklama |
| --- | --- |
| N | öğe indeksi. |
| T | incelenen nesnenin tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nesne | const T\& | incelenen nesne. |

### ReturnValue

N'inci tuple öğesinin değeri.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Değer tuple'ının N'inci öğesini alır.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parametre | Açıklama |
| --- | --- |
| N | öğe indeksi. |
| Args | tuple öğeleri. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| tuple | const ValueTuple\<Args...\>\& | tuple'tan öğe almak için. |

### ReturnValue

N'inci tuple öğesinin değeri.

## Ayrıca Bakınız

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
