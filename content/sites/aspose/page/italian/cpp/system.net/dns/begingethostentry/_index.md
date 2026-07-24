---
title: "System::Net::Dns::BeginGetHostEntry metodo"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Page per C++"
description: "System::Net::Dns::BeginGetHostEntry metodo. Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry usando la stringa specificata che contiene un nome host o un indirizzo IP in C++."
type: docs
weight: 300
url: /it/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando la stringa specificata che contiene un nome host o un indirizzo IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| hostNameOrAddress | String | La stringa che contiene un nome host o un indirizzo IP. |
| requestCallback | AsyncCallback | Una callback da chiamare quando l'operazione è completata. |
| stateObject | System::SharedPtr\<Object\> | Dati forniti dall'utente usati per identificare in modo univoco ogni operazione asincrona. |

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
* Library [Aspose.Page for C++](../../../)
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando l'indirizzo IP specificato.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indirizzo | System::SharedPtr\<IPAddress\> | L'indirizzo IP. |
| requestCallback | AsyncCallback | Una callback da chiamare quando l'operazione è completata. |
| stateObject | System::SharedPtr\<Object\> | Dati forniti dall'utente usati per identificare in modo univoco ogni operazione asincrona. |

### ReturnValue

Un oggetto [IAsyncResult](../../../system/iasyncresult/) che rappresenta l'operazione asincrona avviata.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
