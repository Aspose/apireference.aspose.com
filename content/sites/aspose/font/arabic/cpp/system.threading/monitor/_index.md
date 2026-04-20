---
title: "فئة System::Threading::Monitor"
linktitle: "Monitor"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Threading::Monitor. توفر فئة Monitor آلية تُزامن الوصول إلى الكائنات في C++."
type: docs
weight: 800
url: /ar/cpp/system.threading/monitor/
---
## Monitor class


الفئة [Monitor](./) توفر آلية تُزامن الوصول إلى الكائنات.

```cpp
class Monitor : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | يحصل على قفل حصري على كائن محدد. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | يحصل على قفل حصري على الكائن المحدد، ويضبط قيمة ذرية تشير إلى ما إذا تم أخذ القفل. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | يفرج القفل الحصري عن الكائن المحدد. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | يحدد ما إذا كان الخيط الحالي يحمل القفل على الكائن المحدد. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | يُخطر خيطًا في قائمة الانتظار بتغيير في حالة الكائن المقفل غير مُنفّذ. |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | يُخطر جميع الخيوط المنتظرة بتغيير في حالة الكائن غير مُنفّذ. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | يحاول الحصول على قفل حصري على الكائن المحدد غير مُنفّذ. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | يحاول الحصول على قفل حصري على الكائن المحدد، ويضبط قيمة ذرية تشير إلى ما إذا تم أخذ القفل. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | يحاول، للعدد المحدد من المللي ثانية، الحصول على قفل حصري على الكائن المحدد غير مُنفّذ. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | يحاول، للمدة المحددة، الحصول على قفل حصري على الكائن المحدد غير مُنفّذ. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | يحاول، للمدة المحددة، الحصول على قفل حصري على الكائن المحدد، ويضبط قيمة ذرية تشير إلى ما إذا تم أخذ القفل. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | يحاول، للمدة المحددة، الحصول على قفل حصري على الكائن المحدد، ويضبط قيمة ذرية تشير إلى ما إذا تم أخذ القفل. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | يفرج القفل عن كائن ويُحجب الخيط الحالي حتى يستعيد القفل. إذا انقضت فترة المهلة المحددة، يدخل الخيط إلى طابور الجاهزية. يمكن اختياريًا الخروج من نطاق المزامنة للسياق المتزامن قبل الانتظار وإعادة اكتساب النطاق بعد ذلك. غير مُنفّذ. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | يفرج القفل عن كائن ويُحجب الخيط الحالي حتى يستعيد القفل. إذا انقضت فترة المهلة المحددة، يدخل الخيط إلى طابور الجاهزية. يمكن اختياريًا الخروج من نطاق المزامنة للسياق المتزامن قبل الانتظار وإعادة اكتساب النطاق بعد ذلك. غير مُنفّذ. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | يفرج القفل عن كائن ويُحجب الخيط الحالي حتى يستعيد القفل. إذا انقضت فترة المهلة المحددة، يدخل الخيط إلى طابور الجاهزية. غير مُنفّذ. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | يفرج القفل عن كائن ويُحجب الخيط الحالي حتى يستعيد القفل. إذا انقضت فترة المهلة المحددة، يدخل الخيط إلى طابور الجاهزية. غير مُنفّذ. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | يفرج القفل عن كائن ويُحجب الخيط الحالي حتى يستعيد القفل غير مُنفّذ. |
## ملاحظات



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

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
