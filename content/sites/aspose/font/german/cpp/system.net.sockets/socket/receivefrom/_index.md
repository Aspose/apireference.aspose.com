---
title: "System::Net::Sockets::Socket::ReceiveFrom Methode"
linktitle: "ReceiveFrom"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket::ReceiveFrom Methode. Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array in C++."
type: docs
weight: 4400
url: /de/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Der entfernte Endpunkt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
