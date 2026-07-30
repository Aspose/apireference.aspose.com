---
title: "Метод System::Threading::Tasks::Yield"
linktitle: "Yield"
second_title: "Aspose.Font для C++"
description: "Метод System::Threading::Tasks::Yield. Создаёт ожидаемую задачу, которая асинхронно возвращает управление текущему контексту при ожидании в C++."
type: docs
weight: 3200
url: /ru/cpp/system.threading.tasks/yield/
---
## System::Threading::Tasks::Yield method


Создаёт ожидаемую задачу, которая асинхронно возвращает управление текущему контексту при ожидании.

```cpp
Runtime::CompilerServices::YieldAwaitable System::Threading::Tasks::Yield()
```


### ReturnValue

YieldAwaitable, который можно ожидать для передачи управления.
## Примечания



Этот метод полезен для принудительного переключения управления в асинхронном методе, позволяя обработать другие отложенные задачи перед продолжением.
## См. также

* Class [YieldAwaitable](../../system.runtime.compilerservices/yieldawaitable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
