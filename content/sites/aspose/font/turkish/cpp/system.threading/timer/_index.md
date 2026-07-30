---
title: "System::Threading::Timer sınıfı"
linktitle: "Timer"
second_title: "Aspose.Font için C++"
description: "System::Threading::Timer sınıfı. Gecikmeden sonra işi ayrı bir thread içinde yürüten zamanlayıcı sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya operator new ile bu tipin örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarın ve C++'de fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 1500
url: /tr/cpp/system.threading/timer/
---
## Timer class


[Timer](./) class that executes job item in separate thread after delay. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Timer : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Change](./change/)(int64_t, int64_t) | Zamanlayıcıyı yeniden zamanlar veya iptal eder. |
| [Change](./change/)(System::TimeSpan, System::TimeSpan) | Zamanlayıcıyı yeniden zamanlar veya iptal eder. |
| [Dispose](./dispose/)() | Zamanlayıcıyı iptal eder. |
| [Timer](./timer/)(TimerCallback) | Yapıcı. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) | Yapıcı. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) | Yapıcı. |
## Açıklamalar



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

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
