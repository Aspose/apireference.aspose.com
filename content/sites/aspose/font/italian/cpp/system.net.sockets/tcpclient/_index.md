---
title: "System::Net::Sockets::TcpClient classe"
linktitle: "TcpClient"
second_title: "Aspose.Font per C++"
description: "System::Net::Sockets::TcpClient classe. Rappresenta un client per i servizi di rete TCP. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


Rappresenta un client per i servizi di rete TCP. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class TcpClient : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di connessione asincrona. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di connessione asincrona. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di connessione asincrona. |
| [Close](./close/)() | Chiude la connessione e rilascia l'istanza corrente. |
| [Connect](./connect/)(String, int32_t) | Stabilisce una connessione all'host remoto specificato. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Stabilisce una connessione all'host remoto specificato. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Stabilisce una connessione all'host remoto specificato. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Stabilisce una connessione all'host remoto specificato. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione di connessione asincrona specificata. |
| [get_Available](./get_available/)() | Restituisce il numero di byte ricevuti e pronti per la lettura. |
| [get_Client](./get_client/)() | Informazioni RTTI. |
| [get_Connected](./get_connected/)() | Restituisce un valore che indica se il socket è connesso all'host remoto. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Ottiene un valore che indica se l'istanza corrente consente a un solo client di utilizzare una porta. |
| [get_LingerState](./get_lingerstate/)() | Ottiene un valore che indica se il socket ritarderà la chiusura nel tentativo di inviare tutti i dati in sospeso. |
| [get_NoDelay](./get_nodelay/)() | Ottiene un valore che indica se l'istanza corrente sta usando l'algoritmo di Nagle. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Ottiene la dimensione del buffer utilizzato per la ricezione dei dati. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Ottiene un valore che indica un intervallo di tempo dopo il quale la ricezione dei dati scadrà. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Ottiene la dimensione del buffer utilizzato per l'invio dei dati. |
| [get_SendTimeout](./get_sendtimeout/)() | Ottiene un valore che indica un intervallo di tempo dopo il quale l'invio dei dati scadrà. |
| [GetStream](./getstream/)() | Restituisce lo stream utilizzato per l'invio e la ricezione dei dati. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Imposta il socket. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Imposta un valore che indica se l'istanza corrente consente a un solo client di utilizzare una porta. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Imposta un valore che indica se il socket ritarderà la chiusura nel tentativo di inviare tutti i dati in sospeso. |
| [set_NoDelay](./set_nodelay/)(bool) | Imposta un valore che indica se l'istanza corrente sta utilizzando l'algoritmo di Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Imposta la dimensione del buffer utilizzato per la ricezione dei dati. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Imposta un valore che indica un intervallo di tempo dopo il quale la ricezione dei dati scadrà. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Imposta la dimensione del buffer utilizzato per l'invio dei dati. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Imposta un valore che indica un intervallo di tempo dopo il quale l'invio dei dati scadrà. |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | Crea una nuova istanza. |
| [TcpClient](./tcpclient/)() | Crea una nuova istanza. |
| [TcpClient](./tcpclient/)(AddressFamily) | Crea una nuova istanza. |
| [TcpClient](./tcpclient/)(String, int32_t) | Crea una nuova istanza. |
| virtual [~TcpClient](./~tcpclient/)() | Distrugge l'istanza corrente. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
