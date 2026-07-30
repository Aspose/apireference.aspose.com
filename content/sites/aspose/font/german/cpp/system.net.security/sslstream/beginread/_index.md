---
title: "System::Net::Security::SslStream::BeginRead-Methode"
linktitle: "BeginRead"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::SslStream::BeginRead-Methode. Initiert eine asynchrone Leseoperation in C++."
type: docs
weight: 300
url: /de/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


Startet einen asynchronen Lesevorgang.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Das Byte-Array, aus dem Daten gelesen werden. |
| Offset | int32_t | Der Offset in Bytes im angegebenen Array. |
| count | int32_t | Die Anzahl der zu lesenden Bytes. |
| asyncCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| asyncState | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Leseoperation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die initiierte asynchrone Leseoperation repräsentiert.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
