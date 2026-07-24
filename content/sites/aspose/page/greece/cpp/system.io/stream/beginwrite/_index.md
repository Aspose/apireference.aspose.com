---
title: "System::IO::Stream::BeginWrite μέθοδος"
linktitle: "BeginWrite"
second_title: "Aspose.Page για C++"
description: "System::IO::Stream::BeginWrite method. Εκκινεί μια ασύγχρονη λειτουργία εγγραφής σε C++."
type: docs
weight: 200
url: /el/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Ξεκινά μια ασύγχρονη λειτουργία εγγραφής.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ένα buffer που περιέχει δεδομένα προς εγγραφή |
| offset | int | Μια μετατόπιση 0‑βάση στο **buffer** που υποδεικνύει τη θέση από την οποία ξεκινά η εγγραφή των δεδομένων |
| count | int | Ο αριθμός των byte προς εγγραφή |
| callback | System::AsyncCallback | Μια callback που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<System::Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για τη μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας εγγραφής |

### ReturnValue

Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει την εκκινημένη ασύγχρονη λειτουργία εγγραφής

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
