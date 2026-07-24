---
title: "System::Threading::ThreadPoolImpl klasse"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Page voor C++"
description: "System::Threading::ThreadPoolImpl klasse. Interne gegevens van de thread‑pool. Dit is een singleton‑type waarbij geheugenbeheer wordt uitgevoerd door toegang‑functie(s). Je mag nooit direct instanties ervan maken in C++."
type: docs
weight: 1400
url: /nl/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Haalt het aantal beschikbare threads op. |
| static [GetInitialized](./getinitialized/)() | Haalt de singleton van de initialisatiestatus op. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Haalt het maximale aantal gelijktijdige threads op. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | Haalt het minimale aantal threads op dat door de pool wordt aangemaakt. |
| [JoinAll](./joinall/)() | Voegt alle eigen threads samen. Wacht oneindig. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Voegt een werkitem toe aan de wachtrij. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | Stelt het aantal threads in dat eigendom is van de pool. |
| [SetMinThreads](./setminthreads/)(int, int) | Stelt het minimale aantal threads in dat eigendom is van de pool. |
| [ThreadPoolImpl](./threadpoolimpl/)() | Constructor. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | Destructor. Voegt alle threads samen als ze nog niet beëindigd zijn. |
## Zie ook

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
