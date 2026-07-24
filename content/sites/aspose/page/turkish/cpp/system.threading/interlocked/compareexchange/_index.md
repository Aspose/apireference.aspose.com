---
title: "System::Threading::Interlocked::CompareExchange yöntemi"
linktitle: "KarşılaştırmaDeğiştir"
second_title: "Aspose.Page için C++"
description: "System::Threading::Interlocked::CompareExchange yöntemi. Değişken üzerindeki değeri karşılaştırmalı olarak değiştirir: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve saklanan değer beklenenle eşleştiğinde yalnızca yeni değeri depolar. C++'ta."
type: docs
weight: 200
url: /tr/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Değişken üzerindeki değeri karşılaştırmalı değiştirir: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve saklanan değer beklenenle eşleşiyorsa yeni değeri depolar.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| location1 | int32_t\& | Değiştirilecek değişken referansı. |
| değer | int32_t | Depolanacak değer. |
| comparand | int32_t | Değişimden önce değişkenin değeriyle karşılaştırılacak değer. |
| başarılı | bool\& | Değişim gerçekleştiğinde true, aksi takdirde false olarak ayarlanan değişken referansı. |

### ReturnValue

İşlem başlangıcında değişkenin değeri, değiştirildiği ya da edilmediği fark etmeksizin.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Değişken üzerindeki değeri karşılaştırmalı değiştirir: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve saklanan değer beklenenle eşleşiyorsa yeni değeri depolar.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değişken tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| location1 | T\& | Değiştirilecek değişken referansı. |
| değer | T | Depolanacak değer. |
| comparand | T | Değişimden önce değişkenin değeriyle karşılaştırılacak değer. |

### ReturnValue

İşlem başlangıcında değişkenin değeri, değiştirildiği ya da edilmediği fark etmeksizin.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Değişken üzerindeki değeri karşılaştırmalı değiştirir: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve saklanan değer beklenenle eşleşiyorsa yeni değeri depolar. Henüz uygulanmadı.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değişken tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| location1 | T\& | Değiştirilecek değişken referansı. |
| değer | T | Depolanacak değer. |
| comparand | T | Değişimden önce değişkenin değeriyle karşılaştırılacak değer. |

### ReturnValue

İşlem başlangıcında değişkenin değeri, değiştirildiği ya da edilmediği fark etmeksizin.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
