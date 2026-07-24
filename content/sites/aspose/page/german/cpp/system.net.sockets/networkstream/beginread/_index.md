---
title: "System::Net::Sockets::NetworkStream::BeginRead Methode"
linktitle: "BeginRead"
second_title: "Aspose.Page für C++"
description: "System::Net::Sockets::NetworkStream::BeginRead Methode. Startet eine asynchrone Leseoperation in C++."
type: docs
weight: 300
url: /de/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


Startet eine asynchrone Leseoperation.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Puffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in das die gelesenen Bytes geschrieben werden. |
| offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| size | int32_t | Die Anzahl der zu lesenden Bytes. |
| Rückruf | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Leseoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/) Objekt, das die initiierte asynchrone Leseoperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
