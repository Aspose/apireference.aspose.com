---
title: "System::Net::Sockets::Socket::Receive metod"
linktitle: "Mottag"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::Socket::Receive metod. Tar emot data från socketen och skriver den till den angivna byte‑arrayen i C++."
type: docs
weight: 4300
url: /sv/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte att ta emot som kommer att tilldelas den angivna byte‑arrayen från indexet 'offset'. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte att ta emot som kommer att tilldelas den angivna byte‑arrayen från indexet 'offset'. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |
| errorCode | SocketError\& | Utdata‑parametern där felkoden kommer att tilldelas när mottagningsoperationen misslyckas. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| size | int32_t | Antalet byte att ta emot. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::ArrayPtr\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte att ta emot som kommer att tilldelas den angivna byte‑arrayen från indexet 'offset'. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte att ta emot som kommer att tilldelas den angivna byte‑arrayen från indexet 'offset'. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |
| errorCode | SocketError\& | Utdata‑parametern där felkoden kommer att tilldelas när mottagningsoperationen misslyckas. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| size | int32_t | Antalet byte att ta emot. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::ArrayView\<uint8_t\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Byte‑arrayen där den mottagna datan kommer att tilldelas. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte att ta emot som kommer att tilldelas den angivna byte‑arrayen från indexet 'offset'. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| offset | int32_t | Förskjutningen i byte i den angivna arrayen. |
| size | int32_t | Antalet byte att ta emot som kommer att tilldelas den angivna byte‑arrayen från indexet 'offset'. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |
| errorCode | SocketError\& | Utdata‑parametern där felkoden kommer att tilldelas när mottagningsoperationen misslyckas. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| size | int32_t | Antalet byte att ta emot. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Tar emot data från socketen och skriver dem till den angivna byte‑arrayen.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | System::Details::StackArray\<uint8_t, N\>\& | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Tar emot data från socketen och skriver dem till de angivna byte‑arrayerna.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffertar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |

### ReturnValue

Antalet byte som mottas.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Tar emot data från socketen och skriver dem till de angivna byte‑arrayerna.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffertar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Tar emot data från socketen och skriver dem till de angivna byte‑arrayerna.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffertar | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Byte‑arrayen där den mottagna datan kommer att tilldelas. |
| socketFlags | SocketFlags | Mottagningsbeteendet. |
| errorCode | SocketError\& | Utdata‑parametern där felkoden kommer att tilldelas när mottagningsoperationen misslyckas. |

### ReturnValue

Antalet mottagna byte.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
