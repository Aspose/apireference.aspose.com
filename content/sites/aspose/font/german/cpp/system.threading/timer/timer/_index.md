---
title: "System::Threading::Timer::Timer Konstruktor"
linktitle: "Timer"
second_title: "Aspose.Font für C++"
description: "System::Threading::Timer::Timer Konstruktor. Konstruktor in C++."
type: docs
weight: 100
url: /de/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


Konstruktor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | TimerCallback | Funktion, die vom Timer aufgerufen wird. |

## Siehe auch

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


Konstruktor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | TimerCallback | Funktion, die vom Timer aufgerufen wird. |
| Zustand | const System::SharedPtr\<System::Object\>\& | Argument der Callback-Funktion. |
| dueTime | int64_t | [Timeout](../../timeout/) vor dem ersten Aufruf der Rückruffunktion, in Millisekunden; negative Werte planen den Timer nach der Erstellung nicht, sodass er später neu geplant werden kann. |
| period | int64_t | [Timeout](../../timeout/) zwischen aufeinanderfolgenden Aufrufen der Callback-Funktion, in Millisekunden; nicht-positive Werte bedeuten, dass der Timer nur einmal ausgeführt werden soll. |

## Siehe auch

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


Konstruktor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | TimerCallback | Funktion, die vom Timer aufgerufen wird. |
| Zustand | const System::SharedPtr\<System::Object\>\& | Argument der Callback-Funktion. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) vor dem ersten Aufruf der Rückruffunktion; negative Werte planen den Timer nach der Erstellung nicht, sodass er später neu geplant werden kann. |
| period | System::TimeSpan | [Timeout](../../timeout/) zwischen aufeinanderfolgenden Aufrufen der Callback-Funktion; nicht-positive Werte bedeuten, dass der Timer nur einmal ausgeführt werden soll. |

## Siehe auch

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
