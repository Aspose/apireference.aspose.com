---
title: "System::IO::Directory::EnumerateFiles méthode"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font pour C++"
description: "System::IO::Directory::EnumerateFiles méthode. Recherche les fichiers qui répondent aux critères de recherche spécifiés, soit dans le répertoire spécifié, soit dans l'arborescence complète dont la racine est le répertoire spécifié en C++."
type: docs
weight: 400
url: /fr/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


Recherche les fichiers qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Chemin complet ou relatif du répertoire dans lequel rechercher |
| searchPattern | const String\& | Le modèle de nom des fichiers à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire spécifié ou dans l'arborescence complète dont la racine est le répertoire spécifié |

### ReturnValue

La collection énumérable des chemins complets des fichiers trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
