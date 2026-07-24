---
title: "System::Threading::Timer::Change μέθοδος"
linktitle: "Αλλαγή"
second_title: "Aspose.Page για C++"
description: "System::Threading::Timer::Change μέθοδος. Επαναπρογραμματίζει ή ακυρώνει το χρονόμετρο σε C++."
type: docs
weight: 200
url: /el/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


Επαναπρογραμματίζει ή ακυρώνει το χρονομετρητή.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) πριν από την επόμενη κλήση της συνάρτησης callback, σε χιλιοστά του δευτερολέπτου· οι αρνητικές τιμές ακυρώνουν το χρονόμετρο ακόμη και αν είχε προγραμματιστεί. |
| period | int64_t | [Timeout](../../timeout/) μεταξύ διαδοχικών κλήσεων της συνάρτησης callback, σε χιλιοστά του δευτερολέπτου· οι μη-θετικές τιμές σημαίνουν ότι το χρονόμετρο πρέπει να εκτελεστεί μόνο μία φορά. |

## Δείτε επίσης

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


Επαναπρογραμματίζει ή ακυρώνει το χρονομετρητή.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) πριν από την επόμενη κλήση της συνάρτησης callback· οι αρνητικές τιμές ακυρώνουν το χρονόμετρο ακόμη και αν είχε προγραμματιστεί. |
| period | System::TimeSpan | [Timeout](../../timeout/) μεταξύ διαδοχικών κλήσεων της συνάρτησης callback· οι μη-θετικές τιμές σημαίνουν ότι το χρονόμετρο πρέπει να εκτελεστεί μόνο μία φορά. |

## Δείτε επίσης

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
