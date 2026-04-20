---
title: "System::Threading::Mutex فئة"
linktitle: "Mutex"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Mutex فئة. تنفيذ Mutex. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Mutex](./mutex/)() | معلومات RTTI. |
| [Mutex](./mutex/)(bool) | المُنشئ. |
| [Mutex](./mutex/)(bool, const String\&) | المُنشئ. |
| [ReleaseMutex](./releasemutex/)() | يطلق القفل. |
| static [Remove](./remove/)(const String\&) | يمسح قفلًا مسمى من النظام. |
| virtual [Reset](./reset/)() | يعيد حالة القفل إلى الوضع الأصلي. غير مُنفّذ. |
| virtual [Set](./set/)() | يضبط القفل على الحالة المعلّمة. غير مُنفّذ. |
| [WaitOne](./waitone/)() override | يقفل القفل. ينفّذ انتظارًا غير محدود إذا لزم الأمر. |
| [WaitOne](./waitone/)(int) override | يقفل القفل. ينفّذ انتظارًا إذا لزم الأمر. |
| [WaitOne](./waitone/)(TimeSpan) override | يقفل القفل. ينفّذ انتظارًا إذا لزم الأمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | قيمة خاصة تُعاد من الدالة، وإلا تُعيد فهرس الكائن المُشار إليه في المصفوفة إذا تجاوز المهلة ولم يُشِر شيء. |
## ملاحظات



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

## انظر أيضًا

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
