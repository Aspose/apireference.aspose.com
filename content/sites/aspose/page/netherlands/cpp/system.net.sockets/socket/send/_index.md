---
title: "System::Net::Sockets::Socket::Send methode"
linktitle: "Verzenden"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket::Send methode. Verzendt de opgegeven gegevens naar de socket in C++."
type: docs
weight: 4600
url: /nl/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt toegewezen wanneer de verzendbewerking mislukt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |
| size | int32_t | Het aantal bytes van de opgegeven gegevens dat verzonden moet worden. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt toegewezen wanneer de verzendbewerking mislukt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |
| size | int32_t | Het aantal bytes van de opgegeven gegevens dat verzonden moet worden. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt toegewezen wanneer de verzendbewerking mislukt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |
| size | int32_t | Het aantal bytes van de opgegeven gegevens dat verzonden moet worden. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Een verzameling van byte‑arrays waarvan de gegevens verzonden moeten worden. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Een verzameling van byte‑arrays waarvan de gegevens verzonden moeten worden. |
| socketFlags | SocketFlags | Het verzendgedrag. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Verzendt de opgegeven gegevens naar de socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Een verzameling van byte‑arrays waarvan de gegevens verzonden moeten worden. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt toegewezen wanneer de verzendbewerking mislukt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
