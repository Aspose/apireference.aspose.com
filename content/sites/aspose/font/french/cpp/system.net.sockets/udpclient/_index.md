---
title: "classe System::Net::Sockets::UdpClient"
linktitle: "UdpClient"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Sockets::UdpClient. Fournit des services réseau du protocole de datagramme utilisateur (UDP). Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() function. Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.net.sockets/udpclient/
---
## UdpClient class


Fournit des services réseau du protocole de datagramme utilisateur (UDP). Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class UdpClient : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() | Ferme la connexion UDP. |
| [Connect](./connect/)(String, int32_t) | Établit une connexion au port spécifié sur l’hôte spécifié. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Établit une connexion avec l’hôte à l’adresse spécifiée sur le port spécifié. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Établit une connexion à un point d’extrémité distant. |
| [Dispose](./dispose/)() override | Libère les ressources gérées et non gérées utilisées par le [UdpClient](./). |
| [get_Client](./get_client/)() | Informations RTTI. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | Renvoie un datagramme envoyé par un serveur. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | Envoie un datagramme UDP à l’hôte au point d’extrémité distant. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | Envoie un datagramme UDP au port spécifié sur l’hôte distant spécifié. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | Envoie un datagramme UDP à un hôte distant. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Utilisé pour fournir la socket réseau sous-jacente. |
| [UdpClient](./udpclient/)() | Initialise une nouvelle instance de la classe [UdpClient](./). |
| [UdpClient](./udpclient/)(AddressFamily) | Initialise une nouvelle instance de la classe [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t) | Initialise une nouvelle instance de la classe [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | Initialise une nouvelle instance de la classe [UdpClient](./). |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | Initialise une nouvelle instance de la classe [UdpClient](./). param local EP le point d’extrémité local auquel vous liez la connexion UDP. |
| [UdpClient](./udpclient/)(String, int32_t) | Crée une nouvelle instance de la classe [UdpClient](./) et se connecte à l’hôte distant spécifié sur le port spécifié. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
