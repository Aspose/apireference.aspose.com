---
title: "System::Threading::Timer::Timer costruttore"
linktitle: "Timer"
second_title: "Aspose.Font per C++"
description: "System::Threading::Timer::Timer constructor. Costruttore in C++."
type: docs
weight: 100
url: /it/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


Costruttore.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | TimerCallback | Funzione da chiamare dal timer. |

## Vedi anche

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


Costruttore.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | TimerCallback | Funzione da chiamare dal timer. |
| stato | const System::SharedPtr\<System::Object\>\& | Argomento della funzione di callback. |
| dueTime | int64_t | [Timeout](../../timeout/) prima della prima invocazione della funzione di callback, in millisecondi; i valori negativi non programmano il timer dopo la creazione, quindi può essere riprogrammato in seguito. |
| period | int64_t | [Timeout](../../timeout/) tra le invocazioni successive della funzione di callback, in millisecondi; i valori non positivi indicano che il timer deve essere eseguito una sola volta. |

## Vedi anche

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


Costruttore.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | TimerCallback | Funzione da chiamare dal timer. |
| stato | const System::SharedPtr\<System::Object\>\& | Argomento della funzione di callback. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) prima della prima invocazione della funzione di callback; i valori negativi non programmano il timer dopo la creazione, quindi può essere riprogrammato in seguito. |
| period | System::TimeSpan | [Timeout](../../timeout/) tra le invocazioni successive della funzione di callback; i valori non positivi indicano che il timer deve essere eseguito una sola volta. |

## Vedi anche

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
