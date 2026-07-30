---
title: "System::Threading::Tasks::ResultTask::ResultTask 构造函数"
linktitle: "ResultTask"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ResultTask::ResultTask 构造函数。内部实现。C++ 中不供用户代码使用。"
type: docs
weight: 100
url: /zh/cpp/system.threading.tasks/resulttask/resulttask/
---
## ResultTask::ResultTask() constructor


内部实现。 不供用户代码使用。

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask()
```

## 备注


用于创建未初始化结果任务的内部构造函数
## 另见

* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ResultTask(const Func\<T\>\&) constructor


使用返回值的函数构造一个 [ResultTask](../)。

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask(const Func<T> &function)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 函数 | const Func\<T\>\& | 异步执行并返回结果的函数 |

## 另见

* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ResultTask(const T\&) constructor


用于创建具有指定结果的结果任务的内部构造函数。

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask(const T &result)
```

## 另见

* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
