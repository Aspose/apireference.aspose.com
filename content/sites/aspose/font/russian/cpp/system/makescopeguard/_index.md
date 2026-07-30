---
title: "Метод System::MakeScopeGuard"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Font для C++"
description: "Метод System::MakeScopeGuard. Фабричная функция, создающая экземпляры класса ScopedGuard в C++."
type: docs
weight: 24800
url: /ru/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


Фабричная функция, создающая экземпляры класса ScopedGuard.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Параметр | Описание |
| --- | --- |
| Эта | тип объектa функции, который будет вызван сконструированным объектом ScopedGuard |

| Параметр | Тип | Описание |
| --- | --- | --- |
| f | F | Объект функции, который передаётся конструктору класса ScopedGuard. |

### ReturnValue

Новый экземпляр класса ScopedGuard

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
