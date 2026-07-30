---
title: "System::Net::Dns::BeginGetHostAddresses metodo"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Font per C++"
description: "System::Net::Dns::BeginGetHostAddresses metodo. Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando la stringa specificata che contiene un nome host o un indirizzo IP in C++."
type: docs
weight: 100
url: /it/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando la stringa specificata che contiene un nome host o un indirizzo IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| hostNameOrAddress | Stringa | Una stringa che contiene un nome host o un indirizzo IP. |
| requestCallback | AsyncCallback | Una callback da chiamare al completamento dell'operazione. |
| stato | System::SharedPtr\<Object\> | Dati forniti dall'utente utilizzati per identificare in modo univoco ogni operazione asincrona. |

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
