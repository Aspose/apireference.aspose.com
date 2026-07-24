---
title: "System::Threading::Semaphore::WaitOne method"
linktitle: "WaitOne"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Semaphore::WaitOne method. يقفل semaphore. يقوم بانتظار غير محدود إذا لزم الأمر في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


يقفل Semaphore. ينفذ انتظارًا غير محدود إذا لزم الأمر.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

دائمًا يُعيد true لأنه لا يُعيد إلا بعد قفل semaphore.

## انظر أيضًا

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::WaitOne(int) method


يقفل Semaphore. ينفذ انتظارًا إذا لزم الأمر.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | مهلة الانتظار بالميليثانية. |

### ReturnValue

يعيد true إذا تم قفل semaphore أو false إذا تجاوزت المهلة.

## انظر أيضًا

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
