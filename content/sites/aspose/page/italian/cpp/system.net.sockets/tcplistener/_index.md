---
title: "System::Net::Sockets::TcpListener classe"
linktitle: "TcpListener"
second_title: "Aspose.Page per C++"
description: "System::Net::Sockets::TcpListener class. Rappresenta un listener per i servizi di rete TCP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


Rappresenta un listener per i servizi di rete TCP. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class TcpListener : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | Accetta la richiesta di connessione in sospeso e restituisce il socket utilizzato per inviare e ricevere dati. |
| [AcceptTcpClient](./accepttcpclient/)() | Accetta la richiesta di connessione in sospeso e restituisce l'istanza della classe TcpClient che viene utilizzata per inviare e ricevere dati. |
| [AllowNatTraversal](./allownattraversal/)(bool) | Abilita o disabilita il NAT traversal. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di accept asincrona. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di accept asincrona. |
| static [Create](./create/)(int32_t) | Crea una nuova istanza utilizzando il numero di porta specificato. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione di accept asincrona specificata. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione di accept asincrona specificata. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Ottiene un valore che indica se l'istanza corrente consente a un solo client di utilizzare una porta. |
| [get_LocalEndpoint](./get_localendpoint/)() | Restituisce il endpoint sottostante. |
| [get_Server](./get_server/)() | Informazioni RTTI. |
| [Pending](./pending/)() | Restituisce un valore che indica se ci sono richieste di connessione in sospeso. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Imposta un valore che indica se l'istanza corrente consente a un solo client di utilizzare una porta. |
| [Start](./start/)() | Inizia ad ascoltare le connessioni in arrivo. |
| [Start](./start/)(int32_t) | Inizia ad ascoltare le connessioni in arrivo. |
| [Stop](./stop/)() | Interrompe l'ascolto delle connessioni in arrivo. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | Crea una nuova istanza. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | Crea una nuova istanza. |
| [TcpListener](./tcplistener/)(int32_t) | Crea una nuova istanza. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
