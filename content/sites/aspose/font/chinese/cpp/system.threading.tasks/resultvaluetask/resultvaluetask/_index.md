---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask 构造函数"
linktitle: "ResultValueTask"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask 构造函数。构造一个空的、未初始化的 ResultValueTask（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


构造一个空的、未初始化的 [ResultValueTask](../)。

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## 备注



任务尚未完成且不包含结果。尝试获取结果将抛出异常。

## 另见

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


从指向 [ResultTask<T>](../../resulttask/) 的共享指针构造一个 [ResultValueTask](../)。

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const RTaskPtr\<T\>\& | 要包装的任务。对于空任务可以为 null。 |
## 备注



该 [ResultValueTask](../) 将表示提供的任务的状态和结果。

## 另见

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


使用指定的结果构造一个已完成的 [ResultValueTask](../)。

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| result | const T\& | 要包装在已完成任务中的结果值。 |
## 备注



这将创建一个成功完成的任务，立即返回该值。

## 另见

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
