---
title: "System::Net::Security::SslStream::BeginWrite Methode"
linktitle: "BeginWrite"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::SslStream::BeginWrite Methode. Startet eine asynchrone Schreiboperation in C++."
type: docs
weight: 400
url: /de/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


Startet einen asynchronen Schreibvorgang.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, in das Daten geschrieben werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| count | int32_t | Die Anzahl der zu schreibenden Bytes. |
| asyncCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| asyncState | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Schreiboperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/) Objekt, das die initiierte asynchrone Schreiboperation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
