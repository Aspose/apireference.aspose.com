---
title: "System::Threading::ThreadPoolImpl 类"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::ThreadPoolImpl 类。线程池内部数据。这是一个通过访问函数进行内存管理的单例类型。您绝不应该在 C++ 中直接创建它的实例。"
type: docs
weight: 1400
url: /zh/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | 获取可用线程数。 |
| static [GetInitialized](./getinitialized/)() | 获取初始化状态单例。 |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | 获取最大并发线程数。 |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | 获取池创建的最小线程数。 |
| [JoinAll](./joinall/)() | 加入所有拥有的线程。无限期等待。 |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | 向队列添加工作项。 |
| [SetMaxThreads](./setmaxthreads/)(int, int) | 设置池拥有的线程数。 |
| [SetMinThreads](./setminthreads/)(int, int) | 设置池拥有的最小线程数。 |
| [ThreadPoolImpl](./threadpoolimpl/)() | 构造函数。 |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | 析构函数。如果线程尚未终止，则对所有线程执行 join 操作。 |
## 另见

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
