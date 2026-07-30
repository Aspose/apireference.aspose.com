---
title: "Énumération System::Net::Sockets::SocketFlags"
linktitle: "SocketFlags"
second_title: "Aspose.Font pour C++"
description: "Énumération System::Net::Sockets::SocketFlags. Fournit des valeurs constantes pour les messages de socket en C++."
type: docs
weight: 1400
url: /fr/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


Fournit des valeurs constantes pour les messages de socket.

```cpp
enum class SocketFlags
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Aucun | 0 | Aucun indicateur n'est utilisé pour cet appel. |
| OutOfBand | 1 | Les données hors bande sont en cours de traitement. |
| Peek | 2 | Faire un peek sur un message entrant. |
| NePasRoutage | 4 | Envoyer un message sans utiliser les tables de routage. |
| Truncated | 256 | Un message est trop volumineux pour tenir dans le tampon spécifié. Il a été tronqué. |
| ControlDataTruncated | 512 | Les données de contrôle dépassent 64 KB et ne tiennent pas dans le tampon interne. Elles ont été tronquées. |
| Diffusion | 1024 | Un paquet de diffusion. |
| Multicast | 2048 | Un paquet multicast. |
| Partiel | 32768 | Un message envoyé ou reçu partiellement. |

## Voir aussi

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
