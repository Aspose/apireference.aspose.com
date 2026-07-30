---
title: "System::Net::Sockets::Socket::EndSend metodo"
linktitle: "EndSend"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::Socket::EndSend metodo. Attende fino al completamento dell'operazione di invio asincrona specificata in C++."
type: docs
weight: 1600
url: /it/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


Attende fino al completamento dell'operazione di invio asincrona specificata.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione di invio asincrona. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Attende fino al completamento dell'operazione di invio asincrona specificata.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione di invio asincrona. |
| errorCode | SocketError\& | Il parametro di output dove verrà assegnato il codice di errore quando l'operazione di invio fallisce. |

### ReturnValue

Il numero di byte inviati.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
