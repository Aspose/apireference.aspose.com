---
title: "System::IO::Stream::BeginWrite Methode"
linktitle: "BeginWrite"
second_title: "Aspose.Font für C++"
description: "System::IO::Stream::BeginWrite Methode. Startet einen asynchronen Schreibvorgang in C++."
type: docs
weight: 200
url: /de/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Startet einen asynchronen Schreibvorgang.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Ein Puffer, der zu schreibende Daten enthält |
| Offset | int | Ein 0-basierter Offset in **buffer**, der die Position angibt, ab der die zu schreibenden Daten beginnen |
| count | int | Die Anzahl der zu schreibenden Bytes |
| Rückruf | System::AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn die Operation abgeschlossen ist |
| Zustand | System::SharedPtr\<System::Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Schreiboperation eindeutig zu identifizieren |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die initiierte asynchrone Schreiboperation darstellt

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
