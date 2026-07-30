---
title: "System::Threading::Tasks::Run 方法"
linktitle: "Run"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::Run 方法。将指定的工作排入线程池执行，并在 C++ 中返回该工作的 Task 句柄。"
type: docs
weight: 1600
url: /zh/cpp/system.threading.tasks/run/
---
## System::Threading::Tasks::Run(const Action<>\&) method


将指定的工作排入线程池执行，并返回该工作的 [Task](../task/) 句柄。

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| action | const Action<>\& | 要异步执行的工作。 |

### ReturnValue

一个表示已排入线程池执行的工作的 [Task](../task/)。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Action<>\&, const CancellationToken\&) method


将指定的工作排入线程池执行，并返回该工作的 [Task](../task/) 句柄。

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action, const CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| action | const Action<>\& | 要异步执行的工作。 |
| cancellationToken | const CancellationToken\& | 一个取消令牌，可用于在工作尚未开始时取消它。 |

### ReturnValue

一个表示已排入线程池执行的工作的 [Task](../task/)。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TaskPtr\>\&) method


将指定的工作排入线程池执行，并返回函数返回的 [Task](../task/) 的代理。

```cpp
TaskPtr System::Threading::Tasks::Run(const Func<TaskPtr> &function)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| function | const Func\<TaskPtr\>\& | 要异步执行的工作，该工作返回一个 [Task](../task/)。 |

### ReturnValue

一个表示函数返回的 [Task](../task/) 代理的 [Task](../task/)。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TResult\>\&) method


将指定的工作排入线程池执行，并返回一个用于该工作的 [Task<TResult>](../task/) 句柄。

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Run(const Func<TResult> &function)
```


| 参数 | 描述 |
| --- | --- |
| TResult | 任务返回的结果的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 函数 | const Func\\<TResult\\>\\& | 要异步执行的工作。 |

### ReturnValue

一个表示已排入线程池执行的工作的 [Task<TResult>](../task/)。

## 另见

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
