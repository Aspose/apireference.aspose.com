---
title: "System::Net::Sockets::Socket::EndReceive metodo"
linktitle: "EndReceive"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::Socket::EndReceive metodo. Attende fino al completamento dell'operazione di ricezione asincrona specificata in C++."
type: docs
weight: 1500
url: /it/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


Attende fino al completamento dell'operazione di ricezione asincrona specificata.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione di ricezione asincrona. |

### ReturnValue

Il numero di byte che vengono ricevuti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Attende fino al completamento dell'operazione di ricezione asincrona specificata.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione di ricezione asincrona. |
| errorCode | SocketError\& | Il parametro di output in cui verrà assegnato il codice di errore quando l'operazione di ricezione fallisce. |

### ReturnValue

Il numero di byte ricevuti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
