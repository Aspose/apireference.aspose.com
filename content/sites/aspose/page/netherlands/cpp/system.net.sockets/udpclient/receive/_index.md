---
title: "System::Net::Sockets::UdpClient::Receive method"
linktitle: "Ontvangen"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::UdpClient::Receive method. Retourneert een datagram dat door een server is verzonden in C++."
type: docs
weight: 600
url: /nl/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


Retourneert een datagram dat door een server is verzonden.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | Een [IPEndPoint](../../../system.net/ipendpoint/) die de externe host vertegenwoordigt vanwaar de gegevens werden verzonden. |

### ReturnValue

Een byte-array waarin ontvangen gegevens worden toegewezen.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
