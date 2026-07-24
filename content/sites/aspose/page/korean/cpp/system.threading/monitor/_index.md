---
title: "System::Threading::Monitor 클래스"
linktitle: "Monitor"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Monitor 클래스. Monitor 클래스는 C++에서 객체에 대한 접근을 동기화하는 메커니즘을 제공합니다."
type: docs
weight: 800
url: /ko/cpp/system.threading/monitor/
---
## Monitor class


클래스 [Monitor](./)는 객체에 대한 접근을 동기화하는 메커니즘을 제공합니다.

```cpp
class Monitor : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | 지정된 객체에 대한 배타적 잠금을 획득합니다. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | 지정된 객체에 대한 배타적 잠금을 획득하고, 잠금이 획득되었는지를 나타내는 값을 원자적으로 설정합니다. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | 지정된 객체에 대한 배타적 잠금을 해제합니다. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | 현재 스레드가 지정된 객체에 대한 잠금을 보유하고 있는지 확인합니다. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | 잠긴 객체의 상태 변경을 대기 큐에 있는 스레드에 알립니다 (구현되지 않음). |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | 객체 상태 변경을 모든 대기 중인 스레드에 알립니다 (구현되지 않음). |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | 지정된 객체에 대한 배타적 잠금을 시도합니다 (구현되지 않음). |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | 지정된 객체에 대한 배타적 잠금을 시도하고, 잠금이 획득되었는지를 나타내는 값을 원자적으로 설정합니다. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | 지정된 밀리초 수 동안 지정된 객체에 대한 배타적 잠금을 시도합니다 (구현되지 않음). |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | 지정된 시간 동안 지정된 객체에 대한 배타적 잠금을 시도합니다 (구현되지 않음). |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | 지정된 시간 동안 지정된 객체에 대한 배타적 잠금을 획득하려 시도하고, 잠금이 획득되었는지를 나타내는 값을 원자적으로 설정합니다. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | 지정된 시간 동안 지정된 객체에 대한 배타적 잠금을 획득하려 시도하고, 잠금이 획득되었는지를 나타내는 값을 원자적으로 설정합니다. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | 객체에 대한 잠금을 해제하고 현재 스레드가 잠금을 다시 획득할 때까지 차단합니다. 지정된 시간 제한이 경과하면 스레드는 준비 큐에 들어갑니다. 선택적으로 대기 전에 동기화된 컨텍스트의 동기화 도메인을 나갔다가 이후에 도메인을 다시 획득합니다. 구현되지 않음. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | 객체에 대한 잠금을 해제하고 현재 스레드가 잠금을 다시 획득할 때까지 차단합니다. 지정된 시간 제한이 경과하면 스레드는 준비 큐에 들어갑니다. 선택적으로 대기 전에 동기화된 컨텍스트의 동기화 도메인을 나갔다가 이후에 도메인을 다시 획득합니다. 구현되지 않음. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | 객체에 대한 잠금을 해제하고 현재 스레드가 잠금을 다시 획득할 때까지 차단합니다. 지정된 시간 제한이 경과하면 스레드는 준비 큐에 들어갑니다. 구현되지 않음. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | 객체에 대한 잠금을 해제하고 현재 스레드가 잠금을 다시 획득할 때까지 차단합니다. 지정된 시간 제한이 경과하면 스레드는 준비 큐에 들어갑니다. 구현되지 않음. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | 객체에 대한 잠금을 해제하고 현재 스레드가 잠금을 다시 획득할 때까지 차단합니다. 구현되지 않음. |
## 비고



```cpp
#include "system/threading/monitor.h"
#include "system/threading/thread.h"
#include "system/smart_ptr.h"
#include "system/string.h"
#include <iostream>
#include <vector>

int main()
{
  using namespace System::Threading;

  const auto threadsCount = 3;
  std::cout << "Threads count: " << threadsCount << std::endl;
  auto locker = System::MakeObject<System::Object>();
  int x = 0;

  std::vector<System::SharedPtr<Thread>> threads;
  threads.reserve(threadsCount);
  for (auto i = 0; i < threadsCount; ++i)
  {
    threads.emplace_back(System::MakeObject<Thread>([&x, &locker]() -> void {
      Monitor::Enter(locker);

      x = 1;
      for (auto i = 0; i < 5; ++i)
      {
        std::cout << Thread::get_CurrentThread()->get_Name() << ": " << x++ << std::endl;
        Thread::Sleep(100);
      }

      Monitor::Exit(locker);
    }));
    threads.back()->set_Name(System::String("Thread " + std::to_string(i)));
    threads.back()->Start();
  }

  Thread::Sleep(threadsCount * 100);

  for (auto& thread : threads)
  {
    thread->Join();
  }

  return 0;
}
/*
This code example produces the following output:
Threads count: 3
Thread 0: 1
Thread 0: 2
Thread 0: 3
Thread 0: 4
Thread 0: 5
Thread 1: 1
Thread 1: 2
Thread 1: 3
Thread 1: 4
Thread 1: 5
Thread 2: 1
Thread 2: 2
Thread 2: 3
Thread 2: 4
Thread 2: 5
*/
```

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
