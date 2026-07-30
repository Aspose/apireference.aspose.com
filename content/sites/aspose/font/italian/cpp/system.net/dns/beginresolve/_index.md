---
title: "System::Net::Dns::BeginResolve metodo"
linktitle: "BeginResolve"
second_title: "Aspose.Font per C++"
description: "System::Net::Dns::BeginResolve metodo. Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando il nome host specificato in C++."
type: docs
weight: 400
url: /it/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando il nome host specificato.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| hostName | String | Un nome host che viene usato per creare una nuova istanza della classe [IPHostEntry](../../iphostentry/). |
| requestCallback | AsyncCallback | Una callback da chiamare al completamento dell'operazione. |
| stateObject | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
