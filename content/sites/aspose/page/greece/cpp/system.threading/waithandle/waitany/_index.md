---
title: "System::Threading::WaitHandle::WaitAny μέθοδος"
linktitle: "WaitAny"
second_title: "Aspose.Page για C++"
description: "System::Threading::WaitHandle::WaitAny μέθοδος. Περιμένει να ενεργοποιηθεί οποιοδήποτε από τα handles σε C++."
type: docs
weight: 200
url: /el/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Περιμένει μέχρι οποιοδήποτε από τα handles να ενεργοποιηθεί.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
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
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Περιμένει μέχρι οποιοδήποτε από τα handles να ενεργοποιηθεί.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles για αναμονή. |
| millisecondsTimeout | int | [Χρονικό όριο](../../timeout/) για αναμονή, σε χιλιοστά του δευτερολέπτου· -1 σημαίνει άπειρη αναμονή, 0 σημαίνει έλεγχο-και-επιστροφή, θετικές τιμές είναι χρονικά όρια. |

### ReturnValue

Αληθές εάν κάποιο handle ενεργοποιηθεί, ψευδές εάν το χρονικό όριο ξεπεραστεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Περιμένει μέχρι οποιοδήποτε από τα handles να ενεργοποιηθεί.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles για αναμονή. |
| timeout | TimeSpan | Ένα [System::TimeSpan](../../../system/timespan/) που αντιπροσωπεύει τον αριθμό των χιλιοστών του δευτερολέπτου για αναμονή, ή ένα [System::TimeSpan](../../../system/timespan/) που αντιπροσωπεύει -1 χιλιοστά του δευτερολέπτου για απεριόριστη αναμονή. |

### ReturnValue

Αληθές εάν κάποιο handle ενεργοποιηθεί, ψευδές εάν το χρονικό όριο ξεπεραστεί.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
