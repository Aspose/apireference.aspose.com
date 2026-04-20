---
title: "طريقة System::Threading::WaitHandle::WaitAll"
linktitle: "WaitAll"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::WaitHandle::WaitAll. ينتظر حتى يتم تشغيل جميع المقابض في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


ينتظر حتى تُطلق جميع المقابض.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض التي ينتظرها. |

### ReturnValue

صحيح عندما يتلقى كل عنصر في waitHandles إشارة؛ وإلا فإن الطريقة لا تعود أبداً.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


معلومات RTTI.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض التي ينتظرها. |
| millisecondsTimeout | int | [Timeout](../../timeout/) للانتظار، بالمللي ثانية؛ -1 يعني انتظار لا نهائي، 0 يعني فحص وإرجاع، القيم الموجبة هي مهلات. |

### ReturnValue

صحيح إذا تم تشغيل جميع المقابض، خطأ إذا تجاوزت المهلة.
## ملاحظات


ينتظر حتى تُطلق جميع المقابض.
## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


ينتظر حتى تُطلق جميع المقابض.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | المقابض التي ينتظرها. |
| timeout | TimeSpan | ‏[System::TimeSpan](../../../system/timespan/) يمثل عدد المللي ثانية للانتظار، أو ‏[System::TimeSpan](../../../system/timespan/) يمثل -1 مللي ثانية للانتظار إلى ما لا نهاية. |

### ReturnValue

صحيح إذا تم تشغيل جميع المقابض، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
