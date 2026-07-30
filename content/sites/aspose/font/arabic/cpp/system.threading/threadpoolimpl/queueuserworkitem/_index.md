---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem طريقة"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::ThreadPoolImpl::QueueUserWorkItem. يضيف عنصر عمل إلى الطابور في C++."
type: docs
weight: 700
url: /ar/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


يضيف عنصر عمل إلى القائمة.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| استدعاء رد | WaitCallback | دالة رد النداء للتنفيذ. |
| الحالة | const System::SharedPtr\<System::Object\>\& | معامل دالة رد النداء. |

### ReturnValue

دائمًا تُعيد true.

## انظر أيضًا

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
