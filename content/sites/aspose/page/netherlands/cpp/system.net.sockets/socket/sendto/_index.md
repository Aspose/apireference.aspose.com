---
title: "System::Net::Sockets::Socket::SendTo method"
linktitle: "SendTo"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket::SendTo method. Stuur de opgegeven gegevens naar het opgegeven eindpunt in C++."
type: docs
weight: 4700
url: /nl/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |
| size | int32_t | Het aantal bytes in de opgegeven array. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De te verzenden gegevens. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |
| size | int32_t | Het aantal bytes in de opgegeven array. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De te verzenden gegevens. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |
| size | int32_t | Het aantal bytes in de opgegeven array. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


Verzendt de opgegeven gegevens naar het opgegeven eindpunt.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De te verzenden gegevens. |
| remoteEP | System::SharedPtr\<EndPoint\> | Het externe eindpunt. |

### ReturnValue

Het aantal verzonden bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
