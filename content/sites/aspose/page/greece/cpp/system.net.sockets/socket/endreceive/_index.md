---
title: "System::Net::Sockets::Socket::EndReceive μέθοδος"
linktitle: "EndReceive"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::EndReceive method. Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης σε C++."
type: docs
weight: 1500
url: /el/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει μια ασύγχρονη λειτουργία λήψης. |

### ReturnValue

Ο αριθμός των byte που λαμβάνονται.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει μια ασύγχρονη λειτουργία λήψης. |
| errorCode | SocketError\& | Η παράμετρος εξόδου όπου θα εκχωρηθεί ο κωδικός σφάλματος όταν η λειτουργία λήψης αποτύχει. |

### ReturnValue

Ο αριθμός των ληφθέντων byte.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
