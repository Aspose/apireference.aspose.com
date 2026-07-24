---
title: "System::Threading::Mutex::WaitOne طريقة"
linktitle: "WaitOne"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Mutex::WaitOne طريقة. يقفل القفل. يُجري انتظارًا غير محدود إذا لزم الأمر في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


يقفل القفل المتبادل. يُجري انتظارًا غير محدود إذا لزم الأمر.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

دائمًا يُعيد true لأنه لا يُعيد إلا بعد قفل القفل.

## انظر أيضًا

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


يقفل القفل المتبادل. يُجري انتظارًا إذا لزم الأمر.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | مهلة الانتظار بالميليثانية. |

### ReturnValue

يُعيد true إذا كان القفل مقفلًا أو false إذا تجاوز المهلة.

## انظر أيضًا

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


يقفل القفل المتبادل. يُجري انتظارًا إذا لزم الأمر.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| timeout | TimeSpan | ـ [System::TimeSpan](../../../system/timespan/) الذي يمثل عدد الميليثانية للانتظار، أو [System::TimeSpan](../../../system/timespan/) الذي يمثل -1 ميليثانية للانتظار إلى أجل غير مسمى. |

### ReturnValue

يُعيد true إذا كان القفل مقفلًا أو false إذا تجاوز المهلة.

## انظر أيضًا

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
