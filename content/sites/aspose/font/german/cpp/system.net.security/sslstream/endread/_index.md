---
title: "System::Net::Security::SslStream::EndRead-Methode"
linktitle: "EndRead"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::SslStream::EndRead-Methode. Wartet, bis die angegebene asynchrone Leseoperation in C++ abgeschlossen ist."
type: docs
weight: 700
url: /de/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Wartet, bis die angegebene asynchrone Leseoperation abgeschlossen ist.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/)‑Objekt, das eine asynchrone Leseoperation darstellt |

### ReturnValue

Die Anzahl der während der von **asyncResult** dargestellten Leseoperation gelesenen Bytes

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
