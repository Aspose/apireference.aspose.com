---
title: "System::Net::Sockets::Socket::Send méthode"
linktitle: "Envoyer"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::Send méthode. Envoie les données spécifiées au socket en C++."
type: docs
weight: 4600
url: /fr/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera attribué lorsque l'opération d'envoi échoue. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |
| taille | int32_t | Le nombre d'octets des données spécifiées qui doivent être envoyés. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Les données à envoyer. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera attribué lorsque l'opération d'envoi échoue. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |
| taille | int32_t | Le nombre d'octets des données spécifiées qui doivent être envoyés. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Les données à envoyer. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


Envoie les données spécifiées au socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Envoie les données spécifiées au socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets dans le tableau spécifié à partir du paramètre 'offset'. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera attribué lorsque l'opération d'envoi échoue. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |
| taille | int32_t | Le nombre d'octets des données spécifiées qui doivent être envoyés. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Les données à envoyer. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampons | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Une collection de tableaux d'octets à partir desquels les données doivent être envoyées. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampons | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Une collection de tableaux d'octets à partir desquels les données doivent être envoyées. |
| socketFlags | SocketFlags | Le comportement d'envoi. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Envoie les données spécifiées au socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampons | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Une collection de tableaux d'octets à partir desquels les données doivent être envoyées. |
| socketFlags | SocketFlags | Le comportement d'envoi. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera attribué lorsque l'opération d'envoi échoue. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
