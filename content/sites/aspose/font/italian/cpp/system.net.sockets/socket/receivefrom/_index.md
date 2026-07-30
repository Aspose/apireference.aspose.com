---
title: "System::Net::Sockets::Socket::ReceiveFrom metodo"
linktitle: "ReceiveFrom"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::Socket::ReceiveFrom metodo. Riceve i dati dall'endpoint specificato e li scrive nell'array di byte specificato in C++."
type: docs
weight: 4400
url: /it/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | L'endpoint remoto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
