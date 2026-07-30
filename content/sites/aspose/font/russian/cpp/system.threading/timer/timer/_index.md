---
title: "System::Threading::Timer::Timer конструктор"
linktitle: "Timer"
second_title: "Aspose.Font для C++"
description: "Конструктор System::Threading::Timer::Timer. Конструктор в C++."
type: docs
weight: 100
url: /ru/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


Конструктор.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| обратный вызов | TimerCallback | Функция, вызываемая таймером. |

## См. также

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


Конструктор.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| обратный вызов | TimerCallback | Функция, вызываемая таймером. |
| состояние | const System::SharedPtr\<System::Object\>\& | Аргумент функции обратного вызова. |
| dueTime | int64_t | [Timeout](../../timeout/) перед первым вызовом функции обратного вызова, в миллисекундах; отрицательные значения не планируют таймер после создания, поэтому его можно позже перенастроить. |
| period | int64_t | [Timeout](../../timeout/) между последовательными вызовами функции обратного вызова, в миллисекундах; не‑положительные значения означают, что таймер должен выполниться только один раз. |

## См. также

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


Конструктор.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| обратный вызов | TimerCallback | Функция, вызываемая таймером. |
| состояние | const System::SharedPtr\<System::Object\>\& | Аргумент функции обратного вызова. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) перед первым вызовом функции обратного вызова; отрицательные значения не планируют таймер после создания, поэтому его можно позже перенастроить. |
| period | System::TimeSpan | [Timeout](../../timeout/) между последовательными вызовами функции обратного вызова; не‑положительные значения означают, что таймер должен выполниться только один раз. |

## См. также

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
