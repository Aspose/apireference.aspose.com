---
title: "System::Net::Sockets::Socket::BeginSend μέθοδος"
linktitle: "BeginSend"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::BeginSend μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία αποστολής σε C++."
type: docs
weight: 900
url: /el/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


Ξεκινά μια ασύγχρονη λειτουργία αποστολής.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ένα buffer για ανάγνωση δεδομένων. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά αποστολής. |
| callback | AsyncCallback | Ένα callback που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας αποστολής. |

### ReturnValue

Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει την εκκινημένη ασύγχρονη λειτουργία αποστολής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
