---
title: "System::Threading::Thread 클래스"
linktitle: "스레드"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Thread 클래스. 스레드 구현. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 1200
url: /ko/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Abort](./abort/)() | 스레드를 중단합니다. 구현되지 않음. |
| [get_CurrentCulture](./get_currentculture/)() | 스레드 문화 정보를 가져옵니다. |
| static [get_CurrentThread](./get_currentthread/)() | 현재 스레드를 설명하는 객체를 가져옵니다. |
| [get_CurrentUICulture](./get_currentuiculture/)() | 스레드가 사용하는 사용자 인터페이스 문화 정보를 가져옵니다. |
| [get_IsAlive](./get_isalive/)() | 스레드가 살아 있는지 확인합니다. |
| [get_IsBackground](./get_isbackground/)() | 스레드가 백그라운드인지 확인합니다. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | 스레드가 스레드 풀에 의해 소유되는지 확인합니다. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | 스레드 식별자를 가져옵니다. 운영 체제에서 얻을 수 있지만, OS 스레드 식별자가 int 한도를 초과하면 스레드 ID가 겹칠 수 있습니다. |
| [get_Name](./get_name/)() | 스레드 이름을 가져옵니다. |
| [get_ThreadState](./get_threadstate/)() | 스레드 상태를 가져옵니다. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | 현재 스레드의 식별자를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | 스레드를 인터럽트합니다. 구현되지 않음. |
| [Join](./join/)() | 관리되는 스레드에 조인합니다. 필요에 따라 무제한 대기를 수행합니다. |
| [Join](./join/)(int) | 관리되는 스레드에 조인합니다. 제한된 대기를 수행합니다. |
| [Join](./join/)(TimeSpan) | 관리되는 스레드에 조인합니다. 제한된 대기를 수행합니다. |
| static [MemoryBarrier](./memorybarrier/)() | 메모리 접근을 동기화합니다. |
| [operator=](./operator=/)(const Thread\&) | 다른 스레드에서 TLS 데이터를 복사합니다. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | 스레드 문화 정보를 설정합니다. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | 스레드가 사용하는 사용자 인터페이스 문화 정보를 설정합니다. |
| [set_IsBackground](./set_isbackground/)(bool) | 스레드를 백그라운드 또는 포그라운드로 설정합니다. |
| [set_Name](./set_name/)(const System::String\&) | 스레드 이름을 설정합니다. |
| static [Sleep](./sleep/)(int) | 지정된 시간 제한 동안 현재 스레드를 중지합니다. |
| static [Sleep](./sleep/)(TimeSpan) | 지정된 시간 제한 동안 현재 스레드를 중지합니다. |
| static [SpinWait](./spinwait/)(int) | 특정 반복 횟수만큼 대기합니다. |
| [Start](./start/)() | null 인수 객체를 사용하여 스레드를 시작합니다. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | 스레드를 시작합니다. |
| [Thread](./thread/)() | 생성자. |
| [Thread](./thread/)(ThreadStart) | 생성자. |
| [Thread](./thread/)(ParameterizedThreadStart) | 생성자. |
| [Thread](./thread/)(Thread\&) | 복사 생성자. |
| static [Yield](./yield/)() | 스레드를 양보합니다. |
| virtual [~Thread](./~thread/)() | 소멸자. |
## 비고



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

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
