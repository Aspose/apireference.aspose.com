---
title: "System::Net::Sockets::NetworkStream::BeginWrite method"
linktitle: "BeginWrite"
second_title: "Aspose.Page für C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite method. Initiert einen asynchronen Schreibvorgang in C++."
type: docs
weight: 400
url: /de/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


Startet eine asynchrone Schreiboperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::ArrayPtr\<uint8_t\> | Ein Puffer, der zu schreibende Daten enthält. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu schreibenden Bytes. |
| Rückruf | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Schreiboperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/) Objekt, das die initiierte asynchrone Schreiboperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
