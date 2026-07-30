---
title: "System::Net::Sockets::Socket::SendTo Methode"
linktitle: "SendTo"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket::SendTo Methode. Sendet die angegebenen Daten an den angegebenen Endpunkt in C++."
type: docs
weight: 4700
url: /de/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend beim Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend beim Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend beim Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


Sendet die angegebenen Daten an den angegebenen Endpunkt.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |
| remoteEP | System::SharedPtr\<EndPoint\> | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl gesendeter Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
