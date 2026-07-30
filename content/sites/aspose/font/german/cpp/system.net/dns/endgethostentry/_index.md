---
title: "System::Net::Dns::EndGetHostEntry Methode"
linktitle: "EndGetHostEntry"
second_title: "Aspose.Font für C++"
description: "System::Net::Dns::EndGetHostEntry Methode. Wartet, bis der angegebene asynchrone Vorgang zur Erstellung einer neuen IPHostEntry-class Instanz in C++ abgeschlossen ist."
type: docs
weight: 700
url: /de/cpp/system.net/dns/endgethostentry/
---
## Dns::EndGetHostEntry method


Wartet, bis die angegebene asynchrone Operation zur Erstellung einer neuen IPHostEntry-class-Instanz abgeschlossen ist.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostEntry(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das eine asynchrone Operation darstellt. |

### ReturnValue

Eine neu erstellte Instanz der IPHostEntry-Klasse.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
