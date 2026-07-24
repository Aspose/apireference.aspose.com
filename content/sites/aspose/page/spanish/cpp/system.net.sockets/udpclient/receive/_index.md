---
title: "System::Net::Sockets::UdpClient::Receive método"
linktitle: "Recibir"
second_title: "Aspose.Page para C++"
description: "System::Net::Sockets::UdpClient::Receive método. Devuelve un datagrama enviado por un servidor en C++."
type: docs
weight: 600
url: /es/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


Devuelve un datagrama enviado por un servidor.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | Un [IPEndPoint](../../../system.net/ipendpoint/) que representa el host remoto desde el cual se enviaron los datos. |

### ReturnValue

Una matriz de bytes donde se asignarán los datos recibidos.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
