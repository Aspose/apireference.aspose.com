---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page für C++"
description: "System::Threading::TimerQueue class. Warteschlange, die Timer‑Objekte verwaltet. Dies ist lediglich eine Implementierung. Timer‑Objekte registrieren sich dort selbst; Sie müssen dies nicht tun, um sie zu verwenden – verwenden Sie stattdessen die Timer‑Klassen‑API. Dies ist ein Singleton‑Typ, dessen Speicherverwaltung über Zugriffs‑Funktionen erfolgt. Sie sollten unter keinen Umständen Instanzen davon direkt in C++ erstellen."
type: docs
weight: 1600
url: /de/cpp/system.threading/timerqueue/
---
## TimerQueue class


Warteschlange, die [Timer](../timer/) Objekte verarbeitet. Dies ist nur eine Implementierung. [Timer](../timer/) Objekte registrieren sich dort selbst, Sie müssen dies nicht tun, um sie zu verwenden – verwenden Sie stattdessen die API der [Timer](../timer/) Klasse. Dies ist ein Singleton‑Typ mit Speicherverwaltung, die über Zugriffs‑Funktion(en) erfolgt. Sie sollten niemals Instanzen davon direkt erstellen.

```cpp
class TimerQueue
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(Timer *) | Registriert den Timer in der Warteschlange. |
| [Delete](./delete/)(Timer *) | Löscht den Timer aus der Warteschlange. |
| static [GetInstance](./getinstance/)() | Implementierungs‑Singleton. |
| static [JoinWorkerThread](./joinworkerthread/)() | Tritt dem Arbeitsthread bei. Wartet bei Bedarf unendlich. |
| [operator=](./operator=/)(const TimerQueue\&) | Kein Kopieren. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Kein Kopieren. |
## Siehe auch

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
