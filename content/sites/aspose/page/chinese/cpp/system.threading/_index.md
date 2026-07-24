---
title: "System::Threading 命名空间"
linktitle: "System::Threading"
second_title: "Aspose.Page 适用于 C++"
description: "如何在 C++ 中使用 System::Threading 命名空间。"
type: docs
weight: 6500
url: /zh/cpp/system.threading/
---



## 类

| 类 | 描述 |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) 用于通知等待的线程并自动重置。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [CancellationToken](./cancellationtoken/) | 传播操作应被取消的通知。此类提供在线程之间进行协作取消的机制，允许一个线程通知其他线程操作应被取消。 |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | 表示取消令牌回调的注册。 |
| [CancellationTokenSource](./cancellationtokensource/) | 可用于触发取消通知的取消令牌源。 |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) 可发送给等待线程的事件。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Interlocked](./interlocked/) | 提供线程安全操作的 API。此类型为静态类型，不提供实例服务。绝不应以任何方式创建其实例。 |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) 用于通知等待的线程，且不会自动复位。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [Monitor](./monitor/) | 类 [Monitor](./monitor/) 提供一种同步访问对象的机制。 |
| [Mutex](./mutex/) | [Mutex](./mutex/) 实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) 实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [SynchronizationContext](./synchronizationcontext/) | 提供在各种同步操作中传播同步上下文的基本功能。 |
| [Thread](./thread/) | [Thread](./thread/) 实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [ThreadPool](./threadpool/) | [Thread](./thread/) 池 API，允许将作业推入队列，由工作线程池读取。此类型为静态类型，不提供实例服务。绝不应以任何方式创建其实例。 |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) 池内部数据。此类型为单例类型，内存由访问函数管理。切勿直接创建其实例。 |
| [Timer](./timer/) | [Timer](./timer/) 类，在延迟后于独立线程中执行作业项。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [TimerQueue](./timerqueue/) | 处理 [Timer](./timer/) 对象的队列。这仅是一个实现。[Timer](./timer/) 对象会自行注册到此处，使用时无需手动注册——请改用 [Timer](./timer/) 类 API。此类型为单例类型，内存由访问函数管理。切勿直接创建其实例。 |
| [WaitHandle](./waithandle/) | 等待原语基类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [ApartmentState](./apartmentstate/) | 设置线程的公寓状态。 |
| [EventResetMode](./eventresetmode/) | 指示事件状态的复位方式。 |
| [ThreadState](./threadstate/) | 线程的状态。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | [Thread](./thread/) 带单参数的函数。 |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | [Thread](./thread/) 无参数的函数。 |
| [TimerCallback](./timercallback/) | 计时器调用的回调函数。 |
| [wait_handle_t](./wait_handle_t/) | 句柄类型。 |
| [WaitCallback](./waitcallback/) | 一旦有空位即执行的回调项。 |
