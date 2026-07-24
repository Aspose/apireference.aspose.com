---
title: "System::Net::Sockets::Socket::Receive methode"
linktitle: "Ontvangen"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket::Receive methode. Ontvangt gegevens van de socket en schrijft deze naar de opgegeven byte-array in C++."
type: docs
weight: 4300
url: /nl/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt geplaatst wanneer de ontvangoperatie mislukt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| size | int32_t | Het aantal te ontvangen bytes. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt geplaatst wanneer de ontvangoperatie mislukt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| size | int32_t | Het aantal te ontvangen bytes. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De byte-array waarin de ontvangen gegevens worden geplaatst. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal te ontvangen bytes dat zal worden toegewezen aan de opgegeven byte-array vanaf de 'offset'-index. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt geplaatst wanneer de ontvangoperatie mislukt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| size | int32_t | Het aantal te ontvangen bytes. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | De byte-array waarin de ontvangen gegevens worden geplaatst. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-arrays.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | De byte-arrays waarin de ontvangen gegevens worden geplaatst. |

### ReturnValue

Het aantal bytes dat wordt ontvangen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-arrays.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | De byte-arrays waarin de ontvangen gegevens worden geplaatst. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-arrays.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | De byte-arrays waarin de ontvangen gegevens worden geplaatst. |
| socketFlags | SocketFlags | Het ontvangsgedrag. |
| errorCode | SocketError\& | De uitvoerparameter waarin de foutcode wordt geplaatst wanneer de ontvangoperatie mislukt. |

### ReturnValue

Het aantal ontvangen bytes.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
