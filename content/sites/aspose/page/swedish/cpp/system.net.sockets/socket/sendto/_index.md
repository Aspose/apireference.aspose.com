---
title: "System::Net::Sockets::Socket::SendTo metod"
linktitle: "SendTo"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::Socket::SendTo metod. Skickar den specificerade datan till den specificerade slutpunkten i C++."
type: docs
weight: 4700
url: /sv/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Datan att skicka. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte i den specificerade arrayen med början från parametern 'offset'. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Datan att skicka. |
| size | int32_t | Antalet byte i den specificerade arrayen. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Datan att skicka. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Datan att skicka. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Datan att skicka. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte i den specificerade arrayen med början från parametern 'offset'. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Datan att skicka. |
| size | int32_t | Antalet byte i den specificerade arrayen. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Datan att skicka. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Datan att skicka. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Datan att skicka. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte i den specificerade arrayen med början från parametern 'offset'. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Datan att skicka. |
| size | int32_t | Antalet byte i den specificerade arrayen. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Datan att skicka. |
| socketFlags | SocketFlags | Sändningsbeteendet. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


Skickar den angivna datan till den angivna slutpunkten.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Datan att skicka. |
| remoteEP | System::SharedPtr\<EndPoint\> | Den fjärrslutpunkten. |

### ReturnValue

Antalet skickade byte.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
