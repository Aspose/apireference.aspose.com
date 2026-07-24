---
title: "Méthode System::Net::Sockets::Socket::EndSend"
linktitle: "EndSend"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Net::Sockets::Socket::EndSend. Attend que l'opération d'envoi asynchrone spécifiée se termine en C++."
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
* Library [Aspose.Page for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Attend que l'opération d'envoi asynchrone spécifiée se termine.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un objet [IAsyncResult](../../../system/iasyncresult/) qui représente une opération d'envoi asynchrone. |
| errorCode | SocketError\& | Le paramètre de sortie où le code d'erreur sera assigné lorsque l'opération d'envoi échoue. |

### ReturnValue

Le nombre d'octets envoyés.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
