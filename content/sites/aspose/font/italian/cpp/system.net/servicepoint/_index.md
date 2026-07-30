---
title: "System::Net::ServicePoint classe"
linktitle: "ServicePoint"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::ServicePoint. Fornisce la gestione delle connessioni HTTP. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3100
url: /it/cpp/system.net/servicepoint/
---
## ServicePoint class


Fornisce la gestione delle connessioni HTTP. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ServicePoint : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | Chiude e rimuove le connessioni che appartengono al gruppo di connessione specificato. |
| [get_Address](./get_address/)() | Restituisce l'URI del server a cui si connette l'istanza corrente. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | Informazioni RTTI. |
| [get_Certificate](./get_certificate/)() | Restituisce un certificato utilizzato dall'istanza corrente. |
| [get_ClientCertificate](./get_clientcertificate/)() | Restituisce l'ultimo certificato client. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | Ottiene un timeout in millisecondi dopo il quale il [ServicePoint](./) attivo verrà chiuso. |
| [get_ConnectionLimit](./get_connectionlimit/)() | Ottiene il numero massimo di connessioni consentite dall'istanza corrente. |
| [get_ConnectionName](./get_connectionname/)() | Restituisce il nome della connessione. |
| [get_CurrentConnections](./get_currentconnections/)() | Restituisce un numero di connessioni aperte. |
| [get_Expect100Continue](./get_expect100continue/)() | Ottiene un valore che indica se il comportamento 100-Continue è utilizzato. |
| [get_IdleSince](./get_idlesince/)() | Restituisce data e ora dell'ultima connessione a un host. |
| [get_MaxIdleTime](./get_maxidletime/)() | Ottiene un intervallo di tempo in millisecondi dopo il quale una connessione inattiva verrà chiusa. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | Restituisce la versione HTTP. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Ottiene la dimensione del buffer di ricezione. |
| [get_SupportsPipelining](./get_supportspipelining/)() | Restituisce un valore che indica se l'istanza corrente supporta le connessioni pipeline. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Ottiene un valore che indica se l'algoritmo Nagle è utilizzato dalle connessioni gestite dall'istanza corrente. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | Imposta il delegato utilizzato per associare il [IPEndPoint](../ipendpoint/) locale all'istanza corrente. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | Imposta un timeout in millisecondi dopo il quale il [ServicePoint](./) attivo verrà chiuso. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | Imposta il numero massimo di connessioni consentite dall'istanza corrente. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | Imposta un valore che indica se il comportamento 100-Continue è utilizzato. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | Imposta un intervallo di tempo in millisecondi dopo il quale una connessione inattiva verrà chiusa. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Imposta la dimensione del buffer di ricezione. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Imposta un valore che indica se l'algoritmo Nagle è utilizzato dalle connessioni gestite dall'istanza corrente. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Imposta il valore che indica se l'opzione 'Keep-Alive' è abilitata. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
