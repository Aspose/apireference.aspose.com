---
title: "System::Threading::Tasks::Task::Task 构造函数"
linktitle: "Task"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::Task::Task 构造函数。用于在 C++ 中创建未初始化任务的内部构造函数。"
type: docs
weight: 100
url: /zh/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


用于创建未初始化任务的内部构造函数。

```cpp
System::Threading::Tasks::Task::Task()
```

## 另见

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


构造一个带有有状态操作和状态对象的 [Task](../)。

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | 要执行的操作（接受状态对象） |
| state | const SharedPtr\<Object\>\& | 传递给操作的用户定义状态对象 |

## 另见

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


构造一个带有有状态操作、状态和取消令牌的 [Task](../)。

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | 要执行的操作（接受状态对象） |
| state | const SharedPtr\<Object\>\& | 传递给操作的用户定义状态对象 |
| cancellationToken | const CancellationToken\& | 用于监视取消请求的令牌 |

## 另见

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&) constructor


构造一个带有待执行操作的 [Task](../)。

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| action | const Action<>\& | 要异步执行的操作 |

## 另见

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


构造一个带有操作和取消令牌的 [Task](../)。

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| action | const Action<>\& | 要异步执行的操作 |
| cancellationToken | const CancellationToken\& | 用于监视取消请求的令牌 |

## 另见

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
