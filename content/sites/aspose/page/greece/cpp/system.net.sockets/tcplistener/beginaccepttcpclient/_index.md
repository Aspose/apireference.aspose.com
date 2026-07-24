---
title: "System::Net::Sockets::TcpListener::BeginAcceptTcpClient μέθοδος"
linktitle: "BeginAcceptTcpClient"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptTcpClient μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία αποδοχής σε C++."
type: docs
weight: 600
url: /el/cpp/system.net.sockets/tcplistener/beginaccepttcpclient/
---
## TcpListener::BeginAcceptTcpClient method


Ξεκινά μια ασύγχρονη λειτουργία αποδοχής.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptTcpClient(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | AsyncCallback | Ένα callback που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας σύνδεσης. |

### ReturnValue

Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει την εκκινημένη ασύγχρονη λειτουργία αποδοχής.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
