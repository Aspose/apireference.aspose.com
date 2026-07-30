---
title: "System::Threading::Tasks::FromCanceled method"
linktitle: "FromCanceled"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::FromCanceled 方法。创建一个因使用指定令牌而已取消的任务（C++）。"
type: docs
weight: 1200
url: /zh/cpp/system.threading.tasks/fromcanceled/
---
## System::Threading::Tasks::FromCanceled method


创建一个因使用指定令牌而已取消的任务。

```cpp
TaskPtr System::Threading::Tasks::FromCanceled(const CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| cancellationToken | const CancellationToken\& | 导致任务被取消的取消令牌。 |

### ReturnValue

已取消的任务。

## 另见

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
