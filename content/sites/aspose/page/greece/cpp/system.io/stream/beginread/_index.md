---
title: "System::IO::Stream::BeginRead μέθοδος"
linktitle: "BeginRead"
second_title: "Aspose.Page για C++"
description: "System::IO::Stream::BeginRead μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία ανάγνωσης σε C++."
type: docs
weight: 100
url: /el/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


Ξεκινά μια ασύγχρονη λειτουργία ανάγνωσης.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ένα buffer για ανάγνωση |
| offset | int | Μια μετατόπιση 0-βάσης στο **buffer** που υποδεικνύει τη θέση από την οποία θα ξεκινήσει η εγγραφή των δεδομένων που διαβάστηκαν. |
| count | int | Ο αριθμός των byte για ανάγνωση |
| callback | System::AsyncCallback | Μια callback που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<System::Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας ανάγνωσης. |

### ReturnValue

Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει την εκκινημένη ασύγχρονη λειτουργία ανάγνωσης

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
