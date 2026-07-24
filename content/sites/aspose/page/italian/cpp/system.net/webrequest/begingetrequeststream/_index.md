---
title: "Metodo System::Net::WebRequest::BeginGetRequestStream"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page per C++"
description: "Metodo System::Net::WebRequest::BeginGetRequestStream. Avvia un'operazione asincrona per ottenere uno stream per scrivere dati nella risorsa in C++."
type: docs
weight: 1000
url: /it/cpp/system.net/webrequest/begingetrequeststream/
---
## WebRequest::BeginGetRequestStream method


Avvia un'operazione asincrona per ottenere un flusso per scrivere dati sulla risorsa.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
