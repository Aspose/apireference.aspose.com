---
title: "System::Net::Sockets::UdpClient::Receive metodo"
linktitle: "Receive"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::UdpClient::Receive metodo. Restituisce un datagramma inviato da un server in C++."
type: docs
weight: 600
url: /it/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


Restituisce un datagramma inviato da un server.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | Un [IPEndPoint](../../../system.net/ipendpoint/) che rappresenta l'host remoto da cui sono stati inviati i dati. |

### ReturnValue

Un array di byte in cui verranno assegnati i dati ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
