---
title: "System::Threading::WaitHandle::WaitAny metodu"
linktitle: "WaitAny"
second_title: "Aspose.Font için C++"
description: "System::Threading::WaitHandle::WaitAny metodu. C++'de tutamaklardan herhangi birinin tetiklenmesini bekler."
type: docs
weight: 200
url: /tr/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


İşleyicilerden herhangi birinin tetiklenmesini bekler.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
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
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


İşleyicilerden herhangi birinin tetiklenmesini bekler.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Beklenecek tutamaklar. |
| millisecondsTimeout | int | [Timeout](../../timeout/) beklemek için, milisaniye cinsinden; -1 sonsuz beklemeyi, 0 kontrol edip dönmeyi, pozitif değerler ise zaman aşımını ifade eder. |

### ReturnValue

Herhangi bir tutamak tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


İşleyicilerden herhangi birinin tetiklenmesini bekler.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Beklenecek tutamaklar. |
| timeout | TimeSpan | Beklenecek milisaniye sayısını temsil eden bir [System::TimeSpan](../../../system/timespan/), ya da süresiz beklemeyi temsil eden -1 milisaniyeyi gösteren bir [System::TimeSpan](../../../system/timespan/). |

### ReturnValue

Herhangi bir tutamak tetiklendiğinde True, zaman aşımı aşıldığında false.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
