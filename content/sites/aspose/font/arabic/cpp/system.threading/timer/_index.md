---
title: "System::Threading::Timer فئة"
linktitle: "Timer"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Timer فئة. فئة المؤقت التي تنفّذ عنصر العمل في خيط منفصل بعد التأخير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.threading/timer/
---
## Timer class


[Timer](./) class that executes job item in separate thread after delay. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Timer : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Change](./change/)(int64_t, int64_t) | يعيد جدولة المؤقت أو يلغيه. |
| [Change](./change/)(System::TimeSpan, System::TimeSpan) | يعيد جدولة المؤقت أو يلغيه. |
| [Dispose](./dispose/)() | يلغي جدولة المؤقت. |
| [Timer](./timer/)(TimerCallback) | المُنشئ. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) | المُنشئ. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) | المُنشئ. |
## ملاحظات



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

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
