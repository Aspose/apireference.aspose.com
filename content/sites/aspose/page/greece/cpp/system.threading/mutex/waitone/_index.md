---
title: "System::Threading::Mutex::WaitOne method"
linktitle: "WaitOne"
second_title: "Aspose.Page για C++"
description: "System::Threading::Mutex::WaitOne method. Κλειδώνει το mutex. Πραγματοποιεί απεριόριστη αναμονή εάν είναι απαραίτητο σε C++."
type: docs
weight: 500
url: /el/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Κλειδώνει το mutex. Εκτελεί απεριόριστη αναμονή εάν είναι απαραίτητο.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Επιστρέφει πάντα true καθώς δεν επιστρέφει μέχρι το mutex να κλειδωθεί.

## Δείτε επίσης

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


Κλειδώνει το mutex. Εκτελεί αναμονή εάν είναι απαραίτητο.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| millisecondsTimeout | int | Χρονικό όριο αναμονής σε χιλιοστά του δευτερολέπτου. |

### ReturnValue

Επιστρέφει true εάν το mutex ήταν κλειδωμένο ή false εάν ξεπεράστηκε το χρονικό όριο.

## Δείτε επίσης

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Κλειδώνει το mutex. Εκτελεί αναμονή εάν είναι απαραίτητο.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| timeout | TimeSpan | Ένα [System::TimeSpan](../../../system/timespan/) που αντιπροσωπεύει τον αριθμό των χιλιοστών του δευτερολέπτου για αναμονή, ή ένα [System::TimeSpan](../../../system/timespan/) που αντιπροσωπεύει -1 χιλιοστά του δευτερολέπτου για απεριόριστη αναμονή. |

### ReturnValue

Επιστρέφει true εάν το mutex ήταν κλειδωμένο ή false εάν ξεπεράστηκε το χρονικό όριο.

## Δείτε επίσης

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
