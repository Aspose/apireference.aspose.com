---
title: "System::Net::WebRequest::EndGetRequestStream metodo"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font per C++"
description: "System::Net::WebRequest::EndGetRequestStream metodo. Attende fino al completamento dell'operazione asincrona specificata per ottenere un flusso in C++."
type: docs
weight: 1200
url: /it/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


Attende finché l'operazione asincrona specificata per ottenere un flusso non termina.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta un'operazione asincrona per ottenere un flusso. |

### ReturnValue

Lo stream per scrivere dati nella risorsa.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
