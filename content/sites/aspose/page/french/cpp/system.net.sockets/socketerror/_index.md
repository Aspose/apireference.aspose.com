---
title: "System::Net::Sockets::SocketError enum"
linktitle: "SocketError"
second_title: "Aspose.Page pour C++"
description: "System::Net::Sockets::SocketError enum. Enumère les types d’erreurs de socket en C++."
type: docs
weight: 1300
url: /fr/cpp/system.net.sockets/socketerror/
---
## SocketError enum


Énumère les types d'erreurs de socket.

```cpp
enum class SocketError
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Success | 0 | Une opération de socket s'est terminée avec succès. |
| SocketError | -1 | Une erreur de socket non spécifiée s'est produite. |
| Interrupted | 10004 | Un appel de socket bloquant a été annulé. |
| AccessDenied | 10013 | L'accès à une socket est refusé. |
| Fault | 10014 | Une adresse de pointeur invalide a été détectée. |
| InvalidArgument | 10022 | Un argument invalide a été fourni. |
| TooManyOpenSockets | 10024 | Il y a trop de sockets ouverts dans le fournisseur de sockets sous-jacent. |
| WouldBlock | 10035 | Une opération ne peut pas être immédiatement terminée sur une socket non bloquante. |
| InProgress | 10036 | Une opération bloquante est en cours. |
| AlreadyInProgress | 10037 | Un socket non bloquant a déjà une opération en cours. |
| NotSocket | 10038 | Une tentative d'appeler une opération de socket sur un non-socket. |
| DestinationAddressRequired | 10039 | Une adresse requise est omise dans une opération de socket. |
| MessageSize | 10040 | Un datagramme est trop long. |
| ProtocolType | 10041 | Un type de protocole n'est pas pris en charge par ce socket. |
| ProtocolOption | 10042 | Une option ou un niveau inconnu, invalide ou non pris en charge est utilisé. |
| ProtocolNotSupported | 10043 | Un protocole n'est pas implémenté ou n'est pas configuré. |
| SocketNotSupported | 10044 | Une famille d'adresses ne prend pas en charge le socket spécifié. |
| OperationNotSupported | 10045 | Une famille de protocole ne prend pas en charge une famille d'adresses. |
| ProtocolFamilyNotSupported | 10046 | Une famille de protocole n'est pas implémentée ou n'est pas configurée. |
| AddressFamilyNotSupported | 10047 | La famille d'adresses spécifiée n'est pas prise en charge. |
| AddressAlreadyInUse | 10048 | Une adresse ne peut être utilisée qu'une seule fois. |
| AddressNotAvailable | 10049 | L'adresse IP sélectionnée n'est pas valide dans ce contexte. |
| NetworkDown | 10050 | Le réseau n'est pas disponible. |
| NetworkUnreachable | 10051 | Aucune route vers l'hôte distant n'existe. |
| NetworkReset | 10052 | Une application a tenté de définir 'Keep-Alive' sur une connexion qui a déjà expiré. |
| ConnectionAborted | 10053 | Une connexion est interrompue. |
| ConnectionReset | 10054 | Une connexion est réinitialisée par un pair distant. |
| NoBufferSpaceAvailable | 10055 | Aucun espace de tampon libre n'est disponible pour une opération de socket. |
| IsConnected | 10056 | Un socket est déjà connecté. |
| NotConnected | 10057 | Une application a tenté d'envoyer ou de recevoir des données, et un socket n'est pas connecté. |
| Shutdown | 10058 | Une demande d'envoi ou de réception de données est interdite car le socket a déjà été fermé. |
| TimedOut | 10060 | Une tentative de connexion a expiré, ou un hôte connecté n'a pas répondu. |
| ConnectionRefused | 10061 | Un hôte distant refuse activement une connexion. |
| HostDown | 10064 | Une opération a échoué parce qu'un hôte distant est hors service. |
| HostUnreachable | 10065 | Aucune route réseau vers l'hôte spécifié n'existe. |
| ProcessLimit | 10067 | Trop de processus utilisent le fournisseur de socket sous-jacent. |
| SystemNotReady | 10091 | Un sous-système réseau est indisponible. |
| VersionNotSupported | 10092 | Une version du fournisseur de socket sous-jacent est hors limites. |
| NotInitialized | 10093 | Le fournisseur de socket sous-jacent n'est pas initialisé. |
| Disconnecting | 10101 | Un arrêt gracieux est en cours. |
| TypeNotFound | 10109 | La classe spécifiée est introuvable. |
| HostNotFound | 11001 | L'hôte spécifié est inconnu. |
| Réessayer | 11002 | Un nom d'hôte ne peut pas être résolu. |
| NoRecovery | 11003 | Une erreur est irrécupérable ou la base de données demandée ne peut pas être localisée. |
| NoData | 11004 | Le nom ou l'adresse IP demandé(e) n'est pas trouvé sur le serveur de noms. |

## Voir aussi

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
