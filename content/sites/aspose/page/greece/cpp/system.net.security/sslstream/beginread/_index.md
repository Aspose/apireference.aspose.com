---
title: "System::Net::Security::SslStream::BeginRead μέθοδος"
linktitle: "BeginRead"
second_title: "Aspose.Page για C++"
description: "System::Net::Security::SslStream::BeginRead μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία ανάγνωσης σε C++."
type: docs
weight: 300
url: /el/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


Ξεκινά μια ασύγχρονη λειτουργία ανάγνωσης.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte από τον οποίο διαβάζονται τα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| count | int32_t | Ο αριθμός των byte που θα διαβαστούν. |
| asyncCallback | AsyncCallback | Μία κλήση επιστροφής που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| asyncState | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας ανάγνωσης. |

### ReturnValue

Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει την εκκινηθείσα ασύγχρονη λειτουργία ανάγνωσης.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
