---
title: "System::Net::ServicePoint classe"
linktitle: "ServicePoint"
second_title: "Aspose.Font pour C++"
description: "System::Net::ServicePoint classe. Fournit la gestion des connexions HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3100
url: /fr/cpp/system.net/servicepoint/
---
## ServicePoint class


Fournit la gestion des connexions HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class ServicePoint : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | Ferme et supprime les connexions appartenant au groupe de connexion spécifié. |
| [get_Address](./get_address/)() | Renvoie l'URI du serveur auquel l'instance actuelle se connecte. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | Informations RTTI. |
| [get_Certificate](./get_certificate/)() | Renvoie un certificat utilisé par l'instance actuelle. |
| [get_ClientCertificate](./get_clientcertificate/)() | Renvoie le dernier certificat client. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | Obtient un délai d'attente en millisecondes après lequel le [ServicePoint](./) actif sera fermé. |
| [get_ConnectionLimit](./get_connectionlimit/)() | Obtient le nombre maximal de connexions autorisées par l'instance actuelle. |
| [get_ConnectionName](./get_connectionname/)() | Renvoie le nom de la connexion. |
| [get_CurrentConnections](./get_currentconnections/)() | Renvoie un nombre de connexions ouvertes. |
| [get_Expect100Continue](./get_expect100continue/)() | Obtient une valeur indiquant si le comportement 100-Continue est utilisé. |
| [get_IdleSince](./get_idlesince/)() | Renvoie la date et l'heure de la dernière connexion à un hôte. |
| [get_MaxIdleTime](./get_maxidletime/)() | Obtient une durée en millisecondes après laquelle une connexion inactive sera fermée. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | Renvoie la version HTTP. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Obtient la taille du tampon de réception. |
| [get_SupportsPipelining](./get_supportspipelining/)() | Renvoie une valeur indiquant si l'instance actuelle prend en charge les connexions en pipeline. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Obtient une valeur indiquant si l'algorithme Nagle est utilisé par les connexions gérées par l'instance actuelle. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | Définit le délégué utilisé pour associer le [IPEndPoint](../ipendpoint/) local à l'instance actuelle. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | Définit un délai d'attente en millisecondes après lequel le [ServicePoint](./) actif sera fermé. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | Définit le nombre maximal de connexions autorisées par l'instance actuelle. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | Définit une valeur indiquant si le comportement 100-Continue est utilisé. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | Définit une durée en millisecondes après laquelle une connexion inactive sera fermée. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Définit la taille du tampon de réception. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Définit une valeur indiquant si l'algorithme Nagle est utilisé par les connexions gérées par l'instance actuelle. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Définit la valeur indiquant si l'option 'Keep-Alive' est activée. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
