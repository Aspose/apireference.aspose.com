---
title: "Aspose::Page::EPS::Util::ThreadLocal 类"
linktitle: "ThreadLocal"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::Util::ThreadLocal 类。该类用于复制 .NET Framework 4.0 和 4.5 的 System.Threading.ThreadLocal 包装类型提供的功能。它实现了线程本地的实例和静态类型，并在不同线程之间引用不同的实例，即使该类所聚合的实际实例类型在 C++ 中可能相同。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


用于复制 .NET Framework 4.0 和 4.5 中 System.Threading.ThreadLocal 包装器类型提供的功能的类。它实现了线程局部的实例和静态类型，在不同线程之间引用不同的实例，即使该类聚合的实际实例类型可能相同。

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parameter | 描述 |
| --- | --- |
| T | 用于线程选择逻辑的包装变量类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而非共享指针）。允许在容器中将指针切换为弱模式。 |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Factory](./factory/) |  |

## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
