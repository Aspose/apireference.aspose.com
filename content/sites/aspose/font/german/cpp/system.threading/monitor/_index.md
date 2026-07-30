---
title: "System::Threading::Monitor Klasse"
linktitle: "Monitor"
second_title: "Aspose.Font für C++"
description: "System::Threading::Monitor Klasse. Die Klasse Monitor stellt einen Mechanismus bereit, der den Zugriff auf Objekte in C++ synchronisiert."
type: docs
weight: 800
url: /de/cpp/system.threading/monitor/
---
## Monitor class


Klasse [Monitor](./) stellt einen Mechanismus bereit, der den Zugriff auf Objekte synchronisiert.

```cpp
class Monitor : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Enter](./enter/)(const SharedPtr\<Object\>\&) | Erwirbt eine exklusive Sperre für ein angegebenes Objekt. |
| static [Enter](./enter/)(const System::SharedPtr\<Object\>\&, bool\&) | Erwirbt eine exklusive Sperre für das angegebene Objekt und setzt atomar einen Wert, der angibt, ob die Sperre übernommen wurde. |
| static [Exit](./exit/)(const SharedPtr\<Object\>\&) | Gibt eine exklusive Sperre für das angegebene Objekt frei. |
| static [IsEntered](./isentered/)(const System::SharedPtr\<Object\>\&) | Bestimmt, ob der aktuelle Thread die Sperre für das angegebene Objekt hält. |
| static [Pulse](./pulse/)(const SharedPtr\<Object\>\&) | Benachrichtigt einen Thread in der Warteschlange über eine Änderung des Zustands des gesperrten Objekts Nicht implementiert. |
| static [PulseAll](./pulseall/)(const SharedPtr\<Object\>\&) | Benachrichtigt alle wartenden Threads über eine Änderung des Zustands des Objekts Nicht implementiert. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&) | Versucht, eine exklusive Sperre für das angegebene Objekt zu erwerben Nicht implementiert. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, bool\&) | Versucht, eine exklusive Sperre für das angegebene Objekt zu erwerben und setzt atomar einen Wert, der angibt, ob die Sperre übernommen wurde. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, int32_t) | Versucht, für die angegebene Anzahl von Millisekunden, eine exklusive Sperre für das angegebene Objekt zu erwerben Nicht implementiert. |
| static [TryEnter](./tryenter/)(const SharedPtr\<Object\>\&, TimeSpan) | Versucht, für die angegebene Zeitdauer, eine exklusive Sperre für das angegebene Objekt zu erwerben Nicht implementiert. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, int32_t, bool\&) | Versucht, für die angegebene Zeitdauer, eine exklusive Sperre für das angegebene Objekt zu erwerben und setzt atomar einen Wert, der angibt, ob die Sperre übernommen wurde. |
| static [TryEnter](./tryenter/)(const System::SharedPtr\<Object\>\&, TimeSpan, bool\&) | Versucht, für die angegebene Zeitdauer, eine exklusive Sperre für das angegebene Objekt zu erwerben und setzt atomar einen Wert, der angibt, ob die Sperre übernommen wurde. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t, bool) | Gibt die Sperre für ein Objekt frei und blockiert den aktuellen Thread, bis er die Sperre erneut erwirbt. Wenn das angegebene Zeitüberschreitungsintervall abläuft, gelangt der Thread in die Bereitschafts‑Warteschlange. Optional verlässt er die Synchronisationsdomäne für den synchronisierten Kontext vor dem Warten und erwirbt die Domäne danach erneut. Nicht implementiert. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan, bool) | Gibt die Sperre für ein Objekt frei und blockiert den aktuellen Thread, bis er die Sperre erneut erwirbt. Wenn das angegebene Zeitüberschreitungsintervall abläuft, gelangt der Thread in die Bereitschafts‑Warteschlange. Optional verlässt er die Synchronisationsdomäne für den synchronisierten Kontext vor dem Warten und erwirbt die Domäne danach erneut. Nicht implementiert. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, int32_t) | Gibt die Sperre für ein Objekt frei und blockiert den aktuellen Thread, bis er die Sperre erneut erwirbt. Wenn das angegebene Zeitüberschreitungsintervall abläuft, gelangt der Thread in die Bereitschafts‑Warteschlange. Nicht implementiert. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&, TimeSpan) | Gibt die Sperre für ein Objekt frei und blockiert den aktuellen Thread, bis er die Sperre erneut erwirbt. Wenn das angegebene Zeitüberschreitungsintervall abläuft, gelangt der Thread in die Bereitschafts‑Warteschlange. Nicht implementiert. |
| static [Wait](./wait/)(const SharedPtr\<Object\>\&) | Gibt die Sperre für ein Objekt frei und blockiert den aktuellen Thread, bis er die Sperre erneut erwirbt Nicht implementiert. |
## Hinweise



```cpp
#include "system/threading/monitor.h"
#include "system/threading/thread.h"
#include "system/smart_ptr.h"
#include "system/string.h"
#include <iostream>
#include <vector>

int main()
{
  using namespace System::Threading;

  const auto threadsCount = 3;
  std::cout << "Threads count: " << threadsCount << std::endl;
  auto locker = System::MakeObject<System::Object>();
  int x = 0;

  std::vector<System::SharedPtr<Thread>> threads;
  threads.reserve(threadsCount);
  for (auto i = 0; i < threadsCount; ++i)
  {
    threads.emplace_back(System::MakeObject<Thread>([&x, &locker]() -> void {
      Monitor::Enter(locker);

      x = 1;
      for (auto i = 0; i < 5; ++i)
      {
        std::cout << Thread::get_CurrentThread()->get_Name() << ": " << x++ << std::endl;
        Thread::Sleep(100);
      }

      Monitor::Exit(locker);
    }));
    threads.back()->set_Name(System::String("Thread " + std::to_string(i)));
    threads.back()->Start();
  }

  Thread::Sleep(threadsCount * 100);

  for (auto& thread : threads)
  {
    thread->Join();
  }

  return 0;
}
/*
This code example produces the following output:
Threads count: 3
Thread 0: 1
Thread 0: 2
Thread 0: 3
Thread 0: 4
Thread 0: 5
Thread 1: 1
Thread 1: 2
Thread 1: 3
Thread 1: 4
Thread 1: 5
Thread 2: 1
Thread 2: 2
Thread 2: 3
Thread 2: 4
Thread 2: 5
*/
```

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
