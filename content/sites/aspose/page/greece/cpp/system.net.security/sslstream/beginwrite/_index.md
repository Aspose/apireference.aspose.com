---
title: "System::Net::Security::SslStream::BeginWrite μέθοδος"
linktitle: "BeginWrite"
second_title: "Aspose.Page για C++"
description: "System::Net::Security::SslStream::BeginWrite μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία εγγραφής σε C++."
type: docs
weight: 400
url: /el/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


Ξεκινά μια ασύγχρονη λειτουργία εγγραφής.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte για την εγγραφή δεδομένων. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| count | int32_t | Ο αριθμός των byte για εγγραφή. |
| asyncCallback | AsyncCallback | Μία κλήση επιστροφής που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| asyncState | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας εγγραφής. |

### ReturnValue

Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει τη διεργασία ασύγχρονης εγγραφής που ξεκίνησε.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
