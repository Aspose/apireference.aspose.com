---
title: "System::Net::Dns::EndGetHostAddresses metodo"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Font per C++"
description: "System::Net::Dns::EndGetHostAddresses metodo. Attende fino al completamento dell'operazione asincrona specificata per creare una nuova istanza della classe IPHostEntry in C++."
type: docs
weight: 500
url: /it/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Attende fino al completamento dell'operazione asincrona specificata per creare una nuova istanza della classe IPHostEntry.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione asincrona. |

### ReturnValue

Una nuova istanza della classe IPHostEntry.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
