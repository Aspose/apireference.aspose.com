---
title: "System::Threading::TimerQueue classe"
linktitle: "TimerQueue"
second_title: "Aspose.Font per C++"
description: "System::Threading::TimerQueue classe. Coda che gestisce gli oggetti Timer. Questa è solo un'implementazione. Gli oggetti Timer si registrano lì autonomamente, non è necessario farlo per usarli - utilizza invece l'API della classe Timer. Questo è un tipo singleton con gestione della memoria effettuata tramite funzione(i) di accesso. Non dovresti mai creare istanze di esso direttamente in C++."
type: docs
weight: 1600
url: /it/cpp/system.threading/timerqueue/
---
## TimerQueue class


Coda che gestisce gli oggetti [Timer](../timer/). Questa è solo un'implementazione. Gli oggetti [Timer](../timer/) si registrano lì autonomamente, non è necessario farlo per usarli - utilizza invece l'API della classe [Timer](../timer/). Questo è un tipo singleton con gestione della memoria effettuata tramite funzione(i) di accesso. Non dovresti mai creare istanze di esso direttamente.

```cpp
class TimerQueue
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(Timer *) | Registra il timer nella coda. |
| [Delete](./delete/)(Timer *) | Elimina il timer dalla coda. |
| static [GetInstance](./getinstance/)() | Singleton di implementazione. |
| static [JoinWorkerThread](./joinworkerthread/)() | Unisce il thread di lavoro. Attende indefinitamente se necessario. |
| [operator=](./operator=/)(const TimerQueue\&) | Nessuna copia. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Nessuna copia. |
## Vedi anche

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
