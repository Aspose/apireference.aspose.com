---
title: "System::Threading::Tasks::ResultTask::ContinueWith 方法"
linktitle: "ContinueWith"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith 方法。创建一个在 C++ 中结果任务完成时执行的后续操作。"
type: docs
weight: 400
url: /zh/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith(const Action\<RTaskPtr\<T\>\>\&) method


创建一个在结果任务完成时执行的延续。

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | 在此任务完成时执行的 [Action](../../../system/action/)，接收此结果任务 |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## 备注



后续操作接收此 [ResultTask](../) 以访问结果值

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Action\<TaskPtr\>\&) method


创建一个在任务完成时执行的延续。

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | 在此任务完成时执行的 [Action](../../../system/action/) |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<RTaskPtr\<T\>, TNewResult\>\&) method


创建一个在结果任务完成时执行的延续。

```cpp
template<typename TNewResult> RTaskPtr<TNewResult> System::Threading::Tasks::ResultTask<T>::ContinueWith(const Func<RTaskPtr<T>, TNewResult> &continuationFunction)
```


| 参数 | 描述 |
| --- | --- |
| TNewResult | 任务后续操作的结果类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continuationFunction | const Func\<RTaskPtr\<T\>, TNewResult\>\& | 在此任务完成时获取后续结果的函数，接收此结果任务 |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation
## 备注



continuation 函数接收此 [ResultTask](../) 以访问结果值

## 另见

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


创建一个在任务完成时执行的延续。

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Task::ContinueWith(const Func<TaskPtr, TResult> &continuationFunction)
```


| 参数 | 描述 |
| --- | --- |
| TResult | 任务结果的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| continuationFunction | const Func\<TaskPtr, TResult\>\& | 当此任务完成时获取结果的函数 |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation

## 另见

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
