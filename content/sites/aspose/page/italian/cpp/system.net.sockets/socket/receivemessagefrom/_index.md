---
title: "System::Net::Sockets::Socket::ReceiveMessageFrom metodo"
linktitle: "ReceiveMessageFrom"
second_title: "Aspose.Page per C++"
description: "System::Net::Sockets::Socket::ReceiveMessageFrom metodo. Riceve i dati dal endpoint specificato e li scrive nell'array di byte specificato in C++."
type: docs
weight: 4500
url: /it/cpp/system.net.sockets/socket/receivemessagefrom/
---
## Socket::ReceiveMessageFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Riceve dati dal endpoint specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato a partire dall'indice 'offset'. |
| socketFlags | SocketFlags\& | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Il punto finale remoto. |
| ipPacketInformation | IPPacketInformation\& | Il parametro di output dove verranno assegnate le informazioni sul pacchetto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Riceve dati dal endpoint specificato e li scrive nell'array di byte specificato.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato a partire dall'indice 'offset'. |
| socketFlags | SocketFlags\& | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Il punto finale remoto. |
| ipPacketInformation | IPPacketInformation\& | Il parametro di output dove verranno assegnate le informazioni sul pacchetto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


Riceve dati dal endpoint specificato e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | L'array di byte in cui verranno assegnati i dati ricevuti. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di byte da ricevere che verrà assegnato all'array di byte specificato a partire dall'indice 'offset'. |
| socketFlags | SocketFlags\& | Il comportamento di ricezione. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | Il punto finale remoto. |
| ipPacketInformation | IPPacketInformation\& | Il parametro di output dove verranno assegnate le informazioni sul pacchetto. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
