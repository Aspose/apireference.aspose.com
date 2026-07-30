---
title: "System::Net::Sockets::SocketError énum"
linktitle: "SocketError"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::SocketError enum. Énumère les types d'erreurs de socket en C++."
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
| Succès | 0 | Une opération de socket s'est terminée avec succès. |
| SocketError | -1 | Une erreur de socket non spécifiée s'est produite. |
| Interrompu | 10004 | Un appel de socket bloquant est annulé. |
| AccèsRefusé | 10013 | L'accès à un socket est refusé. |
| Erreur | 10014 | Une adresse de pointeur invalide a été détectée. |
| ArgumentInvalide | 10022 | Un argument invalide a été fourni. |
| TropDeSocketsOuverts | 10024 | Il y a trop de sockets ouverts dans le fournisseur de sockets sous-jacent. |
| Bloquerait | 10035 | Une opération ne peut pas être immédiatement terminée sur un socket non bloquant. |
| EnCours | 10036 | Une opération bloquante est en cours. |
| DéjàEnCours | 10037 | Un socket non bloquant a déjà une opération en cours. |
| NotSocket | 10038 | Une tentative d'appeler une opération de socket sur un non-socket. |
| DestinationAddressRequired | 10039 | Une adresse requise est omise dans une opération de socket. |
| MessageSize | 10040 | Un datagramme est trop long. |
| ProtocolType | 10041 | Un type de protocole n'est pas pris en charge par ce socket. |
| ProtocolOption | 10042 | Une option ou un niveau inconnu, invalide ou non pris en charge est utilisé. |
| ProtocolNotSupported | 10043 | Un protocole n'est pas implémenté ou n'est pas configuré. |
| SocketNotSupported | 10044 | Une famille d'adresses ne prend pas en charge le socket spécifié. |
| OperationNotSupported | 10045 | Une famille de protocoles ne prend pas en charge une famille d'adresses. |
| ProtocolFamilyNotSupported | 10046 | Une famille de protocoles n'est pas implémentée ou n'est pas configurée. |
| AddressFamilyNotSupported | 10047 | La famille d'adresses spécifiée n'est pas prise en charge. |
| AddressAlreadyInUse | 10048 | Une adresse ne peut être utilisée qu'une seule fois. |
| AddressNotAvailable | 10049 | L'adresse IP sélectionnée n'est pas valide dans ce contexte. |
| NetworkDown | 10050 | Le réseau n'est pas disponible. |
| RéseauInjoignable | 10051 | Aucune route vers l'hôte distant n'existe. |
| RéinitialisationRéseau | 10052 | Une application a tenté de définir 'Keep-Alive' sur une connexion qui a déjà expiré. |
| ConnexionInterrompue | 10053 | Une connexion est interrompue. |
| RéinitialisationConnexion | 10054 | Une connexion est réinitialisée par un pair distant. |
| EspaceTamponIndisponible | 10055 | Aucun espace tampon libre n'est disponible pour une opération de socket. |
| EstConnecté | 10056 | Un socket est déjà connecté. |
| NonConnecté | 10057 | Une application a tenté d'envoyer ou de recevoir des données, et un socket n'est pas connecté. |
| Arrêt | 10058 | Une requête d'envoi ou de réception de données est interdite car le socket a déjà été fermé. |
| DélaiExpiré | 10060 | Une tentative de connexion a expiré, ou un hôte connecté n'a pas répondu. |
| ConnexionRefusée | 10061 | Un hôte distant refuse activement une connexion. |
| HôteIndisponible | 10064 | Une opération a échoué parce qu'un hôte distant est hors service. |
| HôteInjoignable | 10065 | Aucune route réseau vers l'hôte spécifié n'existe. |
| LimiteDeProcessus | 10067 | Trop de processus utilisent le fournisseur de socket sous-jacent. |
| SystèmeNonPrêt | 10091 | Un sous-système réseau est indisponible. |
| VersionNonSupportée | 10092 | Une version du fournisseur de socket sous-jacent est hors plage. |
| NonInitialisé | 10093 | Le fournisseur de socket sous-jacent n'est pas initialisé. |
| Déconnexion en cours | 10101 | Une fermeture ordonnée est en cours. |
| TypeIntrouvable | 10109 | La classe spécifiée est introuvable. |
| HôteIntrouvable | 11001 | L'hôte spécifié est inconnu. |
| Réessayer | 11002 | Le nom d'un hôte ne peut pas être résolu. |
| PasDeRécupération | 11003 | Une erreur est irrécupérable ou la base de données demandée est introuvable. |
| PasDeDonnées | 11004 | Le nom ou l'adresse IP demandée n'est pas trouvé sur le serveur de noms. |

## Voir aussi

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
