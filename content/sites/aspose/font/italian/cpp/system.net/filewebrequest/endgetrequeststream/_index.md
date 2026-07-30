---
title: "System::Net::FileWebRequest::EndGetRequestStream metodo"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font per C++"
description: "System::Net::FileWebRequest::EndGetRequestStream metodo. Attende fino al completamento dell'operazione asincrona specificata per ottenere un flusso in C++."
type: docs
weight: 500
url: /it/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


Attende finché l'operazione asincrona specificata per ottenere un flusso non termina.

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
