---
title: "System::Get yöntemi"
linktitle: "Al"
second_title: "Aspose.Page için C++"
description: "System::Get yöntemi. Verilen tuple'ın N'inci elemanını almak için fonksiyon. C++'ta temel nesne için aşırı yükleme."
type: docs
weight: 20700
url: /tr/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Verilen tuple'ın N'inci elemanını almak için fonksiyon. Temel nesne için aşırı yükleme.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parameter | Açıklama |
| --- | --- |
| N | eleman indeksi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| nesne | const SharedPtr\<Object\>\& | incelenmek üzere nesne. |

### ReturnValue

N'inci tuple elemanının nesne olarak döndürülmüş değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Verilen tuple'ın N'inci elemanını almak için fonksiyon. Paylaşımlı işaretçiler için aşırı yükleme.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parameter | Açıklama |
| --- | --- |
| N | eleman indeksi. |
| T | incelenen nesnenin tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| nesne | const SharedPtr\<T\>\& | incelenmek üzere nesne. |

### ReturnValue

N'inci tuple elemanının değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


Verilen tuple'ın N'inci elemanını almak için fonksiyon. Deconstruct yöntemi olan nesneler için aşırı yükleme.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parameter | Açıklama |
| --- | --- |
| N | eleman indeksi. |
| T | incelenen nesnenin tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| nesne | const T\& | incelenmek üzere nesne. |

### ReturnValue

N'inci tuple elemanının değeri.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Değer tuple'ının N'inci elemanını alır.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parameter | Açıklama |
| --- | --- |
| N | eleman indeksi. |
| Argümanlar | tuple öğeleri. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| demet | const ValueTuple\<Args...\>\& | eleman alınacak tuple. |

### ReturnValue

N'inci tuple elemanının değeri.

## Ayrıca Bakınız

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
