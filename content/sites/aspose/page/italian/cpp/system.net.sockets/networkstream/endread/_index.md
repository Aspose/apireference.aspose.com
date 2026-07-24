---
title: "System::Net::Sockets::NetworkStream::EndRead metodo"
linktitle: "EndRead"
second_title: "Aspose.Page per C++"
description: "System::Net::Sockets::NetworkStream::EndRead metodo. Attende fino al completamento dell'operazione di lettura asincrona specificata in C++."
type: docs
weight: 600
url: /it/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


Attende fino al completamento dell'operazione di lettura asincrona specificata.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione di lettura asincrona |

### ReturnValue

Il numero di byte letti durante l'operazione di lettura rappresentata da **asyncResult**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
