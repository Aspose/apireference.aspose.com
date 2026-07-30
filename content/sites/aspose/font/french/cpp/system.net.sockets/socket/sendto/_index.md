---
title: "System::Net::Sockets::Socket::SendTo méthode"
linktitle: "EnvoyerÀ"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::SendTo méthode. Envoie les données spécifiées à l'extrémité spécifiée en C++."
type: docs
weight: 4700
url: /fr/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


Envoie les données spécifiées au point de terminaison spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |
| remoteEP | System::SharedPtr\<EndPoint\> | L'endpoint distant. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
