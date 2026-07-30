---
title: "System::Net::Sockets::Socket::ReceiveMessageFrom méthode"
linktitle: "ReceiveMessageFrom"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::ReceiveMessageFrom méthode. Reçoit des données de l'extrémité spécifiée et les écrit dans le tableau d'octets spécifié en C++."
type: docs
weight: 4500
url: /fr/cpp/system.net.sockets/socket/receivemessagefrom/
---
## Socket::ReceiveMessageFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags\& | Le comportement de réception. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint distant. |
| ipPacketInformation | IPPacketInformation\& | Le paramètre de sortie où les informations sur le paquet seront assignées. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags\& | Le comportement de réception. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint distant. |
| ipPacketInformation | IPPacketInformation\& | Le paramètre de sortie où les informations sur le paquet seront assignées. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Reçoit des données du point de terminaison spécifié et les écrit dans le tableau d'octets spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags\& | Le comportement de réception. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint distant. |
| ipPacketInformation | IPPacketInformation\& | Le paramètre de sortie où les informations sur le paquet seront assignées. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
