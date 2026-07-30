---
title: "طريقة System::Threading::Thread::Join"
linktitle: "Join"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Thread::Join. ينضم إلى الخيط المُدار. يُجري انتظارًا غير محدود إذا لزم الأمر في C++."
type: docs
weight: 1400
url: /ar/cpp/system.threading/thread/join/
---
## Thread::Join() method


ينضم إلى الخيط المُدار. يُجري انتظاراً غير محدود إذا لزم الأمر.

```cpp
void System::Threading::Thread::Join()
```

## انظر أيضًا

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(int) method


ينضم إلى الخيط المُدار. يُجري انتظاراً محدوداً.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | مهلة الانتظار بالمللي ثانية. |

### ReturnValue

صحيح إذا تم الانضمام إلى الخيط بنجاح، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(TimeSpan) method


ينضم إلى الخيط المُدار. يُجري انتظاراً محدوداً.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| timeout | TimeSpan | [TimeSpan](../../../system/timespan/) محدد إلى مقدار الوقت للانتظار حتى ينتهي الخيط. |

### ReturnValue

صحيح إذا تم الانضمام إلى الخيط بنجاح، خطأ إذا تجاوزت المهلة.

## انظر أيضًا

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
