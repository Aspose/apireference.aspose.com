---
title: "Méthode System::Net::Sockets::UdpClient::Send"
linktitle: "Envoyer"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::UdpClient::Send method. Envoie un datagramme UDP à un hôte distant en C++."
type: docs
weight: 700
url: /fr/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


Envoie un datagramme UDP à un hôte distant.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Un tableau de type [Byte](../../../system/byte/) à envoyer. |
| octets | int32_t | Le nombre d'octets dans le datagramme. |

### ReturnValue

Le nombre d'octets qui sont envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


Envoie un datagramme UDP au port spécifié sur l’hôte distant spécifié.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Un tableau de type [Byte](../../../system/byte/) à envoyer |
| octets | int32_t | Le nombre d'octets dans le datagramme. |
| nom d'hôte | String | Un nom de l'hôte distant. |
| port | int32_t | Un numéro de port distant. |

### ReturnValue

Le nombre d'octets qui sont envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


Envoie un datagramme UDP à l’hôte au point d’extrémité distant.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | Un tableau de type [Byte](../../../system/byte/) à envoyer |
| octets | int32_t | Le nombre d'octets dans le datagramme. |
| endPoint | System::SharedPtr\<IPEndPoint\> | Un [IPEndPoint](../../../system.net/ipendpoint/) qui représente l'hôte et le port vers lesquels envoyer le datagramme. |

### ReturnValue

Le nombre d'octets qui sont envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
