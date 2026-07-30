---
title: "System::Threading::Timer::Change Methode"
linktitle: "Änderung"
second_title: "Aspose.Font für C++"
description: "System::Threading::Timer::Change Methode. Plant den Timer neu oder bricht ihn in C++ ab."
type: docs
weight: 200
url: /de/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


Plant den Timer neu oder bricht ihn ab.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) vor dem nächsten Aufruf der Callback-Funktion, in Millisekunden; negative Werte brechen den Timer ab, selbst wenn er geplant wurde. |
| period | int64_t | [Timeout](../../timeout/) zwischen aufeinanderfolgenden Aufrufen der Callback-Funktion, in Millisekunden; nicht-positive Werte bedeuten, dass der Timer nur einmal ausgeführt werden soll. |

## Siehe auch

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


Plant den Timer neu oder bricht ihn ab.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) vor dem nächsten Aufruf der Callback-Funktion; negative Werte brechen den Timer ab, selbst wenn er geplant wurde. |
| period | System::TimeSpan | [Timeout](../../timeout/) zwischen aufeinanderfolgenden Aufrufen der Callback-Funktion; nicht-positive Werte bedeuten, dass der Timer nur einmal ausgeführt werden soll. |

## Siehe auch

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
