---
title: "System::Net::Sockets::Socket classe"
linktitle: "Socket"
second_title: "Aspose.Font per C++"
description: "classe System::Net::Sockets::Socket. La classe Socket implementa l'interfaccia Berkeley sockets in C++."
type: docs
weight: 400
url: /it/cpp/system.net.sockets/socket/
---
## Socket class


La classe [Socket](./) implementa l'interfaccia Berkeley sockets.

```cpp
class Socket : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Accept](./accept/)() | Crea un nuovo socket per la connessione appena creata. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di connessione asincrona. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di connessione asincrona. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di connessione asincrona. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di connessione asincrona. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di scrittura asincrona. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione di invio asincrona. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | Associa il socket all'endpoint locale specificato. |
| [Close](./close/)() | Chiude la connessione del socket. |
| [Close](./close/)(int) | Chiude la connessione del socket con il timeout specificato per consentire l'invio dei dati in coda. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | Stabilisce una connessione all'endpoint remoto specificato. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Stabilisce una connessione all'endpoint remoto specificato. |
| [Connect](./connect/)(String, int32_t) | Stabilisce una connessione all'endpoint remoto specificato. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Stabilisce una connessione all'endpoint remoto specificato. |
| [Dispose](./dispose/)() override | Non fa nulla. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione di connessione asincrona specificata. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione di ricezione asincrona specificata. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Attende fino al completamento dell'operazione di ricezione asincrona specificata. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | Attende fino al completamento dell'operazione di invio asincrona specificata. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Attende fino al completamento dell'operazione di invio asincrona specificata. |
| [get_AddressFamily](./get_addressfamily/)() | Restituisce la famiglia di indirizzi. |
| [get_Available](./get_available/)() | Ottiene il numero di byte ricevuti dalla rete e disponibili per la lettura. |
| [get_Blocking](./get_blocking/)() | Ottiene un valore che indica se il socket è in modalità bloccante. |
| [get_Connected](./get_connected/)() | Restituisce un valore che indica se il socket è connesso all'host remoto. |
| [get_DontFragment](./get_dontfragment/)() | Ottiene un valore che indica se il socket consente la frammentazione dei datagrammi IP. |
| [get_DualMode](./get_dualmode/)() | Ottiene un valore che indica se il socket è in modalità duale. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | Ottiene un valore che indica se il socket consente i pacchetti broadcast. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Ottiene un valore che indica se solo un processo può associare il socket a una porta. |
| [get_IsBound](./get_isbound/)() | Restituisce un valore che indica se il socket è associato a una porta locale specifica. |
| [get_LingerState](./get_lingerstate/)() | Ottiene un valore che indica se il socket ritarderà la chiusura nel tentativo di inviare tutti i dati in sospeso. |
| [get_LocalEndPoint](./get_localendpoint/)() | Restituisce l'endpoint locale. |
| [get_MulticastLoopback](./get_multicastloopback/)() | Ottiene un valore che indica se il socket riceve pacchetti multicast in uscita. |
| [get_NoDelay](./get_nodelay/)() | Ottiene un valore che indica se il socket sta usando l'algoritmo di Nagle. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | Restituisce un valore che indica se il sistema operativo e gli adattatori di rete supportano IPv4. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | Restituisce un valore che indica se il sistema operativo e gli adattatori di rete supportano IPv6. |
| [get_ProtocolType](./get_protocoltype/)() | Restituisce il tipo di protocollo. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Ottiene la dimensione del buffer di ricezione. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Ottiene un intervallo dopo il quale una chiamata 'Receive' scadrà. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | Restituisce il punto finale remoto. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Ottiene la dimensione del buffer di invio. |
| [get_SendTimeout](./get_sendtimeout/)() | Ottiene un intervallo dopo il quale una chiamata 'Send' scadrà. |
| [get_SocketType](./get_sockettype/)() | Restituisce il tipo di socket. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | Informazioni RTTI. |
| [get_Ttl](./get_ttl/)() | Ottiene il valore TTL. |
| [GetImpl](./getimpl/)() const | Restituisce un puntatore all'implementazione. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | Restituisce il valore che corrisponde al nome dell'opzione specificata. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Ottiene il valore che corrisponde al nome dell'opzione specificata. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Restituisce il valore che corrisponde al nome dell'opzione specificata. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Imposta le modalità operative a basso livello per il socket. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Imposta le modalità operative a basso livello per il socket. |
| [Listen](./listen/)(int32_t) | Cambia lo stato del socket in 'listen'. |
| [Poll](./poll/)(int32_t, SelectMode) | Restituisce lo stato del socket basato sulla modalità di polling specificata. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Riceve dati dal socket e li scrive nell'array di byte specificato. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Riceve dati dal socket e li scrive negli array di byte specificati. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Riceve dati dal socket e li scrive negli array di byte specificati. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Riceve dati dal socket e li scrive negli array di byte specificati. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Riceve dati dal punto finale specificato e li scrive nell'array di byte specificato. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | Invia i dati specificati al socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Invia i dati specificati al socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Invia i dati specificati al socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Invia i dati specificati al socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Invia i dati specificati al socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Invia i dati specificati al socket. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | Invia i dati specificati al punto finale specificato. |
| [set_Blocking](./set_blocking/)(bool) | Imposta un valore che indica se il socket è in modalità bloccante. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | Imposta il timeout di connessione. |
| [set_DontFragment](./set_dontfragment/)(bool) | Imposta un valore che indica se il socket consente la frammentazione dei datagrammi IP. |
| [set_DualMode](./set_dualmode/)(bool) | Imposta un valore che indica se il socket è in modalità duale. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | Imposta un valore che indica se il socket consente pacchetti broadcast. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Imposta un valore che indica se un solo processo può associare il socket a una porta. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Imposta un valore che indica se il socket ritarderà la chiusura nel tentativo di inviare tutti i dati in sospeso. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | Imposta un valore che indica se il socket riceve pacchetti multicast in uscita. |
| [set_NoDelay](./set_nodelay/)(bool) | Imposta un valore che indica se il socket sta usando l'algoritmo di Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Imposta la dimensione del buffer di ricezione. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Imposta un intervallo dopo il quale una chiamata 'Receive' scadrà. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Imposta la dimensione del buffer di invio. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Imposta un intervallo dopo il quale una chiamata 'Send' scadrà. |
| [set_Ttl](./set_ttl/)(int16_t) | Imposta il valore TTL. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Imposta l'opzione socket specificata al valore specificato. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Imposta l'opzione socket specificata al valore specificato. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | Imposta l'opzione socket specificata al valore specificato. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | Imposta l'opzione socket specificata al valore specificato. |
| [Shutdown](./shutdown/)(SocketShutdown) | Disabilita le operazioni di invio e ricezione del socket. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Crea una nuova istanza. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Crea una nuova istanza. |
| virtual [~Socket](./~socket/)() | Distrugge l'istanza corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ImplPtr](./implptr/) | L'implementazione del socket. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
