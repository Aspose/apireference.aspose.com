---
title: "طريقة System::Threading::ThreadPoolImpl::QueueUserWorkItem"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Threading::ThreadPoolImpl::QueueUserWorkItem. يضيف عنصر عمل إلى القائمة في C++."
type: docs
weight: 700
url: /ar/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


يضيف عنصر عمل إلى الطابور.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| استدعاء رد | WaitCallback | دالة رد الاتصال للتنفيذ. |
| الحالة | const System::SharedPtr\<System::Object\>\& | معامل دالة رد الاتصال. |

### ReturnValue

دائمًا يُعيد true.

## انظر أيضًا

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
