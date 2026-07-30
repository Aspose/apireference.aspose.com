---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem 方法"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem 方法。将工作项添加到 C++ 中的队列。"
type: docs
weight: 700
url: /zh/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


向队列添加工作项。

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | WaitCallback | 要执行的回调函数。 |
| state | const System::SharedPtr\<System::Object\>\& | 回调函数参数。 |

### ReturnValue

始终返回 true。

## 另见

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
