---
title: "System::Threading 命名空间"
linktitle: "System::Threading"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Threading 命名空间。"
type: docs
weight: 6900
url: /zh/cpp/system.threading/
---



## 类

| 类 | 描述 |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) 用于通知会自动重置的等待线程。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [CancellationToken](./cancellationtoken/) | 传播应取消操作的通知。此类提供在线程之间进行协作取消的机制，允许一个线程通知其他线程某个操作应被取消。 |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | 表示取消令牌回调的注册。 |
| [CancellationTokenSource](./cancellationtokensource/) | 可用于触发取消通知的取消令牌源。 |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) 可发送给等待线程。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Interlocked](./interlocked/) | 提供线程安全操作的 API。这是一个没有实例服务的静态类型。无论何种方式都不应创建其实例。 |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) 用于通知不会自动重置的等待线程。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Monitor](./monitor/) | 类 [Monitor](./monitor/) 提供同步对象访问的机制。 |
| [Mutex](./mutex/) | [Mutex](./mutex/) 实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) 实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SynchronizationContext](./synchronizationcontext/) | 提供在各种同步操作中传播同步上下文的基本功能。 |
| [Thread](./thread/) | [Thread](./thread/) 实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [ThreadPool](./threadpool/) | [Thread](./thread/) 池 API，允许将作业推入队列，由工作线程池读取。这是一个没有实例服务的静态类型。无论何种方式都不应创建其实例。 |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) 池内部数据。这是一个通过访问函数进行内存管理的单例类型。切勿直接创建其实例。 |
| [Timer](./timer/) | [Timer](./timer/) 类，在延迟后于独立线程中执行作业项。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [TimerQueue](./timerqueue/) | 处理 [Timer](./timer/) 对象的队列。这仅是一个实现。[Timer](./timer/) 对象会自行在此注册，使用时无需自行注册——请改用 [Timer](./timer/) 类 API。这是一个通过访问函数进行内存管理的单例类型。切勿直接创建其实例。 |
| [WaitHandle](./waithandle/) | 等待原语基类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [ApartmentState](./apartmentstate/) | 设置线程的公寓状态。 |
| [EventResetMode](./eventresetmode/) | 指示事件状态如何重置。 |
| [ThreadState](./threadstate/) | 线程的状态。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | [Thread](./thread/) 函数，带单个参数。 |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | [Thread](./thread/) 函数，无参数。 |
| [TimerCallback](./timercallback/) | 计时器调用的回调函数。 |
| [wait_handle_t](./wait_handle_t/) | 句柄类型。 |
| [WaitCallback](./waitcallback/) | 一旦有空位就执行的回调项。 |
