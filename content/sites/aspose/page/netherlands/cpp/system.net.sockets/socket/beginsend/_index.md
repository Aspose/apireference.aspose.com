---
title: "System::Net::Sockets::Socket::BeginSend methode"
linktitle: "BeginSend"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket::BeginSend methode. Initialiseert een asynchrone verzendoperatie in C++."
type: docs
weight: 900
url: /nl/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


Start een asynchrone verzendoperatie.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Een buffer om gegevens uit te lezen. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes in de opgegeven array beginnend bij de parameter 'offset'. |
| socketFlags | SocketFlags | Het verzendgedrag. |
| callback | AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking is voltooid. |
| state | System::SharedPtr\<Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone verzendoperatie uniek te identificeren. |

### ReturnValue

Een [IAsyncResult](../../../system/iasyncresult/) object dat de geïnitieerde asynchrone verzendoperatie vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
