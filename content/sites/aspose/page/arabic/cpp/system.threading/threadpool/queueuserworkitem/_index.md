---
title: "System::Threading::ThreadPool::QueueUserWorkItem طريقة"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem طريقة. يضع عنصر العمل في الطابور الموجود مع رد نداء بدون معلمات في C++."
type: docs
weight: 600
url: /ar/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


يضع عنصر عمل في الطابور الموجود مع رد اتصال بدون معلمات.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| استدعاء رد | WaitCallback | دالة رد النداء لاستخدامها كوظيفة. |

### ReturnValue

دائمًا يُعيد true.

## انظر أيضًا

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


يضع عنصر عمل في الطابور الموجود مع رد اتصال بدون معلمات.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| استدعاء رد | WaitCallback | دالة رد النداء لاستخدامها كوظيفة. |
| الحالة | const System::SharedPtr\<System::Object\>\& | معامل دالة الوظيفة. |

### ReturnValue

دائمًا يُعيد true.

## انظر أيضًا

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
