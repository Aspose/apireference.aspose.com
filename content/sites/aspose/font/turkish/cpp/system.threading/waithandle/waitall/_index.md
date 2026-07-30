---
title: "System::Threading::WaitHandle::WaitAll metodu"
linktitle: "WaitAll"
second_title: "Aspose.Font için C++"
description: "System::Threading::WaitHandle::WaitAll metodu. C++'de tüm tutamakların tetiklenmesini bekler."
type: docs
weight: 100
url: /tr/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Tüm işleyicilerin tetiklenmesini bekler.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Beklenecek tutamaklar. |

### ReturnValue

waitHandles içindeki her öğe bir sinyal aldığında True; aksi takdirde metod asla döndürmez.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


RTTI bilgisi.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Beklenecek tutamaklar. |
| millisecondsTimeout | int | [Timeout](../../timeout/) beklemek için, milisaniye cinsinden; -1 sonsuz beklemeyi, 0 kontrol edip dönmeyi, pozitif değerler ise zaman aşımını ifade eder. |

### ReturnValue

Tüm tutamaklar tetiklendiğinde True, zaman aşımı aşıldığında false.
## Açıklamalar


Tüm işleyicilerin tetiklenmesini bekler.
## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Tüm işleyicilerin tetiklenmesini bekler.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Beklenecek tutamaklar. |
| timeout | TimeSpan | Beklenecek milisaniye sayısını temsil eden bir [System::TimeSpan](../../../system/timespan/), ya da süresiz beklemeyi temsil eden -1 milisaniyeyi gösteren bir [System::TimeSpan](../../../system/timespan/). |

### ReturnValue

Tüm tutamaklar tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
