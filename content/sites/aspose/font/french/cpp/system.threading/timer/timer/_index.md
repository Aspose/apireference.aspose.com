---
title: "System::Threading::Timer::Timer constructeur"
linktitle: "Timer"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Threading::Timer::Timer. Constructeur en C++."
type: docs
weight: 100
url: /fr/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


Constructeur.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | TimerCallback | Fonction à appeler par le minuteur. |

## Voir aussi

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


Constructeur.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | TimerCallback | Fonction à appeler par le minuteur. |
| état | const System::SharedPtr\<System::Object\>\& | Argument de la fonction de rappel. |
| dueTime | int64_t | [Timeout](../../timeout/) avant la première invocation de la fonction de rappel, en millisecondes ; les valeurs négatives ne programment pas le minuteur après la création afin qu'il puisse être reprogrammé plus tard. |
| period | int64_t | [Timeout](../../timeout/) entre les invocations consécutives de la fonction de rappel, en millisecondes ; les valeurs non positives signifient que le minuteur ne doit être exécuté qu'une seule fois. |

## Voir aussi

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


Constructeur.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rappel | TimerCallback | Fonction à appeler par le minuteur. |
| état | const System::SharedPtr\<System::Object\>\& | Argument de la fonction de rappel. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) avant la première invocation de la fonction de rappel ; les valeurs négatives ne programment pas le minuteur après la création afin qu'il puisse être reprogrammé plus tard. |
| period | System::TimeSpan | [Timeout](../../timeout/) entre les invocations consécutives de la fonction de rappel ; les valeurs non positives signifient que le minuteur ne doit être exécuté qu'une seule fois. |

## Voir aussi

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
