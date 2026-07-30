---
title: "System::Threading::Tasks::ResultValueTask::operator== 方法"
linktitle: "operator=="
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::ResultValueTask::operator== 方法。C++ 中 ResultValueTask 的相等运算符。"
type: docs
weight: 1200
url: /zh/cpp/system.threading.tasks/resultvaluetask/operator==/
---
## ResultValueTask::operator== method


用于 [ResultValueTask](../) 的相等运算符。

```cpp
bool System::Threading::Tasks::ResultValueTask<T>::operator==(const ResultValueTask &other) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | const ResultValueTask\& | 要与此实例比较的另一个 [ResultValueTask](../)。 |

### ReturnValue

bool 如果两个任务具有相同的结果值或引用相同的底层任务，则为 True；否则为 false。
## 备注



如果任一实例包含直接的结果值，则直接比较结果。否则，比较底层任务指针。
## 另见

* Class [ResultValueTask](../)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
