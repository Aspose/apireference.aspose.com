---
title: "System::Threading::Mutex class"
linktitle: "Mutex"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Mutex class. Implementasi Mutex. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Mutex](./mutex/)() | Informasi RTTI. |
| [Mutex](./mutex/)(bool) | Konstruktor. |
| [Mutex](./mutex/)(bool, const String\&) | Konstruktor. |
| [ReleaseMutex](./releasemutex/)() | Melepaskan mutex. |
| static [Remove](./remove/)(const String\&) | Menghapus mutex bernama dari sistem. |
| virtual [Reset](./reset/)() | Mengatur ulang status mutex. Tidak diimplementasikan. |
| virtual [Set](./set/)() | Mengatur mutex ke status tersinyal. Tidak diimplementasikan. |
| [WaitOne](./waitone/)() override | Mengunci mutex. Melakukan penunggu tak terbatas jika diperlukan. |
| [WaitOne](./waitone/)(int) override | Mengunci mutex. Melakukan penunggu jika diperlukan. |
| [WaitOne](./waitone/)(TimeSpan) override | Mengunci mutex. Melakukan penunggu jika diperlukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Nilai khusus yang akan dikembalikan oleh fungsi, selain mengembalikan indeks objek yang tersinyal dalam array, jika batas waktu terlampaui dan tidak ada yang menyinyal. |
## Catatan



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

## Lihat Juga

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
