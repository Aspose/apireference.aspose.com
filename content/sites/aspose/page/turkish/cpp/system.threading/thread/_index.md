---
title: "System::Threading::Thread sınıfı"
linktitle: "İş Parçacığı"
second_title: "Aspose.Page için C++"
description: "System::Threading::Thread sınıfı. İş parçacığı uygulaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
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
| [Abort](./abort/)() | İş parçacığını durdurur. Uygulanmadı. |
| [get_CurrentCulture](./get_currentculture/)() | İş parçacığının kültürünü alır. |
| static [get_CurrentThread](./get_currentthread/)() | Mevcut iş parçacığını tanımlayan nesneyi alır. |
| [get_CurrentUICulture](./get_currentuiculture/)() | İş parçacığı tarafından kullanılan kullanıcı arabirimi kültürünü alır. |
| [get_IsAlive](./get_isalive/)() | İş parçacığının hâlâ çalışıp çalışmadığını denetler. |
| [get_IsBackground](./get_isbackground/)() | İş parçacığının arka plan olup olmadığını denetler. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | İş parçacığının bir iş parçacığı havuzu tarafından sahiplenilip sahiplenilmediğini denetler. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | İş parçacığının tanımlayıcısını alır. İşletim sisteminden elde edilebilir, ancak OS iş parçacığı tanımlayıcısı int sınırlarını aşarsa, iş parçacığı kimlikleri çakışabilir. |
| [get_Name](./get_name/)() | İş parçacığının adını alır. |
| [get_ThreadState](./get_threadstate/)() | İş parçacığının durumunu alır. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Mevcut iş parçacığının tanımlayıcısını alır. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | İş parçacığını kesintiye uğratır. Uygulanmadı. |
| [Join](./join/)() | Yönetilen iş parçacığına katılır. Gerekirse sınırsız bekleme yapar. |
| [Join](./join/)(int) | Yönetilen iş parçacığına katılır. Sınırlı bekleme yapar. |
| [Join](./join/)(TimeSpan) | Yönetilen iş parçacığına katılır. Sınırlı bekleme yapar. |
| static [MemoryBarrier](./memorybarrier/)() | Bellek erişimini senkronize eder. |
| [operator=](./operator=/)(const Thread\&) | Farklı bir iş parçacığından TLS verilerini kopyalar. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | İş parçacığının kültürünü ayarlar. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | İş parçacığı tarafından kullanılan kullanıcı arabirimi kültürünü ayarlar. |
| [set_IsBackground](./set_isbackground/)(bool) | İş parçacığını arka plan ya da ön plan olarak ayarlar. |
| [set_Name](./set_name/)(const System::String\&) | İş parçacığı adını ayarlar. |
| static [Sleep](./sleep/)(int) | Mevcut iş parçacığını belirtilen zaman aşımı süresi kadar durdurur. |
| static [Sleep](./sleep/)(TimeSpan) | Mevcut iş parçacığını belirtilen zaman aşımı süresi kadar durdurur. |
| static [SpinWait](./spinwait/)(int) | Belirli sayıda döngü yinelemesi için bekler. |
| [Start](./start/)() | İş parçacığını null argüman nesnesi kullanarak başlatır. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | İş parçacığını başlatır. |
| [Thread](./thread/)() | Yapıcı. |
| [Thread](./thread/)(ThreadStart) | Yapıcı. |
| [Thread](./thread/)(ParameterizedThreadStart) | Yapıcı. |
| [Thread](./thread/)(Thread\&) | Kopya yapıcı. |
| static [Yield](./yield/)() | İş parçacığının yürütmesini bırakır. |
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
* Library [Aspose.Page for C++](../../)
