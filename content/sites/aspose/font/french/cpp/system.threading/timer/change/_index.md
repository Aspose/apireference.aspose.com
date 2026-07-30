---
title: "System::Threading::Timer::Change méthode"
linktitle: "Modification"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Timer::Change méthode. Reprogramme ou annule le minuteur en C++."
type: docs
weight: 200
url: /fr/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


Replanifie ou annule la minuterie.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) avant la prochaine invocation de la fonction de rappel, en millisecondes ; les valeurs négatives annulent le minuteur même s'il était programmé. |
| period | int64_t | [Timeout](../../timeout/) entre les invocations consécutives de la fonction de rappel, en millisecondes ; les valeurs non positives signifient que le minuteur ne doit être exécuté qu'une seule fois. |

## Voir aussi

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


Replanifie ou annule la minuterie.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) avant la prochaine invocation de la fonction de rappel ; les valeurs négatives annulent le minuteur même s'il était programmé. |
| period | System::TimeSpan | [Timeout](../../timeout/) entre les invocations consécutives de la fonction de rappel ; les valeurs non positives signifient que le minuteur ne doit être exécuté qu'une seule fois. |

## Voir aussi

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
