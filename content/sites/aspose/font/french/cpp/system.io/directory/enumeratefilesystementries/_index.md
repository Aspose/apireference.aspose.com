---
title: "System::IO::Directory::EnumerateFileSystemEntries méthode"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Font pour C++"
description: "System::IO::Directory::EnumerateFileSystemEntries méthode. Recherche les fichiers et répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence dont la racine est le répertoire indiqué, dans C++."
type: docs
weight: 500
url: /fr/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


Recherche les fichiers et répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Chemin complet ou relatif du répertoire dans lequel rechercher |
| searchPattern | const String\& | Le modèle de nom des fichiers et répertoires à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire spécifié ou dans l'arborescence complète dont la racine est le répertoire spécifié |

### ReturnValue

La collection énumérable des chemins complets des fichiers et répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
