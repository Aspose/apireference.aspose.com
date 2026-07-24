---
title: "System::Threading::ThreadPool::QueueUserWorkItem 方法"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem 方法。将工作项放入队列，该队列使用无参数的回调函数，在 C++ 中实现。"
type: docs
weight: 600
url: /zh/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


将工作项放入带有无参数回调的队列。

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 回调 | WaitCallback | 回调函数用于作为作业。 |

### ReturnValue

始终返回 true。

## 另见

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


将工作项放入带有无参数回调的队列。

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 回调 | WaitCallback | 回调函数用于作为作业。 |
| 状态 | const System::SharedPtr\<System::Object\>\& | 作业函数参数。 |

### ReturnValue

始终返回 true。

## 另见

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
