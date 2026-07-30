---
title: "System::Net::Sockets::Socket::Receive Methode"
linktitle: "Receive"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket::Receive Methode. Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array in C++."
type: docs
weight: 4300
url: /de/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn der Empfangsvorgang fehlschlägt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn der Empfangsvorgang fehlschlägt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes, die dem angegebenen Byte-Array ab dem Index 'offset' zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn der Empfangsvorgang fehlschlägt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| size | int32_t | Die Anzahl der zu empfangenden Bytes. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | Das Byte-Array, in dem die empfangenen Daten zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Empfängt Daten vom Socket und schreibt sie in die angegebenen Byte-Arrays.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Die Byte-Arrays, in denen die empfangenen Daten zugewiesen werden. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Empfängt Daten vom Socket und schreibt sie in die angegebenen Byte-Arrays.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Die Byte-Arrays, in denen die empfangenen Daten zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Empfängt Daten vom Socket und schreibt sie in die angegebenen Byte-Arrays.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Die Byte-Arrays, in denen die empfangenen Daten zugewiesen werden. |
| socketFlags | SocketFlags | Das Empfangsverhalten. |
| errorCode | SocketError\& | Der Ausgabeparameter, dem der Fehlercode zugewiesen wird, wenn der Empfangsvorgang fehlschlägt. |

### ReturnValue

Die Anzahl der empfangenen Bytes.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
