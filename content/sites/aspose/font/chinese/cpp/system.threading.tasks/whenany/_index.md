---
title: "System::Threading::Tasks::WhenAny 方法"
linktitle: "WhenAny"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::WhenAny 方法。创建一个任务，当任意提供的任务完成时即完成（C++）。"
type: docs
weight: 2800
url: /zh/cpp/system.threading.tasks/whenany/
---
## System::Threading::Tasks::WhenAny(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


创建一个任务，当任意提供的任务完成时即完成。

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| 参数 | 描述 |
| --- | --- |
| TResult | 已完成任务结果的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const ArrayPtr\\<RTaskPtr\\<TResult\\>\\>\\& | 需要等待完成的任务。 |

### ReturnValue

一个任务，当任意任务完成时返回第一个已完成的任务。

## 另见

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const ArrayPtr\<TaskPtr\>\&) method


创建一个任务，当任意提供的任务完成时即完成。

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const ArrayPtr<TaskPtr> &tasks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const ArrayPtr\\<TaskPtr\\>\\& | 需要等待完成的任务。 |

### ReturnValue

一个任务，表示所提供任务之一的完成。

## 另见

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


创建一个任务，当任意提供的任务完成时即完成。

```cpp
template<typename TResult> RTaskPtr<RTaskPtr<TResult>> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| 参数 | 描述 |
| --- | --- |
| TResult | 已完成任务结果的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | 需要等待完成的任务。 |

### ReturnValue

一个任务，当任意任务完成时返回第一个已完成的任务。

## 另见

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAny(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


创建一个任务，当任意提供的任务完成时即完成。

```cpp
RTaskPtr<TaskPtr> System::Threading::Tasks::WhenAny(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | 需要等待完成的任务。 |

### ReturnValue

一个任务，表示所提供任务之一的完成。

## 另见

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
