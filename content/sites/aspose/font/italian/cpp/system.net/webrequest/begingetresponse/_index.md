---
title: "Metodo System::Net::WebRequest::BeginGetResponse"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font per C++"
description: "Metodo System::Net::WebRequest::BeginGetResponse. Avvia una richiesta asincrona per la risorsa in C++."
type: docs
weight: 1100
url: /it/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Avvia una richiesta asincrona per la risorsa.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
