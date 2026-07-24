---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page для C++"
description: "System::Threading::TimerQueue class. Очередь, обрабатывающая объекты Timer. Это просто реализация. Объекты Timer регистрируют себя там самостоятельно, вам не нужно делать это для их использования — используйте API класса Timer. Это тип‑синглтон, управление памятью осуществляется функциями доступа. Вы никогда не должны создавать его экземпляры напрямую в C++."
type: docs
weight: 1600
url: /ru/cpp/system.threading/timerqueue/
---
## TimerQueue class


Очередь, обрабатывающая объекты [Timer](../timer/). Это лишь реализация. Объекты [Timer](../timer/) регистрируются там самостоятельно, вам не нужно делать это для их использования — используйте API класса [Timer](../timer/) вместо этого. Это тип‑синглтон с управлением памятью через функции доступа. Вы никогда не должны создавать его экземпляры напрямую.

```cpp
class TimerQueue
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(Timer *) | Регистрирует таймер в очереди. |
| [Delete](./delete/)(Timer *) | Удаляет таймер из очереди. |
| static [GetInstance](./getinstance/)() | Синглтон реализации. |
| static [JoinWorkerThread](./joinworkerthread/)() | Присоединяется к рабочему потоку. При необходимости ждёт бесконечно. |
| [operator=](./operator=/)(const TimerQueue\&) | Копирование запрещено. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Копирование запрещено. |
## См. также

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
