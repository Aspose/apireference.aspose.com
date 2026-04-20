---
title: "طريقة System::Threading::Mutex::WaitOne"
linktitle: "WaitOne"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Mutex::WaitOne. تقوم بقفل الـ mutex. تنفّذ انتظارًا غير محدود إذا لزم الأمر في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


يقفل القفل. ينفّذ انتظارًا غير محدود إذا لزم الأمر.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

دائمًا تُعيد true لأنها لا تُعيد إلا بعد قفل الـ mutex.

## انظر أيضًا

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(int) method


يقفل القفل. ينفّذ انتظارًا إذا لزم الأمر.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | مهلة الانتظار بالمللي ثانية. |

### ReturnValue

تُعيد true إذا كان الـ mutex مقفلًا أو false إذا تجاوز المهلة.

## انظر أيضًا

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


يقفل القفل. ينفّذ انتظارًا إذا لزم الأمر.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| timeout | TimeSpan | ‏[System::TimeSpan](../../../system/timespan/) يمثل عدد المللي ثانية للانتظار، أو ‏[System::TimeSpan](../../../system/timespan/) يمثل -1 مللي ثانية للانتظار إلى ما لا نهاية. |

### ReturnValue

تُعيد true إذا كان الـ mutex مقفلًا أو false إذا تجاوز المهلة.

## انظر أيضًا

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
