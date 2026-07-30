---
title: "System::Threading::Thread Klasse"
linktitle: "Thread"
second_title: "Aspose.Font für C++"
description: "System::Threading::Thread Klasse. Thread-Implementierung. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Abort](./abort/)() | Bricht den Thread ab. Nicht implementiert. |
| [get_CurrentCulture](./get_currentculture/)() | Liefert die Thread-Kultur. |
| static [get_CurrentThread](./get_currentthread/)() | Liefert das Objekt, das den aktuellen Thread beschreibt. |
| [get_CurrentUICulture](./get_currentuiculture/)() | Liefert die vom Thread verwendete Benutzeroberflächenkultur. |
| [get_IsAlive](./get_isalive/)() | Überprüft, ob der Thread aktiv ist. |
| [get_IsBackground](./get_isbackground/)() | Überprüft, ob der Thread im Hintergrund läuft. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | Überprüft, ob der Thread von einem Thread-Pool verwaltet wird. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | Liefert die Kennung des Threads. Kann vom Betriebssystem erhalten werden, aber wenn die OS-Thread-Kennung die int-Grenzen überschreitet, können Thread-IDs kollidieren. |
| [get_Name](./get_name/)() | Liefert den Thread-Namen. |
| [get_ThreadState](./get_threadstate/)() | Liefert den Thread-Zustand. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Liefert die Kennung des aktuellen Threads. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | Unterbricht den Thread. Nicht implementiert. |
| [Join](./join/)() | Wartet auf den verwalteten Thread. Führt bei Bedarf unbegrenztes Warten aus. |
| [Join](./join/)(int) | Wartet auf den verwalteten Thread. Führt begrenztes Warten aus. |
| [Join](./join/)(TimeSpan) | Wartet auf den verwalteten Thread. Führt begrenztes Warten aus. |
| static [MemoryBarrier](./memorybarrier/)() | Synchronisiert den Speicherzugriff. |
| [operator=](./operator=/)(const Thread\&) | Kopiert TLS-Daten von einem anderen Thread. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Setzt die Thread-Kultur. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Setzt die vom Thread verwendete Benutzeroberflächenkultur. |
| [set_IsBackground](./set_isbackground/)(bool) | Setzt den Thread in den Hintergrund oder Vordergrund. |
| [set_Name](./set_name/)(const System::String\&) | Setzt den Thread-Namen. |
| static [Sleep](./sleep/)(int) | Stoppt den aktuellen Thread für die angegebene Zeitüberschreitung. |
| static [Sleep](./sleep/)(TimeSpan) | Stoppt den aktuellen Thread für die angegebene Zeitüberschreitung. |
| static [SpinWait](./spinwait/)(int) | Wartet auf eine bestimmte Anzahl von Schleifendurchläufen. |
| [Start](./start/)() | Startet den Thread mit einem Null-Argumentobjekt. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | Startet den Thread. |
| [Thread](./thread/)() | Konstruktor. |
| [Thread](./thread/)(ThreadStart) | Konstruktor. |
| [Thread](./thread/)(ParameterizedThreadStart) | Konstruktor. |
| [Thread](./thread/)(Thread\&) | Kopierkonstruktor. |
| static [Yield](./yield/)() | Erzeugt Thread. |
| virtual [~Thread](./~thread/)() | Destruktor. |
## Hinweise



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

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
