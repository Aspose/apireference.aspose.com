---
title: "System::IO::Directory::EnumerateDirectories method"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Font pour C++"
description: "System::IO::Directory::EnumerateDirectories method. Recherche les répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié en C++."
type: docs
weight: 300
url: /fr/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Recherche les répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Chemin complet ou relatif du répertoire dans lequel rechercher |
| searchPattern | const String\& | Le modèle de nom des répertoires à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire spécifié ou dans l'arborescence complète dont la racine est le répertoire spécifié |

### ReturnValue

La collection énumérable des chemins complets des répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
