---
title: "System::Net::Sockets::UdpClient::Receive μέθοδος"
linktitle: "Λήψη"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::UdpClient::Receive μέθοδος. Επιστρέφει ένα datagram που αποστέλλεται από έναν διακομιστή σε C++."
type: docs
weight: 600
url: /el/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


Επιστρέφει ένα datagram που έστειλε ο διακομιστής.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | Ένα [IPEndPoint](../../../system.net/ipendpoint/) που αντιπροσωπεύει τον απομακρυσμένο υπολογιστή από τον οποίο εστάλησαν τα δεδομένα. |

### ReturnValue

Ένας πίνακας byte όπου θα εκχωρηθούν τα ληφθέντα δεδομένα.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
