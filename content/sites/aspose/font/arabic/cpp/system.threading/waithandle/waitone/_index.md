---
title: "طريقة System::Threading::WaitHandle::WaitOne"
linktitle: "WaitOne"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::WaitHandle::WaitOne. ينتظر حتى يتم تشغيل المقبض لفترة غير محدودة في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


ينتظر حتى يُطلق المقبض لفترة غير محدودة.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

دائمًا تُعيد صحيح لأنه لا يحدث مهلة.

## انظر أيضًا

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int) method


ينتظر حتى يُطلق المقبض.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) للانتظار، بالمللي ثانية؛ -1 يعني انتظار لا نهائي، 0 يعني فحص وإرجاع، القيم الموجبة هي مهلات. |

### ReturnValue

صحيح إذا تم تشغيل المقبض، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


ينتظر حتى يُطلق المقبض.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) للانتظار، بالمللي ثانية؛ -1 يعني انتظار لا نهائي، 0 يعني فحص وإرجاع، القيم الموجبة هي مهلات. |
| exitContext | bool | إذا كان صحيحًا، يجب أن يترك الانتظار القفل على المقبض قبل الانتظار له. |

### ReturnValue

صحيح إذا تم تشغيل المقبض، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


ينتظر حتى يُطلق المقبض.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| timeout | TimeSpan | ‏[System::TimeSpan](../../../system/timespan/) يمثل عدد المللي ثانية للانتظار، أو ‏[System::TimeSpan](../../../system/timespan/) يمثل -1 مللي ثانية للانتظار إلى ما لا نهاية. |

### ReturnValue

صحيح إذا تم تشغيل المقبض، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
