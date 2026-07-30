---
title: "System::Net::Dns::EndGetHostAddresses-Methode"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Font für C++"
description: "System::Net::Dns::EndGetHostAddresses-Methode. Wartet, bis die angegebene asynchrone Operation zur Erstellung einer neuen Instanz der IPHostEntry-Klasse in C++ abgeschlossen ist."
type: docs
weight: 500
url: /de/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Wartet, bis die angegebene asynchrone Operation zur Erstellung einer neuen IPHostEntry-class-Instanz abgeschlossen ist.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das eine asynchrone Operation darstellt. |

### ReturnValue

Eine neu erstellte Instanz der IPHostEntry-Klasse.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
