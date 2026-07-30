---
title: "System::Threading::ThreadPool::QueueUserWorkItem 方法"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem 方法。将工作项放入队列，该工作项使用无参数的回调（C++）。"
type: docs
weight: 600
url: /zh/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


将工作项放入队列，该工作项带有无参数的回调。

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | WaitCallback | 用作作业的回调函数。 |

### ReturnValue

始终返回 true。

## 另见

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


将工作项放入队列，该工作项带有无参数的回调。

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | WaitCallback | 用作作业的回调函数。 |
| state | const System::SharedPtr\<System::Object\>\& | 作业函数参数。 |

### ReturnValue

始终返回 true。

## 另见

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
