---
title: "System::Threading::Interlocked::CompareExchange yöntemi"
linktitle: "CompareExchange"
second_title: "Aspose.Font için C++"
description: "System::Threading::Interlocked::CompareExchange yöntemi. Değişken üzerindeki değeri karşılaştırarak değiştirir: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve yalnızca mevcut değer beklenenle eşleşiyorsa yeni değeri depolar C++'da."
type: docs
weight: 200
url: /tr/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Değişken üzerindeki karşılaştırma-değişim değeri: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve yalnızca saklanan değer beklenenle eşleşiyorsa yeni değeri depolar.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| location1 | int32_t\& | Değiştirmek için değişken referansı. |
| değer | int32_t | Depolanacak değer. |
| comparand | int32_t | Değişkenin değeriyle karşılaştırılacak değer. |
| başarılı | bool\& | Değiş tokuş gerçekleştiğinde true, aksi takdirde false olarak ayarlanan değişken referansı. |

### ReturnValue

İşlem başlangıcındaki değişkenin değeri, değiştirildiği ya da değişmediği fark etmeksizin.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Değişken üzerindeki karşılaştırma-değişim değeri: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve yalnızca saklanan değer beklenenle eşleşiyorsa yeni değeri depolar.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değişken tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| location1 | T\& | Değiştirmek için değişken referansı. |
| değer | T | Depolanacak değer. |
| comparand | T | Değişkenin değeriyle karşılaştırılacak değer. |

### ReturnValue

İşlem başlangıcındaki değişkenin değeri, değiştirildiği ya da değişmediği fark etmeksizin.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Değişken üzerindeki karşılaştırma-değişim değeri: değişkenin belirli bir değere eşit olup olmadığını kontrol eder ve yalnızca saklanan değer beklenenle eşleşiyorsa yeni değeri depolar. Uygulanmadı.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değişken tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| location1 | T\& | Değiştirmek için değişken referansı. |
| değer | T | Depolanacak değer. |
| comparand | T | Değişkenin değeriyle karşılaştırılacak değer. |

### ReturnValue

İşlem başlangıcındaki değişkenin değeri, değiştirildiği ya da değişmediği fark etmeksizin.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
