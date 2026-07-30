---
title: "System::Threading::Mutex class"
linktitle: "Mutex"
second_title: "Aspose.Font için C++"
description: "System::Threading::Mutex sınıfı. Mutex uygulaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tür bir örnek asla yığına (stack) ya da operator new ile oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirin."
type: docs
weight: 900
url: /tr/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Mutex](./mutex/)() | RTTI bilgisi. |
| [Mutex](./mutex/)(bool) | Yapıcı. |
| [Mutex](./mutex/)(bool, const String\&) | Yapıcı. |
| [ReleaseMutex](./releasemutex/)() | Mutex'i serbest bırakır. |
| static [Remove](./remove/)(const String\&) | Sistemdeki adlandırılmış bir mutex'i siler. |
| virtual [Reset](./reset/)() | Mutex durumunu sıfırlar. Henüz uygulanmadı. |
| virtual [Set](./set/)() | Mutex'i sinyal durumuna ayarlar. Henüz uygulanmadı. |
| [WaitOne](./waitone/)() override | Mutex'i kilitler. Gerekirse sınırsız bekleme yapar. |
| [WaitOne](./waitone/)(int) override | Mutex'i kilitler. Gerekirse bekleme yapar. |
| [WaitOne](./waitone/)(TimeSpan) override | Mutex'i kilitler. Gerekirse bekleme yapar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Fonksiyon tarafından döndürülecek özel değer, aksi takdirde zaman aşımı geçerse ve hiçbir şey sinyal göndermezse, dizideki sinyalleri olan nesnenin indeksini döndürür. |
## Açıklamalar



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

## Ayrıca Bakınız

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
