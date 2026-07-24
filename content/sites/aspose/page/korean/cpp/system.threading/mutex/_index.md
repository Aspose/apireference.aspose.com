---
title: "System::Threading::Mutex 클래스"
linktitle: "Mutex"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Mutex 클래스. Mutex 구현. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 900
url: /ko/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Mutex](./mutex/)() | RTTI 정보. |
| [Mutex](./mutex/)(bool) | 생성자. |
| [Mutex](./mutex/)(bool, const String\&) | 생성자. |
| [ReleaseMutex](./releasemutex/)() | 뮤텍스를 해제합니다. |
| static [Remove](./remove/)(const String\&) | 시스템에서 지정된 이름의 뮤텍스를 삭제합니다. |
| virtual [Reset](./reset/)() | 뮤텍스 상태를 재설정합니다. 구현되지 않음. |
| virtual [Set](./set/)() | 뮤텍스를 신호 상태로 설정합니다. 구현되지 않음. |
| [WaitOne](./waitone/)() override | 뮤텍스를 잠급니다. 필요시 무제한 대기를 수행합니다. |
| [WaitOne](./waitone/)(int) override | 뮤텍스를 잠급니다. 필요시 대기를 수행합니다. |
| [WaitOne](./waitone/)(TimeSpan) override | 뮤텍스를 잠급니다. 필요시 대기를 수행합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | 함수가 반환할 특수 값이며, 타임아웃이 초과되고 아무 것도 신호를 보내지 않을 경우 배열에서 신호된 객체의 인덱스를 반환합니다. |
## 비고



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

## 또 보기

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
