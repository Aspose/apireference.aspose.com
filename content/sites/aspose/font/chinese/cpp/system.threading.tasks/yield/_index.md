---
title: "System::Threading::Tasks::Yield 方法"
linktitle: "Yield"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::Yield 方法。创建一个可等待的任务，在 C++ 中等待时会异步让出回到当前上下文。"
type: docs
weight: 3200
url: /zh/cpp/system.threading.tasks/yield/
---
## System::Threading::Tasks::Yield method


创建一个可等待的任务，在等待时会异步让出回到当前上下文。

```cpp
Runtime::CompilerServices::YieldAwaitable System::Threading::Tasks::Yield()
```


### ReturnValue

一个可等待以让出控制权的 YieldAwaitable。
## 备注



此方法用于强制异步方法让出控制权，以便在继续之前处理其他挂起的工作。
## 另见

* Class [YieldAwaitable](../../system.runtime.compilerservices/yieldawaitable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
