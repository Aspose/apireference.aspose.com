---
title: "System::Threading::Timer::Timer κατασκευαστής"
linktitle: "Timer"
second_title: "Aspose.Page για C++"
description: "System::Threading::Timer::Timer κατασκευαστής. Κατασκευαστής σε C++."
type: docs
weight: 100
url: /el/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


Κατασκευαστής.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | TimerCallback | Συνάρτηση που καλείται από το χρονόμετρο. |

## Δείτε επίσης

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


Κατασκευαστής.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | TimerCallback | Συνάρτηση που καλείται από το χρονόμετρο. |
| state | const System::SharedPtr\<System::Object\>\& | Παράμετρος συνάρτησης callback. |
| dueTime | int64_t | [Timeout](../../timeout/) πριν από την πρώτη κλήση της συνάρτησης callback, σε χιλιοστά του δευτερολέπτου· οι αρνητικές τιμές δεν προγραμματίζουν το χρονόμετρο μετά τη δημιουργία, ώστε να μπορεί να επαναπρογραμματιστεί αργότερα. |
| period | int64_t | [Timeout](../../timeout/) μεταξύ διαδοχικών κλήσεων της συνάρτησης callback, σε χιλιοστά του δευτερολέπτου· οι μη-θετικές τιμές σημαίνουν ότι το χρονόμετρο πρέπει να εκτελεστεί μόνο μία φορά. |

## Δείτε επίσης

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


Κατασκευαστής.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | TimerCallback | Συνάρτηση που καλείται από το χρονόμετρο. |
| state | const System::SharedPtr\<System::Object\>\& | Παράμετρος συνάρτησης callback. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) πριν από την πρώτη κλήση της συνάρτησης callback· οι αρνητικές τιμές δεν προγραμματίζουν το χρονόμετρο μετά τη δημιουργία, ώστε να μπορεί να επαναπρογραμματιστεί αργότερα. |
| period | System::TimeSpan | [Timeout](../../timeout/) μεταξύ διαδοχικών κλήσεων της συνάρτησης callback· οι μη-θετικές τιμές σημαίνουν ότι το χρονόμετρο πρέπει να εκτελεστεί μόνο μία φορά. |

## Δείτε επίσης

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
