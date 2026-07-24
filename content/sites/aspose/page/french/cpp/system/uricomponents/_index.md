---
title: "enum System::UriComponents"
linktitle: "UriComponents"
second_title: "Aspose.Page pour C++"
description: "enum System::UriComponents. Représente les composants d'URI en C++."
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
| Schéma | 1 | Les données du schéma. |
| UserInfo | 2 | Les données UserInfo. |
| Host | 4 | Les données de l'hôte. |
| Port | 8 | Les données du port. |
| SchemeAndServer | n/a | Les données du schéma, de l'hôte et du port. |
| Path | 16 | Les données du chemin local. |
| Requête | 32 | Les données de la requête. |
| PathAndQuery | n/a | Les données du chemin local et de la requête. |
| HttpRequestUrl | n/a | Les données du schéma, de l'hôte, du port, de la requête et du chemin local. |
| Fragment | 64 | Les données du fragment. |
| AbsoluteUri | n/a | Les données du Scheme, Host, Port, Quer, LocalPath et Fragment. |
| StrongPort | 128 | Les données du Port ; si les données du port ne sont pas présentes dans le [Uri](../uri/) et qu’un port par défaut a été attribué au Scheme, le port par défaut est renvoyé ; s’il n’y a pas de port par défaut, -1 est renvoyé. |
| HostAndPort | n/a | Les données du Host et du Port ; si les données du port ne sont pas présentes dans le [Uri](../uri/) et qu’un port par défaut a été attribué au Scheme, le port par défaut est renvoyé. S’il n’y a pas de port par défaut, -1 est renvoyé. |
| StrongAuthority | n/a | Les données du UserInfo, Host et Port. Si aucune donnée de port n’est présente dans le [Uri](../uri/) et qu’un port par défaut a été attribué au Scheme, le port par défaut est renvoyé. S’il n’y a pas de port par défaut, -1 est renvoyé. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Spécifie que le délimiteur doit être inclus. |
| SerializationInfoString | n/a | Le contexte complet du [Uri](../uri/) nécessaire aux Sérialiseurs du [Uri](../uri/). Le contexte inclut la portée IPv6. |

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
