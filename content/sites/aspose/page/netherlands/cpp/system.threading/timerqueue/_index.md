---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page voor C++"
description: "System::Threading::TimerQueue class. Wachtrij die Timer‑objecten afhandelt. Dit is slechts een implementatie. Timer‑objecten registreren zichzelf daar, je hoeft dit niet te doen om ze te gebruiken – gebruik in plaats daarvan de Timer‑klasse‑API. Dit is een singleton‑type met geheugenbeheer uitgevoerd door toegang‑functie(s). Je mag nooit direct instanties ervan maken in C++."
type: docs
weight: 1600
url: /nl/cpp/system.threading/timerqueue/
---
## TimerQueue class


Wachtrij die [Timer](../timer/) objecten verwerkt. Dit is slechts een implementatie. [Timer](../timer/) objecten registreren zich daar zelf, je hoeft dit niet te doen om ze te gebruiken - gebruik in plaats daarvan de [Timer](../timer/) klasse‑API. Dit is een singleton‑type met geheugenbeheer uitgevoerd via toegangsfunctie(s). Je moet nooit direct instanties ervan maken.

```cpp
class TimerQueue
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(Timer *) | Registreert timer in wachtrij. |
| [Delete](./delete/)(Timer *) | Verwijdert timer uit wachtrij. |
| static [GetInstance](./getinstance/)() | Implementatie singleton. |
| static [JoinWorkerThread](./joinworkerthread/)() | Voegt de worker‑thread samen. Wacht oneindig indien vereist. |
| [operator=](./operator=/)(const TimerQueue\&) | Geen kopiëren. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Geen kopiëren. |
## Zie ook

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
