---
title: "System::Threading::WaitHandle::WaitOne metodu"
linktitle: "WaitOne"
second_title: "Aspose.Font için C++"
description: "System::Threading::WaitHandle::WaitOne metodu. C++'de tutamağın süresiz bir süre boyunca tetiklenmesini bekler."
type: docs
weight: 600
url: /tr/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


İşleyicinin sınırsız bir süre boyunca tetiklenmesini bekler.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Zaman aşımı oluşmadığı için her zaman true döndürür.

## Ayrıca Bakınız

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int) method


İşleyicinin tetiklenmesini bekler.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) beklemek için, milisaniye cinsinden; -1 sonsuz beklemeyi, 0 kontrol edip dönmeyi, pozitif değerler ise zaman aşımını ifade eder. |

### ReturnValue

Tutamak tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


İşleyicinin tetiklenmesini bekler.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) beklemek için, milisaniye cinsinden; -1 sonsuz beklemeyi, 0 kontrol edip dönmeyi, pozitif değerler ise zaman aşımını ifade eder. |
| exitContext | bool | True ise, bekleme tutamak üzerindeki kilidi, ona beklemeden önce bırakmalıdır. |

### ReturnValue

Tutamak tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


İşleyicinin tetiklenmesini bekler.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| timeout | TimeSpan | Beklenecek milisaniye sayısını temsil eden bir [System::TimeSpan](../../../system/timespan/), ya da süresiz beklemeyi temsil eden -1 milisaniyeyi gösteren bir [System::TimeSpan](../../../system/timespan/). |

### ReturnValue

Tutamak tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
