---
title: "System::Threading::Tasks::WhenAll method"
linktitle: "WhenAll"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::WhenAll 方法。创建一个在所有提供的任务完成后即完成的任务（C++）。"
type: docs
weight: 2400
url: /zh/cpp/system.threading.tasks/whenall/
---
## System::Threading::Tasks::WhenAll(const ArrayPtr\<RTaskPtr\<TResult\>\>\&) method


创建一个在所有提供的任务完成后即完成的任务。

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const ArrayPtr<RTaskPtr<TResult>> &tasks)
```


| 参数 | 描述 |
| --- | --- |
| TResult | 已完成任务结果的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const ArrayPtr\\<RTaskPtr\\<TResult\\>\\>\\& | 需要等待完成的任务。 |

### ReturnValue

一个在所有任务完成时返回所有结果数组的任务。

## 另见

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const ArrayPtr\<TaskPtr\>\&) method


创建一个在所有提供的任务完成后即完成的任务。

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const ArrayPtr<TaskPtr> &tasks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const ArrayPtr\\<TaskPtr\\>\\& | 需要等待完成的任务。 |

### ReturnValue

一个表示所有提供的任务已完成的任务。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\&) method


创建一个在所有提供的任务完成后即完成的任务。

```cpp
template<typename TResult> RTaskPtr<ArrayPtr<TResult>> System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<RTaskPtr<TResult>>> &tasks)
```


| 参数 | 描述 |
| --- | --- |
| TResult | 已完成任务结果的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const SharedPtr\<Collections::Generic::IEnumerable\<RTaskPtr\<TResult\>\>\>\& | 需要等待完成的任务。 |

### ReturnValue

一个在所有任务完成时返回所有结果数组的任务。

## 另见

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WhenAll(const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\&) method


创建一个在所有提供的任务完成后即完成的任务。

```cpp
TaskPtr System::Threading::Tasks::WhenAll(const SharedPtr<Collections::Generic::IEnumerable<TaskPtr>> &tasks)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 任务 | const SharedPtr\<Collections::Generic::IEnumerable\<TaskPtr\>\>\& | 需要等待完成的任务。 |

### ReturnValue

一个表示所有提供的任务已完成的任务。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
