---
title: "System::Threading::Timer class"
linktitle: "Timer"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Timer class. Kelas timer yang mengeksekusi item pekerjaan di thread terpisah setelah penundaan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini dengan pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen di C++."
type: docs
weight: 1500
url: /id/cpp/system.threading/timer/
---
## Timer class


[Timer](./) class that executes job item in separate thread after delay. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Timer : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Change](./change/)(int64_t, int64_t) | Menjadwalkan ulang atau membatalkan timer. |
| [Change](./change/)(System::TimeSpan, System::TimeSpan) | Menjadwalkan ulang atau membatalkan timer. |
| [Dispose](./dispose/)() | Membatalkan penjadwalan timer. |
| [Timer](./timer/)(TimerCallback) | Konstruktor. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) | Konstruktor. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) | Konstruktor. |
## Catatan



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

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
