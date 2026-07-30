---
title: "System::Net::Sockets::NetworkStream::EndRead Methode"
linktitle: "EndRead"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::NetworkStream::EndRead Methode. Wartet, bis die angegebene asynchrone Leseoperation in C++ abgeschlossen ist."
type: docs
weight: 600
url: /de/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


Wartet, bis die angegebene asynchrone Leseoperation abgeschlossen ist.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/)‑Objekt, das eine asynchrone Leseoperation darstellt |

### ReturnValue

Die Anzahl der während der von **asyncResult** dargestellten Leseoperation gelesenen Bytes

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
