---
title: "System::Net::FileWebRequest::BeginGetRequestStream metodo"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Font per C++"
description: "System::Net::FileWebRequest::BeginGetRequestStream metodo. Avvia un'operazione asincrona per ottenere un flusso per scrivere dati nella risorsa in C++."
type: docs
weight: 300
url: /it/cpp/system.net/filewebrequest/begingetrequeststream/
---
## FileWebRequest::BeginGetRequestStream method


Avvia un'operazione asincrona per ottenere un flusso per scrivere dati nella risorsa.

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
