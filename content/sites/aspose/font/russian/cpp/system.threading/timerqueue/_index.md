---
title: "System::Threading::TimerQueue класс"
linktitle: "TimerQueue"
second_title: "Aspose.Font для C++"
description: "System::Threading::TimerQueue класс. Очередь, обрабатывающая объекты Timer. Это просто реализация. Объекты Timer регистрируются там самостоятельно, вам не нужно делать это для их использования — используйте API класса Timer вместо этого. Это тип‑синглтон с управлением памятью через функции доступа. Вы никогда не должны создавать его экземпляры напрямую в C++."
type: docs
weight: 1600
url: /ru/cpp/system.threading/timerqueue/
---
## TimerQueue class


Очередь, обрабатывающая объекты [Timer](../timer/). Это просто реализация. Объекты [Timer](../timer/) регистрируются там самостоятельно, вам не нужно делать это для их использования — используйте API класса [Timer](../timer/) вместо этого. Это тип‑синглтон с управлением памятью через функции доступа. Вы никогда не должны создавать его экземпляры напрямую.

```cpp
class TimerQueue
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(Timer *) | Регистрирует таймер в очереди. |
| [Delete](./delete/)(Timer *) | Удаляет таймер из очереди. |
| static [GetInstance](./getinstance/)() | Синглтон реализации. |
| static [JoinWorkerThread](./joinworkerthread/)() | Присоединяется к рабочему потоку. Ожидает бесконечно, если требуется. |
| [operator=](./operator=/)(const TimerQueue\&) | Копирование запрещено. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Копирование запрещено. |
## См. также

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
