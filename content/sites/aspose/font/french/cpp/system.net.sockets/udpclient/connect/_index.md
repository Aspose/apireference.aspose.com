---
title: "Méthode System::Net::Sockets::UdpClient::Connect"
linktitle: "Connect"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Net::Sockets::UdpClient::Connect. Établit une connexion au port spécifié sur l'hôte spécifié en C++."
type: docs
weight: 300
url: /fr/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


Établit une connexion au port spécifié sur l’hôte spécifié.

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom d'hôte | String | Le nom de l'hôte DNS distant auquel vous souhaitez vous connecter. |
| port | int32_t | Le numéro de port local à partir duquel vous souhaitez communiquer. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


Établit une connexion avec l’hôte à l’adresse spécifiée sur le port spécifié.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | L'[IPAddress](../../../system.net/ipaddress/) de l'hôte distant vers lequel envoyer les données. |
| port | int32_t | Le numéro de port local à partir duquel vous souhaitez communiquer. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


Établit une connexion à un point d’extrémité distant.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| endPoint | System::SharedPtr\<IPEndPoint\> | Le point de terminaison auquel vous liez la connexion UDP. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
