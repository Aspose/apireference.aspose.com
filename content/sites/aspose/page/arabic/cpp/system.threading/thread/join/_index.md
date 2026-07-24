---
title: "طريقة System::Threading::Thread::Join"
linktitle: "Join"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::Thread::Join. ينضم إلى الخيط المُدار. يُجري انتظارًا غير محدود إذا لزم الأمر في C++."
type: docs
weight: 1400
url: /ar/cpp/system.threading/thread/join/
---
## Thread::Join() method


ينضم إلى الخيط المدار. ينفّذ انتظارًا غير محدود إذا لزم الأمر.

```cpp
void System::Threading::Thread::Join()
```

## انظر أيضًا

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(int) method


ينضم إلى الخيط المدار. ينفّذ انتظارًا محدودًا.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | مهلة الانتظار بالميليثانية. |

### ReturnValue

صحيح إذا تم الانضمام إلى الخيط بنجاح، خطأ إذا تجاوز المهلة.

## انظر أيضًا

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(TimeSpan) method


ينضم إلى الخيط المدار. ينفّذ انتظارًا محدودًا.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| timeout | TimeSpan | كائن [TimeSpan](../../../system/timespan/) يُحدَّد إلى مقدار الوقت للانتظار حتى ينتهي الخيط. |

### ReturnValue

صحيح إذا تم الانضمام إلى الخيط بنجاح، خطأ إذا تجاوز المهلة.

## انظر أيضًا

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
