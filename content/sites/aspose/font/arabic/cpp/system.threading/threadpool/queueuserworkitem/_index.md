---
title: "طريقة System::Threading::ThreadPool::QueueUserWorkItem"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::ThreadPool::QueueUserWorkItem. تضع عنصر عمل في الطابور مع رد نداء بدون معلمات في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


يضع عنصر العمل في الطابور الموجود مع رد نداء بدون معلمات.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استدعاء رد | WaitCallback | دالة رد النداء لاستخدامها كوظيفة. |

### ReturnValue

دائمًا تُعيد true.

## انظر أيضًا

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


يضع عنصر العمل في الطابور الموجود مع رد نداء بدون معلمات.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استدعاء رد | WaitCallback | دالة رد النداء لاستخدامها كوظيفة. |
| الحالة | const System::SharedPtr\<System::Object\>\& | معامل دالة الوظيفة. |

### ReturnValue

دائمًا تُعيد true.

## انظر أيضًا

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
