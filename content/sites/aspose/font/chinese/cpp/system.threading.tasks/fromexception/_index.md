---
title: "System::Threading::Tasks::FromException 方法"
linktitle: "FromException"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::FromException 方法。创建一个已完成且带有指定异常的任务（C++）。"
type: docs
weight: 1300
url: /zh/cpp/system.threading.tasks/fromexception/
---
## System::Threading::Tasks::FromException(const Exception\&) method


创建一个已完成且带有指定异常的任务。

```cpp
TaskPtr System::Threading::Tasks::FromException(const Exception &exception)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 异常 | const Exception\& | 用于完成任务的异常。 |

### ReturnValue

一个已故障的任务。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::FromException(const Exception\&) method


创建一个已完成且带有指定异常和结果类型的任务。

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::FromException(const Exception &exception)
```


| 参数 | 描述 |
| --- | --- |
| TResult | 任务结果的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 异常 | const Exception\& | 用于完成任务的异常。 |

### ReturnValue

一个带有指定结果类型的已故障任务。

## 另见

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Typedef [Exception](../../system/exception/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
