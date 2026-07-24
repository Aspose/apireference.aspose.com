---
title: "System::Threading::Interlocked::Exchange yöntemi"
linktitle: "Değiştir"
second_title: "Aspose.Page için C++"
description: "System::Threading::Interlocked::Exchange yöntemi. Değişken üzerindeki değeri değiştirir: yeni değeri depolar ve C++'ta depolanmadan hemen önce değişkenin sahip olduğu değeri döndürür."
type: docs
weight: 400
url: /tr/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Değişken üzerindeki değeri değiştirir: yeni değeri depolar ve depolanmadan hemen önce değişkenin sahip olduğu değeri döndürür.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değişken tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| location1 | T\& | Değiştirilecek değişken referansı. |
| değer | T | Depolanacak değer. |

### ReturnValue

Değişkenin değiştirilmeden hemen önceki değeri.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Değişken üzerindeki değeri değiştirir: yeni değeri depolar ve depolanmadan hemen önce değişkenin sahip olduğu değeri döndürür. Henüz uygulanmadı.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değişken tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| location1 | T\& | Değiştirilecek değişken referansı. |
| değer | T | Depolanacak değer. |

### ReturnValue

Değişkenin değiştirilmeden hemen önceki değeri.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
