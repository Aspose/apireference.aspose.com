---
title: "System::Net::Dns classe"
linktitle: "Dns"
second_title: "Aspose.Font per C++"
description: "System::Net::Dns classe. Fornisce metodi per lavorare con DNS in C++."
type: docs
weight: 700
url: /it/cpp/system.net/dns/
---
## Dns class


Fornisce metodi per lavorare con DNS.

```cpp
class Dns : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando la stringa specificata che contiene un nome host o un indirizzo IP. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando il nome host specificato. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando la stringa specificata che contiene un nome host o un indirizzo IP. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando l'indirizzo IP specificato. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione asincrona per creare una nuova istanza della classe IPHostEntry utilizzando il nome host specificato. |
| [Dns](./dns/)() | Il costruttore predefinito eliminato. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione asincrona specificata per creare una nuova istanza della classe IPHostEntry. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione asincrona specificata per creare una nuova istanza della classe IPHostEntry. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione asincrona specificata per creare una nuova istanza della classe IPHostEntry. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione asincrona specificata per creare una nuova istanza della classe IPHostEntry. |
| static [GetHostAddresses](./gethostaddresses/)(String) | Restituisce una collezione di indirizzi IP del nome host o dell'indirizzo IP specificati. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | Crea una nuova istanza della classe IPHostEntry utilizzando la rappresentazione stringa dell'indirizzo IP specificato. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | Crea una nuova istanza della classe IPHostEntry utilizzando l'indirizzo IP specificato. |
| static [GetHostByName](./gethostbyname/)(String) | Informazioni RTTI. |
| static [GetHostEntry](./gethostentry/)(String) | Crea una nuova istanza della classe IPHostEntry utilizzando la stringa specificata che contiene un nome host o un indirizzo IP. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | Crea una nuova istanza della classe IPHostEntry utilizzando l'indirizzo IP specificato. |
| static [GetHostName](./gethostname/)() | Restituisce il nome host della macchina locale. |
| static [Resolve](./resolve/)(String) | Crea una nuova istanza della classe IPHostEntry utilizzando il nome host specificato. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
