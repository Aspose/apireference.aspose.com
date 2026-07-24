---
title: "System::Threading::WaitHandle::WaitOne طريقة"
linktitle: "WaitOne"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::WaitHandle::WaitOne طريقة. ينتظر أن يُطلق المقبض لفترة غير محدودة في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


ينتظر أن يتم تشغيل المقبض لفترة غير محدودة.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

دائمًا تُعيد صحيح لأنه لا يحدث مهلة.

## انظر أيضًا

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


ينتظر أن يتم تشغيل المقبض.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) للانتظار، بالميليثانية؛ -1 يعني انتظار لا نهائي، 0 يعني فحص وإرجاع، القيم الموجبة هي مهلات. |

### ReturnValue

صحيح إذا تم إطلاق المقبض، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


ينتظر أن يتم تشغيل المقبض.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) للانتظار، بالميليثانية؛ -1 يعني انتظار لا نهائي، 0 يعني فحص وإرجاع، القيم الموجبة هي مهلات. |
| exitContext | bool | إذا كان صحيحًا، يجب على الانتظار أن يزيل القفل عن المقبض قبل الانتظار له. |

### ReturnValue

صحيح إذا تم إطلاق المقبض، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


ينتظر أن يتم تشغيل المقبض.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| timeout | TimeSpan | ـ [System::TimeSpan](../../../system/timespan/) الذي يمثل عدد الميليثانية للانتظار، أو [System::TimeSpan](../../../system/timespan/) الذي يمثل -1 ميليثانية للانتظار إلى أجل غير مسمى. |

### ReturnValue

صحيح إذا تم إطلاق المقبض، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
