---
title: "System::Threading::Timer classe"
linktitle: "Timer"
second_title: "Aspose.Font per C++"
description: "System::Threading::Timer classe. Classe Timer che esegue un elemento di lavoro in un thread separato dopo un ritardo. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system.threading/timer/
---
## Timer class


[Timer](./) class that executes job item in separate thread after delay. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Timer : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Change](./change/)(int64_t, int64_t) | Riprogramma o annulla il timer. |
| [Change](./change/)(System::TimeSpan, System::TimeSpan) | Riprogramma o annulla il timer. |
| [Dispose](./dispose/)() | Annulla la programmazione del timer. |
| [Timer](./timer/)(TimerCallback) | Costruttore. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) | Costruttore. |
| [Timer](./timer/)(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) | Costruttore. |
## Osservazioni



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

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
