---
title: "System::Net::Sockets::UdpClient::Receive Methode"
linktitle: "Empfangen"
second_title: "Aspose.Page für C++"
description: "System::Net::Sockets::UdpClient::Receive Methode. Gibt ein Datagramm zurück, das von einem Server in C++ gesendet wurde."
type: docs
weight: 600
url: /de/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


Gibt ein vom Server gesendetes Datagramm zurück.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | Ein [IPEndPoint](../../../system.net/ipendpoint/), das den Remote-Host darstellt, von dem die Daten gesendet wurden. |

### ReturnValue

Ein Byte-Array, dem die empfangenen Daten zugewiesen werden.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
