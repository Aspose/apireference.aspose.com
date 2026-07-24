---
title: "System::Threading::WaitHandle::WaitAll طريقة"
linktitle: "WaitAll"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::WaitHandle::WaitAll طريقة. ينتظر جميع المقابض لتُطلق في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


ينتظر حتى تُطلق جميع المقابض.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض للانتظار. |

### ReturnValue

صحيح عندما يتلقى كل عنصر في waitHandles إشارة؛ وإلا فإن الطريقة لا تعود أبدًا.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


معلومات RTTI.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض للانتظار. |
| millisecondsTimeout | int | [Timeout](../../timeout/) للانتظار، بالميليثانية؛ -1 يعني انتظار لا نهائي، 0 يعني فحص وإرجاع، القيم الموجبة هي مهلات. |

### ReturnValue

صحيح إذا تم إطلاق جميع المقابض، خطأ إذا تجاوزت المهلة.
## ملاحظات


ينتظر حتى تُطلق جميع المقابض.
## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


ينتظر حتى تُطلق جميع المقابض.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض للانتظار. |
| timeout | TimeSpan | ـ [System::TimeSpan](../../../system/timespan/) الذي يمثل عدد الميليثانية للانتظار، أو [System::TimeSpan](../../../system/timespan/) الذي يمثل -1 ميليثانية للانتظار إلى أجل غير مسمى. |

### ReturnValue

صحيح إذا تم إطلاق جميع المقابض، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
