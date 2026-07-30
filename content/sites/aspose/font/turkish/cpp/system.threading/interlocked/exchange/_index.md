---
title: "System::Threading::Interlocked::Exchange yöntemi"
linktitle: "Exchange"
second_title: "Aspose.Font için C++"
description: "System::Threading::Interlocked::Exchange yöntemi. Değişkenin değerini değiştirir: yeni değeri depolar ve C++'de depolanmadan hemen önce değişkenin sahip olduğu değeri döndürür."
type: docs
weight: 400
url: /tr/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Değişken üzerindeki değer değişimi: yeni değeri depolar ve depolamadan hemen önce değişkenin sahip olduğu değeri döndürür.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değişken tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| location1 | T\& | Değiştirmek için değişken referansı. |
| değer | T | Depolanacak değer. |

### ReturnValue

Değiştirilmeye hemen önceki değişkenin değeri.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Değişken üzerindeki değer değişimi: yeni değeri depolar ve depolamadan hemen önce değişkenin sahip olduğu değeri döndürür. Uygulanmadı.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değişken tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| location1 | T\& | Değiştirmek için değişken referansı. |
| değer | T | Depolanacak değer. |

### ReturnValue

Değiştirilmeye hemen önceki değişkenin değeri.

## Ayrıca Bakınız

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
