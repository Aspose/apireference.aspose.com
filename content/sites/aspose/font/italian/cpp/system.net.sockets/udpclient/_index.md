---
title: "System::Net::Sockets::UdpClient classe"
linktitle: "UdpClient"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Sockets::UdpClient. Fornisce servizi di rete User Datagram Protocol (UDP). Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.net.sockets/udpclient/
---
## UdpClient class


Fornisce servizi di rete User Datagram Protocol (UDP). Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class UdpClient : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Close](./close/)() | Chiude la connessione UDP. |
| [Connect](./connect/)(String, int32_t) | Stabilisce una connessione alla porta specificata sull'host specificato. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Stabilisce una connessione con l'host all'indirizzo specificato sulla porta specificata. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Stabilisce una connessione a un endpoint remoto. |
| [Dispose](./dispose/)() override | Rilascia le risorse gestite e non gestite utilizzate da [UdpClient](./). |
| [get_Client](./get_client/)() | Informazioni RTTI. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | Restituisce un datagramma inviato da un server. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | Invia un datagramma UDP all'host all'endpoint remoto. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | Invia un datagramma UDP alla porta specificata sull'host remoto specificato. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | Invia un datagramma UDP a un host remoto. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Utilizzato per fornire il socket di rete sottostante. |
| [UdpClient](./udpclient/)() | Inizializza una nuova istanza della classe [UdpClient](./). |
| [UdpClient](./udpclient/)(AddressFamily) | Inizializza una nuova istanza della classe [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t) | Inizializza una nuova istanza della classe [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | Inizializza una nuova istanza della classe [UdpClient](./). |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | Inizializza una nuova istanza della classe [UdpClient](./). param local EP l'endpoint locale a cui si associa la connessione UDP. |
| [UdpClient](./udpclient/)(String, int32_t) | Crea una nuova istanza della classe [UdpClient](./) e si connette all'host remoto specificato sulla porta specificata. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
