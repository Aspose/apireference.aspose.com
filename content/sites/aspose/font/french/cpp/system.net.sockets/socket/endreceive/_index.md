---
title: "System::Net::Sockets::Socket::EndReceive méthode"
linktitle: "TerminerRéception"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::EndReceive méthode. Attend jusqu'à ce que l'opération de réception asynchrone spécifiée soit terminée en C++."
type: docs
weight: 1500
url: /fr/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


Attend que l'opération de réception asynchrone spécifiée se termine.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération de réception asynchrone. |

### ReturnValue

Le nombre d'octets qui sont reçus.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Attend que l'opération de réception asynchrone spécifiée se termine.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération de réception asynchrone. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera affecté lorsque l'opération de réception échoue. |

### ReturnValue

Le nombre d'octets reçus.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
