---
title: "Metodo System::Net::FileWebRequest::BeginGetResponse"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page per C++"
description: "Metodo System::Net::FileWebRequest::BeginGetResponse. Avvia una richiesta asincrona per la risorsa in C++."
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
| callback | AsyncCallback | Una callback da chiamare quando l'operazione è completata. |
| state | System::SharedPtr\<Object\> | Dati forniti dall'utente usati per identificare in modo univoco ogni operazione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
