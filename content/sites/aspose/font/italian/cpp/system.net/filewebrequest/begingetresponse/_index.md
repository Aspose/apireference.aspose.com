---
title: "System::Net::FileWebRequest::BeginGetResponse metodo"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font per C++"
description: "System::Net::FileWebRequest::BeginGetResponse metodo. Avvia una richiesta asincrona per la risorsa in C++."
type: docs
weight: 400
url: /it/cpp/system.net/filewebrequest/begingetresponse/
---
## FileWebRequest::BeginGetResponse method


Avvia una richiesta asincrona per la risorsa.

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | AsyncCallback | Una callback da chiamare al completamento dell'operazione. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
