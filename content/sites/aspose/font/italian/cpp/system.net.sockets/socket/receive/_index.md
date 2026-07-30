---
title: "System::Net::Sockets::Socket::Receive metodo"
linktitle: "Receive"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::Socket::Receive metodo. Riceve dati dal socket e li scrive nell'array di byte specificato in C++."
type: docs
weight: 4300
url: /it/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| errorCode | SocketError\& | Il parametro di output in cui verrà assegnato il codice di errore quando l'operazione di ricezione fallisce. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| size | int32_t | Il numero di byte da ricevere. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| errorCode | SocketError\& | Il parametro di output in cui verrà assegnato il codice di errore quando l'operazione di ricezione fallisce. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| size | int32_t | Il numero di byte da ricevere. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato dall'indice 'offset'. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| errorCode | SocketError\& | Il parametro di output in cui verrà assegnato il codice di errore quando l'operazione di ricezione fallisce. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |
| size | int32_t | Il numero di byte da ricevere. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Riceve dati dal socket e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Riceve dati dal socket e li scrive negli array di byte specificati.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Gli array di byte in cui verranno assegnati i dati ricevuti. |

### ReturnValue

Il numero di byte che vengono ricevuti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Riceve dati dal socket e li scrive negli array di byte specificati.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Gli array di byte in cui verranno assegnati i dati ricevuti. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Riceve dati dal socket e li scrive negli array di byte specificati.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Gli array di byte in cui verranno assegnati i dati ricevuti. |
| socketFlags | SocketFlags | Il comportamento di ricezione. |
| errorCode | SocketError\& | Il parametro di output in cui verrà assegnato il codice di errore quando l'operazione di ricezione fallisce. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
