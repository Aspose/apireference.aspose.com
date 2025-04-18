---
title: System::Threading::ThreadPool::QueueUserWorkItem method
linktitle: QueueUserWorkItem
second_title: Aspose.PUB for C++
description: 'System::Threading::ThreadPool::QueueUserWorkItem method. Puts work item into queue which is present with callback with no parameter in C++.'
type: docs
weight: 600
url: /cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Puts work item into queue which is present with callback with no parameter.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Type | Description |
| --- | --- | --- |
| callback | WaitCallback | Callback function to be used as a job. |

### ReturnValue

Always returns true.

## See Also

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.PUB for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Puts work item into queue which is present with callback with no parameter.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | Description |
| --- | --- | --- |
| callback | WaitCallback | Callback function to be used as a job. |
| state | const System::SharedPtr\<System::Object\>\& | Job function parameter. |

### ReturnValue

Always returns true.

## See Also

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.PUB for C++](../../../)
