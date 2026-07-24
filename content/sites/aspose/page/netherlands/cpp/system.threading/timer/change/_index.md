---
title: "System::Threading::Timer::Change method"
linktitle: "Wijziging"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Timer::Change method. Plant de timer opnieuw of annuleert deze in C++."
type: docs
weight: 200
url: /nl/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


Plant de timer opnieuw of annuleert deze.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) vóór de volgende aanroep van de callback-functie, in milliseconden; negatieve waarden annuleren de timer zelfs als deze was gepland. |
| period | int64_t | [Timeout](../../timeout/) tussen opeenvolgende aanroepen van de callback-functie, in milliseconden; niet-positieve waarden betekenen dat de timer slechts één keer moet worden uitgevoerd. |

## Zie ook

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


Plant de timer opnieuw of annuleert deze.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) vóór de volgende aanroep van de callback-functie; negatieve waarden annuleren de timer zelfs als deze was gepland. |
| period | System::TimeSpan | [Timeout](../../timeout/) tussen opeenvolgende aanroepen van de callback-functie; niet-positieve waarden betekenen dat de timer slechts één keer moet worden uitgevoerd. |

## Zie ook

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
