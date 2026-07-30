---
title: "Méthode System::Net::Sockets::UdpClient::Receive"
linktitle: "Recevoir"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::UdpClient::Receive method. Retourne un datagramme envoyé par un serveur en C++."
type: docs
weight: 600
url: /fr/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


Renvoie un datagramme envoyé par un serveur.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | Un [IPEndPoint](../../../system.net/ipendpoint/) qui représente l'hôte distant depuis lequel les données ont été envoyées. |

### ReturnValue

Un tableau d'octets où les données reçues seront assignées.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
