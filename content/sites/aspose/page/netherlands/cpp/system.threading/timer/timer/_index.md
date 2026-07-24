---
title: "System::Threading::Timer::Timer constructor"
linktitle: "Timer"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Timer::Timer constructor. Constructor in C++."
type: docs
weight: 100
url: /nl/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


Constructor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | TimerCallback | Functie die door de timer wordt aangeroepen. |

## Zie ook

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


Constructor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | TimerCallback | Functie die door de timer wordt aangeroepen. |
| state | const System::SharedPtr\<System::Object\>\& | Argument van de callback-functie. |
| dueTime | int64_t | [Timeout](../../timeout/) vóór de eerste aanroep van de callback-functie, in milliseconden; negatieve waarden plannen de timer niet na creatie, zodat deze later opnieuw kan worden ingepland. |
| period | int64_t | [Timeout](../../timeout/) tussen opeenvolgende aanroepen van de callback-functie, in milliseconden; niet-positieve waarden betekenen dat de timer slechts één keer moet worden uitgevoerd. |

## Zie ook

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


Constructor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | TimerCallback | Functie die door de timer wordt aangeroepen. |
| state | const System::SharedPtr\<System::Object\>\& | Argument van de callback-functie. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) vóór de eerste aanroep van de callback-functie; negatieve waarden plannen de timer niet na creatie, zodat deze later opnieuw kan worden ingepland. |
| period | System::TimeSpan | [Timeout](../../timeout/) tussen opeenvolgende aanroepen van de callback-functie; niet-positieve waarden betekenen dat de timer slechts één keer moet worden uitgevoerd. |

## Zie ook

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
