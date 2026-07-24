---
title: "System::Threading::Timer class"
linktitle: "Timer"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Timer class. Timer‑klasse die een taak uitvoert in een aparte thread na een vertraging. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 1500
url: /nl/cpp/system.threading/timer/
---
## Timer class


[Timer](./) class that executes job item in separate thread after delay. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Timer : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Change](./change/)(int64_t, int64_t) | Plant de timer opnieuw of annuleert deze. |
| [Change](./change/)(System::TimeSpan, System::TimeSpan) | Plant de timer opnieuw of annuleert deze. |
| [Dispose](./dispose/)() | Annuleert de timer. |
| [Timer](./timer/)(TimerCallback) | Constructor. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) | Constructor. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) | Constructor. |
## Opmerkingen



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

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
