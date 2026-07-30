---
title: "System::Net::Dns::EndResolve Methode"
linktitle: "EndResolve"
second_title: "Aspose.Font für C++"
description: "System::Net::Dns::EndResolve Methode. Wartet, bis der angegebene asynchrone Vorgang zur Erstellung einer neuen IPHostEntry-class Instanz in C++ abgeschlossen ist."
type: docs
weight: 800
url: /de/cpp/system.net/dns/endresolve/
---
## Dns::EndResolve method


Wartet, bis die angegebene asynchrone Operation zur Erstellung einer neuen IPHostEntry-class-Instanz abgeschlossen ist.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndResolve(System::SharedPtr<IAsyncResult> asyncResult)
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
