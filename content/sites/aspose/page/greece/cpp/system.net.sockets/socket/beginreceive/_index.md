---
title: "System::Net::Sockets::Socket::BeginReceive μέθοδος"
linktitle: "BeginReceive"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::BeginReceive μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία εγγραφής σε C++."
type: docs
weight: 800
url: /el/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


Ξεκινά μια ασύγχρονη λειτουργία εγγραφής.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | System::ArrayPtr\<uint8_t\> | Ένα buffer όπου θα εκχωρηθούν τα ληφθέντα δεδομένα. |
| offset | int32_t | Η μετατόπιση σε byte στον καθορισμένο πίνακα. |
| size | int32_t | Ο αριθμός των byte στον καθορισμένο πίνακα ξεκινώντας από την παράμετρο 'offset'. |
| socketFlags | SocketFlags | Η συμπεριφορά λήψης. |
| callback | AsyncCallback | Ένα callback που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από το χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας λήψης. |

### ReturnValue

Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει τη ξεκινήμένη ασύγχρονη λειτουργία λήψης.

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
