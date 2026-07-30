---
title: "System::Threading::Timer::Change metodo"
linktitle: "Modifica"
second_title: "Aspose.Font per C++"
description: "System::Threading::Timer::Change metodo. Riprogramma o annulla il timer in C++."
type: docs
weight: 200
url: /it/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


Riprogramma o annulla il timer.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) prima della prossima invocazione della funzione di callback, in millisecondi; i valori negativi annullano il timer anche se era stato programmato. |
| period | int64_t | [Timeout](../../timeout/) tra le invocazioni successive della funzione di callback, in millisecondi; i valori non positivi indicano che il timer deve essere eseguito una sola volta. |

## Vedi anche

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


Riprogramma o annulla il timer.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) prima della prossima invocazione della funzione di callback; i valori negativi annullano il timer anche se era stato programmato. |
| period | System::TimeSpan | [Timeout](../../timeout/) tra le invocazioni successive della funzione di callback; i valori non positivi indicano che il timer deve essere eseguito una sola volta. |

## Vedi anche

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
