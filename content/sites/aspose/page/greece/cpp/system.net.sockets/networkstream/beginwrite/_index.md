---
title: "System::Net::Sockets::NetworkStream::BeginWrite method"
linktitle: "BeginWrite"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite method. Ξεκινά μια ασύγχρονη λειτουργία εγγραφής σε C++."
type: docs
weight: 400
url: /el/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Ξεκινά μια ασύγχρονη λειτουργία εγγραφής.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ένας buffer που περιέχει δεδομένα προς εγγραφή. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte για εγγραφή. |
| callback | AsyncCallback | Μία κλήση επιστροφής που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας εγγραφής. |

### ReturnValue

Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει τη διεργασία ασύγχρονης εγγραφής που ξεκίνησε.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
