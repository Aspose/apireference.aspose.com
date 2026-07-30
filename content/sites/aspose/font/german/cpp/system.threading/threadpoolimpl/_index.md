---
title: "System::Threading::ThreadPoolImpl Klasse"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Font für C++"
description: "System::Threading::ThreadPoolImpl Klasse. Interne Daten des Thread‑Pools. Dies ist ein Singleton‑Typ, dessen Speicherverwaltung über Zugriffs‑funktion(en) erfolgt. Sie sollten niemals Instanzen davon direkt in C++ erstellen."
type: docs
weight: 1400
url: /de/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Ermittelt die Anzahl verfügbarer Threads. |
| static [GetInitialized](./getinitialized/)() | Ermittelt das Singleton des Initialisierungszustands. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Ermittelt die maximale Anzahl gleichzeitiger Threads. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | Ermittelt die minimale Anzahl von Threads, die vom Pool erstellt werden. |
| [JoinAll](./joinall/)() | Führt join für alle eigenen Threads aus. Wartet unendlich. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Fügt ein Arbeitselement zur Warteschlange hinzu. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | Setzt die Anzahl der vom Pool verwalteten Threads. |
| [SetMinThreads](./setminthreads/)(int, int) | Setzt die minimale Anzahl der vom Pool verwalteten Threads. |
| [ThreadPoolImpl](./threadpoolimpl/)() | Konstruktor. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | Destruktor. Führt join für alle Threads aus, falls sie noch nicht beendet wurden. |
## Siehe auch

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
