---
title: "طريقة System::Threading::Semaphore::WaitOne"
linktitle: "WaitOne"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Semaphore::WaitOne. تُقفل semaphore. تُجري انتظارًا غير محدود إذا لزم الأمر في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


يقفل الـ Semaphore. ينفذ انتظارًا غير محدود إذا لزم الأمر.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

دائمًا تُعيد true لأنه لا يُعيد إلا بعد قفل semaphore.

## انظر أيضًا

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Semaphore::WaitOne(int) method


يقفل الـ Semaphore. ينفذ انتظارًا إذا لزم الأمر.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| millisecondsTimeout | int | مهلة الانتظار بالمللي ثانية. |

### ReturnValue

تُعيد true إذا تم قفل semaphore أو false إذا تجاوزت المهلة.

## انظر أيضًا

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
