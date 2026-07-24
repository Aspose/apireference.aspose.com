---
title: "System::Threading::Thread فئة"
linktitle: "الخيط"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::Thread فئة. تنفيذ الخيط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Abort](./abort/)() | يوقف الخيط. غير مُطبق. |
| [get_CurrentCulture](./get_currentculture/)() | يحصل على ثقافة الخيط. |
| static [get_CurrentThread](./get_currentthread/)() | يحصل على الكائن الذي يصف الخيط الحالي. |
| [get_CurrentUICulture](./get_currentuiculture/)() | يحصل على ثقافة واجهة المستخدم المستخدمة من قبل الخيط. |
| [get_IsAlive](./get_isalive/)() | يتحقق مما إذا كان الخيط حيًا. |
| [get_IsBackground](./get_isbackground/)() | يتحقق مما إذا كان الخيط في الخلفية. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | يتحقق مما إذا كان الخيط مملوكًا من قبل مجموعة الخيوط. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | يحصل على معرف الخيط. يمكن الحصول عليه من نظام التشغيل، ولكن إذا تجاوز معرف خيط نظام التشغيل حدود النوع int، قد تتقاطع معرّفات الخيوط. |
| [get_Name](./get_name/)() | يحصل على اسم الخيط. |
| [get_ThreadState](./get_threadstate/)() | يحصل على حالة الخيط. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | يحصل على معرف الخيط الحالي. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | يقاطع الخيط. غير مُطبق. |
| [Join](./join/)() | ينضم إلى الخيط المدار. ينفّذ انتظارًا غير محدود إذا لزم الأمر. |
| [Join](./join/)(int) | ينضم إلى الخيط المدار. ينفّذ انتظارًا محدودًا. |
| [Join](./join/)(TimeSpan) | ينضم إلى الخيط المدار. ينفّذ انتظارًا محدودًا. |
| static [MemoryBarrier](./memorybarrier/)() | يُزامن الوصول إلى الذاكرة. |
| [operator=](./operator=/)(const Thread\&) | ينسخ بيانات TLS من خيط مختلف. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | يضبط ثقافة الخيط. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | يضبط ثقافة واجهة المستخدم المستخدمة من قبل الخيط. |
| [set_IsBackground](./set_isbackground/)(bool) | يضبط الخيط إلى الخلفية أو الواجهة. |
| [set_Name](./set_name/)(const System::String\&) | يضبط اسم الخيط. |
| static [Sleep](./sleep/)(int) | يوقف الخيط الحالي للمهلة المحددة. |
| static [Sleep](./sleep/)(TimeSpan) | يوقف الخيط الحالي للمهلة المحددة. |
| static [SpinWait](./spinwait/)(int) | ينتظر عددًا محددًا من تكرارات الحلقة. |
| [Start](./start/)() | يبدأ الخيط باستخدام كائن حجة فارغ. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | يبدأ الخيط. |
| [Thread](./thread/)() | منشئ. |
| [Thread](./thread/)(ThreadStart) | منشئ. |
| [Thread](./thread/)(ParameterizedThreadStart) | منشئ. |
| [Thread](./thread/)(Thread\&) | منشئ النسخ. |
| static [Yield](./yield/)() | يُعطي الخيط فرصة التنفيذ. |
| virtual [~Thread](./~thread/)() | المدمر. |
## ملاحظات



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

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
