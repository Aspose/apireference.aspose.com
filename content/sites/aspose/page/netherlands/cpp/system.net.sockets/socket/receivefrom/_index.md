---
title: "System::Net::Sockets::Socket::ReceiveFrom methode"
linktitle: "ReceiveFrom"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket::ReceiveFrom methode. Ontvangt gegevens van het opgegeven eindpunt en schrijft deze naar de opgegeven byte‑array in C++."
type: docs
weight: 4400
url: /nl/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Het externe eindpunt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
