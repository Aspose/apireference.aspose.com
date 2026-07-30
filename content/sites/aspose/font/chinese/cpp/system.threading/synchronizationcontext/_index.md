---
title: "System::Threading::SynchronizationContext 类"
linktitle: "SynchronizationContext"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::SynchronizationContext 类。提供在 C++ 中跨各种同步操作传播同步上下文的基本功能。"
type: docs
weight: 1100
url: /zh/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


提供在各种同步操作中传播同步上下文的基本功能。

```cpp
class SynchronizationContext : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [get_Current](./get_current/)() | 获取当前线程的同步上下文。 |
| virtual [Post](./post/)(SendOrPostCallback, SharedPtr\<Object\>) | 异步运行回调。 |
| virtual [Send](./send/)(SendOrPostCallback, SharedPtr\<Object\>) | 同步运行回调。 |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | 设置当前线程的同步上下文。 |
| [SynchronizationContext](./synchronizationcontext/)() | RTTI 信息。 |
## 备注


此类实现线程之间同步上下文的传播，并用于将回调或调用封送到适当的线程或同步上下文。
虚拟实现。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
