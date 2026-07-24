---
title: "System::Net::Sockets::Socket::Send-Methode"
linktitle: "Senden"
second_title: "Aspose.Page für C++"
description: "System::Net::Sockets::Socket::Send-Methode. Sendet die angegebenen Daten an den Socket in C++."
type: docs
weight: 4600
url: /de/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend ab dem Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend ab dem Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn die Sendoperation fehlschlägt. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |
| size | int32_t | Die Anzahl der Bytes aus den angegebenen Daten, die gesendet werden müssen. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::ArrayPtr\<uint8_t\> | Die zu sendenden Daten. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend ab dem Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend ab dem Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn die Sendoperation fehlschlägt. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |
| size | int32_t | Die Anzahl der Bytes aus den angegebenen Daten, die gesendet werden müssen. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::ArrayView\<uint8_t\> | Die zu sendenden Daten. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


Sendet die angegebenen Daten an den Socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend ab dem Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Sendet die angegebenen Daten an den Socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der Bytes im angegebenen Array, beginnend ab dem Parameter 'offset'. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn die Sendoperation fehlschlägt. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |
| size | int32_t | Die Anzahl der Bytes aus den angegebenen Daten, die gesendet werden müssen. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::Details::StackArray\<uint8_t, N\>\& | Die zu sendenden Daten. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Eine Sammlung von Byte-Arrays, aus denen Daten gesendet werden müssen. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Eine Sammlung von Byte-Arrays, aus denen Daten gesendet werden müssen. |
| socketFlags | SocketFlags | Das Sendeverhalten. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Sendet die angegebenen Daten an den Socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Eine Sammlung von Byte-Arrays, aus denen Daten gesendet werden müssen. |
| socketFlags | SocketFlags | Das Sendeverhalten. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn die Sendoperation fehlschlägt. |

### ReturnValue

Die Anzahl der gesendeten Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
