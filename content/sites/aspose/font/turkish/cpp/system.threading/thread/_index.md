---
title: "System::Threading::Thread sınıfı"
linktitle: "Thread"
second_title: "Aspose.Font için C++"
description: "System::Threading::Thread sınıfı. Thread uygulaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Abort](./abort/)() | Thread'i iptal eder. Henüz uygulanmadı. |
| [get_CurrentCulture](./get_currentculture/)() | Thread kültürünü alır. |
| static [get_CurrentThread](./get_currentthread/)() | Mevcut thread'i tanımlayan nesneyi alır. |
| [get_CurrentUICulture](./get_currentuiculture/)() | Thread tarafından kullanılan kullanıcı arayüzü kültürünü alır. |
| [get_IsAlive](./get_isalive/)() | Thread'in hâlâ çalışıp çalışmadığını kontrol eder. |
| [get_IsBackground](./get_isbackground/)() | Thread'in arka plan olup olmadığını kontrol eder. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | Thread'in bir thread havuzu tarafından sahiplenilip sahiplenilmediğini kontrol eder. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | Thread kimliğini alır. OS'den alınabilir, ancak OS thread kimliği int sınırlarını aşarsa, thread kimlikleri çakışabilir. |
| [get_Name](./get_name/)() | Thread adını alır. |
| [get_ThreadState](./get_threadstate/)() | Thread durumunu alır. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Mevcut thread'in kimliğini alır. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | Thread'i kesintiye uğratır. Henüz uygulanmadı. |
| [Join](./join/)() | Yönetilen thread'e katılır. Gerekirse sınırsız bekleme yapar. |
| [Join](./join/)(int) | Yönetilen thread'e katılır. Sınırlı bekleme yapar. |
| [Join](./join/)(TimeSpan) | Yönetilen thread'e katılır. Sınırlı bekleme yapar. |
| static [MemoryBarrier](./memorybarrier/)() | Bellek erişimini senkronize eder. |
| [operator=](./operator=/)(const Thread\&) | Farklı bir thread'ten TLS verilerini kopyalar. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Thread kültürünü ayarlar. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Thread tarafından kullanılan kullanıcı arayüzü kültürünü ayarlar. |
| [set_IsBackground](./set_isbackground/)(bool) | Thread'i arka plan ya da ön plan olarak ayarlar. |
| [set_Name](./set_name/)(const System::String\&) | Thread adını ayarlar. |
| static [Sleep](./sleep/)(int) | Mevcut thread'i belirtilen zaman aşımı süresi boyunca durdurur. |
| static [Sleep](./sleep/)(TimeSpan) | Mevcut thread'i belirtilen zaman aşımı süresi boyunca durdurur. |
| static [SpinWait](./spinwait/)(int) | Belirli sayıda döngü yinelemesi için bekler. |
| [Start](./start/)() | Thread'i null argüman nesnesiyle başlatır. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | Thread'i başlatır. |
| [Thread](./thread/)() | Yapıcı. |
| [Thread](./thread/)(ThreadStart) | Yapıcı. |
| [Thread](./thread/)(ParameterizedThreadStart) | Yapıcı. |
| [Thread](./thread/)(Thread\&) | Kopya yapıcı. |
| static [Yield](./yield/)() | İş parçacığı üretir. |
| virtual [~Thread](./~thread/)() | Yıkıcı. |
## Açıklamalar



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

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
