---
title: "Metodo System::Net::HttpWebRequest::BeginGetRequestStream"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page per C++"
description: "Metodo System::Net::HttpWebRequest::BeginGetRequestStream. Avvia un'operazione asincrona per ottenere un flusso per scrivere dati sulla risorsa in C++."
type: docs
weight: 400
url: /it/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


Avvia un'operazione asincrona per ottenere un flusso per scrivere dati sulla risorsa.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
