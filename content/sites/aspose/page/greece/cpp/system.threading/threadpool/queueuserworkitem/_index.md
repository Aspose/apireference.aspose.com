---
title: "Μέθοδος System::Threading::ThreadPool::QueueUserWorkItem"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Threading::ThreadPool::QueueUserWorkItem. Τοποθετεί το αντικείμενο εργασίας στην ουρά που είναι παρόν με κλήση επιστροφής χωρίς παράμετρο σε C++."
type: docs
weight: 600
url: /el/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Τοποθετεί το αντικείμενο εργασίας στην ουρά που υπάρχει με callback χωρίς παράμετρο.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | WaitCallback | Συνάρτηση κλήσης επιστροφής που θα χρησιμοποιηθεί ως εργασία. |

### ReturnValue

Επιστρέφει πάντα true.

## Δείτε επίσης

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Τοποθετεί το αντικείμενο εργασίας στην ουρά που υπάρχει με callback χωρίς παράμετρο.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | WaitCallback | Συνάρτηση κλήσης επιστροφής που θα χρησιμοποιηθεί ως εργασία. |
| state | const System::SharedPtr\<System::Object\>\& | Παράμετρος συνάρτησης εργασίας. |

### ReturnValue

Επιστρέφει πάντα true.

## Δείτε επίσης

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
