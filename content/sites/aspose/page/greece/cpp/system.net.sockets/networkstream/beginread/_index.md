---
title: "System::Net::Sockets::NetworkStream::BeginRead μέθοδος"
linktitle: "BeginRead"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::NetworkStream::BeginRead μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία ανάγνωσης σε C++."
type: docs
weight: 300
url: /el/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


Ξεκινά μια ασύγχρονη λειτουργία ανάγνωσης.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte όπου θα γραφτούν τα διαβασμένα byte. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte που θα διαβαστούν. |
| callback | AsyncCallback | Μία κλήση επιστροφής που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας ανάγνωσης. |

### ReturnValue

Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει την εκκινηθείσα ασύγχρονη λειτουργία ανάγνωσης.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
