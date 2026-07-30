---
title: "System::Threading::Thread 类"
linktitle: "Thread"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Thread 类。线程实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1200
url: /zh/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Abort](./abort/)() | 中止线程。未实现。 |
| [get_CurrentCulture](./get_currentculture/)() | 获取线程的区域性。 |
| static [get_CurrentThread](./get_currentthread/)() | 获取描述当前线程的对象。 |
| [get_CurrentUICulture](./get_currentuiculture/)() | 获取线程使用的用户界面区域性。 |
| [get_IsAlive](./get_isalive/)() | 检查线程是否仍在运行。 |
| [get_IsBackground](./get_isbackground/)() | 检查线程是否为后台线程。 |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | 检查线程是否由线程池拥有。 |
| [get_ManagedThreadId](./get_managedthreadid/)() const | 获取线程标识符。可以从操作系统获取，但如果操作系统的线程标识符超出 int 限制，线程的 ID 可能会冲突。 |
| [get_Name](./get_name/)() | 获取线程名称。 |
| [get_ThreadState](./get_threadstate/)() | 获取线程状态。 |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | 获取当前线程的标识符。 |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | 中断线程。未实现。 |
| [Join](./join/)() | 加入受管线程。如有需要，执行无限等待。 |
| [Join](./join/)(int) | 加入受管线程。执行有限等待。 |
| [Join](./join/)(TimeSpan) | 加入受管线程。执行有限等待。 |
| static [MemoryBarrier](./memorybarrier/)() | 同步内存访问。 |
| [operator=](./operator=/)(const Thread\&) | 从其他线程复制 TLS 数据。 |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | 设置线程区域性。 |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | 设置线程使用的用户界面区域性。 |
| [set_IsBackground](./set_isbackground/)(bool) | 将线程设置为后台或前台。 |
| [set_Name](./set_name/)(const System::String\&) | 设置线程名称。 |
| static [Sleep](./sleep/)(int) | 在指定的超时时间内停止当前线程。 |
| static [Sleep](./sleep/)(TimeSpan) | 在指定的超时时间内停止当前线程。 |
| static [SpinWait](./spinwait/)(int) | 等待特定次数的循环迭代。 |
| [Start](./start/)() | 使用空参数对象启动线程。 |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | 启动线程。 |
| [Thread](./thread/)() | 构造函数。 |
| [Thread](./thread/)(ThreadStart) | 构造函数。 |
| [Thread](./thread/)(ParameterizedThreadStart) | 构造函数。 |
| [Thread](./thread/)(Thread\&) | 拷贝构造函数。 |
| static [Yield](./yield/)() | 产生线程。 |
| virtual [~Thread](./~thread/)() | 析构函数。 |
## 备注



```cpp
#include "system/threading/thread.h"
#include "system/smart_ptr.h"

int main()
{
  auto thread = System::MakeObject<System::Threading::Thread>([]()
  {
    std::cout << "Child thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;
    System::Threading::Thread::Sleep(200);
  });

  std::cout << "Main thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;

  thread->Start();
  thread->Join();

  return 0;
}
/*
This code example produces the following output:
Main thread ID: 2
Child thread ID: 1
*/
```

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
