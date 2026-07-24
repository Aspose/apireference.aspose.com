---
title: "Metodo System::Net::FileWebRequest::EndGetRequestStream"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page per C++"
description: "Metodo System::Net::FileWebRequest::EndGetRequestStream. Attende fino al completamento dell'operazione asincrona specificata per ottenere un flusso in C++."
type: docs
weight: 500
url: /it/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


Attende fino al completamento dell'operazione asincrona specificata per ottenere un flusso.

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
* Library [Aspose.Page for C++](../../../)
