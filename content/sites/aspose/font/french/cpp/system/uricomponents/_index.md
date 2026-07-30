---
title: "énumération System::UriComponents"
linktitle: "UriComponents"
second_title: "Aspose.Font pour C++"
description: "énumération System::UriComponents. Représente les composants d'URI en C++."
type: docs
weight: 8900
url: /fr/cpp/system/uricomponents/
---
## UriComponents enum


Représente les composants d'URI.

```cpp
enum class UriComponents
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Schéma | 1 | Les données Scheme. |
| UserInfo | 2 | Les données UserInfo. |
| Host | 4 | Les données Host. |
| Port | 8 | Les données Port. |
| SchemeAndServer | n/a | Les données du schéma, de l'hôte et du port. |
| Chemin | 16 | Les données du chemin local. |
| Requête | 32 | Les données de la requête. |
| PathAndQuery | n/a | Les données du chemin local et de la requête. |
| HttpRequestUrl | n/a | Les données du schéma, de l'hôte, du port, de la requête et du chemin local. |
| Fragment | 64 | Les données du fragment. |
| AbsoluteUri | n/a | Les données du schéma, de l'hôte, du port, de la requête, du chemin local et du fragment. |
| StrongPort | 128 | Les données du port ; si les données du port ne sont pas présentes dans le [Uri](../uri/) et qu'un port par défaut a été attribué au schéma, le port par défaut est renvoyé ; s'il n'existe pas de port par défaut, -1 est renvoyé. |
| HostAndPort | n/a | Les données de l'hôte et du port ; si les données du port ne sont pas présentes dans le [Uri](../uri/) et qu'un port par défaut a été attribué au schéma, le port par défaut est renvoyé. S'il n'existe pas de port par défaut, -1 est renvoyé. |
| StrongAuthority | n/a | Les données UserInfo, hôte et port. Si aucune donnée de port n'est présente dans le [Uri](../uri/) et qu'un port par défaut a été attribué au schéma, le port par défaut est renvoyé. S'il n'existe pas de port par défaut, -1 est renvoyé. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Spécifie que le délimiteur doit être inclus. |
| SerializationInfoString | n/a | Le contexte complet du [Uri](../uri/) nécessaire aux sérialiseurs du [Uri](../uri/). Le contexte inclut la portée IPv6. |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
