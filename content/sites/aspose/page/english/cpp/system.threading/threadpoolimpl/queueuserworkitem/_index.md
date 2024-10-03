---
title: System::Threading::ThreadPoolImpl::QueueUserWorkItem method
linktitle: QueueUserWorkItem
second_title: Aspose.Page for C++
description: 'System::Threading::ThreadPoolImpl::QueueUserWorkItem method. Adds work item to queue in C++.'
type: docs
weight: 100
url: /cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


Adds work item to queue.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | Description |
| --- | --- | --- |
| callback | WaitCallback | Callback function to execute. |
| state | const System::SharedPtr\<System::Object\>\& | Callback function argument. |

### ReturnValue

Always returns true.

## See Also

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
