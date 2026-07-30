---
title: "System::Net::Dns::BeginResolve Methode"
linktitle: "BeginResolve"
second_title: "Aspose.Font für C++"
description: "System::Net::Dns::BeginResolve Methode. Startet einen asynchronen Vorgang, um eine neue Instanz der IPHostEntry-class mit dem angegebenen Hostnamen in C++ zu erstellen."
type: docs
weight: 400
url: /de/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mit dem angegebenen Hostnamen zu erstellen.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| hostName | String | Ein Hostname, der verwendet wird, um eine neue Instanz der [IPHostEntry](../../iphostentry/) Klasse zu erstellen. |
| requestCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| stateObject | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Operation eindeutig zu identifizieren. |

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
