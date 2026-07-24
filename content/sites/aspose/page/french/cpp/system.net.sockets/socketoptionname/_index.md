---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Page pour C++"
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
| AcceptConnection | 2 | Indique si un socket écoute une connexion entrante. |
| ReuseAddress | 4 | Indique si un socket peut être lié à une adresse déjà utilisée. |
| KeepAlive | 8 | Active les paquets 'Keep-Alive' pour une connexion socket. |
| DontRoute | 16 | Indique si un paquet est envoyé directement aux adresses d'interface. |
| Broadcast | 32 | Indique si un socket peut envoyer les messages de diffusion. |
| UseLoopback | 64 | Contourner le matériel lorsque cela est possible. |
| Linger | 128 | Le système bloquera le processus lors de la tentative de fermeture jusqu'à ce qu'il puisse transmettre les données. |
| OutOfBandInline | 256 | Reçoit des données hors bande dans le flux de données normal. |
| DontLinger | n/a | Indique si une socket sera fermée sans temporisation. |
| ExclusiveAddressUse | n/a | Une socket utilisera l'adresse liée exclusivement. |
| SendBuffer | 4097 | Spécifie la taille du tampon d'envoi. |
| ReceiveBuffer | 4098 | Spécifie la taille du tampon de réception. |
| SendLowWater | 4099 | Spécifie la quantité minimale de données pour les opérations d'envoi. |
| ReceiveLowWater | 4100 | Spécifie la quantité minimale de données pour les opérations de réception. |
| SendTimeout | 4101 | Spécifie le délai d'expiration pour les opérations d'envoi synchrones. |
| ReceiveTimeout | 4102 | Spécifie le délai d’attente pour les opérations de réception synchrones. |
| Erreur | 4103 | Renvoie le statut d'erreur et le réinitialise. |
| Type | 4104 | Renvoie un type de socket. |
| ReuseUnicastPort | 12295 | Indique si le système doit différer l’allocation du port éphémère pour les connexions sortantes. |
| MaxConnections | 2147483647 | Cette option n’est pas prise en charge. Elle était utilisée pour spécifier la longueur maximale de la file d’attente d’écoute. |
| IPOptions | 1 | Spécifie l’option IP qui doit être insérée dans les datagrammes sortants. |
| HeaderIncluded | 2 | L’en-tête est inclus dans les datagrammes sortants. |
| TypeOfService | 3 | Modifie le type d’en-tête IP du champ de service. |
| IpTimeToLive | 4 | Le temps de vie IP. |
| MulticastInterface | 9 | Définit l’interface pour les paquets multicast sortants. |
| MulticastTimeToLive | 10 | Le temps de vie du multicast IP. |
| MulticastLoopback | 11 | Le retour en boucle IP Multicast. |
| AddMembership | 12 | Ajouter une adhésion à un groupe IP. |
| DropMembership | 13 | Supprimer une adhésion à un groupe IP. |
| DontFragment | 14 | Ne pas fragmenter les datagrammes IP. |
| AddSourceMembership | 15 | Rejoindre le groupe/source IP. |
| DropSourceMembership | 16 | Supprimer le groupe/source IP. |
| BlockSource | 17 | Bloquer le groupe/source IP. |
| UnblockSource | 18 | Débloquer le groupe/source IP. |
| PacketInformation | 19 | Recevoir les informations de paquet pour IPv4. |
| HopLimit | 21 | Renvoie un entier contenant le nombre de sauts (HOP) du paquet. |
| IPProtectionLevel | 23 | Permet de restreindre une socket IPv6 à la portée spécifiée. |
| IPv6Only | 27 | La socket est restreinte à l'envoi et à la réception de paquets IPv6 uniquement. |
| NoDelay | 1 | Désactive l'algorithme Nagle pour la coalescence des paquets d'envoi. |
| BsdUrgent | 2 | Utilisez les données urgentes telles que définies dans le RFC-1222. |
| Expedited | 2 | Utilisez les données expédiées telles que définies dans le RFC-1222. |
| NoChecksum | 1 | Envoyez les datagrammes UDP avec une somme de contrôle mise à zéro. |
| ChecksumCoverage | 20 | Définissez ou récupérez la couverture de la somme de contrôle UDP. |
| UpdateAcceptContext | 28683 | Met à jour un socket client avec les mêmes propriétés qu'un socket d'écoute. |
| UpdateConnectContext | 28688 | Met à jour un socket client avec les mêmes propriétés qu'un socket d'écoute. |

## Voir aussi

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
