---
title: "System::Net::Dns::BeginGetHostAddresses-Methode"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Font für C++"
description: "System::Net::Dns::BeginGetHostAddresses-Methode. Startet einen asynchronen Vorgang, um eine neue IPHostEntry-class-Instanz zu erstellen, wobei die angegebene Zeichenkette verwendet wird, die einen Hostnamen oder eine IP-Adresse enthält, in C++."
type: docs
weight: 100
url: /de/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mithilfe des angegebenen Strings zu erstellen, der einen Hostnamen oder eine IP-Adresse enthält.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| hostNameOrAddress | String | Ein String, der einen Hostnamen oder eine IP-Adresse enthält. |
| requestCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| Zustand | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Operation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die gestartete asynchrone Operation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
