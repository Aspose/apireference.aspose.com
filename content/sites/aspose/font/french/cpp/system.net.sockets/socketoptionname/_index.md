---
title: "System::Net::Sockets::SocketOptionName énum"
linktitle: "SocketOptionName"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::SocketOptionName enum. Définit les noms d'options de socket pour la classe Socket en C++."
type: docs
weight: 1600
url: /fr/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


Définit les noms d'options de socket pour la classe [Socket](../socket/).

```cpp
enum class SocketOptionName
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Débogage | 1 | Enregistre les informations de débogage. |
| AccepterConnexion | 2 | Indique si une socket écoute une connexion entrante. |
| RéutiliserAdresse | 4 | Indique si une socket peut être liée à une adresse déjà utilisée. |
| MaintenirEnVie | 8 | Active les paquets 'Keep-Alive' pour une connexion socket. |
| NePasRoutage | 16 | Indique si un paquet est envoyé directement aux adresses d'interface. |
| Diffusion | 32 | Indique si une socket peut envoyer les messages de diffusion. |
| UtiliserBouclage | 64 | Contourne le matériel lorsque cela est possible. |
| Rester | 128 | Le système bloquera le processus lors de la tentative de fermeture jusqu'à ce qu'il puisse transmettre les données. |
| EnLigneHorsBande | 256 | Reçoit les données hors bande dans le flux de données normal. |
| NePasRester | n/a | Indique si une socket sera fermée sans temporisation. |
| UtilisationAdresseExclusive | n/a | Une socket utilisera l'adresse liée de manière exclusive. |
| TamponEnvoi | 4097 | Spécifie la taille du tampon d'envoi. |
| TamponRéception | 4098 | Spécifie la taille du tampon de réception. |
| SeuilBasEnvoi | 4099 | Spécifie la quantité minimale de données pour les opérations d'envoi. |
| SeuilBasRéception | 4100 | Spécifie la quantité minimale de données pour les opérations de réception. |
| DélaiExpirationEnvoi | 4101 | Spécifie le délai d'attente pour les opérations d'envoi synchrones. |
| DélaiExpirationRéception | 4102 | Spécifie le délai d'attente pour les opérations de réception synchrones. |
| Erreur | 4103 | Renvoie le statut d'erreur et le réinitialise. |
| Type | 4104 | Renvoie un type de socket. |
| RéutiliserPortUnicast | 12295 | Indique si le système doit différer l'allocation du port éphémère pour les connexions sortantes. |
| ConnexionsMax | 2147483647 | Cette option n'est pas prise en charge. Elle était utilisée pour spécifier la longueur maximale de la file d'attente d'écoute. |
| IPOptions | 1 | Spécifie l'option IP qui doit être insérée aux datagrammes sortants. |
| HeaderIncluded | 2 | L'en-tête est inclus aux datagrammes sortants. |
| TypeOfService | 3 | Modifiez le type d'en-tête IP du champ de service. |
| IpTimeToLive | 4 | Le temps de vie IP. |
| MulticastInterface | 9 | Définissez l'interface pour les paquets multicast sortants. |
| MulticastTimeToLive | 10 | Le temps de vie du multicast IP. |
| MulticastLoopback | 11 | Le bouclage du multicast IP. |
| AddMembership | 12 | Ajoutez une adhésion à un groupe IP. |
| DropMembership | 13 | Supprimez une adhésion à un groupe IP. |
| DontFragment | 14 | Ne fragmentiez pas les datagrammes IP. |
| AddSourceMembership | 15 | Rejoignez le groupe/source IP. |
| DropSourceMembership | 16 | Supprimez le groupe/source IP. |
| BlockSource | 17 | Bloquez le groupe/source IP. |
| UnblockSource | 18 | Débloquez le groupe/source IP. |
| PacketInformation | 19 | Recevez les informations de paquet pour IPv4. |
| HopLimit | 21 | Renvoie un entier contenant le nombre de sauts HOP du paquet. |
| IPProtectionLevel | 23 | Active la restriction d'une socket IPv6 à la portée spécifiée. |
| IPv6Only | 27 | La socket est limitée à l'envoi et à la réception de paquets IPv6 uniquement. |
| NoDelay | 1 | Désactive l'algorithme de Nagle pour la coalescence des paquets d'envoi. |
| BsdUrgent | 2 | Utilisez les données urgentes telles que définies dans la RFC-1222. |
| Expedited | 2 | Utilisez les données accélérées telles que définies dans la RFC-1222. |
| NoChecksum | 1 | Envoyez les datagrammes UDP avec une somme de contrôle mise à zéro. |
| ChecksumCoverage | 20 | Définissez ou récupérez la couverture de la somme de contrôle UDP. |
| UpdateAcceptContext | 28683 | Met à jour une socket client avec les mêmes propriétés qu'une socket d'écoute. |
| UpdateConnectContext | 28688 | Met à jour une socket client avec les mêmes propriétés qu'une socket d'écoute. |

## Voir aussi

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
