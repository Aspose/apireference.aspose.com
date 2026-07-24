---
title: "System::Threading::WaitHandle::WaitOne μέθοδος"
linktitle: "WaitOne"
second_title: "Aspose.Page για C++"
description: "System::Threading::WaitHandle::WaitOne μέθοδος. Περιμένει το handle να ενεργοποιηθεί για απεριόριστη διάρκεια σε C++."
type: docs
weight: 600
url: /el/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


Περιμένει το χειριστήριο να ενεργοποιηθεί για απεριόριστη χρονική διάρκεια.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Πάντα επιστρέφει αληθές καθώς δεν συμβαίνει χρονικό όριο.

## Δείτε επίσης

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


Περιμένει το χειριστήριο να ενεργοποιηθεί.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| millisecondsTimeout | int | [Χρονικό όριο](../../timeout/) για αναμονή, σε χιλιοστά του δευτερολέπτου· -1 σημαίνει άπειρη αναμονή, 0 σημαίνει έλεγχο-και-επιστροφή, θετικές τιμές είναι χρονικά όρια. |

### ReturnValue

Αληθές αν το handle ενεργοποιήθηκε, ψευδές αν ξεπεράστηκε το χρονικό όριο.

## Δείτε επίσης

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


Περιμένει το χειριστήριο να ενεργοποιηθεί.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| millisecondsTimeout | int | [Χρονικό όριο](../../timeout/) για αναμονή, σε χιλιοστά του δευτερολέπτου· -1 σημαίνει άπειρη αναμονή, 0 σημαίνει έλεγχο-και-επιστροφή, θετικές τιμές είναι χρονικά όρια. |
| exitContext | bool | Αν είναι αληθές, η αναμονή πρέπει να απελευθερώσει το κλείδωμα του handle πριν την αναμονή. |

### ReturnValue

Αληθές αν το handle ενεργοποιήθηκε, ψευδές αν ξεπεράστηκε το χρονικό όριο.

## Δείτε επίσης

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


Περιμένει το χειριστήριο να ενεργοποιηθεί.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| timeout | TimeSpan | Ένα [System::TimeSpan](../../../system/timespan/) που αντιπροσωπεύει τον αριθμό των χιλιοστών του δευτερολέπτου για αναμονή, ή ένα [System::TimeSpan](../../../system/timespan/) που αντιπροσωπεύει -1 χιλιοστά του δευτερολέπτου για απεριόριστη αναμονή. |

### ReturnValue

Αληθές αν το handle ενεργοποιήθηκε, ψευδές αν ξεπεράστηκε το χρονικό όριο.

## Δείτε επίσης

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
