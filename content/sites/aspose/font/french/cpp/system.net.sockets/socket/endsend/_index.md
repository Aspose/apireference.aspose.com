---
title: "System::Net::Sockets::Socket::EndSend méthode"
linktitle: "EndSend"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::EndSend méthode. Attend jusqu'à ce que l'opération d'envoi asynchrone spécifiée soit terminée en C++."
type: docs
weight: 1600
url: /fr/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


Attend que l'opération d'envoi asynchrone spécifiée se termine.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération d'envoi asynchrone. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Attend que l'opération d'envoi asynchrone spécifiée se termine.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération d'envoi asynchrone. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera attribué lorsque l'opération d'envoi échoue. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
