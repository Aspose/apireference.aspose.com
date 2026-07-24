---
title: "System::Threading::WaitHandle::WaitAny yöntemi"
linktitle: "WaitAny"
second_title: "Aspose.Page için C++"
description: "System::Threading::WaitHandle::WaitAny yöntemi. C++'ta herhangi bir tutamacın tetiklenmesini bekler."
type: docs
weight: 200
url: /tr/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


İşleyicilerden herhangi birinin tetiklenmesini bekler.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Beklenecek tanıtıcılar. |

### ReturnValue

waitHandles içindeki her öğe sinyal aldığında True; aksi takdirde metod asla dönmez.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


İşleyicilerden herhangi birinin tetiklenmesini bekler.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Beklenecek tanıtıcılar. |
| millisecondsTimeout | int | [Timeout](../../timeout/) bekleme süresi, milisaniye cinsinden; -1 sonsuz beklemeyi, 0 kontrol edip dönmeyi, pozitif değerler ise zaman aşımını ifade eder. |

### ReturnValue

True, herhangi bir tutamacın tetiklenmesi durumunda; false, zaman aşımı aşılırsa.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


İşleyicilerden herhangi birinin tetiklenmesini bekler.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Beklenecek tanıtıcılar. |
| timeout | TimeSpan | Beklenecek milisaniye sayısını temsil eden bir [System::TimeSpan](../../../system/timespan/), ya da -1 milisaniyeyi temsil ederek süresiz beklemeyi gösteren bir [System::TimeSpan](../../../system/timespan/). |

### ReturnValue

True, herhangi bir tutamacın tetiklenmesi durumunda; false, zaman aşımı aşılırsa.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
