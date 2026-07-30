---
title: "System::Threading::Mutex class"
linktitle: "Mutex"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Mutex 类。Mutex 实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 900
url: /zh/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Mutex](./mutex/)() | RTTI 信息。 |
| [Mutex](./mutex/)(bool) | 构造函数。 |
| [Mutex](./mutex/)(bool, const String\&) | 构造函数。 |
| [ReleaseMutex](./releasemutex/)() | 释放互斥体。 |
| static [Remove](./remove/)(const String\&) | 删除系统中的已命名互斥体。 |
| virtual [Reset](./reset/)() | 重置互斥体状态。未实现。 |
| virtual [Set](./set/)() | 将互斥体设置为已发信号状态。未实现。 |
| [WaitOne](./waitone/)() override | 锁定互斥体。如有必要，执行无限等待。 |
| [WaitOne](./waitone/)(int) override | 锁定互斥体。如有必要，执行等待。 |
| [WaitOne](./waitone/)(TimeSpan) override | 锁定互斥体。如有必要，执行等待。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | 特殊值由函数返回；否则返回数组中已发信号对象的索引，如果超时且没有任何信号。 |
## 备注



```cpp
#include "system/threading/mutex.h"
#include "system/threading/thread.h"
#include "system/console.h"
#include "system/convert.h"
#include "system/smart_ptr.h"
#include "system/string.h"

int main()
{
  auto mutex = System::MakeObject<System::Threading::Mutex>();

  System::String str;

  const int THREADS_COUNT = 3;
  std::vector<System::SharedPtr<System::Threading::Thread>> threads;
  threads.reserve(THREADS_COUNT);

  for (auto i = 0; i < THREADS_COUNT; ++i)
  {
    threads.push_back(System::MakeObject<System::Threading::Thread>([&mutex, &str]()
    {
      mutex->WaitOne();

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" started." + System::Environment::get_NewLine();

      System::Threading::Thread::Sleep(200);

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" ended." + System::Environment::get_NewLine();

      mutex->ReleaseMutex();
    }));

    threads[i]->Start();
  }

  System::Threading::Thread::Sleep(700);

  System::Console::WriteLine(str);

  return 0;
}
/*
This code example produces the following output:
Thread 1 started.
Thread 1 ended.
Thread 2 started.
Thread 2 ended.
Thread 3 started.
Thread 3 ended.
*/
```

## 另见

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
