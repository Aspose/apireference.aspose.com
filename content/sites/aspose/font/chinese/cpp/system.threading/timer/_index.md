---
title: "System::Threading::Timer 类"
linktitle: "Timer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Timer 类。计时器类，在延迟后于独立线程中执行作业项。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1500
url: /zh/cpp/system.threading/timer/
---
## Timer class


[Timer](./) class that executes job item in separate thread after delay. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Timer : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Change](./change/)(int64_t, int64_t) | 重新调度或取消计时器。 |
| [Change](./change/)(System::TimeSpan, System::TimeSpan) | 重新调度或取消计时器。 |
| [Dispose](./dispose/)() | 取消计时器。 |
| [Timer](./timer/)(TimerCallback) | 构造函数。 |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) | 构造函数。 |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) | 构造函数。 |
## 备注



```cpp
#include "system/threading/thread.h"
#include "system/threading/timer.h"
#include "system/object.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  using namespace System::Threading;

  auto number = 0;
  auto timer = System::MakeObject<Timer>([&number](System::SharedPtr<System::Object> object) -> void {
    std::cout << ++number << std::endl;
  }, nullptr, 0, 200);

  Thread::Sleep(1000);
  timer->Dispose();

  return 0;
}
/*
This code example produces the following output:
1
2
3
4
5
*/
```

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
