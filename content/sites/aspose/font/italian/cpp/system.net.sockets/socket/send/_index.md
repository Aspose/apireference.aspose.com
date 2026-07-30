---
title: "System::Net::Sockets::Socket::Send method"
linktitle: "Send"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::Socket::Send method. Invia i dati specificati al socket in C++."
type: docs
weight: 4600
url: /it/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | I dati da inviare. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | I dati da inviare. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte nell'array specificato a partire dal parametro 'offset'. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | I dati da inviare. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte nell'array specificato a partire dal parametro 'offset'. |
| socketFlags | SocketFlags | Il comportamento di invio. |
| errorCode | SocketError\& | Il parametro di output dove verrà assegnato il codice di errore quando l'operazione di invio fallisce. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | I dati da inviare. |
| size | int32_t | Il numero di byte dei dati specificati che devono essere inviati. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | I dati da inviare. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | I dati da inviare. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | I dati da inviare. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte nell'array specificato a partire dal parametro 'offset'. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | I dati da inviare. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte nell'array specificato a partire dal parametro 'offset'. |
| socketFlags | SocketFlags | Il comportamento di invio. |
| errorCode | SocketError\& | Il parametro di output dove verrà assegnato il codice di errore quando l'operazione di invio fallisce. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | I dati da inviare. |
| size | int32_t | Il numero di byte dei dati specificati che devono essere inviati. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | I dati da inviare. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


Invia i dati specificati al socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | I dati da inviare. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Invia i dati specificati al socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | I dati da inviare. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte nell'array specificato a partire dal parametro 'offset'. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Invia i dati specificati al socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | I dati da inviare. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte nell'array specificato a partire dal parametro 'offset'. |
| socketFlags | SocketFlags | Il comportamento di invio. |
| errorCode | SocketError\& | Il parametro di output dove verrà assegnato il codice di errore quando l'operazione di invio fallisce. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Invia i dati specificati al socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | I dati da inviare. |
| size | int32_t | Il numero di byte dei dati specificati che devono essere inviati. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Invia i dati specificati al socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | I dati da inviare. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Una raccolta di array di byte da cui i dati devono essere inviati. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Una raccolta di array di byte da cui i dati devono essere inviati. |
| socketFlags | SocketFlags | Il comportamento di invio. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Invia i dati specificati al socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Una raccolta di array di byte da cui i dati devono essere inviati. |
| socketFlags | SocketFlags | Il comportamento di invio. |
| errorCode | SocketError\& | Il parametro di output dove verrà assegnato il codice di errore quando l'operazione di invio fallisce. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
