---
title: "Metodo System::IO::Stream::EndRead"
linktitle: "EndRead"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::Stream::EndRead. Attende fino al completamento dell'operazione di lettura asincrona specificata in C++."
type: docs
weight: 600
url: /it/cpp/system.io/stream/endread/
---
## Stream::EndRead method


Attende finché l'operazione di lettura asincrona specificata non è completata.

```cpp
virtual int System::IO::Stream::EndRead(System::SharedPtr<System::IAsyncResult> asyncResult)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<System::IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione di lettura asincrona |

### ReturnValue

Il numero di byte letti durante l'operazione di lettura rappresentata da **asyncResult**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
