---
title: "System::Threading::SynchronizationContext::SetSynchronizationContext 方法"
linktitle: "SetSynchronizationContext"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::SynchronizationContext::SetSynchronizationContext 方法。在 C++ 中为当前线程设置同步上下文。"
type: docs
weight: 500
url: /zh/cpp/system.threading/synchronizationcontext/setsynchronizationcontext/
---
## SynchronizationContext::SetSynchronizationContext method


设置当前线程的同步上下文。

```cpp
static void System::Threading::SynchronizationContext::SetSynchronizationContext(const SharedPtr<SynchronizationContext> &syncContext)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| syncContext | const SharedPtr\<SynchronizationContext\>\& | 用于设置当前线程的同步上下文。 |
## 备注



传递 nullptr 将清除当前线程的同步上下文。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SynchronizationContext](../)
* Class [SynchronizationContext](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
