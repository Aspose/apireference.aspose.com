---
title: "System::Threading::SynchronizationContext::SetSynchronizationContext 方法"
linktitle: "SetSynchronizationContext"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::SynchronizationContext::SetSynchronizationContext 方法。设置当前线程的同步上下文（在 C++ 中）。"
type: docs
weight: 300
url: /zh/cpp/system.threading/synchronizationcontext/setsynchronizationcontext/
---
## SynchronizationContext::SetSynchronizationContext method


设置当前线程的同步上下文。

```cpp
static void System::Threading::SynchronizationContext::SetSynchronizationContext(const SharedPtr<SynchronizationContext> &syncContext)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| syncContext | const SharedPtr\<SynchronizationContext\>\& | 要为当前线程设置的同步上下文。 |
## 备注



传入 nullptr 将清除当前线程的同步上下文。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SynchronizationContext](../)
* Class [SynchronizationContext](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
