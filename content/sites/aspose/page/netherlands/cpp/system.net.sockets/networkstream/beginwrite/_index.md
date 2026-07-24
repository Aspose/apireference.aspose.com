---
title: "System::Net::Sockets::NetworkStream::BeginWrite method"
linktitle: "BeginWrite"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite method. Initialiseert een asynchrone schrijfoperatie in C++."
type: docs
weight: 400
url: /nl/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Initieert een asynchrone schrijfbewerking.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Een buffer die gegevens bevat die moeten worden geschreven. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes om te schrijven. |
| callback | AsyncCallback | Een callback die wordt aangeroepen wanneer de bewerking is voltooid. |
| state | System::SharedPtr\<Object\> | Door de gebruiker geleverde gegevens die worden gebruikt om elke asynchrone schrijfoperatie uniek te identificeren. |

### ReturnValue

Een [IAsyncResult](../../../system/iasyncresult/) object dat de geïnitieerde asynchrone schrijfoperatie vertegenwoordigt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
