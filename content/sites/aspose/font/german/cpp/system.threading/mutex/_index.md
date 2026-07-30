---
title: "System::Threading::Mutex Klasse"
linktitle: "Mutex"
second_title: "Aspose.Font für C++"
description: "System::Threading::Mutex Klasse. Mutex-Implementierung. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Mutex](./mutex/)() | RTTI-Informationen. |
| [Mutex](./mutex/)(bool) | Konstruktor. |
| [Mutex](./mutex/)(bool, const String\&) | Konstruktor. |
| [ReleaseMutex](./releasemutex/)() | Gibt das Mutex frei. |
| static [Remove](./remove/)(const String\&) | Löscht ein benanntes Mutex aus dem System. |
| virtual [Reset](./reset/)() | Setzt den Mutex-Zustand zurück. Nicht implementiert. |
| virtual [Set](./set/)() | Setzt das Mutex in den signaliserten Zustand. Nicht implementiert. |
| [WaitOne](./waitone/)() override | Sperrt das Mutex. Führt bei Bedarf unbegrenztes Warten durch. |
| [WaitOne](./waitone/)(int) override | Sperrt das Mutex. Führt bei Bedarf Warten durch. |
| [WaitOne](./waitone/)(TimeSpan) override | Sperrt das Mutex. Führt bei Bedarf Warten durch. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Spezialwert, der von der Funktion zurückgegeben wird, andernfalls wird der Index des signalisierten Objekts im Array zurückgegeben, wenn das Zeitlimit überschritten wird und nichts signalisiert. |
## Hinweise



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

## Siehe auch

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
