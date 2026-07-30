---
title: "System::Net::Sockets::Socket::Receive méthode"
linktitle: "Recevoir"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::Receive méthode. Reçoit des données du socket et les écrit dans le tableau d'octets spécifié en C++."
type: docs
weight: 4300
url: /fr/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags | Le comportement de réception. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera affecté lorsque l'opération de réception échoue. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| taille | int32_t | Le nombre d'octets à recevoir. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::ArrayPtr\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags | Le comportement de réception. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera affecté lorsque l'opération de réception échoue. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| taille | int32_t | Le nombre d'octets à recevoir. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::ArrayView\<uint8_t\> | Le tableau d'octets où les données reçues seront affectées. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Le tableau d'octets où les données reçues seront affectées. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Le tableau d'octets où les données reçues seront affectées. |
| décalage | int32_t | Le décalage en octets dans le tableau spécifié. |
| taille | int32_t | Le nombre d'octets à recevoir qui seront affectés au tableau d'octets spécifié à partir de l'index 'offset'. |
| socketFlags | SocketFlags | Le comportement de réception. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera affecté lorsque l'opération de réception échoue. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Le tableau d'octets où les données reçues seront affectées. |
| taille | int32_t | Le nombre d'octets à recevoir. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Reçoit des données du socket et les écrit dans le tableau d'octets spécifié.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | System::Details::StackArray\<uint8_t, N\>\& | Le tableau d'octets où les données reçues seront affectées. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Reçoit des données du socket et les écrit dans les tableaux d'octets spécifiés.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampons | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Les tableaux d'octets où les données reçues seront affectées. |

### ReturnValue

Le nombre d'octets qui sont reçus.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Reçoit des données du socket et les écrit dans les tableaux d'octets spécifiés.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampons | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Les tableaux d'octets où les données reçues seront affectées. |
| socketFlags | SocketFlags | Le comportement de réception. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Reçoit des données du socket et les écrit dans les tableaux d'octets spécifiés.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampons | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Les tableaux d'octets où les données reçues seront affectées. |
| socketFlags | SocketFlags | Le comportement de réception. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera affecté lorsque l'opération de réception échoue. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
