---
title: "System::Net::Sockets::TcpListener classe"
linktitle: "TcpListener"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::TcpListener classe. Représente un écouteur pour les services réseau TCP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


Représente un écouteur pour les services réseau TCP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class TcpListener : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | Accepte la demande de connexion en attente et renvoie le socket utilisé pour envoyer et recevoir des données. |
| [AcceptTcpClient](./accepttcpclient/)() | Accepte la demande de connexion en attente et renvoie l'instance TcpClient-classe qui est utilisée pour l'envoi et la réception de données. |
| [AllowNatTraversal](./allownattraversal/)(bool) | Active ou désactive le passage NAT. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération d'acceptation asynchrone. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération d'acceptation asynchrone. |
| static [Create](./create/)(int32_t) | Crée une nouvelle instance en utilisant le numéro de port spécifié. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | Attend jusqu'à ce que l'opération d'acceptation asynchrone spécifiée se termine. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | Attend jusqu'à ce que l'opération d'acceptation asynchrone spécifiée se termine. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Obtient une valeur qui indique si l'instance actuelle autorise un seul client à utiliser un port. |
| [get_LocalEndpoint](./get_localendpoint/)() | Renvoie le point de terminaison sous-jacent. |
| [get_Server](./get_server/)() | Informations RTTI. |
| [Pending](./pending/)() | Renvoie une valeur qui indique s'il existe des demandes de connexion en attente. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Définit une valeur qui indique si l'instance actuelle autorise un seul client à utiliser un port. |
| [Start](./start/)() | Commence à écouter les connexions entrantes. |
| [Start](./start/)(int32_t) | Commence à écouter les connexions entrantes. |
| [Stop](./stop/)() | Arrête d'écouter les connexions entrantes. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | Construit une nouvelle instance. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | Construit une nouvelle instance. |
| [TcpListener](./tcplistener/)(int32_t) | Construit une nouvelle instance. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
