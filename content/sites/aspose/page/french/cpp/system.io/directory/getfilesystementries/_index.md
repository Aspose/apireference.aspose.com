---
title: "Méthode System::IO::Directory::GetFileSystemEntries"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Page pour C++"
description: "Méthode System::IO::Directory::GetFileSystemEntries. Recherche les fichiers et répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire indiqué, dans C++."
type: docs
weight: 1300
url: /fr/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


Recherche les fichiers et répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire spécifié, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Chemin complet ou relatif du répertoire dans lequel rechercher |
| searchPattern | const String\& | Le modèle de nom des fichiers et répertoires à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire indiqué ou dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire indiqué |

### ReturnValue

Un tableau de chemins complets des fichiers et répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
