---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Font pour C++"
description: "System::Net::WebExceptionStatus enum. Énumère les codes d'état de la classe WebException en C++."
type: docs
weight: 4900
url: /fr/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


Énumère les codes d'état de la classe [WebException](../webexception/).

```cpp
enum class WebExceptionStatus
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Succès | 0 | Aucune erreur ne s'est produite. |
| NameResolutionFailure | 1 | Le service de résolution de noms n'a pas pu résoudre le nom d'hôte. |
| ConnectFailure | 2 | Le point de service distant n'a pas pu être contacté au niveau du transport. |
| ReceiveFailure | 3 | Une réponse complète n'est pas reçue du serveur distant. |
| SendFailure | 4 | Une requête complète n'a pas pu être envoyée au serveur distant. |
| PipelineFailure | 5 | La requête était une requête en pipeline et la connexion a été fermée avant que la réponse ne soit reçue. |
| RequestCanceled | 6 | La requête a été annulée ou une erreur non classifiable s'est produite. |
| ProtocolError | 7 | La réponse reçue du serveur était complète mais indiquait une erreur au niveau du protocole. |
| ConnectionClosed | 8 | La connexion a été fermée prématurément. |
| TrustFailure | 9 | Un certificat serveur n'a pas pu être validé. |
| SecureChannelFailure | 10 | Une erreur s'est produite lors de l'établissement d'une connexion en utilisant SSL. |
| ServerProtocolViolation | 11 | La réponse du serveur n'était pas une réponse HTTP valide. |
| KeepAliveFailure | 12 | La connexion pour une requête qui spécifie l'en-tête 'Keep-Alive' a été fermée de manière inattendue. |
| En attente | 13 | Une requête asynchrone interne est en attente. |
| Délai d'attente | 14 | Aucune réponse n'a été reçue pendant la période d'expiration d'une requête. |
| Échec de résolution du nom du proxy | 15 | Le service de résolution de noms n'a pas pu résoudre le nom d'hôte du proxy. |
| Erreur inconnue | 16 | Une exception de type inconnu s'est produite. |
| Limite de longueur du message dépassée | 17 | Un message qui a dépassé la limite spécifiée a été reçu. |
| Entrée du cache introuvable | 18 | L'entrée de cache spécifiée n'a pas été trouvée. |
| Requête interdite par la politique de cache | 19 | La requête n'était pas autorisée par la politique de cache. |
| Requête interdite par le proxy | 20 | Cette requête n'était pas autorisée par le proxy. |

## Voir aussi

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
