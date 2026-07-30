---
title: "Класс System::Threading::ThreadPoolImpl"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Font для C++"
description: "Класс System::Threading::ThreadPoolImpl. Внутренние данные пула потоков. Это тип‑одиночка, управление памятью осуществляется через функции доступа. Вы никогда не должны создавать его экземпляры напрямую в C++."
type: docs
weight: 1400
url: /ru/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## Методы

| Метод | Описание |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Получает количество доступных потоков. |
| static [GetInitialized](./getinitialized/)() | Получает одиночку состояния инициализации. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Получает максимальное количество одновременно работающих потоков. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | Получает минимальное количество потоков, создаваемых пулом. |
| [JoinAll](./joinall/)() | Ожидает завершения всех принадлежащих потоков. Ждёт бесконечно. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Добавляет задачу в очередь. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | Устанавливает количество потоков, принадлежащих пулу. |
| [SetMinThreads](./setminthreads/)(int, int) | Устанавливает минимальное количество потоков, принадлежащих пулу. |
| [ThreadPoolImpl](./threadpoolimpl/)() | Конструктор. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | Деструктор. Ожидает завершения всех потоков, если они ещё не завершены. |
## См. также

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
