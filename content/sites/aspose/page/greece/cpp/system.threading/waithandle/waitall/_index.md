---
title: "System::Threading::WaitHandle::WaitAll μέθοδος"
linktitle: "WaitAll"
second_title: "Aspose.Page για C++"
description: "System::Threading::WaitHandle::WaitAll μέθοδος. Περιμένει μέχρι όλα τα handles να ενεργοποιηθούν σε C++."
type: docs
weight: 100
url: /el/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Περιμένει μέχρι όλα τα handles να ενεργοποιηθούν.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles για αναμονή. |

### ReturnValue

Αληθές όταν κάθε στοιχείο στο waitHandles έχει λάβει σήμα· διαφορετικά η μέθοδος δεν επιστρέφει ποτέ.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Πληροφορίες RTTI.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles για αναμονή. |
| millisecondsTimeout | int | [Χρονικό όριο](../../timeout/) για αναμονή, σε χιλιοστά του δευτερολέπτου· -1 σημαίνει άπειρη αναμονή, 0 σημαίνει έλεγχο-και-επιστροφή, θετικές τιμές είναι χρονικά όρια. |

### ReturnValue

Αληθές αν όλα τα handles ενεργοποιήθηκαν, ψευδές αν ξεπεράστηκε το χρονικό όριο.
## Παρατηρήσεις


Περιμένει μέχρι όλα τα handles να ενεργοποιηθούν.
## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Περιμένει μέχρι όλα τα handles να ενεργοποιηθούν.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles για αναμονή. |
| timeout | TimeSpan | Ένα [System::TimeSpan](../../../system/timespan/) που αντιπροσωπεύει τον αριθμό των χιλιοστών του δευτερολέπτου για αναμονή, ή ένα [System::TimeSpan](../../../system/timespan/) που αντιπροσωπεύει -1 χιλιοστά του δευτερολέπτου για απεριόριστη αναμονή. |

### ReturnValue

Αληθές αν όλα τα handles ενεργοποιήθηκαν, ψευδές αν ξεπεράστηκε το χρονικό όριο.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
