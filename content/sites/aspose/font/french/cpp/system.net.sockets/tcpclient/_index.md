---
title: "Classe System::Net::Sockets::TcpClient"
linktitle: "TcpClient"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Sockets::TcpClient. Représente un client pour les services réseau TCP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


Représente un client pour les services réseau TCP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class TcpClient : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération de connexion asynchrone. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération de connexion asynchrone. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération de connexion asynchrone. |
| [Close](./close/)() | Ferme la connexion et libère l'instance actuelle. |
| [Connect](./connect/)(String, int32_t) | Établit une connexion à l'hôte distant spécifié. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Établit une connexion à l'hôte distant spécifié. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Établit une connexion à l'hôte distant spécifié. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Établit une connexion à l'hôte distant spécifié. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Attend que l'opération de connexion asynchrone spécifiée se termine. |
| [get_Available](./get_available/)() | Renvoie le nombre d'octets reçus et prêts à être lus. |
| [get_Client](./get_client/)() | Informations RTTI. |
| [get_Connected](./get_connected/)() | Renvoie une valeur indiquant si le socket est connecté à l'hôte distant. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Obtient une valeur qui indique si l'instance actuelle autorise un seul client à utiliser un port. |
| [get_LingerState](./get_lingerstate/)() | Obtient une valeur indiquant si le socket retardera la fermeture afin d'envoyer toutes les données en attente. |
| [get_NoDelay](./get_nodelay/)() | Obtient une valeur indiquant si l'instance actuelle utilise l'algorithme de Nagle. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Obtient la taille du tampon utilisé pour la réception des données. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Obtient une valeur indiquant une durée après laquelle la réception des données expirera. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Obtient la taille du tampon utilisé pour l'envoi des données. |
| [get_SendTimeout](./get_sendtimeout/)() | Obtient une valeur qui indique une durée après laquelle l'envoi de données expirera. |
| [GetStream](./getstream/)() | Renvoie le flux utilisé pour l'envoi et la réception de données. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Définit la socket. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Définit une valeur qui indique si l'instance actuelle autorise un seul client à utiliser un port. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Définit une valeur indiquant si le socket retardera la fermeture afin d'envoyer toutes les données en attente. |
| [set_NoDelay](./set_nodelay/)(bool) | Définit une valeur qui indique si l'instance actuelle utilise l'algorithme de Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Définit la taille du tampon utilisé pour la réception de données. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Définit une valeur qui indique une durée après laquelle la réception de données expirera. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Définit la taille du tampon utilisé pour l'envoi de données. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Définit une valeur qui indique une durée après laquelle l'envoi de données expirera. |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | Construit une nouvelle instance. |
| [TcpClient](./tcpclient/)() | Construit une nouvelle instance. |
| [TcpClient](./tcpclient/)(AddressFamily) | Construit une nouvelle instance. |
| [TcpClient](./tcpclient/)(String, int32_t) | Construit une nouvelle instance. |
| virtual [~TcpClient](./~tcpclient/)() | Détruit l'instance actuelle. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
